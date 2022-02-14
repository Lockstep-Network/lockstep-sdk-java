
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Represents a Sync action that loads data from a connector into the Lockstep Platform.  Users can
 * request Sync actions manually using Lockstep Inbox, or via the [Create Sync API](https://developer.lockstep.io/reference/post_api-v1-sync).
 * Each Sync action is tied to an [AppEnrollment](https://developer.lockstep.io/docs/applications-and-enrollments).
 * When the Sync action is complete, the field `StatusCode` will be set to either `Success` or `Failed`.
 *
 * You can fetch a list of detailed results for the Sync API by calling Retrieve or Query with an `include`
 * parameter of `details`.  These detailed results contain line-by-line errors that were detected during
 * processing of this sync.
 */
public class SyncRequestModel
{
    private String syncRequestId;
    private String groupKey;
    private String statusCode;
    private String processResultMessage;
    private String appEnrollmentId;
    private String created;
    private String modified;
    private String modifiedUserId;
    private Object details;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field syncRequestId
     */
    public String getSyncRequestId() { return this.syncRequestId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for syncRequestId
     */
    public void setSyncRequestId(String value) { this.syncRequestId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The status of processing for this SyncRequest.  When a SyncRequest is created, it is flagged as `Ready`.
     * When it is picked up for execution, its status moves to `In Progress`.  When it is complete, its status
     * will move to `Success` or `Failed`.  If another API call cancels the SyncRequest, its status will move
     * to `Cancelled`.
     *
     * * Ready
     * * In Progress
     * * Cancelled
     * * Failed
     * * Success
     *
     * @return The field statusCode
     */
    public String getStatusCode() { return this.statusCode; }
    /**
     * The status of processing for this SyncRequest.  When a SyncRequest is created, it is flagged as `Ready`.
     * When it is picked up for execution, its status moves to `In Progress`.  When it is complete, its status
     * will move to `Success` or `Failed`.  If another API call cancels the SyncRequest, its status will move
     * to `Cancelled`.
     *
     * * Ready
     * * In Progress
     * * Cancelled
     * * Failed
     * * Success
     *
     * @param value The new value for statusCode
     */
    public void setStatusCode(String value) { this.statusCode = value; }
    /**
     * Message containing information about the sync request results
     *
     * @return The field processResultMessage
     */
    public String getProcessResultMessage() { return this.processResultMessage; }
    /**
     * Message containing information about the sync request results
     *
     * @param value The new value for processResultMessage
     */
    public void setProcessResultMessage(String value) { this.processResultMessage = value; }
    /**
     * App enrollment sync request is for
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * App enrollment sync request is for
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The date this sync request was created
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date this sync request was created
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The date this sync request was last modified
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * The date this sync request was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this sync request.
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this sync request.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The detailed list of results and errors that occurred during the processing of this SyncRequest.  This
     * information is available only after the SyncRequest has completed.  You will only be able to fetch this
     * field if the SyncRequest's `StatusCode` field is set to `Cancelled`, `Success`, or `Failed`.
     *
     * To retrieve this collection, add the keyword `details` to the `include` parameter on your Retrieve or
     * Query requests.
     *
     * @return The field details
     */
    public Object getDetails() { return this.details; }
    /**
     * The detailed list of results and errors that occurred during the processing of this SyncRequest.  This
     * information is available only after the SyncRequest has completed.  You will only be able to fetch this
     * field if the SyncRequest's `StatusCode` field is set to `Cancelled`, `Success`, or `Failed`.
     *
     * To retrieve this collection, add the keyword `details` to the `include` parameter on your Retrieve or
     * Query requests.
     *
     * @param value The new value for details
     */
    public void setDetails(Object value) { this.details = value; }
};
