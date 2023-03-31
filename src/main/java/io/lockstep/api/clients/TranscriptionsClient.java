
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
import io.lockstep.api.models.TranscriptionValidationRequestModel;

import io.lockstep.api.models.DeleteResult;
import io.lockstep.api.models.TranscriptionRequestSubmit;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.TranscriptionValidationRequestItemModel;
import io.lockstep.api.models.EmailReplyGeneratorResponse;
import io.lockstep.api.models.EmailReplyGeneratorRequest;

/**
 * Contains all methods related to Transcriptions
 */
public class TranscriptionsClient
{
    private LockstepApi client;

    /**
     * Constructor for the Transcriptions API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public TranscriptionsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Transcription Validation Request specified by this unique identifier, optionally including nested data sets.
     *
     * A Transcription Validation Request represents a collection of files sent from the client to verify the file type using the machine learning platform Sage AI.
     *
     * @param id The unique Lockstep Platform ID number of the transcription validation request
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Items
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<TranscriptionValidationRequestModel> retrieveTranscriptionValidationRequest(@NotNull String id, @Nullable String include)
    {
        RestRequest<TranscriptionValidationRequestModel> r = new RestRequest<TranscriptionValidationRequestModel>(this.client, "GET", "/api/v1/Transcriptions/validate/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(TranscriptionValidationRequestModel.class);
    }

    /**
     * Updates an existing Transcription Validation Request with the information supplied to this PATCH call.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * A Transcription Validation Request represents a collection of files sent from the client to verify the file type using the machine learning platform Sage AI.
     *
     * @param id The unique Lockstep Platform ID number of the Transcription Validation Request to update
     * @param body A list of changes to apply to this Transcription Validation Request
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<TranscriptionValidationRequestModel> updateTranscriptionValidationRequest(@NotNull String id, @NotNull Object body)
    {
        RestRequest<TranscriptionValidationRequestModel> r = new RestRequest<TranscriptionValidationRequestModel>(this.client, "PATCH", "/api/v1/Transcriptions/validate/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(TranscriptionValidationRequestModel.class);
    }

    /**
     * Deletes the Transcription Validation Request and all associated items referred to by this unique identifier.
     *
     * A Transcription Validation Request represents a collection of files sent from the client to verify the file type using the machine learning platform Sage AI.
     *
     * @param id The unique Lockstep Platform ID number of the transcription validation request to delete
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DeleteResult> deleteTranscriptionValidationRequest(@NotNull String id)
    {
        RestRequest<DeleteResult> r = new RestRequest<DeleteResult>(this.client, "DELETE", "/api/v1/Transcriptions/validate/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(DeleteResult.class);
    }

    /**
     * Creates one Transcription Validation Request with all the associated request items within this account and returns the record as created.
     *
     * A Transcription Validation Request represents a collection of files sent from the client to verify the file type using the machine learning platform Sage AI.
     *
     * @param body The files which will be verified
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<TranscriptionValidationRequestModel> createTranscriptionValidationRequest(@NotNull TranscriptionRequestSubmit[] body)
    {
        RestRequest<TranscriptionValidationRequestModel> r = new RestRequest<TranscriptionValidationRequestModel>(this.client, "POST", "/api/v1/Transcriptions/validate");
        r.AddBody(body);
        return r.Call(TranscriptionValidationRequestModel.class);
    }

    /**
     * Queries transcription validation requests transactions for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Items
     * @param order The sort order for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<TranscriptionValidationRequestModel>> queryTranscriptionValidationRequests(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<TranscriptionValidationRequestModel>> r = new RestRequest<FetchResult<TranscriptionValidationRequestModel>>(this.client, "GET", "/api/v1/Transcriptions/validate/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<TranscriptionValidationRequestModel>>() {}.getType());
    }

    /**
     * Retrieves the TranscriptionValidationRequestItemModel specified by this unique identifier.
     *
     * A TranscriptionValidationRequestItemModel represents a file sent from the client to verify the file type using the machine learning platform Sage AI.
     *
     * @param body The TranscriptionValidationRequestItemModels to add to an existing TranscriptionValidationRequestItemModel
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<TranscriptionValidationRequestItemModel[]> createsaTranscriptionValidationRequestItemModel(@NotNull TranscriptionRequestSubmit[] body)
    {
        RestRequest<TranscriptionValidationRequestItemModel[]> r = new RestRequest<TranscriptionValidationRequestItemModel[]>(this.client, "POST", "/api/v1/Transcriptions/validation-items");
        r.AddBody(body);
        return r.Call(TranscriptionValidationRequestItemModel[].class);
    }

    /**
     * Retrieves the TranscriptionValidationRequestItemModel specified by this unique identifier.
     *
     * A TranscriptionValidationRequestItemModel represents a file sent from the client to verify the file type using the machine learning platform Sage AI.
     *
     * @param id The unique Lockstep Platform ID number of the TranscriptionValidationRequestItemModel
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<TranscriptionValidationRequestItemModel> retrieveaTranscriptionValidationRequestItemModel(@NotNull String id)
    {
        RestRequest<TranscriptionValidationRequestItemModel> r = new RestRequest<TranscriptionValidationRequestItemModel>(this.client, "GET", "/api/v1/Transcriptions/validation-items/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(TranscriptionValidationRequestItemModel.class);
    }

    /**
     * Updates the TranscriptionValidationRequestItemModel specified by this unique identifier.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * A TranscriptionValidationRequestItemModel represents a file sent from the client to verify the file type using the machine learning platform Sage AI.
     *
     * @param id The unique Lockstep Platform ID number of the TranscriptionValidationRequestItemModel
     * @param body A list of changes to apply to this TranscriptionValidationRequestItemModel
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<TranscriptionValidationRequestItemModel> updateaTranscriptionValidationRequestItemModel(@NotNull String id, @NotNull Object body)
    {
        RestRequest<TranscriptionValidationRequestItemModel> r = new RestRequest<TranscriptionValidationRequestItemModel>(this.client, "PATCH", "/api/v1/Transcriptions/validation-items/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(TranscriptionValidationRequestItemModel.class);
    }

    /**
     * Deletes the TranscriptionValidationRequestItemModel specified by this unique identifier.
     *
     * A TranscriptionValidationRequestItemModel represents a file sent from the client to verify the file type using the machine learning platform Sage AI.
     *
     * @param id The unique Lockstep Platform ID number of the TranscriptionValidationRequestItemModel
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DeleteResult> deleteaTranscriptionValidationRequestItemModel(@NotNull String id)
    {
        RestRequest<DeleteResult> r = new RestRequest<DeleteResult>(this.client, "DELETE", "/api/v1/Transcriptions/validation-items/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(DeleteResult.class);
    }

    /**
     * Queries TranscriptionValidationRequestItemModels for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future ///
     * @param order The sort order for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<TranscriptionValidationRequestItemModel>> queryTranscriptionValidationRequestItems(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<TranscriptionValidationRequestItemModel>> r = new RestRequest<FetchResult<TranscriptionValidationRequestItemModel>>(this.client, "GET", "/api/v1/Transcriptions/validation-items/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<TranscriptionValidationRequestItemModel>>() {}.getType());
    }

    /**
     * Retrieves the Email Reply Generator Response containing a list of email reply suggestions
     *
     * An Email Reply Generator Request represents an email to be sent for a list of email reply suggestions.
     *
     * @param body The Email Reply Generator Request to be sent
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<EmailReplyGeneratorResponse> retrieveanEmailReplyGeneratorResponse(@NotNull EmailReplyGeneratorRequest body)
    {
        RestRequest<EmailReplyGeneratorResponse> r = new RestRequest<EmailReplyGeneratorResponse>(this.client, "POST", "/api/v1/Transcriptions/email-reply-suggestions");
        r.AddBody(body);
        return r.Call(EmailReplyGeneratorResponse.class);
    }
}
