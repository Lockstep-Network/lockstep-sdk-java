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

public class ActivityModel
{
    private String activityId;
    private String groupKey;
    private String companyId;
    private String activityTypeCode;
    private String activityName;
    private String activityDescription;
    private String activityStatus;
    private Boolean isOpen;
    private String priority;
    private String userAssignedTo;
    private Date dateAssigned;
    private Date dateClosed;
    private Date snoozeUntilDate;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private Double amountCollected;
    private Double amountPaid;
    private Double creditGiven;
    private Boolean isUnread;
    private Boolean isArchived;
    private AttachmentModel[] attachments;
    private NoteModel[] notes;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getactivityId() { return this.activityId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setactivityId(String value) { this.activityId = value; }
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
     * The ID of the company to which this activity belongs.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this activity belongs.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The type code of the activity
     */
    public String getactivityTypeCode() { return this.activityTypeCode; }
    /**
     * The type code of the activity
     */
    public void setactivityTypeCode(String value) { this.activityTypeCode = value; }
    /**
     * The name of the activity.  The name is a short name provided by the
     * person who created the activity that can be displayed in a list.
     */
    public String getactivityName() { return this.activityName; }
    /**
     * The name of the activity.  The name is a short name provided by the
     * person who created the activity that can be displayed in a list.
     */
    public void setactivityName(String value) { this.activityName = value; }
    /**
     * A description of the activity.  This field contains more detailed text about the
     * activity and can be lengthy.
     */
    public String getactivityDescription() { return this.activityDescription; }
    /**
     * A description of the activity.  This field contains more detailed text about the
     * activity and can be lengthy.
     */
    public void setactivityDescription(String value) { this.activityDescription = value; }
    /**
     * The status of the activity.
     */
    public String getactivityStatus() { return this.activityStatus; }
    /**
     * The status of the activity.
     */
    public void setactivityStatus(String value) { this.activityStatus = value; }
    /**
     * True if this activity is currently "open", which indicates that the activitiy is
     * currently in progress.
     */
    public Boolean getisOpen() { return this.isOpen; }
    /**
     * True if this activity is currently "open", which indicates that the activitiy is
     * currently in progress.
     */
    public void setisOpen(Boolean value) { this.isOpen = value; }
    /**
     * The priority of the activity.
     */
    public String getpriority() { return this.priority; }
    /**
     * The priority of the activity.
     */
    public void setpriority(String value) { this.priority = value; }
    /**
     * The ID of the user the activity is assigned to.
     */
    public String getuserAssignedTo() { return this.userAssignedTo; }
    /**
     * The ID of the user the activity is assigned to.
     */
    public void setuserAssignedTo(String value) { this.userAssignedTo = value; }
    /**
     * The date the activity was assigned.
     */
    public Date getdateAssigned() { return this.dateAssigned; }
    /**
     * The date the activity was assigned.
     */
    public void setdateAssigned(Date value) { this.dateAssigned = value; }
    /**
     * The date the activity was closed.
     */
    public Date getdateClosed() { return this.dateClosed; }
    /**
     * The date the activity was closed.
     */
    public void setdateClosed(Date value) { this.dateClosed = value; }
    /**
     * If this activity has been "snoozed", this field will be non-null and will contain
     * the date when the activity will be displayed.  Until that date arrives, the activity
     * will remain hidden.
     */
    public Date getsnoozeUntilDate() { return this.snoozeUntilDate; }
    /**
     * If this activity has been "snoozed", this field will be non-null and will contain
     * the date when the activity will be displayed.  Until that date arrives, the activity
     * will remain hidden.
     */
    public void setsnoozeUntilDate(Date value) { this.snoozeUntilDate = value; }
    /**
     * The date on which this activity was created.
     */
    public Date getcreated() { return this.created; }
    /**
     * The date on which this activity was created.
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created this activity.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this activity.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this activity was last modified.
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date on which this activity was last modified.
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified this activity.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this activity.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * Amount collected (if any) for the activity.
     */
    public Double getamountCollected() { return this.amountCollected; }
    /**
     * Amount collected (if any) for the activity.
     */
    public void setamountCollected(Double value) { this.amountCollected = value; }
    /**
     * Amount paid (if any) for the activity.
     */
    public Double getamountPaid() { return this.amountPaid; }
    /**
     * Amount paid (if any) for the activity.
     */
    public void setamountPaid(Double value) { this.amountPaid = value; }
    /**
     * Credit given (if any) for the activity.
     */
    public Double getcreditGiven() { return this.creditGiven; }
    /**
     * Credit given (if any) for the activity.
     */
    public void setcreditGiven(Double value) { this.creditGiven = value; }
    /**
     * True if this activity is to be shown in an "unread" state.  When an activity
     * is read by a person it is assigned to, this flag is set to false.
     */
    public Boolean getisUnread() { return this.isUnread; }
    /**
     * True if this activity is to be shown in an "unread" state.  When an activity
     * is read by a person it is assigned to, this flag is set to false.
     */
    public void setisUnread(Boolean value) { this.isUnread = value; }
    /**
     * Activities may be archived when they should be hidden from the user.  When
     * this flag is true, this activity should be hidden.
     */
    public Boolean getisArchived() { return this.isArchived; }
    /**
     * Activities may be archived when they should be hidden from the user.  When
     * this flag is true, this activity should be hidden.
     */
    public void setisArchived(Boolean value) { this.isArchived = value; }
    /**
     * All attachments attached to applied activity.
     * 
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to applied activity.
     * 
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All notes attached to this applied activity.
     * 
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this applied activity.
     * 
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All definitions attached to this applied activity.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this applied activity.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this activity.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this activity.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
