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

public class CustomFieldValueModel
{
    private String groupKey;
    private String customFieldDefinitionId;
    private String recordKey;
    private String stringValue;
    private Double numericValue;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private CustomFieldDefinitionModel customFieldDefinition;

    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public String getCustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public void setCustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * @return Additional key if source table doesn't have a unique id
     */
    public String getRecordKey() { return this.recordKey; }
    /**
     * @param value - Additional key if source table doesn't have a unique id
     */
    public void setRecordKey(String value) { this.recordKey = value; }
    /**
     * @return String of data for field
     */
    public String getStringValue() { return this.stringValue; }
    /**
     * @param value - String of data for field
     */
    public void setStringValue(String value) { this.stringValue = value; }
    /**
     * @return Number data for field
     */
    public Double getNumericValue() { return this.numericValue; }
    /**
     * @param value - Number data for field
     */
    public void setNumericValue(Double value) { this.numericValue = value; }
    /**
     * @return Date created
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - Date created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return Id of user who created this value
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - Id of user who created this value
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return Date modified
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - Date modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return Id of user who modified this value
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - Id of user who modified this value
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * @return AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * @param value - AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * @return Definition of the value
     */
    public CustomFieldDefinitionModel getCustomFieldDefinition() { return this.customFieldDefinition; }
    /**
     * @param value - Definition of the value
     */
    public void setCustomFieldDefinition(CustomFieldDefinitionModel value) { this.customFieldDefinition = value; }
};
