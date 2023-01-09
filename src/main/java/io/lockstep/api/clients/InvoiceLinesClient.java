
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
import io.lockstep.api.models.InvoiceLineModel;
import io.lockstep.api.models.DeleteResult;
import io.lockstep.api.models.BulkDeleteRequestModel;

import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to InvoiceLines
 */
public class InvoiceLinesClient
{
    private LockstepApi client;

    /**
     * Constructor for the InvoiceLines API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public InvoiceLinesClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Creates one or more invoice lines within this account and returns the created records
     *
     * @param body Documentation pending
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<InvoiceLineModel[]> createInvoiceLine(@NotNull InvoiceLineModel[] body)
    {
        RestRequest<InvoiceLineModel[]> r = new RestRequest<InvoiceLineModel[]>(this.client, "POST", "/api/v1/invoice-lines");
        r.AddBody(body);
        return r.Call(InvoiceLineModel[].class);
    }

    /**
     *
     * @param body The unique Lockstep Platform ID numbers of the Invoice Lines to delete; NOT the customer's ERP keys
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DeleteResult> deleteInvoiceLines(@NotNull BulkDeleteRequestModel body)
    {
        RestRequest<DeleteResult> r = new RestRequest<DeleteResult>(this.client, "DELETE", "/api/v1/invoice-lines");
        r.AddBody(body);
        return r.Call(DeleteResult.class);
    }

    /**
     *
     * @param invoiceLineId Unique id of the the InvoiceLine
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<InvoiceLineModel> retrievesInvoiceLine(@NotNull String invoiceLineId)
    {
        RestRequest<InvoiceLineModel> r = new RestRequest<InvoiceLineModel>(this.client, "GET", "/api/v1/invoice-lines/{invoiceLineId}");
        r.AddPath("{invoiceLineId}", invoiceLineId.toString());
        return r.Call(InvoiceLineModel.class);
    }

    /**
     * Updates an existing Invoice Line with the information supplied to this PATCH call.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone. As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged. This allows you to ensure that you are only updating the specific fields desired.
     *
     * @param invoiceLineId Unique id of the the InvoiceLine
     * @param body A list of changes to apply to this Invoice Line
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<InvoiceLineModel> updateInvoiceLine(@NotNull String invoiceLineId, @NotNull Object body)
    {
        RestRequest<InvoiceLineModel> r = new RestRequest<InvoiceLineModel>(this.client, "PATCH", "/api/v1/invoice-lines/{invoiceLineId}");
        r.AddPath("{invoiceLineId}", invoiceLineId.toString());
        r.AddBody(body);
        return r.Call(InvoiceLineModel.class);
    }

    /**
     *
     * @param invoiceLineId Unique id of the the InvoiceLine
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DeleteResult> deletesInvoiceLine(@NotNull String invoiceLineId)
    {
        RestRequest<DeleteResult> r = new RestRequest<DeleteResult>(this.client, "DELETE", "/api/v1/invoice-lines/{invoiceLineId}");
        r.AddPath("{invoiceLineId}", invoiceLineId.toString());
        return r.Call(DeleteResult.class);
    }

    /**
     * Queries Invoice Lines for the account using specified filtering More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve.
     * @param order The sort order for the results, in the [Searchlight order syntax]
     * @param pageSize The page size for results (default 200, maximum of 10,000)
     * @param pageNumber The page number for results (default 0)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<InvoiceLineModel>> queryInvoiceLines(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<InvoiceLineModel>> r = new RestRequest<FetchResult<InvoiceLineModel>>(this.client, "GET", "/api/v1/invoice-lines/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<InvoiceLineModel>>() {}.getType());
    }
}
