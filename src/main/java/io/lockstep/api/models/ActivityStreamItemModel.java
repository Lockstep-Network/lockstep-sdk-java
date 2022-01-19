
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
 * @version    2022.3
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Represents an item belonging to the activity stream.
 */
public class ActivityStreamItemModel
{
    private String objectKey;
    private String activityStreamType;
    private String textValue;
    private String created;
    private String createdUserId;
    private String groupKey;
    private String fromEmailAddress;
    private String toEmailAddress;
    private String fromContactName;
    private String toContactName;

    /**
     * The object key of the activity stream item.
     *
     * @return The field objectKey
     */
    public String getObjectKey() { return this.objectKey; }
    /**
     * The object key of the activity stream item.
     *
     * @param value The new value for objectKey
     */
    public void setObjectKey(String value) { this.objectKey = value; }
    /**
     * The type code of the activity stream item.
     *
     * @return The field activityStreamType
     */
    public String getActivityStreamType() { return this.activityStreamType; }
    /**
     * The type code of the activity stream item.
     *
     * @param value The new value for activityStreamType
     */
    public void setActivityStreamType(String value) { this.activityStreamType = value; }
    /**
     * The text body description for this Activity Stream Item.
     *
     * @return The field textValue
     */
    public String getTextValue() { return this.textValue; }
    /**
     * The text body description for this Activity Stream Item.
     *
     * @param value The new value for textValue
     */
    public void setTextValue(String value) { this.textValue = value; }
    /**
     * The date on which this activity stream item was created.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date on which this activity stream item was created.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The ID of the user who created this activity.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this activity.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
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
     * The sender's email address if activity stream item is an Email.
     *
     * @return The field fromEmailAddress
     */
    public String getFromEmailAddress() { return this.fromEmailAddress; }
    /**
     * The sender's email address if activity stream item is an Email.
     *
     * @param value The new value for fromEmailAddress
     */
    public void setFromEmailAddress(String value) { this.fromEmailAddress = value; }
    /**
     * The recipient's email address if activity stream item is an Email.
     *
     * @return The field toEmailAddress
     */
    public String getToEmailAddress() { return this.toEmailAddress; }
    /**
     * The recipient's email address if activity stream item is an Email.
     *
     * @param value The new value for toEmailAddress
     */
    public void setToEmailAddress(String value) { this.toEmailAddress = value; }
    /**
     * The name of the contact sending the activity otherwise null.
     *
     * @return The field fromContactName
     */
    public String getFromContactName() { return this.fromContactName; }
    /**
     * The name of the contact sending the activity otherwise null.
     *
     * @param value The new value for fromContactName
     */
    public void setFromContactName(String value) { this.fromContactName = value; }
    /**
     * The name of the contact sending the activity otherwise null.
     *
     * @return The field toContactName
     */
    public String getToContactName() { return this.toContactName; }
    /**
     * The name of the contact sending the activity otherwise null.
     *
     * @param value The new value for toContactName
     */
    public void setToContactName(String value) { this.toContactName = value; }
};
