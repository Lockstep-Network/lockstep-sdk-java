
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
 * App enrollment and custom field merged into one
 */
public class AppEnrollmentCustomFieldModel
{
    private String appEnrollmentId;
    private String appId;
    private String name;
    private String appType;
    private String groupKey;
    private String customFieldDefinitionId;
    private String customFieldLabel;
    private String dataType;
    private Integer sortOrder;
    private String stringValue;
    private Double numericValue;

    /**
     * Unique id for the app enrollment
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * Unique id for the app enrollment
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Id of enrolled app
     *
     * @return The field appId
     */
    public String getAppId() { return this.appId; }
    /**
     * Id of enrolled app
     *
     * @param value The new value for appId
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * The name of the application
     *
     * @return The field name
     */
    public String getName() { return this.name; }
    /**
     * The name of the application
     *
     * @param value The new value for name
     */
    public void setName(String value) { this.name = value; }
    /**
     * Tag for what type of app the application is
     *
     * @return The field appType
     */
    public String getAppType() { return this.appType; }
    /**
     * Tag for what type of app the application is
     *
     * @param value The new value for appType
     */
    public void setAppType(String value) { this.appType = value; }
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
     * Unique Id for the custom field definition
     *
     * @return The field customFieldDefinitionId
     */
    public String getCustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * Unique Id for the custom field definition
     *
     * @param value The new value for customFieldDefinitionId
     */
    public void setCustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * Text to display in-application for custom field
     *
     * @return The field customFieldLabel
     */
    public String getCustomFieldLabel() { return this.customFieldLabel; }
    /**
     * Text to display in-application for custom field
     *
     * @param value The new value for customFieldLabel
     */
    public void setCustomFieldLabel(String value) { this.customFieldLabel = value; }
    /**
     * Data type of the custom field definition
     *
     * @return The field dataType
     */
    public String getDataType() { return this.dataType; }
    /**
     * Data type of the custom field definition
     *
     * @param value The new value for dataType
     */
    public void setDataType(String value) { this.dataType = value; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     *
     * @return The field sortOrder
     */
    public Integer getSortOrder() { return this.sortOrder; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     *
     * @param value The new value for sortOrder
     */
    public void setSortOrder(Integer value) { this.sortOrder = value; }
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
};
