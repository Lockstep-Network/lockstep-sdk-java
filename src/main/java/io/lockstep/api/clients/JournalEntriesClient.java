
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
import io.lockstep.api.models.JournalEntryModel;

import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to JournalEntries
 */
public class JournalEntriesClient
{
    private LockstepApi client;

    /**
     * Constructor for the JournalEntries API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public JournalEntriesClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Journal Entry specified by this unique identifier, optionally including nested data sets.
     *
     * @param id The unique Lockstep Platform ID number of this journal entry; NOT the customer's ERP key
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Lines, Attachments
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<JournalEntryModel> retrieveJournalEntry(@NotNull String id, @Nullable String include)
    {
        RestRequest<JournalEntryModel> r = new RestRequest<JournalEntryModel>(this.client, "GET", "/api/v1/journal-entries/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(JournalEntryModel.class);
    }

    /**
     * Creates one or more Journal Entries within this account and returns the records as created.
     *
     * @param body The Journal Entries to create
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<JournalEntryModel[]> createJournalEntries(@NotNull JournalEntryModel[] body)
    {
        RestRequest<JournalEntryModel[]> r = new RestRequest<JournalEntryModel[]>(this.client, "POST", "/api/v1/journal-entries");
        r.AddBody(body);
        return r.Call(JournalEntryModel[].class);
    }

    /**
     * Queries Journal Entries for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Lines, Attachments
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<JournalEntryModel>> queryJournalEntries(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<JournalEntryModel>> r = new RestRequest<FetchResult<JournalEntryModel>>(this.client, "GET", "/api/v1/journal-entries/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<JournalEntryModel>>() {}.getType());
    }
}
