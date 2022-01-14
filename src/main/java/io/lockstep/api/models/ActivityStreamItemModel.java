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

public class ActivityStreamItemModel
{
    private String objectKey;
    private String activityType;
    private String textValue;
    private Date created;
    private String createdUserId;
    private String groupKey;
    private String fromEmailAddress;
    private String toEmailAddress;
    private String fromContactName;
    private String toContactName;

    /**
     * The object key of the activity stream item.
     */
    public String getObjectKey() { return this.objectKey; }
    /**
     * The object key of the activity stream item.
     */
    public void setObjectKey(String value) { this.objectKey = value; }
    /**
     * The type code of the activity stream item.
     */
    public String getActivityType() { return this.activityType; }
    /**
     * The type code of the activity stream item.
     */
    public void setActivityType(String value) { this.activityType = value; }
    /**
     * The text body description for this Activity Stream Item.
     */
    public String getTextValue() { return this.textValue; }
    /**
     * The text body description for this Activity Stream Item.
     */
    public void setTextValue(String value) { this.textValue = value; }
    /**
     * The date on which this activity stream item was created.
     */
    public Date getCreated() { return this.created; }
    /**
     * The date on which this activity stream item was created.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created this activity.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this activity.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The sender's email address if activity stream item is an Email.
     */
    public String getFromEmailAddress() { return this.fromEmailAddress; }
    /**
     * The sender's email address if activity stream item is an Email.
     */
    public void setFromEmailAddress(String value) { this.fromEmailAddress = value; }
    /**
     * The recipient's email address if activity stream item is an Email.
     */
    public String getToEmailAddress() { return this.toEmailAddress; }
    /**
     * The recipient's email address if activity stream item is an Email.
     */
    public void setToEmailAddress(String value) { this.toEmailAddress = value; }
    /**
     * The name of the contact sending the activity otherwise null.
     */
    public String getFromContactName() { return this.fromContactName; }
    /**
     * The name of the contact sending the activity otherwise null.
     */
    public void setFromContactName(String value) { this.fromContactName = value; }
    /**
     * The name of the contact sending the activity otherwise null.
     */
    public String getToContactName() { return this.toContactName; }
    /**
     * The name of the contact sending the activity otherwise null.
     */
    public void setToContactName(String value) { this.toContactName = value; }
};
