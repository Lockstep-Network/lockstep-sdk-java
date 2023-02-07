
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
import io.lockstep.api.models.AccountingProfileModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.AccountingProfileRequest;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to ProfilesAccounting
 */
public class ProfilesAccountingClient
{
    private LockstepApi client;

    /**
     * Constructor for the ProfilesAccounting API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public ProfilesAccountingClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Accounting Profile specified by this unique identifier, optionally including nested data sets.
     *
     * An Accounting Profile is a child of a Company Profile, and collectively, they comprise the identity and necessary information for an accounting  team to work with trading partners, financial institutions, auditors, and others. You can use Accounting Profiles to define an accounting function by what the function does and how to interface with the function.
     *
     * @param id The unique Lockstep Platform ID number of this Accounting Profile
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, Notes
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<AccountingProfileModel> retrieveAccountingProfile(@NotNull String id, @Nullable String include)
    {
        RestRequest<AccountingProfileModel> r = new RestRequest<AccountingProfileModel>(this.client, "GET", "/api/v1/profiles/accounting/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(AccountingProfileModel.class);
    }

    /**
     * Updates an accounting profile that matches the specified id with the requested information.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * An Accounting Profile is a child of a Company Profile, and collectively, they comprise the identity and necessary information for an accounting  team to work with trading partners, financial institutions, auditors, and others. You can use Accounting Profiles to define an accounting function by what the function does and how to interface with the function.
     *
     * @param id The unique Lockstep Platform ID number of the Accounting Profile to update
     * @param body A list of changes to apply to this Accounting Profile
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<AccountingProfileModel> updateAccountingProfile(@NotNull String id, @NotNull Object body)
    {
        RestRequest<AccountingProfileModel> r = new RestRequest<AccountingProfileModel>(this.client, "PATCH", "/api/v1/profiles/accounting/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(AccountingProfileModel.class);
    }

    /**
     * Delete the Accounting Profile referred to by this unique identifier.
     *
     * An Accounting Profile is a child of a Company Profile, and collectively, they comprise the identity and necessary information for an accounting  team to work with trading partners, financial institutions, auditors, and others. You can use Accounting Profiles to define an accounting function by what the function does and how to interface with the function.
     *
     * @param id The unique Lockstep Platform ID number of the Accounting Profile to disable
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> deleteAccountingProfile(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/profiles/accounting/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more accounting profiles from a given model.
     *
     * An Accounting Profile is a child of a Company Profile, and collectively, they comprise the identity and necessary information for an accounting  team to work with trading partners, financial institutions, auditors, and others. You can use Accounting Profiles to define an accounting function by what the function does and how to interface with the function.
     *
     * @param body The Accounting Profiles to create
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<AccountingProfileModel[]> createAccountingProfiles(@NotNull AccountingProfileRequest[] body)
    {
        RestRequest<AccountingProfileModel[]> r = new RestRequest<AccountingProfileModel[]>(this.client, "POST", "/api/v1/profiles/accounting");
        r.AddBody(body);
        return r.Call(AccountingProfileModel[].class);
    }

    /**
     * Queries Accounting Profiles for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * An Accounting Profile is a child of a Company Profile, and collectively, they comprise the identity and necessary information for an accounting  team to work with trading partners, financial institutions, auditors, and others. You can use Accounting Profiles to define an accounting function by what the function does and how to interface with the function.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, Notes
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<AccountingProfileModel>> queryAccountingProfiles(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<AccountingProfileModel>> r = new RestRequest<FetchResult<AccountingProfileModel>>(this.client, "GET", "/api/v1/profiles/accounting/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<AccountingProfileModel>>() {}.getType());
    }
}
