
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2023 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2023 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.LockstepResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import io.lockstep.api.models.AttachmentLinkModel;

import io.lockstep.api.models.DeleteResult;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to AttachmentLinks
 */
public class AttachmentLinksClient
{
    private LockstepApi client;

    /**
     * Constructor for the AttachmentLinks API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public AttachmentLinksClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Attachment Link with the provided Attachment Link identifier.
     *
     * An Attachment Link is a link that associates one Attachment with one object within Lockstep.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param attachmentId Documentation pending
     * @param objectKey Documentation pending
     * @param tableName Documentation pending
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<AttachmentLinkModel> retrieveAttachmentLink(@NotNull String attachmentId, @NotNull String objectKey, @NotNull String tableName)
    {
        RestRequest<AttachmentLinkModel> r = new RestRequest<AttachmentLinkModel>(this.client, "GET", "/api/v1/AttachmentLinks");
        r.AddQuery("attachmentId", attachmentId.toString());
        r.AddQuery("objectKey", objectKey.toString());
        r.AddQuery("tableName", tableName.toString());
        return r.Call(AttachmentLinkModel.class);
    }

    /**
     * Creates one Attachment Link from the provided arguments.
     *
     * An Attachment Link is a link that associates one Attachment with one object within Lockstep.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param body Documentation pending
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<AttachmentLinkModel[]> uploadAttachment(@NotNull AttachmentLinkModel[] body)
    {
        RestRequest<AttachmentLinkModel[]> r = new RestRequest<AttachmentLinkModel[]>(this.client, "POST", "/api/v1/AttachmentLinks");
        r.AddBody(body);
        return r.Call(AttachmentLinkModel[].class);
    }

    /**
     * Delete the specified link between an object and its attachment.
     *
     * An Attachment Link is a link that associates one Attachment with one object within Lockstep.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param attachmentId Documentation pending
     * @param objectKey Documentation pending
     * @param tableName Documentation pending
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DeleteResult> deleteAttachmentLink(@Nullable String attachmentId, @Nullable String objectKey, @Nullable String tableName)
    {
        RestRequest<DeleteResult> r = new RestRequest<DeleteResult>(this.client, "DELETE", "/api/v1/AttachmentLinks");
        r.AddQuery("attachmentId", attachmentId.toString());
        r.AddQuery("objectKey", objectKey.toString());
        r.AddQuery("tableName", tableName.toString());
        return r.Call(DeleteResult.class);
    }

    /**
     * Queries Attachment Links for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * An Attachment Link is a link that associates one Attachment with one object within Lockstep.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param filter The filter to use to select from the list of available Attachments, in the [Searchlight query syntax](https://github.com/tspence/csharp-searchlight).
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available for querying but may be available in the future.
     * @param order The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize The page size for results (default 250, maximum of 500)
     * @param pageNumber The page number for results (default 0)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<AttachmentLinkModel>> queryAttachmentLinks(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<AttachmentLinkModel>> r = new RestRequest<FetchResult<AttachmentLinkModel>>(this.client, "GET", "/api/v1/AttachmentLinks/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<AttachmentLinkModel>>() {}.getType());
    }
}