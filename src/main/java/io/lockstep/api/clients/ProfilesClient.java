
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.LockstepResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import io.lockstep.api.models.PublicCompanyProfileModel;

import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to Profiles
 */
public class ProfilesClient
{
    private LockstepApi client;

    /**
     * Constructor for the Profiles API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public ProfilesClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Public Company Profile specified by the public url slug.
     *
     * A Public Company Profile makes available the following information: <ul><li>Company Name</li><li>Company Logo Url</li><li>Description</li><li>Website</li></ul>
     *
     * @param urlSlug Documentation pending
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PublicCompanyProfileModel> retrievePublicCompanyProfile(@NotNull String urlSlug)
    {
        RestRequest<PublicCompanyProfileModel> r = new RestRequest<PublicCompanyProfileModel>(this.client, "GET", "/api/v1/Profiles/companies/{urlSlug}");
        r.AddPath("{urlSlug}", urlSlug.toString());
        return r.Call(PublicCompanyProfileModel.class);
    }

    /**
     * Queries Public Company Profiles
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A Public Company Profile makes available the following information:
     *
     * <ul><li>Company Name</li><li>Company Logo Url</li><li>Description</li><li>Website</li></ul>
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param order The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize The page size for results (default 200, maximum of 10,000)
     * @param pageNumber The page number for results (default 0)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<PublicCompanyProfileModel>> queryPublicCompanyProfiles(@Nullable String filter, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<PublicCompanyProfileModel>> r = new RestRequest<FetchResult<PublicCompanyProfileModel>>(this.client, "GET", "/api/v1/Profiles/companies/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<PublicCompanyProfileModel>>() {}.getType());
    }
}
