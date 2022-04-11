
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
 * Represents links between an Activity and another record.
 */
public class ActivityXRefModel
{
    private @NotNull String activityXRefId;
    private @NotNull String activityId;
    private @NotNull String groupKey;
    private @Nullable String tableKey;
    private @Nullable String objectKey;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this is
     * added to the Lockstep platform.
     *
     * @return The field activityXRefId
     */
    public @NotNull String getActivityXRefId() { return this.activityXRefId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this is
     * added to the Lockstep platform.
     *
     * @param value The new value for activityXRefId
     */
    public void setActivityXRefId(@NotNull String value) { this.activityXRefId = value; }
    /**
     * The ID of the activity to which this reference belongs.
     *
     * @return The field activityId
     */
    public @NotNull String getActivityId() { return this.activityId; }
    /**
     * The ID of the activity to which this reference belongs.
     *
     * @param value The new value for activityId
     */
    public void setActivityId(@NotNull String value) { this.activityId = value; }
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
     * The name of the table the activity reference is associated with
     *
     * @return The field tableKey
     */
    public @Nullable String getTableKey() { return this.tableKey; }
    /**
     * The name of the table the activity reference is associated with
     *
     * @param value The new value for tableKey
     */
    public void setTableKey(@Nullable String value) { this.tableKey = value; }
    /**
     * The ID of the object the activity reference is associated with
     *
     * @return The field objectKey
     */
    public @Nullable String getObjectKey() { return this.objectKey; }
    /**
     * The ID of the object the activity reference is associated with
     *
     * @param value The new value for objectKey
     */
    public void setObjectKey(@Nullable String value) { this.objectKey = value; }
};
