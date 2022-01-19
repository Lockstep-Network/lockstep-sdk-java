
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
 * A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a
 * core definition for each object.  The core definition is intended to represent a level of compatibility
 * that provides support across most accounting systems and products.  When a user or developer requires
 * information beyond this core definition, you can use Custom Fields to represent this information.
 *
 * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
 */
public class CustomFieldValueModel
{
    private String groupKey;
    private String customFieldDefinitionId;
    private String recordKey;
    private String stringValue;
    private Double numericValue;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private CustomFieldDefinitionModel customFieldDefinition;

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
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field customFieldDefinitionId
     */
    public String getCustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for customFieldDefinitionId
     */
    public void setCustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * Additional key if source table doesn't have a unique id
     *
     * @return The field recordKey
     */
    public String getRecordKey() { return this.recordKey; }
    /**
     * Additional key if source table doesn't have a unique id
     *
     * @param value The new value for recordKey
     */
    public void setRecordKey(String value) { this.recordKey = value; }
    /**
     * String of data for field
     *
     * @return The field stringValue
     */
    public String getStringValue() { return this.stringValue; }
    /**
     * String of data for field
     *
     * @param value The new value for stringValue
     */
    public void setStringValue(String value) { this.stringValue = value; }
    /**
     * Number data for field
     *
     * @return The field numericValue
     */
    public Double getNumericValue() { return this.numericValue; }
    /**
     * Number data for field
     *
     * @param value The new value for numericValue
     */
    public void setNumericValue(Double value) { this.numericValue = value; }
    /**
     * Date created
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * Date created
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * Id of user who created this value
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * Id of user who created this value
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date modified
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * Date modified
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * Id of user who modified this value
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * Id of user who modified this value
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Definition of the value
     *
     * @return The field customFieldDefinition
     */
    public CustomFieldDefinitionModel getCustomFieldDefinition() { return this.customFieldDefinition; }
    /**
     * Definition of the value
     *
     * @param value The new value for customFieldDefinition
     */
    public void setCustomFieldDefinition(CustomFieldDefinitionModel value) { this.customFieldDefinition = value; }
};
