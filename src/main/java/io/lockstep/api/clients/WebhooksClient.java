
/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import io.lockstep.api.models.WebhookModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.WebhookHistoryTableStorageModel;

/**
 * Contains all methods related to Webhooks
 */
public class WebhooksClient
{
    private LockstepApi client;

    /**
     * Constructor for the Webhooks API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public WebhooksClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Webhook specified by this unique identifier.
     *
     * @param id The unique Lockstep Platform ID number of this Webhook
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<WebhookModel> retrieveWebhook(@NotNull String id)
    {
        RestRequest<WebhookModel> r = new RestRequest<WebhookModel>(this.client, "GET", "/api/v1/Webhooks/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(WebhookModel.class);
    }

    /**
     * Updates a webhook that matches the specified id with the requested information.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * @param id The unique Lockstep Platform ID number of the Webhook to update.
     * @param body A list of changes to apply to this Webhook
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<WebhookModel> updateWebhook(@NotNull String id, @NotNull Object body)
    {
        RestRequest<WebhookModel> r = new RestRequest<WebhookModel>(this.client, "PATCH", "/api/v1/Webhooks/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(WebhookModel.class);
    }

    /**
     * Deletes the Webhook referred to by this unique identifier.
     *
     * @param id The unique Lockstep Platform ID number of the Webhook to delete.
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> deleteWebhook(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/Webhooks/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more webhooks from a given model.
     *
     * @param body The Webhooks to create
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<WebhookModel[]> createWebhooks(@NotNull WebhookModel[] body)
    {
        RestRequest<WebhookModel[]> r = new RestRequest<WebhookModel[]>(this.client, "POST", "/api/v1/Webhooks");
        r.AddBody(body);
        return r.Call(WebhookModel[].class);
    }

    /**
     * Updates a webhook that matches the specified id with a new client secret.
     *
     * @param id The unique Lockstep Platform ID number of the Webhook to update.
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<WebhookModel> regenerateClientSecret(@NotNull String id)
    {
        RestRequest<WebhookModel> r = new RestRequest<WebhookModel>(this.client, "PATCH", "/api/v1/Webhooks/{id}/regenerateclientsecret");
        r.AddPath("{id}", id.toString());
        return r.Call(WebhookModel.class);
    }

    /**
     * Queries Webhooks for this account using the specified filtering, sorting, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<WebhookModel>> queryWebhooks(@Nullable String filter, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<WebhookModel>> r = new RestRequest<FetchResult<WebhookModel>>(this.client, "GET", "/api/v1/Webhooks/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<WebhookModel>>() {}.getType());
    }

    /**
     *
     * @param webhookId The unique Lockstep Platform ID number of this Webhook
     * @param filter The filter for this query. See [Azure Query Language](https://docs.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities)
     * @param select The selection for this query. Selection is the desired properties of an entity to pull from the set. If a property is not selected, it will either return as null or empty. See [Azure Query Language](https://docs.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities)
     * @param pageSize The page size for results (default 200).
     * @param pageNumber The page number for results (default 0).
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<WebhookHistoryTableStorageModel>> queryWebhookHistory(@NotNull String webhookId, @Nullable String filter, @Nullable String select, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<WebhookHistoryTableStorageModel>> r = new RestRequest<FetchResult<WebhookHistoryTableStorageModel>>(this.client, "GET", "/api/v1/Webhooks/{webhookId}/history/query");
        r.AddPath("{webhookId}", webhookId.toString());
        r.AddQuery("filter", filter.toString());
        r.AddQuery("select", select.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<WebhookHistoryTableStorageModel>>() {}.getType());
    }
}
