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

public class UserRoleModel
{
    private String userRoleId;
    private String groupKey;
    private String userRoleName;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getuserRoleId() { return this.userRoleId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setuserRoleId(String value) { this.userRoleId = value; }
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
     * The name of the user role
     */
    public String getuserRoleName() { return this.userRoleName; }
    /**
     * The name of the user role
     */
    public void setuserRoleName(String value) { this.userRoleName = value; }
    /**
     * The date that the user role was created
     */
    public Date getcreated() { return this.created; }
    /**
     * The date that the user role was created
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created the user role
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the user role
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the user role was last modified
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date the user role was last modified
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified the user role
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the user role
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
};
