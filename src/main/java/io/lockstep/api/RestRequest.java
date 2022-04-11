/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2022.4.32.0
 * @link       https://github.com/tspence/lockstep-sdk-java
 */

package io.lockstep.api;

import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import java.util.Hashtable;
import java.util.Map.Entry;
import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPatch;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.net.URIBuilder;
import org.jetbrains.annotations.NotNull;

import com.google.gson.Gson;

import io.lockstep.api.models.ErrorResult;
import io.lockstep.api.models.LockstepResponse;

/**
 * Represents a request to a remote web server
 *
 * @author jkirk
 * @version $Id: $Id
 */
public class RestRequest<@NotNull T>
{
    private Hashtable<String, String> queryParams;
    private Hashtable<String, String> pathReplacements;
    private String method;
    private String path;
    private Object body;
    private LockstepApi client;

    /**
     * <p>Constructor for RestRequest.</p>
     *
     * @param client a {@link io.lockstep.api.LockstepApi} object.
     * @param method a {@link java.lang.String} object.
     * @param path a {@link java.lang.String} object.
     */
    public RestRequest(@NotNull LockstepApi client, @NotNull String method, @NotNull String path)
    {
        this.client = client;
        this.method = method;
        this.path = path;
        queryParams = new Hashtable<String, String>();
        pathReplacements = new Hashtable<String, String>();
    }

    /**
     * <p>AddQuery.</p>
     *
     * @param name a {@link java.lang.String} object.
     * @param value a {@link java.lang.String} object.
     */
    public void AddQuery(@NotNull String name, @NotNull String value)
    {
        this.queryParams.put(name, value);
    }

    /**
     * <p>AddPath.</p>
     *
     * @param name a {@link java.lang.String} object.
     * @param value a {@link java.lang.String} object.
     */
    public void AddPath(@NotNull String name, @NotNull String value)
    {
        this.pathReplacements.put(name, value);
    }

    /**
     * <p>AddBody.</p>
     *
     * @param body a {@link java.lang.Object} object.
     */
    public void AddBody(Object body)
    {
        this.body = body;
    }

    /**
     * Adapted from Apache simple request client example
     *
     * @param classReference a {@link java.lang.reflect.Type} object.
     * @return a {@link io.lockstep.api.models.LockstepResponse} object.
     */
    public @NotNull LockstepResponse<T> Call(Type classReference)
    {
        Instant start = Instant.now();
        LockstepResponse<T> lockstepResponse = new LockstepResponse<T>();
        try {

            CloseableHttpClient httpclient = HttpClients.createDefault();

            // Add query parameters
            URIBuilder builder = new URIBuilder(this.client.getServerUri());
            for (Entry<String, String> entry : this.queryParams.entrySet()) {
                builder.addParameter(entry.getKey(), entry.getValue());
            }

            // Set the path and execute replacements
            String filledPath = this.path;
            for (Entry<String, String> entry : this.pathReplacements.entrySet()) {
                filledPath = filledPath.replaceAll(entry.getKey(), entry.getValue());
            }
            builder.setPath(filledPath);
            URI uri = builder.build();

            // Create the appropriate request
            ClassicHttpRequest request;
            switch (this.method) {
                case "PATCH":
                    request = new HttpPatch(uri);
                    break;
                case "PUT":
                    request = new HttpPut(uri);
                    break;
                case "POST":
                    request = new HttpPost(uri);
                    break;
                case "DELETE":
                    request = new HttpDelete(uri);
                    break;
                case "GET":
                default:
                    request = new HttpGet(uri);
                    break;
            }

            request.addHeader("SdkName", "Java");
            request.addHeader("SdkVersion", "2022.14.30.0");
            
            String applicationName = this.client.getAppName();

            if (applicationName != null) {
                request.addHeader("ApplicationName", applicationName);
            }

            String machineName = InetAddress.getLocalHost().getHostName();
            
            if (machineName != null) {
                request.addHeader("MachineName", machineName);
            }

            String bearerToken = this.client.getBearerToken();
            if (bearerToken != null) {
                request.addHeader("Authorization", "Bearer " + bearerToken);
            }

            // Add authentication
            String apiKey = this.client.getApiKey();
            if (apiKey != null) {
                request.addHeader("Api-Key", apiKey);
            }

            // If we have a request body
            Gson gson = new Gson();
            if (body != null) {
                StringEntity stringEntity = new StringEntity(gson.toJson(body));
                request.setEntity(stringEntity);
            }
            // Execute and parse results
            final CloseableHttpResponse response = httpclient.execute(request);

            //get round trip time
            long roundTripTime = Duration.between(start, Instant.now()).toMillis();

            // Did we succeed?
            int code = response.getCode();
            long serverDuration = 0;

            if (response.getHeader("ServerDuration") != null) {
                serverDuration = Long.parseLong(response.getHeader("ServerDuration").getValue());
            }

            String content = EntityUtils.toString(response.getEntity());

            if (code >= 200 && code < 300) {
                T t = gson.fromJson(content, classReference);
                lockstepResponse.setValue(t);
                lockstepResponse.setServerDuration(serverDuration);
                lockstepResponse.setRoundTripTime(roundTripTime);
                lockstepResponse.setSuccess(true);
            } else {
                ErrorResult errorResult = gson.fromJson(content, ErrorResult.class);
                lockstepResponse.setError(errorResult);
                lockstepResponse.setSuccess(false);
            }
            return lockstepResponse;
        } catch (Exception e) { 
            lockstepResponse.setSuccess(false);
            lockstepResponse.setException(e);
        }
        return lockstepResponse;
    }
}
