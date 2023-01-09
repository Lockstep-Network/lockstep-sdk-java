
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
import io.lockstep.api.models.InvoiceAddressModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to InvoiceAddresses
 */
public class InvoiceAddressesClient
{
    private LockstepApi client;

    /**
     * Constructor for the InvoiceAddresses API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public InvoiceAddressesClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the invoice address specified by this unique identifier, optionally including nested data sets.
     *
     * An Invoice Address contains address information about an invoice. You can use Invoice Addresses to track information about locations important to an invoice such as: where a company's goods are shipped from, where a company's goods are shipped to or billing addresses to name a few.
     *
     * @param id The unique ID number of this invoice address
     * @param include To fetch additional data on this object, specify the list of elements to retrieve.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<InvoiceAddressModel> retrieveInvoiceAddress(@NotNull String id, @Nullable String include)
    {
        RestRequest<InvoiceAddressModel> r = new RestRequest<InvoiceAddressModel>(this.client, "GET", "/api/v1/invoice-addresses/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(InvoiceAddressModel.class);
    }

    /**
     * Deletes the Invoice Address by this unique identifier.
     *
     * An Invoice Address contains address information about an invoice. You can use Invoice Addresses to track information about locations important to an invoice such as: where a company's goods are shipped from, where a company's goods are shipped to or billing addresses to name a few.
     *
     * @param id The unique ID of the Invoice Address to delete
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> deleteInvoiceAddress(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/invoice-addresses/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Updates an existing Invoice Address with the information supplied to this PATCH call.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone. As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged. This allows you to ensure that you are only updating the specific fields desired.
     *
     * An Invoice Address contains address information about an invoice. You can use Invoice Addresses to track information about locations important to an invoice such as: where a company's goods are shipped from, where a company's goods are shipped to or billing addresses to name a few.
     *
     * @param id The unique ID number of the Invoice Address to update
     * @param body A list of changes to apply to this Invoice Address
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<InvoiceAddressModel> updateInvoiceAddress(@NotNull String id, @NotNull Object body)
    {
        RestRequest<InvoiceAddressModel> r = new RestRequest<InvoiceAddressModel>(this.client, "PATCH", "/api/v1/invoice-addresses/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(InvoiceAddressModel.class);
    }

    /**
     * Creates one or more Invoice Addresses within this account and returns the records as created.
     *
     * An Invoice Address contains address information about an invoice. You can use Invoice Addresses to track information about locations important to an invoice such as: where a company's goods are shipped from, where a company's goods are shipped to or billing addresses to name a few.
     *
     * @param body The Invoice Address to create
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<InvoiceAddressModel[]> createInvoiceAddress(@NotNull InvoiceAddressModel[] body)
    {
        RestRequest<InvoiceAddressModel[]> r = new RestRequest<InvoiceAddressModel[]>(this.client, "POST", "/api/v1/invoice-addresses");
        r.AddBody(body);
        return r.Call(InvoiceAddressModel[].class);
    }

    /**
     * Queries Invoice Addresses for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
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
    public @NotNull LockstepResponse<FetchResult<InvoiceAddressModel>> queryInvoiceAddresses(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<InvoiceAddressModel>> r = new RestRequest<FetchResult<InvoiceAddressModel>>(this.client, "GET", "/api/v1/invoice-addresses/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<InvoiceAddressModel>>() {}.getType());
    }
}
