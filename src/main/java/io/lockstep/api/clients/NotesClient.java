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


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.NoteModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

public class NotesClient
{
    private LockstepApi client;

    public NotesClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the note with the specified note identifier.  A note is a customizable text string that can be attached to various account attributes within Lockstep. You can use notes for internal communication, correspondence with clients, or personal reminders. The Note Model represents a note and a number of different metadata attributes related to the creation, storage, and ownership of the note.
     * 
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     * 
     * @param id - The unique ID number of the Note to retrieve
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     */
    public LockstepResponse<NoteModel> retrieveNote(String id, String include)
    {
        RestRequest<NoteModel> r = new RestRequest<NoteModel>(this.client, "GET", "/api/v1/Notes/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(NoteModel.class);
    }

    /**
     * Archives the Note with the unique ID specified.  A note is a customizable text string that can be attached to various account attributes within Lockstep. You can use notes for internal communication, correspondence with clients, or personal reminders. The Note Model represents a note and a number of different metadata attributes related to the creation, storage, and ownership of the note.
     * 
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     * 
     * @param id - Note id to be archived
     */
    public LockstepResponse<ActionResultModel> archiveNote(String id)
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
     * @param body - The array of notes to be created
     */
    public LockstepResponse<NoteModel[]> createNotes(NoteModel[] body)
    {
        RestRequest<NoteModel[]> r = new RestRequest<NoteModel[]>(this.client, "POST", "/api/v1/Notes");
        r.AddBody(body);
        return r.Call(NoteModel[].class);
    }

    /**
     * Queries Notes on the Lockstep Platform using the specified filtering, sorting, nested fetch, and pagination rules requested.
     * 
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.  A note is a customizable text string that can be attached to various account attributes within Lockstep. You can use notes for internal communication, correspondence with clients, or personal reminders. The Note Model represents a note and a number of different metadata attributes related to the creation, storage, and ownership of the note.
     * 
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     * 
     * @param filter - The filter to use to select from the list of available applications, in the [Searchlight query syntax](https://github.com/tspence/csharp-searchlight).
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order - The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize - The page size for results (default 200, maximum of 10,000)
     * @param pageNumber - The page number for results (default 0)
     */
    public LockstepResponse<FetchResult<NoteModel>> queryNotes(String filter, String include, String order, Integer pageSize, Integer pageNumber)
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
