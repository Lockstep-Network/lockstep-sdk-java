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
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
 */

package io.lockstep.api;

import org.apache.hc.client5.http.async.methods.SimpleHttpRequest;
import org.apache.hc.client5.http.async.methods.SimpleHttpResponse;
import org.apache.hc.client5.http.async.methods.SimpleRequestBuilder;
import org.apache.hc.client5.http.async.methods.SimpleRequestProducer;
import org.apache.hc.client5.http.async.methods.SimpleResponseConsumer;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.async.HttpAsyncClients;
import org.apache.hc.core5.concurrent.FutureCallback;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.message.StatusLine;
import org.apache.hc.core5.io.CloseMode;
import org.apache.hc.core5.reactor.IOReactorConfig;
import org.apache.hc.core5.util.Timeout;

/**
 * Represents a failed request.
 */
public class RestRequest<T>
{
    private String method;
    private String path;
    private Hashtable<String, String> queryParams;
    private Hashtable<String, String> pathReplacements;
    private Object body;
    private LockstepApi client;

    public RestRequest(LockstepApi client, String method, String path)
    {
        this.client = client;
        this.method = method;
        this.path = path;
        queryParams = new Hashtable();
        pathReplacements = new Hashtable();
    }

    public void AddQuery(String name, String value)
    {
        this.queryParams.put(name, value);
    }

    public void AddPath(String name, String value)
    {
        this.pathReplacements.put(name, value);
    }

    public void AddBody(Object body)
    {
        this.body = body;
    }

    /**
     * Adapted from Apache simple request client example
     */
    public Future<LockstepResponse<T>> Call()
    {
        // Construct a client object for making a request
        final IOReactorConfig ioReactorConfig = IOReactorConfig.custom()
            .setSoTimeout(Timeout.ofSeconds(5))
            .build();
        final CloseableHttpAsyncClient asyncClient = HttpAsyncClients.custom()
            .setIOReactorConfig(ioReactorConfig)
            .build();
            asyncClient.start();

        // Configure our HTTP request
        SimpleHttpRequest builder = this.client.CreateRequestBuilder();
        builder.setPath(this.path);
        if (this.body != null) {
            builder.setBody(this.body);
        }

        // Add query parameters
        for (Entry<String, String> entry : this.queryParams.entrySet())
            builder.addParameter(entry.getKey(), entry.getValue());
        }

        // Execute HTTP request and parse the result
        final SimpleHttpRequest request = builder.build();
        return asyncClient.execute(
                SimpleRequestProducer.create(request),
                SimpleResponseConsumer.create(),
                new FutureCallback<LockstepResponse<T>>() {

                    @Override
                    public void completed(final SimpleHttpResponse response) {
                        System.out.println(request + "->" + new StatusLine(response));
                        System.out.println(response.getBody());
                    }

                    @Override
                    public void failed(final Exception ex) {
                        System.out.println(request + "->" + ex);
                    }

                    @Override
                    public void cancelled() {
                        System.out.println(request + " cancelled");
                    }

                });
    }
}
