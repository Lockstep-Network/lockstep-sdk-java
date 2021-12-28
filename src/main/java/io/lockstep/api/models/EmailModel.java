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
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getemailId() { return this.emailId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setemailId(String value) { this.emailId = value; }
    /**
     * The unique ID number of this email's conversation thread.
     */
    public String getthreadId() { return this.threadId; }
    /**
     * The unique ID number of this email's conversation thread.
     */
    public void setthreadId(String value) { this.threadId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The ID number of the company that created this email.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this email.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The email address for the sender of this email.
     */
    public String getemailFrom() { return this.emailFrom; }
    /**
     * The email address for the sender of this email.
     */
    public void setemailFrom(String value) { this.emailFrom = value; }
    /**
     * The email address for the recipient(s) of this email.
     */
    public String getemailTo() { return this.emailTo; }
    /**
     * The email address for the recipient(s) of this email.
     */
    public void setemailTo(String value) { this.emailTo = value; }
    /**
     * The email address for the CC recipient(s) of this email
     */
    public String getemailCC() { return this.emailCC; }
    /**
     * The email address for the CC recipient(s) of this email
     */
    public void setemailCC(String value) { this.emailCC = value; }
    /**
     * The subject line of this email.
     */
    public String getemailSubject() { return this.emailSubject; }
    /**
     * The subject line of this email.
     */
    public void setemailSubject(String value) { this.emailSubject = value; }
    /**
     * The body content of this email.
     */
    public String getemailBody() { return this.emailBody; }
    /**
     * The body content of this email.
     */
    public void setemailBody(String value) { this.emailBody = value; }
    /**
     * The date on which this email was sent.
     */
    public Date getsentDate() { return this.sentDate; }
    /**
     * The date on which this email was sent.
     */
    public void setsentDate(Date value) { this.sentDate = value; }
    /**
     * A status flag indicating if this email is unread.
     */
    public Boolean getisUnread() { return this.isUnread; }
    /**
     * A status flag indicating if this email is unread.
     */
    public void setisUnread(Boolean value) { this.isUnread = value; }
    /**
     * A status flag indicating if this email is priority status.
     */
    public Boolean getisPriority() { return this.isPriority; }
    /**
     * A status flag indicating if this email is priority status.
     */
    public void setisPriority(Boolean value) { this.isPriority = value; }
    /**
     * A status flag indicating if this email is marked as spam.
     */
    public Boolean getisSpam() { return this.isSpam; }
    /**
     * A status flag indicating if this email is marked as spam.
     */
    public void setisSpam(Boolean value) { this.isSpam = value; }
    /**
     * The date on which this email was created.
     */
    public Date getcreated() { return this.created; }
    /**
     * The date on which this email was created.
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID number of the user who created this email.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this email.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * A status flag indicating if this email is to be sent.
     */
    public Boolean gettoBeSent() { return this.toBeSent; }
    /**
     * A status flag indicating if this email is to be sent.
     */
    public void settoBeSent(Boolean value) { this.toBeSent = value; }
    /**
     * The ID number of the customer that sent this email.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID number of the customer that sent this email.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The date on which this email was received.
     */
    public Date getreceivedTimeStamp() { return this.receivedTimeStamp; }
    /**
     * The date on which this email was received.
     */
    public void setreceivedTimeStamp(Date value) { this.receivedTimeStamp = value; }
    /**
     * The date on which this email was opened.
     */
    public Date getopenedTimestamp() { return this.openedTimestamp; }
    /**
     * The date on which this email was opened.
     */
    public void setopenedTimestamp(Date value) { this.openedTimestamp = value; }
    /**
     * The number of times this email was viewed.
     */
    public Integer getviewCount() { return this.viewCount; }
    /**
     * The number of times this email was viewed.
     */
    public void setviewCount(Integer value) { this.viewCount = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The id of the email in an external system if imported.
     */
    public String getexternalEmailId() { return this.externalEmailId; }
    /**
     * The id of the email in an external system if imported.
     */
    public void setexternalEmailId(String value) { this.externalEmailId = value; }
    /**
     * The id of the email thread in an external system if imported.
     */
    public String getexternalThreadId() { return this.externalThreadId; }
    /**
     * The id of the email thread in an external system if imported.
     */
    public void setexternalThreadId(String value) { this.externalThreadId = value; }
    /**
     * The email address(es) for the BCC recipient(s) of this email
     */
    public String getemailBcc() { return this.emailBcc; }
    /**
     * The email address(es) for the BCC recipient(s) of this email
     */
    public void setemailBcc(String value) { this.emailBcc = value; }
    /**
     * All notes attached to this email.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this email.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this email.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this email.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to this email.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this email.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this email.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this email.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
