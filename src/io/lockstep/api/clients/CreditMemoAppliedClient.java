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



public class CreditMemoAppliedClient
{
    private LockstepApi client;

    public CreditMemoAppliedClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the Credit Memo Application specified by this unique identifier, optionally including nested data sets.
     * 
     * Credit Memos reflect credits granted to a customer for various reasons, such as discounts or refunds. Credit Memos may be applied to Invoices as Payments. When a Credit Memo is applied as payment to an Invoice, Lockstep creates a Credit Memo Application record to track the amount from the Credit Memo that was applied as payment to the Invoice. You can examine Credit Memo Application records to track which Invoices were paid using this Credit.
     * 
     * @param id - The unique Lockstep Platform ID number of this Credit Memo Application; NOT the customer's ERP key
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, Notes
     */
    public LockstepResponse<CreditMemoAppliedModel> RetrieveCreditMemoApplication(String id, String include)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/CreditMemoApplied/{id}");
        r.AddPath("{id}", id);
        r.AddQuery("include", include);
        return this.client.Request<CreditMemoAppliedModel>(r);
    }

    /**
     * Updates an existing Credit memo Application with the information supplied to this PATCH call.
     * 
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.  Credit Memos reflect credits granted to a customer for various reasons, such as discounts or refunds. Credit Memos may be applied to Invoices as Payments. When a Credit Memo is applied as payment to an Invoice, Lockstep creates a Credit Memo Application record to track the amount from the Credit Memo that was applied as payment to the Invoice. You can examine Credit Memo Application records to track which Invoices were paid using this Credit.
     * 
     * @param id - The unique Lockstep Platform ID number of the Credit Memo Application to update; NOT the customer's ERP key
     * @param body - A list of changes to apply to this Credit Memo Application
     */
    public LockstepResponse<CreditMemoAppliedModel> UpdateCreditMemoApplication(String id, object body)
    {
        RestRequest r = new RestRequest("PATCH", "/api/v1/CreditMemoApplied/{id}");
        r.AddPath("{id}", id);
        r.AddBody(body);
        return this.client.Request<CreditMemoAppliedModel>(r);
    }

    /**
     * Deletes the Credit Memo Application referred to by this unique identifier.
     * 
     * Credit Memos reflect credits granted to a customer for various reasons, such as discounts or refunds. Credit Memos may be applied to Invoices as Payments. When a Credit Memo is applied as payment to an Invoice, Lockstep creates a Credit Memo Application record to track the amount from the Credit Memo that was applied as payment to the Invoice. You can examine Credit Memo Application records to track which Invoices were paid using this Credit.
     * 
     * @param id - The unique Lockstep Platform ID number of the Credit Memo Application to delete; NOT the customer's ERP key
     */
    public LockstepResponse<CreditMemoAppliedModel> DeleteCreditMemoApplication(String id)
    {
        RestRequest r = new RestRequest("DELETE", "/api/v1/CreditMemoApplied/{id}");
        r.AddPath("{id}", id);
        return this.client.Request<CreditMemoAppliedModel>(r);
    }

    /**
     * Creates one or more Credit Memo Applications within this account and returns the records as created.
     * 
     * Credit Memos reflect credits granted to a customer for various reasons, such as discounts or refunds. Credit Memos may be applied to Invoices as Payments. When a Credit Memo is applied as payment to an Invoice, Lockstep creates a Credit Memo Application record to track the amount from the Credit Memo that was applied as payment to the Invoice. You can examine Credit Memo Application records to track which Invoices were paid using this Credit.
     * 
     * @param body - The Credit Memo Applications to create
     */
    public LockstepResponse<CreditMemoAppliedModel[]> CreateCreditMemoApplications(CreditMemoAppliedModel[] body)
    {
        RestRequest r = new RestRequest("POST", "/api/v1/CreditMemoApplied");
        r.AddBody(body);
        return this.client.Request<CreditMemoAppliedModel[]>(r);
    }

    /**
     * Queries Credit Memo Applications for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     * 
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.  Credit Memos reflect credits granted to a customer for various reasons, such as discounts or refunds. Credit Memos may be applied to Invoices as Payments. When a Credit Memo is applied as payment to an Invoice, Lockstep creates a Credit Memo Application record to track the amount from the Credit Memo that was applied as payment to the Invoice. You can examine Credit Memo Application records to track which Invoices were paid using this Credit.
     * 
     * @param filter - The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, Notes
     * @param order - The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     */
    public LockstepResponse<FetchResult<CreditMemoAppliedModel>> QueryCreditMemoApplications(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/CreditMemoApplied/query");
        r.AddQuery("filter", filter);
        r.AddQuery("include", include);
        r.AddQuery("order", order);
        r.AddQuery("pageSize", pageSize);
        r.AddQuery("pageNumber", pageNumber);
        return this.client.Request<FetchResult<CreditMemoAppliedModel>>(r);
    }
}
