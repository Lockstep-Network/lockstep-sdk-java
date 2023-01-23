
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


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a transcription validation request that is used to validate if file is of a specific type.
 */
public class TranscriptionValidationRequestModel
{
    private @NotNull String transcriptionValidationRequestId;
    private @NotNull String groupKey;
    private @Nullable String statusCode;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable TranscriptionValidationRequestItemModel[] items;

    /**
     * The unique identifier of the transcription validation request.
     *
     * @return The field transcriptionValidationRequestId
     */
    public @NotNull String getTranscriptionValidationRequestId() { return this.transcriptionValidationRequestId; }
    /**
     * The unique identifier of the transcription validation request.
     *
     * @param value The new value for transcriptionValidationRequestId
     */
    public void setTranscriptionValidationRequestId(@NotNull String value) { this.transcriptionValidationRequestId = value; }
    /**
     * Group account transcription validation request is associated with.
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * Group account transcription validation request is associated with.
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * A code identifying the status of this transcription validation request.
     *
     * Recognized Transcription Validation Request status codes are:
     * * `New` - Represents a transcription validation request that is considered new and needs work to complete
     * * `In Progress` - Represents a transcription validation request that is currently being worked on
     * * `Failed` - Represents a transcription validation request that could not complete the validation process
     * * `Complete` - Represents a transcription validation request that is considered complete and does not need any further work
     *
     * @return The field statusCode
     */
    public @Nullable String getStatusCode() { return this.statusCode; }
    /**
     * A code identifying the status of this transcription validation request.
     *
     * Recognized Transcription Validation Request status codes are:
     * * `New` - Represents a transcription validation request that is considered new and needs work to complete
     * * `In Progress` - Represents a transcription validation request that is currently being worked on
     * * `Failed` - Represents a transcription validation request that could not complete the validation process
     * * `Complete` - Represents a transcription validation request that is considered complete and does not need any further work
     *
     * @param value The new value for statusCode
     */
    public void setStatusCode(@Nullable String value) { this.statusCode = value; }
    /**
     * The date on which this transcription validation request was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date on which this transcription validation request was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID number of the user who created this transcription validation request.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this transcription validation request.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date on which this transcription validation request was last modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date on which this transcription validation request was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this transcription validation request.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this transcription validation request.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
    /**
     * All items attached to this transcription validation request.
     * To retrieve this collection, specify `Items` in the "Include" parameter for your query.
     *
     * @return The field items
     */
    public @Nullable TranscriptionValidationRequestItemModel[] getItems() { return this.items; }
    /**
     * All items attached to this transcription validation request.
     * To retrieve this collection, specify `Items` in the "Include" parameter for your query.
     *
     * @param value The new value for items
     */
    public void setItems(@Nullable TranscriptionValidationRequestItemModel[] value) { this.items = value; }
};
