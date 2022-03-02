
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
 * Represents links between an Activity and another record.
 */
public class ActivityXRefModel
{
    private String activityXRefId;
    private String activityId;
    private String groupKey;
    private String tableKey;
    private String objectKey;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this is
     * added to the Lockstep platform.
     *
     * @return The field activityXRefId
     */
    public String getActivityXRefId() { return this.activityXRefId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this is
     * added to the Lockstep platform.
     *
     * @param value The new value for activityXRefId
     */
    public void setActivityXRefId(String value) { this.activityXRefId = value; }
    /**
     * The ID of the activity to which this reference belongs.
     *
     * @return The field activityId
     */
    public String getActivityId() { return this.activityId; }
    /**
     * The ID of the activity to which this reference belongs.
     *
     * @param value The new value for activityId
     */
    public void setActivityId(String value) { this.activityId = value; }
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
     * The name of the table the activity reference is associated with
     *
     * @return The field tableKey
     */
    public String getTableKey() { return this.tableKey; }
    /**
     * The name of the table the activity reference is associated with
     *
     * @param value The new value for tableKey
     */
    public void setTableKey(String value) { this.tableKey = value; }
    /**
     * The ID of the object the activity reference is associated with
     *
     * @return The field objectKey
     */
    public String getObjectKey() { return this.objectKey; }
    /**
     * The ID of the object the activity reference is associated with
     *
     * @param value The new value for objectKey
     */
    public void setObjectKey(String value) { this.objectKey = value; }
};
