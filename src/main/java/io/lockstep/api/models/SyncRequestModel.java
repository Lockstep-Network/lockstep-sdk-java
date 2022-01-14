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
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public String getSyncRequestId() { return this.syncRequestId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public void setSyncRequestId(String value) { this.syncRequestId = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return Potential values = Cancelled, Ready, In Progress, Success, Failed
     */
    public String getStatusCode() { return this.statusCode; }
    /**
     * @param value - Potential values = Cancelled, Ready, In Progress, Success, Failed
     */
    public void setStatusCode(String value) { this.statusCode = value; }
    /**
     * @return Message containing information about the sync request results
     */
    public String getProcessResultMessage() { return this.processResultMessage; }
    /**
     * @param value - Message containing information about the sync request results
     */
    public void setProcessResultMessage(String value) { this.processResultMessage = value; }
    /**
     * @return App enrollment sync request is for
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * @param value - App enrollment sync request is for
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * @return The date this sync request was created
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - The date this sync request was created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The date this sync request was last modified
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - The date this sync request was last modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return The ID number of the user who most recently modified this sync request.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - The ID number of the user who most recently modified this sync request.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * @return The detailed results from the sync. To retrieve this collection, set `includeDetails` to true in your GET requests.
     */
    public Object getDetails() { return this.details; }
    /**
     * @param value - The detailed results from the sync. To retrieve this collection, set `includeDetails` to true in your GET requests.
     */
    public void setDetails(Object value) { this.details = value; }
};
