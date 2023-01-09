
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
import io.lockstep.api.models.PaymentAppliedModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to PaymentsApplied
 */
public class PaymentsAppliedClient
{
    private LockstepApi client;

    /**
     * Constructor for the PaymentsApplied API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public PaymentsAppliedClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Payment Applied specified by this unique identifier, optionally including nested data sets.
     *
     * A Payment Applied is created by a business who receives a Payment from a customer.  A customer may make a single Payment to match an Invoice exactly, a partial Payment for an Invoice, or a single Payment may be made for multiple smaller Invoices.  The Payment Applied contains information about which Invoices are connected to which Payments and for which amounts.
     *
     * @param id The unique Lockstep Platform ID number of this Payment Applied; NOT the customer's ERP key
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Invoice, Payment
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PaymentAppliedModel> retrievePaymentApplied(@NotNull String id, @Nullable String include)
    {
        RestRequest<PaymentAppliedModel> r = new RestRequest<PaymentAppliedModel>(this.client, "GET", "/api/v1/payments-applied/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(PaymentAppliedModel.class);
    }

    /**
     * Updates an existing Payment Applied with the information supplied to this PATCH call.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * A Payment Applied is created by a business who receives a Payment from a customer.  A customer may make a single Payment to match an Invoice exactly, a partial Payment for an Invoice, or a single Payment may be made for multiple smaller Invoices.  The Payment Applied contains information about which Invoices are connected to which Payments and for which amounts.
     *
     * @param id The unique Lockstep Platform ID number of the Payment Applied to update; NOT the customer's ERP key
     * @param body A list of changes to apply to this Payment Applied
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PaymentAppliedModel> updatePaymentApplied(@NotNull String id, @NotNull Object body)
    {
        RestRequest<PaymentAppliedModel> r = new RestRequest<PaymentAppliedModel>(this.client, "PATCH", "/api/v1/payments-applied/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(PaymentAppliedModel.class);
    }

    /**
     * Deletes the Payment Applied referred to by this unique identifier.
     *
     * A Payment Applied is created by a business who receives a Payment from a customer.  A customer may make a single Payment to match an Invoice exactly, a partial Payment for an Invoice, or a single Payment may be made for multiple smaller Invoices.  The Payment Applied contains information about which Invoices are connected to which Payments and for which amounts.
     *
     * @param id The unique Lockstep Platform ID number of the Payment Applied to delete; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> deletePaymentApplied(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/payments-applied/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more Payments Applied within this account and returns the records as created.
     *
     * A Payment Applied is created by a business who receives a Payment from a customer.  A customer may make a single Payment to match an Invoice exactly, a partial Payment for an Invoice, or a single Payment may be made for multiple smaller Invoices.  The Payment Applied contains information about which Invoices are connected to which Payments and for which amounts.
     *
     * @param body The Payments Applied to create
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PaymentAppliedModel[]> createPaymentsApplied(@NotNull PaymentAppliedModel[] body)
    {
        RestRequest<PaymentAppliedModel[]> r = new RestRequest<PaymentAppliedModel[]>(this.client, "POST", "/api/v1/payments-applied");
        r.AddBody(body);
        return r.Call(PaymentAppliedModel[].class);
    }

    /**
     * Queries Payments Applied for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A Payment Applied is created by a business who receives a Payment from a customer.  A customer may make a single Payment to match an Invoice exactly, a partial Payment for an Invoice, or a single Payment may be made for multiple smaller Invoices.  The Payment Applied contains information about which Invoices are connected to which Payments and for which amounts.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Invoice
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<PaymentAppliedModel>> queryPaymentsApplied(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<PaymentAppliedModel>> r = new RestRequest<FetchResult<PaymentAppliedModel>>(this.client, "GET", "/api/v1/payments-applied/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<PaymentAppliedModel>>() {}.getType());
    }
}
