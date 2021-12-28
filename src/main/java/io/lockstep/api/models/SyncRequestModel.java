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
     */
    public String getsyncRequestId() { return this.syncRequestId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setsyncRequestId(String value) { this.syncRequestId = value; }
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
     * Potential values = Cancelled, Ready, In Progress, Success, Failed
     */
    public String getstatusCode() { return this.statusCode; }
    /**
     * Potential values = Cancelled, Ready, In Progress, Success, Failed
     */
    public void setstatusCode(String value) { this.statusCode = value; }
    /**
     * Message containing information about the sync request results
     */
    public String getprocessResultMessage() { return this.processResultMessage; }
    /**
     * Message containing information about the sync request results
     */
    public void setprocessResultMessage(String value) { this.processResultMessage = value; }
    /**
     * App enrollment sync request is for
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * App enrollment sync request is for
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The date this sync request was created
     */
    public Date getcreated() { return this.created; }
    /**
     * The date this sync request was created
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The date this sync request was last modified
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date this sync request was last modified
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this sync request.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this sync request.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The detailed results from the sync.
     * To retrieve this collection, set `includeDetails` to true in your GET requests.
     */
    public Object getdetails() { return this.details; }
    /**
     * The detailed results from the sync.
     * To retrieve this collection, set `includeDetails` to true in your GET requests.
     */
    public void setdetails(Object value) { this.details = value; }
};
