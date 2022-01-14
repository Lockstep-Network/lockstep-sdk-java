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
    private CompanyModel company;
    private AttachmentModel[] attachments;
    private NoteModel[] notes;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public String getActivityId() { return this.activityId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public void setActivityId(String value) { this.activityId = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The ID of the company to which this activity belongs.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * @param value - The ID of the company to which this activity belongs.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * @return The type code of the activity
     */
    public String getActivityTypeCode() { return this.activityTypeCode; }
    /**
     * @param value - The type code of the activity
     */
    public void setActivityTypeCode(String value) { this.activityTypeCode = value; }
    /**
     * @return The name of the activity. The name is a short name provided by the person who created the activity that can be displayed in a list.
     */
    public String getActivityName() { return this.activityName; }
    /**
     * @param value - The name of the activity. The name is a short name provided by the person who created the activity that can be displayed in a list.
     */
    public void setActivityName(String value) { this.activityName = value; }
    /**
     * @return A description of the activity. This field contains more detailed text about the activity and can be lengthy.
     */
    public String getActivityDescription() { return this.activityDescription; }
    /**
     * @param value - A description of the activity. This field contains more detailed text about the activity and can be lengthy.
     */
    public void setActivityDescription(String value) { this.activityDescription = value; }
    /**
     * @return The status of the activity.
     */
    public String getActivityStatus() { return this.activityStatus; }
    /**
     * @param value - The status of the activity.
     */
    public void setActivityStatus(String value) { this.activityStatus = value; }
    /**
     * @return True if this activity is currently "open", which indicates that the activitiy is currently in progress.
     */
    public Boolean getIsOpen() { return this.isOpen; }
    /**
     * @param value - True if this activity is currently "open", which indicates that the activitiy is currently in progress.
     */
    public void setIsOpen(Boolean value) { this.isOpen = value; }
    /**
     * @return The priority of the activity.
     */
    public String getPriority() { return this.priority; }
    /**
     * @param value - The priority of the activity.
     */
    public void setPriority(String value) { this.priority = value; }
    /**
     * @return The ID of the user the activity is assigned to.
     */
    public String getUserAssignedTo() { return this.userAssignedTo; }
    /**
     * @param value - The ID of the user the activity is assigned to.
     */
    public void setUserAssignedTo(String value) { this.userAssignedTo = value; }
    /**
     * @return The date the activity was assigned.
     */
    public Date getDateAssigned() { return this.dateAssigned; }
    /**
     * @param value - The date the activity was assigned.
     */
    public void setDateAssigned(Date value) { this.dateAssigned = value; }
    /**
     * @return The date the activity was closed.
     */
    public Date getDateClosed() { return this.dateClosed; }
    /**
     * @param value - The date the activity was closed.
     */
    public void setDateClosed(Date value) { this.dateClosed = value; }
    /**
     * @return If this activity has been "snoozed", this field will be non-null and will contain the date when the activity will be displayed. Until that date arrives, the activity will remain hidden.
     */
    public Date getSnoozeUntilDate() { return this.snoozeUntilDate; }
    /**
     * @param value - If this activity has been "snoozed", this field will be non-null and will contain the date when the activity will be displayed. Until that date arrives, the activity will remain hidden.
     */
    public void setSnoozeUntilDate(Date value) { this.snoozeUntilDate = value; }
    /**
     * @return The date on which this activity was created.
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - The date on which this activity was created.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The ID of the user who created this activity.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The ID of the user who created this activity.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return The date on which this activity was last modified.
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - The date on which this activity was last modified.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return The ID of the user who last modified this activity.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - The ID of the user who last modified this activity.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * @return Amount collected (if any) for the activity.
     */
    public Double getAmountCollected() { return this.amountCollected; }
    /**
     * @param value - Amount collected (if any) for the activity.
     */
    public void setAmountCollected(Double value) { this.amountCollected = value; }
    /**
     * @return Amount paid (if any) for the activity.
     */
    public Double getAmountPaid() { return this.amountPaid; }
    /**
     * @param value - Amount paid (if any) for the activity.
     */
    public void setAmountPaid(Double value) { this.amountPaid = value; }
    /**
     * @return Credit given (if any) for the activity.
     */
    public Double getCreditGiven() { return this.creditGiven; }
    /**
     * @param value - Credit given (if any) for the activity.
     */
    public void setCreditGiven(Double value) { this.creditGiven = value; }
    /**
     * @return True if this activity is to be shown in an "unread" state. When an activity is read by a person it is assigned to, this flag is set to false.
     */
    public Boolean getIsUnread() { return this.isUnread; }
    /**
     * @param value - True if this activity is to be shown in an "unread" state. When an activity is read by a person it is assigned to, this flag is set to false.
     */
    public void setIsUnread(Boolean value) { this.isUnread = value; }
    /**
     * @return Activities may be archived when they should be hidden from the user. When this flag is true, this activity should be hidden.
     */
    public Boolean getIsArchived() { return this.isArchived; }
    /**
     * @param value - Activities may be archived when they should be hidden from the user. When this flag is true, this activity should be hidden.
     */
    public void setIsArchived(Boolean value) { this.isArchived = value; }
    /**
     * @return The company associated with the activity To retrieve this collection, specify `Company` in the "Include" parameter for your query.
     */
    public CompanyModel getCompany() { return this.company; }
    /**
     * @param value - The company associated with the activity To retrieve this collection, specify `Company` in the "Include" parameter for your query.
     */
    public void setCompany(CompanyModel value) { this.company = value; }
    /**
     * @return All attachments attached to applied activity. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * @param value - All attachments attached to applied activity. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * @return All notes attached to this applied activity. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * @param value - All notes attached to this applied activity. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * @return All definitions attached to this applied activity. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * @param value - All definitions attached to this applied activity. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * @return All values attached to this activity. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * @param value - All values attached to this activity. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
