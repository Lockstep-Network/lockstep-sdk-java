
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.LockstepResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import io.lockstep.api.models.WebhookRuleModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to WebhookRules
 */
public class WebhookRulesClient
{
    private LockstepApi client;

    /**
     * Constructor for the WebhookRules API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public WebhookRulesClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Webhook Rule specified by this unique identifier.
     *
     * @param id The unique Lockstep Platform ID number of this Webhook Rule
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<WebhookRuleModel> retrieveWebhookRule(@NotNull String id)
    {
        RestRequest<WebhookRuleModel> r = new RestRequest<WebhookRuleModel>(this.client, "GET", "/api/v1/WebhookRules/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(WebhookRuleModel.class);
    }

    /**
     * Updates a webhook rule that matches the specified id with the requested information.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * @param id The unique Lockstep Platform ID number of the Webhook Rule to update.
     * @param body A list of changes to apply to this Webhook Rule
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<WebhookRuleModel> updateWebhookRule(@NotNull String id, @NotNull Object body)
    {
        RestRequest<WebhookRuleModel> r = new RestRequest<WebhookRuleModel>(this.client, "PATCH", "/api/v1/WebhookRules/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(WebhookRuleModel.class);
    }

    /**
     * Deletes the Webhook Rule referred to by this unique identifier.
     *
     * @param id The unique Lockstep Platform ID number of the Webhook Rule to delete.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> deleteWebhookRule(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/WebhookRules/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more webhook rules from a given model.
     *
     * @param body The Webhook Rules to create
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<WebhookRuleModel[]> createWebhookRules(@NotNull WebhookRuleModel[] body)
    {
        RestRequest<WebhookRuleModel[]> r = new RestRequest<WebhookRuleModel[]>(this.client, "POST", "/api/v1/WebhookRules");
        r.AddBody(body);
        return r.Call(WebhookRuleModel[].class);
    }

    /**
     * Queries Webhook Rules for this account using the specified filtering, sorting, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<WebhookRuleModel>> queryWebhookRules(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<WebhookRuleModel>> r = new RestRequest<FetchResult<WebhookRuleModel>>(this.client, "GET", "/api/v1/WebhookRules/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<WebhookRuleModel>>() {}.getType());
    }
}
