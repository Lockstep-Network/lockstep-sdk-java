
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
import io.lockstep.api.models.PaymentModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.BlobRequest;
import io.lockstep.api.models.PaymentSummaryModelPaymentSummaryTotalsModelSummaryFetchResult;
import io.lockstep.api.models.PaymentDetailHeaderModel;
import io.lockstep.api.models.PaymentDetailModel;

/**
 * Contains all methods related to Payments
 */
public class PaymentsClient
{
    private LockstepApi client;

    /**
     * Constructor for the Payments API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public PaymentsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Payment specified by this unique identifier, optionally including nested data sets.
     *
     * A Payment represents money sent from one company to another.  A single payment may contain payments for one or more invoices; it is also possible for payments to be made in advance of an invoice, for example, as a deposit.  The creator of the Payment is identified by the `CustomerId` field, and the recipient of the Payment is identified by the `CompanyId` field.  Most Payments are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the Payment.  Payments that have not been fully applied have a nonzero `UnappliedAmount` value, which represents a deposit that has been paid and not yet applied to an Invoice.
     *
     * @param id The unique Lockstep Platform ID number of this Payment; NOT the customer's ERP key
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Applications, Notes, Attachments, CustomFields
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PaymentModel> retrievePayment(@NotNull String id, @Nullable String include)
    {
        RestRequest<PaymentModel> r = new RestRequest<PaymentModel>(this.client, "GET", "/api/v1/Payments/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(PaymentModel.class);
    }

    /**
     * Updates an existing Payment with the information supplied to this PATCH call.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * A Payment represents money sent from one company to another.  A single payment may contain payments for one or more invoices; it is also possible for payments to be made in advance of an invoice, for example, as a deposit.  The creator of the Payment is identified by the `CustomerId` field, and the recipient of the Payment is identified by the `CompanyId` field.  Most Payments are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the Payment.  Payments that have not been fully applied have a nonzero `UnappliedAmount` value, which represents a deposit that has been paid and not yet applied to an Invoice.
     *
     * @param id The unique Lockstep Platform ID number of the Payment to update; NOT the customer's ERP key
     * @param body A list of changes to apply to this Payment
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PaymentModel> updatePayment(@NotNull String id, @NotNull Object body)
    {
        RestRequest<PaymentModel> r = new RestRequest<PaymentModel>(this.client, "PATCH", "/api/v1/Payments/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(PaymentModel.class);
    }

    /**
     * Deletes the Payment referred to by this unique identifier.
     *
     * A Payment represents money sent from one company to another.  A single payment may contain payments for one or more invoices; it is also possible for payments to be made in advance of an invoice, for example, as a deposit.  The creator of the Payment is identified by the `CustomerId` field, and the recipient of the Payment is identified by the `CompanyId` field.  Most Payments are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the Payment.  Payments that have not been fully applied have a nonzero `UnappliedAmount` value, which represents a deposit that has been paid and not yet applied to an Invoice.
     *
     * @param id The unique Lockstep Platform ID number of the Payment to delete; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> deletePayment(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/Payments/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more Payments within this account and returns the records as created.
     *
     * A Payment represents money sent from one company to another.  A single payment may contain payments for one or more invoices; it is also possible for payments to be made in advance of an invoice, for example, as a deposit.  The creator of the Payment is identified by the `CustomerId` field, and the recipient of the Payment is identified by the `CompanyId` field.  Most Payments are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the Payment.  Payments that have not been fully applied have a nonzero `UnappliedAmount` value, which represents a deposit that has been paid and not yet applied to an Invoice.
     *
     * @param body The Payments to create
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PaymentModel[]> createPayments(@NotNull PaymentModel[] body)
    {
        RestRequest<PaymentModel[]> r = new RestRequest<PaymentModel[]>(this.client, "POST", "/api/v1/Payments");
        r.AddBody(body);
        return r.Call(PaymentModel[].class);
    }

    /**
     * Queries Payments for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A Payment represents money sent from one company to another.  A single payment may contain payments for one or more invoices; it is also possible for payments to be made in advance of an invoice, for example, as a deposit.  The creator of the Payment is identified by the `CustomerId` field, and the recipient of the Payment is identified by the `CompanyId` field.  Most Payments are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the Payment.  Payments that have not been fully applied have a nonzero `UnappliedAmount` value, which represents a deposit that has been paid and not yet applied to an Invoice.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Applications, Notes, Attachments, CustomFields
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<PaymentModel>> queryPayments(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<PaymentModel>> r = new RestRequest<FetchResult<PaymentModel>>(this.client, "GET", "/api/v1/Payments/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<PaymentModel>>() {}.getType());
    }

    /**
     * Retrieves a PDF file for this payment if it has been synced using an app enrollment to one of the supported apps.
     *
     * QuickBooks Online supports AR Payments.
     *
     * For other ERPs, the supported types will depend on the synced data.
     *
     * @param id The unique Lockstep Platform ID number of this payment; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<byte[]> retrievepaymentPDF(@NotNull String id)
    {
        BlobRequest r = new BlobRequest(this.client, "GET", "/api/v1/Payments/{id}/pdf");
        r.AddPath("{id}", id.toString());
        return r.Call();
    }

    /**
     * Checks for whether a PDF file for this payment exists if it has been synced using an app enrollment to one of the supported apps.
     *
     * QuickBooks Online supports AR Payments.
     *
     * For other ERPs, the supported types will depend on the synced data.
     *
     * @param id The unique Lockstep Platform ID number of this payment; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<byte[]> checkpaymentPDF(@NotNull String id)
    {
        BlobRequest r = new BlobRequest(this.client, "HEAD", "/api/v1/Payments/{id}/pdf");
        r.AddPath("{id}", id.toString());
        return r.Call();
    }

    /**
     * Queries Payments for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.  This query endpoint provides extra data about the summary of payment information.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A Payment represents money sent from one company to another.  A single payment may contain payments for one or more invoices; it is also possible for payments to be made in advance of an invoice, for example, as a deposit.  The creator of the Payment is identified by the `CustomerId` field, and the recipient of the Payment is identified by the `CompanyId` field.  Most Payments are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the Payment.  Payments that have not been fully applied have a nonzero `UnappliedAmount` value, which represents a deposit that has been paid and not yet applied to an Invoice.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Summary, Aging
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PaymentSummaryModelPaymentSummaryTotalsModelSummaryFetchResult> queryPaymentSummaryView(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<PaymentSummaryModelPaymentSummaryTotalsModelSummaryFetchResult> r = new RestRequest<PaymentSummaryModelPaymentSummaryTotalsModelSummaryFetchResult>(this.client, "GET", "/api/v1/Payments/views/summary");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(PaymentSummaryModelPaymentSummaryTotalsModelSummaryFetchResult.class);
    }

    /**
     * Retrieves aggregated payment data from your account.
     *
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PaymentDetailHeaderModel> retrievePaymentDetailHeader()
    {
        RestRequest<PaymentDetailHeaderModel> r = new RestRequest<PaymentDetailHeaderModel>(this.client, "GET", "/api/v1/Payments/views/detail-header");
        return r.Call(PaymentDetailHeaderModel.class);
    }

    /**
     * Queries Payments within the Lockstep platform using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website. A Payment represents money sent from one company to another. A single payment may contain payments for one or more invoices; it is also possible for payments to be made in advance of an invoice, for example, as a deposit. The creator of the Payment is identified by the CustomerId field, and the recipient of the Payment is identified by the CompanyId field. Most Payments are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the Payment. Payments that have not been fully applied have a nonzero UnappliedAmount value, which represents a deposit that has been paid and not yet applied to an Invoice.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<PaymentDetailModel>> queryPaymentDetailView(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<PaymentDetailModel>> r = new RestRequest<FetchResult<PaymentDetailModel>>(this.client, "GET", "/api/v1/Payments/views/detail");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<PaymentDetailModel>>() {}.getType());
    }
}
