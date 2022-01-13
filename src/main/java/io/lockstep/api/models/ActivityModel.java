
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
 * @version    2021.39
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
    private AttachmentModel[] attachments;
    private NoteModel[] notes;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getActivityId() { return this.activityId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setActivityId(String value) { this.activityId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The ID of the company to which this activity belongs.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this activity belongs.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * The type code of the activity
     *
     * @return a {@link java.lang.String} object.
     */
    public String getActivityTypeCode() { return this.activityTypeCode; }
    /**
     * The type code of the activity
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setActivityTypeCode(String value) { this.activityTypeCode = value; }
    /**
     * The name of the activity.  The name is a short name provided by the
     * person who created the activity that can be displayed in a list.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getActivityName() { return this.activityName; }
    /**
     * The name of the activity.  The name is a short name provided by the
     * person who created the activity that can be displayed in a list.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setActivityName(String value) { this.activityName = value; }
    /**
     * A description of the activity.  This field contains more detailed text about the
     * activity and can be lengthy.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getActivityDescription() { return this.activityDescription; }
    /**
     * A description of the activity.  This field contains more detailed text about the
     * activity and can be lengthy.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setActivityDescription(String value) { this.activityDescription = value; }
    /**
     * The status of the activity.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getActivityStatus() { return this.activityStatus; }
    /**
     * The status of the activity.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setActivityStatus(String value) { this.activityStatus = value; }
    /**
     * True if this activity is currently "open", which indicates that the activitiy is
     * currently in progress.
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getIsOpen() { return this.isOpen; }
    /**
     * True if this activity is currently "open", which indicates that the activitiy is
     * currently in progress.
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setIsOpen(Boolean value) { this.isOpen = value; }
    /**
     * The priority of the activity.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPriority() { return this.priority; }
    /**
     * The priority of the activity.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPriority(String value) { this.priority = value; }
    /**
     * The ID of the user the activity is assigned to.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserAssignedTo() { return this.userAssignedTo; }
    /**
     * The ID of the user the activity is assigned to.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setUserAssignedTo(String value) { this.userAssignedTo = value; }
    /**
     * The date the activity was assigned.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getDateAssigned() { return this.dateAssigned; }
    /**
     * The date the activity was assigned.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setDateAssigned(Date value) { this.dateAssigned = value; }
    /**
     * The date the activity was closed.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getDateClosed() { return this.dateClosed; }
    /**
     * The date the activity was closed.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setDateClosed(Date value) { this.dateClosed = value; }
    /**
     * If this activity has been "snoozed", this field will be non-null and will contain
     * the date when the activity will be displayed.  Until that date arrives, the activity
     * will remain hidden.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getSnoozeUntilDate() { return this.snoozeUntilDate; }
    /**
     * If this activity has been "snoozed", this field will be non-null and will contain
     * the date when the activity will be displayed.  Until that date arrives, the activity
     * will remain hidden.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setSnoozeUntilDate(Date value) { this.snoozeUntilDate = value; }
    /**
     * The date on which this activity was created.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * The date on which this activity was created.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created this activity.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this activity.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this activity was last modified.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * The date on which this activity was last modified.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified this activity.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this activity.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * Amount collected (if any) for the activity.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getAmountCollected() { return this.amountCollected; }
    /**
     * Amount collected (if any) for the activity.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setAmountCollected(Double value) { this.amountCollected = value; }
    /**
     * Amount paid (if any) for the activity.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getAmountPaid() { return this.amountPaid; }
    /**
     * Amount paid (if any) for the activity.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setAmountPaid(Double value) { this.amountPaid = value; }
    /**
     * Credit given (if any) for the activity.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getCreditGiven() { return this.creditGiven; }
    /**
     * Credit given (if any) for the activity.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setCreditGiven(Double value) { this.creditGiven = value; }
    /**
     * True if this activity is to be shown in an "unread" state.  When an activity
     * is read by a person it is assigned to, this flag is set to false.
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getIsUnread() { return this.isUnread; }
    /**
     * True if this activity is to be shown in an "unread" state.  When an activity
     * is read by a person it is assigned to, this flag is set to false.
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setIsUnread(Boolean value) { this.isUnread = value; }
    /**
     * Activities may be archived when they should be hidden from the user.  When
     * this flag is true, this activity should be hidden.
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getIsArchived() { return this.isArchived; }
    /**
     * Activities may be archived when they should be hidden from the user.  When
     * this flag is true, this activity should be hidden.
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setIsArchived(Boolean value) { this.isArchived = value; }
    /**
     * All attachments attached to applied activity.
     *
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to applied activity.
     *
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All notes attached to this applied activity.
     *
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this applied activity.
     *
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All definitions attached to this applied activity.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this applied activity.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this activity.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this activity.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
