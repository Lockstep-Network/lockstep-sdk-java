
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
 * Represents a transcription validation request item to be validated.
 */
public class TranscriptionValidationRequestItemModel
{
    private @NotNull String transcriptionValidationRequestItemId;
    private @NotNull String transcriptionValidationRequestId;
    private @NotNull String groupKey;
    private @Nullable String fileHash;
    private @Nullable String fileName;
    private @Nullable String fileExt;
    private @Nullable String fileLocation;
    private @Nullable String transcriptionResult;
    private @Nullable String processStart;
    private @Nullable String processEnd;
    private @NotNull Integer retryCount;
    private @Nullable String feedbackResult;
    private @Nullable String feedbackSent;
    private @Nullable String statusCode;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;

    /**
     * The unique identifier of the transcription validation request item.
     *
     * @return The field transcriptionValidationRequestItemId
     */
    public @NotNull String getTranscriptionValidationRequestItemId() { return this.transcriptionValidationRequestItemId; }
    /**
     * The unique identifier of the transcription validation request item.
     *
     * @param value The new value for transcriptionValidationRequestItemId
     */
    public void setTranscriptionValidationRequestItemId(@NotNull String value) { this.transcriptionValidationRequestItemId = value; }
    /**
     * The ID number of the transcription validation request this item belongs to.
     *
     * @return The field transcriptionValidationRequestId
     */
    public @NotNull String getTranscriptionValidationRequestId() { return this.transcriptionValidationRequestId; }
    /**
     * The ID number of the transcription validation request this item belongs to.
     *
     * @param value The new value for transcriptionValidationRequestId
     */
    public void setTranscriptionValidationRequestId(@NotNull String value) { this.transcriptionValidationRequestId = value; }
    /**
     * Group account transcription validation request item is associated with.
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * Group account transcription validation request item is associated with.
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * Generated hash of the file being validated.
     *
     * @return The field fileHash
     */
    public @Nullable String getFileHash() { return this.fileHash; }
    /**
     * Generated hash of the file being validated.
     *
     * @param value The new value for fileHash
     */
    public void setFileHash(@Nullable String value) { this.fileHash = value; }
    /**
     * Original name of the file on disk, without its extension.
     *
     * @return The field fileName
     */
    public @Nullable String getFileName() { return this.fileName; }
    /**
     * Original name of the file on disk, without its extension.
     *
     * @param value The new value for fileName
     */
    public void setFileName(@Nullable String value) { this.fileName = value; }
    /**
     * Original extension name of the file on disk.
     *
     * @return The field fileExt
     */
    public @Nullable String getFileExt() { return this.fileExt; }
    /**
     * Original extension name of the file on disk.
     *
     * @param value The new value for fileExt
     */
    public void setFileExt(@Nullable String value) { this.fileExt = value; }
    /**
     * Location of file in blob storage to be validated.
     *
     * @return The field fileLocation
     */
    public @Nullable String getFileLocation() { return this.fileLocation; }
    /**
     * Location of file in blob storage to be validated.
     *
     * @param value The new value for fileLocation
     */
    public void setFileLocation(@Nullable String value) { this.fileLocation = value; }
    /**
     * Transcription result
     *
     * @return The field transcriptionResult
     */
    public @Nullable String getTranscriptionResult() { return this.transcriptionResult; }
    /**
     * Transcription result
     *
     * @param value The new value for transcriptionResult
     */
    public void setTranscriptionResult(@Nullable String value) { this.transcriptionResult = value; }
    /**
     * Transcription process start date
     *
     * @return The field processStart
     */
    public @Nullable String getProcessStart() { return this.processStart; }
    /**
     * Transcription process start date
     *
     * @param value The new value for processStart
     */
    public void setProcessStart(@Nullable String value) { this.processStart = value; }
    /**
     * Transcription process end date
     *
     * @return The field processEnd
     */
    public @Nullable String getProcessEnd() { return this.processEnd; }
    /**
     * Transcription process end date
     *
     * @param value The new value for processEnd
     */
    public void setProcessEnd(@Nullable String value) { this.processEnd = value; }
    /**
     * Amount of times item was processed to retrieve the transcription data
     *
     * @return The field retryCount
     */
    public @NotNull Integer getRetryCount() { return this.retryCount; }
    /**
     * Amount of times item was processed to retrieve the transcription data
     *
     * @param value The new value for retryCount
     */
    public void setRetryCount(@NotNull Integer value) { this.retryCount = value; }
    /**
     * Feedback result specified by the client when the transcription result is not correct. This feedback result will be sent back to the transcription services to retrain and improve models over time.
     *
     * @return The field feedbackResult
     */
    public @Nullable String getFeedbackResult() { return this.feedbackResult; }
    /**
     * Feedback result specified by the client when the transcription result is not correct. This feedback result will be sent back to the transcription services to retrain and improve models over time.
     *
     * @param value The new value for feedbackResult
     */
    public void setFeedbackResult(@Nullable String value) { this.feedbackResult = value; }
    /**
     * Date when feedback result was sent back to transcription service.
     *
     * @return The field feedbackSent
     */
    public @Nullable String getFeedbackSent() { return this.feedbackSent; }
    /**
     * Date when feedback result was sent back to transcription service.
     *
     * @param value The new value for feedbackSent
     */
    public void setFeedbackSent(@Nullable String value) { this.feedbackSent = value; }
    /**
     * A code identifying the status of this transcription validation request item.
     *
     * Recognized Transcription Validation Request status codes are:
     * * `New` - Represents a transcription validation request item that is considered new and needs work to complete
     * * `In Progress` - Represents a transcription validation request item that is currently being worked on
     * * `Failed` - Represents a transcription validation request item that could not complete the validation process
     * * `Complete` - Represents a transcription validation request item that is considered complete and does not need any further work
     *
     * @return The field statusCode
     */
    public @Nullable String getStatusCode() { return this.statusCode; }
    /**
     * A code identifying the status of this transcription validation request item.
     *
     * Recognized Transcription Validation Request status codes are:
     * * `New` - Represents a transcription validation request item that is considered new and needs work to complete
     * * `In Progress` - Represents a transcription validation request item that is currently being worked on
     * * `Failed` - Represents a transcription validation request item that could not complete the validation process
     * * `Complete` - Represents a transcription validation request item that is considered complete and does not need any further work
     *
     * @param value The new value for statusCode
     */
    public void setStatusCode(@Nullable String value) { this.statusCode = value; }
    /**
     * The date on which this transcription validation request item was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date on which this transcription validation request item was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID number of the user who created this transcription validation request item.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this transcription validation request item.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date on which this transcription validation request item was last modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date on which this transcription validation request item was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this transcription validation request item.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this transcription validation request item.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
};
