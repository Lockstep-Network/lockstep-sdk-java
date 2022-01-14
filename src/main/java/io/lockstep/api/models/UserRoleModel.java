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
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public String getUserRoleId() { return this.userRoleId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public void setUserRoleId(String value) { this.userRoleId = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The name of the user role
     */
    public String getUserRoleName() { return this.userRoleName; }
    /**
     * @param value - The name of the user role
     */
    public void setUserRoleName(String value) { this.userRoleName = value; }
    /**
     * @return The date that the user role was created
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - The date that the user role was created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The ID of the user who created the user role
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The ID of the user who created the user role
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return The date the user role was last modified
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - The date the user role was last modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return The ID of the user who last modified the user role
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - The ID of the user who last modified the user role
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
};
