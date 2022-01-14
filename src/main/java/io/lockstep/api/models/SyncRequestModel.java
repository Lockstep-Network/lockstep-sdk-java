
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

/**
 * Represents a user request to sync data
 */
public class SyncRequestModel
{
    private String syncRequestId;
    private String groupKey;
    private String statusCode;
    private String processResultMessage;
    private String appEnrollmentId;
    private Date created;
    private Date modified;
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
     * Potential values = Cancelled, Ready, In Progress, Success, Failed
     *
     * @return The field statusCode
     */
    public String getStatusCode() { return this.statusCode; }
    /**
     * Potential values = Cancelled, Ready, In Progress, Success, Failed
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
    public Date getCreated() { return this.created; }
    /**
     * The date this sync request was created
     *
     * @param value The new value for created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The date this sync request was last modified
     *
     * @return The field modified
     */
    public Date getModified() { return this.modified; }
    /**
     * The date this sync request was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(Date value) { this.modified = value; }
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
     * The detailed results from the sync.
     * To retrieve this collection, set `includeDetails` to true in your GET requests.
     *
     * @return The field details
     */
    public Object getDetails() { return this.details; }
    /**
     * The detailed results from the sync.
     * To retrieve this collection, set `includeDetails` to true in your GET requests.
     *
     * @param value The new value for details
     */
    public void setDetails(Object value) { this.details = value; }
};
