
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
 * Represents an account for an entire group
 */
public class GroupAccountModel
{
    private @NotNull String groupKey;
    private @NotNull String groupName;
    private @NotNull String primaryUserId;
    private @NotNull String groupCompanyId;
    private @NotNull Boolean isActive;
    private @NotNull Boolean onboardingScheduled;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;

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
     * The name of the group
     *
     * @return The field groupName
     */
    public @NotNull String getGroupName() { return this.groupName; }
    /**
     * The name of the group
     *
     * @param value The new value for groupName
     */
    public void setGroupName(@NotNull String value) { this.groupName = value; }
    /**
     * The primary user for the group
     *
     * @return The field primaryUserId
     */
    public @NotNull String getPrimaryUserId() { return this.primaryUserId; }
    /**
     * The primary user for the group
     *
     * @param value The new value for primaryUserId
     */
    public void setPrimaryUserId(@NotNull String value) { this.primaryUserId = value; }
    /**
     * The CompanyId of the Company the group is associated with
     *
     * @return The field groupCompanyId
     */
    public @NotNull String getGroupCompanyId() { return this.groupCompanyId; }
    /**
     * The CompanyId of the Company the group is associated with
     *
     * @param value The new value for groupCompanyId
     */
    public void setGroupCompanyId(@NotNull String value) { this.groupCompanyId = value; }
    /**
     * The active status of the group
     *
     * @return The field isActive
     */
    public @NotNull Boolean getIsActive() { return this.isActive; }
    /**
     * The active status of the group
     *
     * @param value The new value for isActive
     */
    public void setIsActive(@NotNull Boolean value) { this.isActive = value; }
    /**
     * The onboarding session status of the group
     *
     * @return The field onboardingScheduled
     */
    public @NotNull Boolean getOnboardingScheduled() { return this.onboardingScheduled; }
    /**
     * The onboarding session status of the group
     *
     * @param value The new value for onboardingScheduled
     */
    public void setOnboardingScheduled(@NotNull Boolean value) { this.onboardingScheduled = value; }
    /**
     * The date this group account was created
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date this group account was created
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created this group account
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this group account
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date this group account was last modified
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date this group account was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this group account
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this group account
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
};
