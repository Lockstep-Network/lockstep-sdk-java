
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A UserGroup represents the groups that the user is a member of.
 * A user may have varying permissions/access within a Group.
 */
public class UserGroupModel
{
    private @NotNull String groupKey;
    private @Nullable String userRole;
    private @Nullable String groupName;
    private @Nullable String status;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * The name of the Permission Level for the group.
     *
     * @return The field userRole
     */
    public @Nullable String getUserRole() { return this.userRole; }
    /**
     * The name of the Permission Level for the group.
     *
     * @param value The new value for userRole
     */
    public void setUserRole(@Nullable String value) { this.userRole = value; }
    /**
     * The name of the group
     *
     * @return The field groupName
     */
    public @Nullable String getGroupName() { return this.groupName; }
    /**
     * The name of the group
     *
     * @param value The new value for groupName
     */
    public void setGroupName(@Nullable String value) { this.groupName = value; }
    /**
     * The user's status in the group
     *
     * @return The field status
     */
    public @Nullable String getStatus() { return this.status; }
    /**
     * The user's status in the group
     *
     * @param value The new value for status
     */
    public void setStatus(@Nullable String value) { this.status = value; }
};
