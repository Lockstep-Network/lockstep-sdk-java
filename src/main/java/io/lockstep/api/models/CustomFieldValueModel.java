
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
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * Additional key if source table doesn't have a unique id
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRecordKey() { return this.recordKey; }
    /**
     * Additional key if source table doesn't have a unique id
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setRecordKey(String value) { this.recordKey = value; }
    /**
     * String of data for field
     *
     * @return a {@link java.lang.String} object.
     */
    public String getStringValue() { return this.stringValue; }
    /**
     * String of data for field
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setStringValue(String value) { this.stringValue = value; }
    /**
     * Number data for field
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getNumericValue() { return this.numericValue; }
    /**
     * Number data for field
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setNumericValue(Double value) { this.numericValue = value; }
    /**
     * Date created
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * Date created
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * Id of user who created this value
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * Id of user who created this value
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date modified
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * Date modified
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * Id of user who modified this value
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * Id of user who modified this value
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Definition of the value
     *
     * @return a {@link io.lockstep.api.models.CustomFieldDefinitionModel} object.
     */
    public CustomFieldDefinitionModel getCustomFieldDefinition() { return this.customFieldDefinition; }
    /**
     * Definition of the value
     *
     * @param value a {@link io.lockstep.api.models.CustomFieldDefinitionModel} object.
     */
    public void setCustomFieldDefinition(CustomFieldDefinitionModel value) { this.customFieldDefinition = value; }
};
