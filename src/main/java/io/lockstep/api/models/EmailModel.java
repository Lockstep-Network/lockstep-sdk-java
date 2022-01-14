/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @version    2022.2
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;

public class EmailModel
{
    private String emailId;
    private String threadId;
    private String groupKey;
    private String companyId;
    private String emailFrom;
    private String emailTo;
    private String emailCC;
    private String emailSubject;
    private String emailBody;
    private Date sentDate;
    private Boolean isUnread;
    private Boolean isPriority;
    private Boolean isSpam;
    private Date created;
    private String createdUserId;
    private Boolean toBeSent;
    private String customerId;
    private Date receivedTimeStamp;
    private Date openedTimestamp;
    private Integer viewCount;
    private String appEnrollmentId;
    private String externalEmailId;
    private String externalThreadId;
    private String emailBcc;
    private String sendType;
    private Date modified;
    private String modifiedUserId;
    private String responseOriginId;
    private EmailModel responseOrigin;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public String getEmailId() { return this.emailId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public void setEmailId(String value) { this.emailId = value; }
    /**
     * @return The unique ID number of this email's conversation thread.
     */
    public String getThreadId() { return this.threadId; }
    /**
     * @param value - The unique ID number of this email's conversation thread.
     */
    public void setThreadId(String value) { this.threadId = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The ID number of the company that created this email.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * @param value - The ID number of the company that created this email.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * @return The email address for the sender of this email.
     */
    public String getEmailFrom() { return this.emailFrom; }
    /**
     * @param value - The email address for the sender of this email.
     */
    public void setEmailFrom(String value) { this.emailFrom = value; }
    /**
     * @return The email address for the recipient(s) of this email.
     */
    public String getEmailTo() { return this.emailTo; }
    /**
     * @param value - The email address for the recipient(s) of this email.
     */
    public void setEmailTo(String value) { this.emailTo = value; }
    /**
     * @return The email address for the CC recipient(s) of this email
     */
    public String getEmailCC() { return this.emailCC; }
    /**
     * @param value - The email address for the CC recipient(s) of this email
     */
    public void setEmailCC(String value) { this.emailCC = value; }
    /**
     * @return The subject line of this email.
     */
    public String getEmailSubject() { return this.emailSubject; }
    /**
     * @param value - The subject line of this email.
     */
    public void setEmailSubject(String value) { this.emailSubject = value; }
    /**
     * @return The body content of this email.
     */
    public String getEmailBody() { return this.emailBody; }
    /**
     * @param value - The body content of this email.
     */
    public void setEmailBody(String value) { this.emailBody = value; }
    /**
     * @return The date on which this email was sent.
     */
    public Date getSentDate() { return this.sentDate; }
    /**
     * @param value - The date on which this email was sent.
     */
    public void setSentDate(Date value) { this.sentDate = value; }
    /**
     * @return A status flag indicating if this email is unread.
     */
    public Boolean getIsUnread() { return this.isUnread; }
    /**
     * @param value - A status flag indicating if this email is unread.
     */
    public void setIsUnread(Boolean value) { this.isUnread = value; }
    /**
     * @return A status flag indicating if this email is priority status.
     */
    public Boolean getIsPriority() { return this.isPriority; }
    /**
     * @param value - A status flag indicating if this email is priority status.
     */
    public void setIsPriority(Boolean value) { this.isPriority = value; }
    /**
     * @return A status flag indicating if this email is marked as spam.
     */
    public Boolean getIsSpam() { return this.isSpam; }
    /**
     * @param value - A status flag indicating if this email is marked as spam.
     */
    public void setIsSpam(Boolean value) { this.isSpam = value; }
    /**
     * @return The date on which this email was created.
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - The date on which this email was created.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The ID number of the user who created this email.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The ID number of the user who created this email.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return A status flag indicating if this email is to be sent.
     */
    public Boolean getToBeSent() { return this.toBeSent; }
    /**
     * @param value - A status flag indicating if this email is to be sent.
     */
    public void setToBeSent(Boolean value) { this.toBeSent = value; }
    /**
     * @return The ID number of the customer that sent this email.
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * @param value - The ID number of the customer that sent this email.
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * @return The date on which this email was received.
     */
    public Date getReceivedTimeStamp() { return this.receivedTimeStamp; }
    /**
     * @param value - The date on which this email was received.
     */
    public void setReceivedTimeStamp(Date value) { this.receivedTimeStamp = value; }
    /**
     * @return The date on which this email was opened.
     */
    public Date getOpenedTimestamp() { return this.openedTimestamp; }
    /**
     * @param value - The date on which this email was opened.
     */
    public void setOpenedTimestamp(Date value) { this.openedTimestamp = value; }
    /**
     * @return The number of times this email was viewed.
     */
    public Integer getViewCount() { return this.viewCount; }
    /**
     * @param value - The number of times this email was viewed.
     */
    public void setViewCount(Integer value) { this.viewCount = value; }
    /**
     * @return AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * @param value - AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * @return The id of the email in an external system if imported.
     */
    public String getExternalEmailId() { return this.externalEmailId; }
    /**
     * @param value - The id of the email in an external system if imported.
     */
    public void setExternalEmailId(String value) { this.externalEmailId = value; }
    /**
     * @return The id of the email thread in an external system if imported.
     */
    public String getExternalThreadId() { return this.externalThreadId; }
    /**
     * @param value - The id of the email thread in an external system if imported.
     */
    public void setExternalThreadId(String value) { this.externalThreadId = value; }
    /**
     * @return The email address(es) for the BCC recipient(s) of this email
     */
    public String getEmailBcc() { return this.emailBcc; }
    /**
     * @param value - The email address(es) for the BCC recipient(s) of this email
     */
    public void setEmailBcc(String value) { this.emailBcc = value; }
    /**
     * @return The type message being sent (New, Reply, Forward) or null for messages not being sent.
     */
    public String getSendType() { return this.sendType; }
    /**
     * @param value - The type message being sent (New, Reply, Forward) or null for messages not being sent.
     */
    public void setSendType(String value) { this.sendType = value; }
    /**
     * @return The date on which this email was modified. Email modification should only be done by internal services.
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - The date on which this email was modified. Email modification should only be done by internal services.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return The ID of the user who modified this email. Email modification should only be done by internal services.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - The ID of the user who modified this email. Email modification should only be done by internal services.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * @return If the message being sent is a reply or a forward, the id of the the email being replied to or forwarded. Otherwise null.
     */
    public String getResponseOriginId() { return this.responseOriginId; }
    /**
     * @param value - If the message being sent is a reply or a forward, the id of the the email being replied to or forwarded. Otherwise null.
     */
    public void setResponseOriginId(String value) { this.responseOriginId = value; }
    /**
     * @return The email object associated with the response origin id.
     */
    public EmailModel getResponseOrigin() { return this.responseOrigin; }
    /**
     * @param value - The email object associated with the response origin id.
     */
    public void setResponseOrigin(EmailModel value) { this.responseOrigin = value; }
    /**
     * @return All notes attached to this email. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * @param value - All notes attached to this email. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * @return All attachments attached to this email. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * @param value - All attachments attached to this email. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * @return All definitions attached to this email. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * @param value - All definitions attached to this email. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * @return All values attached to this email. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * @param value - All values attached to this email. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
