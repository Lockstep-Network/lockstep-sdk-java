
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
 * A request to transcribe the provided file content to a Lockstep Platform object.
 */
public class TranscriptionRequestSubmit
{
    private @Nullable String fileContent;
    private @Nullable String fileContentUrl;
    private @Nullable String fileName;
    private @Nullable String invoiceTypeCode;
    private @Nullable String transcriptionValidationRequestId;

    /**
     * The base64 string of document content
     *
     * @return The field fileContent
     */
    public @Nullable String getFileContent() { return this.fileContent; }
    /**
     * The base64 string of document content
     *
     * @param value The new value for fileContent
     */
    public void setFileContent(@Nullable String value) { this.fileContent = value; }
    /**
     * The location of the file provided
     *
     * @return The field fileContentUrl
     */
    public @Nullable String getFileContentUrl() { return this.fileContentUrl; }
    /**
     * The location of the file provided
     *
     * @param value The new value for fileContentUrl
     */
    public void setFileContentUrl(@Nullable String value) { this.fileContentUrl = value; }
    /**
     * The name of the file provided
     *
     * @return The field fileName
     */
    public @Nullable String getFileName() { return this.fileName; }
    /**
     * The name of the file provided
     *
     * @param value The new value for fileName
     */
    public void setFileName(@Nullable String value) { this.fileName = value; }
    /**
     * The type of LockstepApi2.Models.TranscriptionRequestSubmit.InvoiceTypeCode requested to transcribe content to.
     *
     * @return The field invoiceTypeCode
     */
    public @Nullable String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * The type of LockstepApi2.Models.TranscriptionRequestSubmit.InvoiceTypeCode requested to transcribe content to.
     *
     * @param value The new value for invoiceTypeCode
     */
    public void setInvoiceTypeCode(@Nullable String value) { this.invoiceTypeCode = value; }
    /**
     * Group account transcription validation request item is associated with.
     *
     * @return The field transcriptionValidationRequestId
     */
    public @Nullable String getTranscriptionValidationRequestId() { return this.transcriptionValidationRequestId; }
    /**
     * Group account transcription validation request item is associated with.
     *
     * @param value The new value for transcriptionValidationRequestId
     */
    public void setTranscriptionValidationRequestId(@Nullable String value) { this.transcriptionValidationRequestId = value; }
};
