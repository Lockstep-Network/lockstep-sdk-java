
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
import io.lockstep.api.models.NoteModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to Notes
 */
public class NotesClient
{
    private LockstepApi client;

    /**
     * Constructor for the Notes API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public NotesClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the note with the specified note identifier.
     *
     * A note is a customizable text string that can be attached to various account attributes within Lockstep. You can use notes for internal communication, correspondence with clients, or personal reminders. The Note Model represents a note and a number of different metadata attributes related to the creation, storage, and ownership of the note.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param id The unique ID number of the Note to retrieve
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<NoteModel> retrieveNote(@NotNull String id, @Nullable String include)
    {
        RestRequest<NoteModel> r = new RestRequest<NoteModel>(this.client, "GET", "/api/v1/Notes/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(NoteModel.class);
    }

    /**
     * Archives the Note with the unique ID specified.
     *
     * A note is a customizable text string that can be attached to various account attributes within Lockstep. You can use notes for internal communication, correspondence with clients, or personal reminders. The Note Model represents a note and a number of different metadata attributes related to the creation, storage, and ownership of the note.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param id Note id to be archived
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> archiveNote(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/Notes/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more notes from the specified array of Note Models
     *
     * A note is a customizable text string that can be attached to various account attributes within Lockstep. You can use notes for internal communication, correspondence with clients, or personal reminders. The Note Model represents a note and a number of different metadata attributes related to the creation, storage, and ownership of the note.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param body The array of notes to be created
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<NoteModel[]> createNotes(@NotNull NoteModel[] body)
    {
        RestRequest<NoteModel[]> r = new RestRequest<NoteModel[]>(this.client, "POST", "/api/v1/Notes");
        r.AddBody(body);
        return r.Call(NoteModel[].class);
    }

    /**
     * Queries Notes on the Lockstep Platform using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A note is a customizable text string that can be attached to various account attributes within Lockstep. You can use notes for internal communication, correspondence with clients, or personal reminders. The Note Model represents a note and a number of different metadata attributes related to the creation, storage, and ownership of the note.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param filter The filter to use to select from the list of available applications, in the [Searchlight query syntax](https://github.com/tspence/csharp-searchlight).
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize The page size for results (default 250, maximum of 500)
     * @param pageNumber The page number for results (default 0)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<NoteModel>> queryNotes(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<NoteModel>> r = new RestRequest<FetchResult<NoteModel>>(this.client, "GET", "/api/v1/Notes/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<NoteModel>>() {}.getType());
    }
}
