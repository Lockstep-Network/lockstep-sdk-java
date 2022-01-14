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
     * @return Unique id for the app enrollment
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * @param value - Unique id for the app enrollment
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * @return Id of enrolled app
     */
    public String getAppId() { return this.appId; }
    /**
     * @param value - Id of enrolled app
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * @return The name of the application
     */
    public String getName() { return this.name; }
    /**
     * @param value - The name of the application
     */
    public void setName(String value) { this.name = value; }
    /**
     * @return Tag for what type of app the application is
     */
    public String getAppType() { return this.appType; }
    /**
     * @param value - Tag for what type of app the application is
     */
    public void setAppType(String value) { this.appType = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return Unique Id for the custom field definition
     */
    public String getCustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * @param value - Unique Id for the custom field definition
     */
    public void setCustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * @return Text to display in-application for custom field
     */
    public String getCustomFieldLabel() { return this.customFieldLabel; }
    /**
     * @param value - Text to display in-application for custom field
     */
    public void setCustomFieldLabel(String value) { this.customFieldLabel = value; }
    /**
     * @return Data type of the custom field definition
     */
    public String getDataType() { return this.dataType; }
    /**
     * @param value - Data type of the custom field definition
     */
    public void setDataType(String value) { this.dataType = value; }
    /**
     * @return Used for display logic when multiple app enrollment custom fields exist
     */
    public Integer getSortOrder() { return this.sortOrder; }
    /**
     * @param value - Used for display logic when multiple app enrollment custom fields exist
     */
    public void setSortOrder(Integer value) { this.sortOrder = value; }
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
};
