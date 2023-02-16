
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
import io.lockstep.api.models.AccountingProfileContactModel;

import io.lockstep.api.models.DeleteResult;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.AccountingProfileContactResultModel;

/**
 * Contains all methods related to ProfilesAccountingContacts
 */
public class ProfilesAccountingContactsClient
{
    private LockstepApi client;

    /**
     * Constructor for the ProfilesAccountingContacts API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public ProfilesAccountingContactsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Accounting Profile Contact specified by this unique identifier, optionally including nested data sets.
     *
     * A Contact has a link to a Contact that is associated with your company's Accounting Profile. A profile has one primary contact and any number of secondary contacts.
     *
     * @param id The unique Lockstep Platform ID number of this Accounting Profile Contact
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<AccountingProfileContactModel> retrieveAccountingProfileContact(@NotNull String id)
    {
        RestRequest<AccountingProfileContactModel> r = new RestRequest<AccountingProfileContactModel>(this.client, "GET", "/api/v1/profiles/accounting/contacts/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(AccountingProfileContactModel.class);
    }

    /**
     * Delete the Accounting Profile Contact referred to by this unique identifier.
     *
     * An Accounting Profile Contact has a link to a Contact that is associated with your company's Accounting Profile. A profile has one primary contact and any number of secondary contacts.
     *
     * @param id The unique Lockstep Platform ID number of the Accounting Profile Contact to delete
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DeleteResult> deleteAccountingProfileContact(@NotNull String id)
    {
        RestRequest<DeleteResult> r = new RestRequest<DeleteResult>(this.client, "DELETE", "/api/v1/profiles/accounting/contacts/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(DeleteResult.class);
    }

    /**
     * Creates one or more Accounting Profile Contacts from a given model.
     *
     * An Accounting Profile Contact has a link to a Contact that is associated with your company's Accounting Profile. A profile has one primary contact and any number of secondary contacts.
     *
     * @param body The Accounting Profile Contacts to create
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<AccountingProfileContactModel[]> createAccountingProfileContacts(@NotNull AccountingProfileContactModel[] body)
    {
        RestRequest<AccountingProfileContactModel[]> r = new RestRequest<AccountingProfileContactModel[]>(this.client, "POST", "/api/v1/profiles/accounting/contacts");
        r.AddBody(body);
        return r.Call(AccountingProfileContactModel[].class);
    }

    /**
     * Queries Accounting Profile Contacts for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * An Accounting Profile Contact has a link to a Contact that is associated with your company's Accounting Profile. A profile has one primary contact and any number of secondary contacts.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: None
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<AccountingProfileContactModel>> queryAccountingProfileContacts(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<AccountingProfileContactModel>> r = new RestRequest<FetchResult<AccountingProfileContactModel>>(this.client, "GET", "/api/v1/profiles/accounting/contacts/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<AccountingProfileContactModel>>() {}.getType());
    }

    /**
     * Queries Accounting Profile Contacts and Contacts for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * An Accounting Profile Contact has a link to a Contact that is associated with your company's Accounting Profile. A profile has one primary contact and any number of secondary contacts.
     *
     * A Contact contains information about a person or role within a Company. You can use Contacts to track information about who is responsible for a specific project, who handles invoices, or information about which role at a particular customer or vendor you should speak with about invoices.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: None
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<AccountingProfileContactResultModel>> queryLinkedAccountingProfileContacts(@Nullable String filter, @Nullable String order, @Nullable String include, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<AccountingProfileContactResultModel>> r = new RestRequest<FetchResult<AccountingProfileContactResultModel>>(this.client, "GET", "/api/v1/profiles/accounting/contacts/query/models");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<AccountingProfileContactResultModel>>() {}.getType());
    }

    /**
     * Reverses the isPrimary fields on the primary and secondary contact to reflect a swap and returns the new primary accounting profile contact model.
     *
     * An Accounting Profile Contact has a link to a Contact that is associated with your company's Accounting Profile. A profile has one primary contact and any number of secondary contacts.
     *
     * @param id The unique Lockstep Platform ID number of the Accounting Profile Contact to set as primary
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<AccountingProfileContactModel> setSecondaryContactasPrimary(@NotNull String id)
    {
        RestRequest<AccountingProfileContactModel> r = new RestRequest<AccountingProfileContactModel>(this.client, "PATCH", "/api/v1/profiles/accounting/contacts/{id}/primary");
        r.AddPath("{id}", id.toString());
        return r.Call(AccountingProfileContactModel.class);
    }
}
