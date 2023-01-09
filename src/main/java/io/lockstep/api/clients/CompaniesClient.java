
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
import io.lockstep.api.models.CompanyModel;

import io.lockstep.api.models.DeleteResult;
import io.lockstep.api.models.BulkDeleteRequestModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.CustomerSummaryModel;
import io.lockstep.api.models.VendorSummaryModel;
import io.lockstep.api.models.CompanyDetailsModel;
import io.lockstep.api.BlobRequest;
import io.lockstep.api.models.ViewBoxSettingsModel;

/**
 * Contains all methods related to Companies
 */
public class CompaniesClient
{
    private LockstepApi client;

    /**
     * Constructor for the Companies API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public CompaniesClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Company specified by this unique identifier, optionally including nested data sets.
     *
     * A Company represents a customer, a vendor, or a company within the organization of the account holder. Companies can have parents and children, representing an organizational hierarchy of corporate entities. You can use Companies to track projects and financial data under this Company label.
     *
     * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
     *
     * @param id The unique Lockstep Platform ID number of this Company; NOT the customer's ERP key
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, Contacts, CustomFields, Invoices, Notes, Classification
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<CompanyModel> retrieveCompany(@NotNull String id, @Nullable String include)
    {
        RestRequest<CompanyModel> r = new RestRequest<CompanyModel>(this.client, "GET", "/api/v1/Companies/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(CompanyModel.class);
    }

    /**
     * Updates a Company that matches the specified id with the requested information.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * A Company represents a customer, a vendor, or a company within the organization of the account holder. Companies can have parents and children, representing an organizational hierarchy of corporate entities. You can use Companies to track projects and financial data under this Company label.
     *
     * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
     *
     * @param id The unique Lockstep Platform ID number of this Company; NOT the customer's ERP key
     * @param body A list of changes to apply to this Company
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<CompanyModel> updateCompany(@NotNull String id, @NotNull Object body)
    {
        RestRequest<CompanyModel> r = new RestRequest<CompanyModel>(this.client, "PATCH", "/api/v1/Companies/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(CompanyModel.class);
    }

    /**
     * Delete the Company referred to by this unique identifier.
     *
     * A Company represents a customer, a vendor, or a company within the organization of the account holder. Companies can have parents and children, representing an organizational hierarchy of corporate entities. You can use Companies to track projects and financial data under this Company label.
     *
     * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
     *
     * @param id The unique Lockstep Platform ID number of this Company; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DeleteResult> deleteCompany(@NotNull String id)
    {
        RestRequest<DeleteResult> r = new RestRequest<DeleteResult>(this.client, "DELETE", "/api/v1/Companies/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(DeleteResult.class);
    }

    /**
     * Creates one or more Companies from a given model.
     *
     * A Company represents a customer, a vendor, or a company within the organization of the account holder. Companies can have parents and children, representing an organizational hierarchy of corporate entities. You can use Companies to track projects and financial data under this Company label.
     *
     * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
     *
     * @param body The Companies to create
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<CompanyModel[]> createCompanies(@NotNull CompanyModel[] body)
    {
        RestRequest<CompanyModel[]> r = new RestRequest<CompanyModel[]>(this.client, "POST", "/api/v1/Companies");
        r.AddBody(body);
        return r.Call(CompanyModel[].class);
    }

    /**
     * Delete the Companies referred to by these unique identifiers.
     *
     * A Company represents a customer, a vendor, or a company within the organization of the account holder. Companies can have parents and children, representing an organizational hierarchy of corporate entities. You can use Companies to track projects and financial data under this Company label.
     *
     * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
     *
     * @param body The unique Lockstep Platform ID numbers of the Companies to delete; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DeleteResult> deleteCompanies(@NotNull BulkDeleteRequestModel body)
    {
        RestRequest<DeleteResult> r = new RestRequest<DeleteResult>(this.client, "DELETE", "/api/v1/Companies");
        r.AddBody(body);
        return r.Call(DeleteResult.class);
    }

    /**
     * Queries Companies for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A Company represents a customer, a vendor, or a company within the organization of the account holder. Companies can have parents and children, representing an organizational hierarchy of corporate entities. You can use Companies to track projects and financial data under this Company label.
     *
     * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, Contacts, CustomFields, Invoices, Notes, Classification
     * @param order The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize The page size for results (default 250, maximum of 500)
     * @param pageNumber The page number for results (default 0)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<CompanyModel>> queryCompanies(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<CompanyModel>> r = new RestRequest<FetchResult<CompanyModel>>(this.client, "GET", "/api/v1/Companies/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<CompanyModel>>() {}.getType());
    }

    /**
     * Queries Customer Summaries for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * The Customer Summary View represents a slightly different view of the data and includes some extra fields that might be useful. For more information, see the data format of the Customer Summary Model.
     *
     * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize The page size for results (default 250, maximum of 500)
     * @param pageNumber The page number for results (default 0)
     * @param reportDate The date to calculate the fields on. If no date is entered the current UTC date will be used.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<CustomerSummaryModel>> queryCustomerSummary(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber, @Nullable String reportDate)
    {
        RestRequest<FetchResult<CustomerSummaryModel>> r = new RestRequest<FetchResult<CustomerSummaryModel>>(this.client, "GET", "/api/v1/Companies/views/customer-summary");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        r.AddQuery("reportDate", reportDate.toString());
        return r.Call(new TypeToken<FetchResult<CustomerSummaryModel>>() {}.getType());
    }

    /**
     * Queries Vendor Summaries for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * The Vendor Summary View represents a slightly different view of the data and includes some extra fields that might be useful. For more information, see the data format of the Vendor Summary Model.
     *
     * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize The page size for results (default 250, maximum of 500)
     * @param pageNumber The page number for results (default 0)
     * @param reportDate The date to calculate the fields on. If no date is entered the current UTC date will be used.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<VendorSummaryModel>> queryVendorSummary(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber, @Nullable String reportDate)
    {
        RestRequest<FetchResult<VendorSummaryModel>> r = new RestRequest<FetchResult<VendorSummaryModel>>(this.client, "GET", "/api/v1/Companies/views/vendor-summary");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        r.AddQuery("reportDate", reportDate.toString());
        return r.Call(new TypeToken<FetchResult<VendorSummaryModel>>() {}.getType());
    }

    /**
     * Retrieves the Company Details specified by this unique identifier, optionally including nested data sets.
     *
     * The Company Detail View represents a slightly different view of the data and includes some extra fields that might be useful. For more information, see the data format of the Company Detail Model.
     *
     * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
     *
     * @param id The unique Lockstep Platform ID number of this Company; NOT the company's ERP key
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<CompanyDetailsModel> retrieveCompanyDetail(@NotNull String id)
    {
        RestRequest<CompanyDetailsModel> r = new RestRequest<CompanyDetailsModel>(this.client, "GET", "/api/v1/Companies/views/details/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(CompanyDetailsModel.class);
    }

    /**
     * Sets the logo for specified company. The logo will be stored in the Lockstep Platform and will be **publicly accessible**.
     *
     * .jpg, .jpeg, .png, and .webp are supported. 2MB maximum. If no logo is uploaded, the existing logo will be deleted.
     *
     * A Company represents a customer, a vendor, or a company within the organization of the account holder. Companies can have parents and children, representing an organizational hierarchy of corporate entities. You can use Companies to track projects and financial data under this Company label.
     *
     * Optional view box meta data for the provided logo may be supplied using the following query parameters. Please note that you must supply either all of the values or none of the values. <ul><li>min_x</li><li>min_y</li><li>width</li><li>height</li></ul>
     *
     * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
     *
     * @param id The unique Lockstep Platform ID number of this Company; NOT the customer's ERP key
     * @param min_x ViewBox minX setting for this Company's logo.
     * @param min_y ViewBox minY setting for this Company's logo.
     * @param width ViewBox width setting for this Company's logo.
     * @param height ViewBox height setting for this Company's logo.
     * @param filename The full path of a file to upload to the API
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<CompanyModel> setCompanyLogo(@NotNull String id, @Nullable Double min_x, @Nullable Double min_y, @Nullable Double width, @Nullable Double height, @NotNull byte[] filename)
    {
        RestRequest<CompanyModel> r = new RestRequest<CompanyModel>(this.client, "POST", "/api/v1/Companies/{id}/logo");
        r.AddPath("{id}", id.toString());
        r.AddQuery("min_x", min_x.toString());
        r.AddQuery("min_y", min_y.toString());
        r.AddQuery("width", width.toString());
        r.AddQuery("height", height.toString());
        return r.Call(CompanyModel.class);
    }

    /**
     * Update view box meta data for the given Company id.
     *
     * @param id The unique Lockstep Platform ID number of this Company; NOT the customer's ERP key
     * @param body The `ViewBoxSettingsModel` containing meta data value updates
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<CompanyModel> updatelogoviewboxsettings(@NotNull String id, @NotNull ViewBoxSettingsModel body)
    {
        RestRequest<CompanyModel> r = new RestRequest<CompanyModel>(this.client, "PATCH", "/api/v1/Companies/{id}/logo-settings");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(CompanyModel.class);
    }
}
