
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


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An Email represents a communication sent from one company to another.  The creator of the email is identified
 * by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field.
 * The Email Model represents an email and a number of different metadata attributes related to the creation,
 * storage, and ownership of the email.
 */
public class EmailModel
{
    private @NotNull String emailId;
    private @NotNull String threadId;
    private @NotNull String groupKey;
    private @Nullable String companyId;
    private @Nullable String emailFrom;
    private @Nullable String emailTo;
    private @Nullable String emailCC;
    private @Nullable String emailSubject;
    private @Nullable String emailBody;
    private @Nullable String sentDate;
    private @NotNull Boolean isUnread;
    private @NotNull Boolean isPriority;
    private @NotNull Boolean isSpam;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull Boolean toBeSent;
    private @Nullable String customerId;
    private @Nullable String receivedTimeStamp;
    private @Nullable String openedTimestamp;
    private @NotNull Integer viewCount;
    private @Nullable String appEnrollmentId;
    private @Nullable String externalEmailId;
    private @Nullable String externalThreadId;
    private @Nullable String emailBcc;
    private @Nullable String sendType;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String responseOriginId;
    private @Nullable EmailModel responseOrigin;
    private @Nullable NoteModel[] notes;
    private @Nullable AttachmentModel[] attachments;
    private @Nullable CustomFieldDefinitionModel[] customFieldDefinitions;
    private @Nullable CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field emailId
     */
    public @NotNull String getEmailId() { return this.emailId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for emailId
     */
    public void setEmailId(@NotNull String value) { this.emailId = value; }
    /**
     * The unique ID number of this email's conversation thread.
     *
     * @return The field threadId
     */
    public @NotNull String getThreadId() { return this.threadId; }
    /**
     * The unique ID number of this email's conversation thread.
     *
     * @param value The new value for threadId
     */
    public void setThreadId(@NotNull String value) { this.threadId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * The ID number of the company that created this email.
     *
     * @return The field companyId
     */
    public @Nullable String getCompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this email.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@Nullable String value) { this.companyId = value; }
    /**
     * The email address for the sender of this email.
     *
     * @return The field emailFrom
     */
    public @Nullable String getEmailFrom() { return this.emailFrom; }
    /**
     * The email address for the sender of this email.
     *
     * @param value The new value for emailFrom
     */
    public void setEmailFrom(@Nullable String value) { this.emailFrom = value; }
    /**
     * The email address for the recipient(s) of this email.
     *
     * @return The field emailTo
     */
    public @Nullable String getEmailTo() { return this.emailTo; }
    /**
     * The email address for the recipient(s) of this email.
     *
     * @param value The new value for emailTo
     */
    public void setEmailTo(@Nullable String value) { this.emailTo = value; }
    /**
     * The email address for the CC recipient(s) of this email
     *
     * @return The field emailCC
     */
    public @Nullable String getEmailCC() { return this.emailCC; }
    /**
     * The email address for the CC recipient(s) of this email
     *
     * @param value The new value for emailCC
     */
    public void setEmailCC(@Nullable String value) { this.emailCC = value; }
    /**
     * The subject line of this email.
     *
     * @return The field emailSubject
     */
    public @Nullable String getEmailSubject() { return this.emailSubject; }
    /**
     * The subject line of this email.
     *
     * @param value The new value for emailSubject
     */
    public void setEmailSubject(@Nullable String value) { this.emailSubject = value; }
    /**
     * The body content of this email.
     *
     * @return The field emailBody
     */
    public @Nullable String getEmailBody() { return this.emailBody; }
    /**
     * The body content of this email.
     *
     * @param value The new value for emailBody
     */
    public void setEmailBody(@Nullable String value) { this.emailBody = value; }
    /**
     * The date on which this email was sent.
     *
     * @return The field sentDate
     */
    public @Nullable String getSentDate() { return this.sentDate; }
    /**
     * The date on which this email was sent.
     *
     * @param value The new value for sentDate
     */
    public void setSentDate(@Nullable String value) { this.sentDate = value; }
    /**
     * A status flag indicating if this email is unread.
     *
     * @return The field isUnread
     */
    public @NotNull Boolean getIsUnread() { return this.isUnread; }
    /**
     * A status flag indicating if this email is unread.
     *
     * @param value The new value for isUnread
     */
    public void setIsUnread(@NotNull Boolean value) { this.isUnread = value; }
    /**
     * A status flag indicating if this email is priority status.
     *
     * @return The field isPriority
     */
    public @NotNull Boolean getIsPriority() { return this.isPriority; }
    /**
     * A status flag indicating if this email is priority status.
     *
     * @param value The new value for isPriority
     */
    public void setIsPriority(@NotNull Boolean value) { this.isPriority = value; }
    /**
     * A status flag indicating if this email is marked as spam.
     *
     * @return The field isSpam
     */
    public @NotNull Boolean getIsSpam() { return this.isSpam; }
    /**
     * A status flag indicating if this email is marked as spam.
     *
     * @param value The new value for isSpam
     */
    public void setIsSpam(@NotNull Boolean value) { this.isSpam = value; }
    /**
     * The date on which this email was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date on which this email was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID number of the user who created this email.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this email.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * A status flag indicating if this email is to be sent.
     *
     * @return The field toBeSent
     */
    public @NotNull Boolean getToBeSent() { return this.toBeSent; }
    /**
     * A status flag indicating if this email is to be sent.
     *
     * @param value The new value for toBeSent
     */
    public void setToBeSent(@NotNull Boolean value) { this.toBeSent = value; }
    /**
     * The ID number of the customer that sent this email.
     *
     * @return The field customerId
     */
    public @Nullable String getCustomerId() { return this.customerId; }
    /**
     * The ID number of the customer that sent this email.
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(@Nullable String value) { this.customerId = value; }
    /**
     * The date on which this email was received.
     *
     * @return The field receivedTimeStamp
     */
    public @Nullable String getReceivedTimeStamp() { return this.receivedTimeStamp; }
    /**
     * The date on which this email was received.
     *
     * @param value The new value for receivedTimeStamp
     */
    public void setReceivedTimeStamp(@Nullable String value) { this.receivedTimeStamp = value; }
    /**
     * The date on which this email was opened.
     *
     * @return The field openedTimestamp
     */
    public @Nullable String getOpenedTimestamp() { return this.openedTimestamp; }
    /**
     * The date on which this email was opened.
     *
     * @param value The new value for openedTimestamp
     */
    public void setOpenedTimestamp(@Nullable String value) { this.openedTimestamp = value; }
    /**
     * The number of times this email was viewed.
     *
     * @return The field viewCount
     */
    public @NotNull Integer getViewCount() { return this.viewCount; }
    /**
     * The number of times this email was viewed.
     *
     * @param value The new value for viewCount
     */
    public void setViewCount(@NotNull Integer value) { this.viewCount = value; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * The id of the email in an external system if imported.
     *
     * @return The field externalEmailId
     */
    public @Nullable String getExternalEmailId() { return this.externalEmailId; }
    /**
     * The id of the email in an external system if imported.
     *
     * @param value The new value for externalEmailId
     */
    public void setExternalEmailId(@Nullable String value) { this.externalEmailId = value; }
    /**
     * The id of the email thread in an external system if imported.
     *
     * @return The field externalThreadId
     */
    public @Nullable String getExternalThreadId() { return this.externalThreadId; }
    /**
     * The id of the email thread in an external system if imported.
     *
     * @param value The new value for externalThreadId
     */
    public void setExternalThreadId(@Nullable String value) { this.externalThreadId = value; }
    /**
     * The email address(es) for the BCC recipient(s) of this email
     *
     * @return The field emailBcc
     */
    public @Nullable String getEmailBcc() { return this.emailBcc; }
    /**
     * The email address(es) for the BCC recipient(s) of this email
     *
     * @param value The new value for emailBcc
     */
    public void setEmailBcc(@Nullable String value) { this.emailBcc = value; }
    /**
     * The type message being sent (New, Reply, Forward) or null for messages not being sent.
     *
     * @return The field sendType
     */
    public @Nullable String getSendType() { return this.sendType; }
    /**
     * The type message being sent (New, Reply, Forward) or null for messages not being sent.
     *
     * @param value The new value for sendType
     */
    public void setSendType(@Nullable String value) { this.sendType = value; }
    /**
     * The date on which this email was modified.
     * Email modification should only be done by internal services.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date on which this email was modified.
     * Email modification should only be done by internal services.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who modified this email.
     * Email modification should only be done by internal services.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who modified this email.
     * Email modification should only be done by internal services.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
    /**
     * If the message being sent is a reply or a forward, the id of the the email being replied to or forwarded.
     * Otherwise null.
     *
     * @return The field responseOriginId
     */
    public @Nullable String getResponseOriginId() { return this.responseOriginId; }
    /**
     * If the message being sent is a reply or a forward, the id of the the email being replied to or forwarded.
     * Otherwise null.
     *
     * @param value The new value for responseOriginId
     */
    public void setResponseOriginId(@Nullable String value) { this.responseOriginId = value; }
    /**
     * The email object associated with the response origin id.
     *
     * @return The field responseOrigin
     */
    public @Nullable EmailModel getResponseOrigin() { return this.responseOrigin; }
    /**
     * The email object associated with the response origin id.
     *
     * @param value The new value for responseOrigin
     */
    public void setResponseOrigin(@Nullable EmailModel value) { this.responseOrigin = value; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `Email` and the `ObjectKey` set to the `EmailId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field notes
     */
    public @Nullable NoteModel[] getNotes() { return this.notes; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `Email` and the `ObjectKey` set to the `EmailId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable NoteModel[] value) { this.notes = value; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `Email` and the `ObjectKey` set to the `EmailId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field attachments
     */
    public @Nullable AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `Email` and the `ObjectKey` set to the `EmailId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for attachments
     */
    public void setAttachments(@Nullable AttachmentModel[] value) { this.attachments = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Email` and the `ObjectKey` set to the `EmailId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldDefinitions
     */
    public @Nullable CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Email` and the `ObjectKey` set to the `EmailId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(@Nullable CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Email` and the `ObjectKey` set to the `EmailId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldValues
     */
    public @Nullable CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Email` and the `ObjectKey` set to the `EmailId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(@Nullable CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
