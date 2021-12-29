/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
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
     * Unique id for the app enrollment
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * Unique id for the app enrollment
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Id of enrolled app
     */
    public String getAppId() { return this.appId; }
    /**
     * Id of enrolled app
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * The name of the application
     */
    public String getName() { return this.name; }
    /**
     * The name of the application
     */
    public void setName(String value) { this.name = value; }
    /**
     * Tag for what type of app the application is
     */
    public String getAppType() { return this.appType; }
    /**
     * Tag for what type of app the application is
     */
    public void setAppType(String value) { this.appType = value; }
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
     * Unique Id for the custom field definition
     */
    public String getCustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * Unique Id for the custom field definition
     */
    public void setCustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * Text to display in-application for custom field
     */
    public String getCustomFieldLabel() { return this.customFieldLabel; }
    /**
     * Text to display in-application for custom field
     */
    public void setCustomFieldLabel(String value) { this.customFieldLabel = value; }
    /**
     * Data type of the custom field definition
     */
    public String getDataType() { return this.dataType; }
    /**
     * Data type of the custom field definition
     */
    public void setDataType(String value) { this.dataType = value; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     */
    public Integer getSortOrder() { return this.sortOrder; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     */
    public void setSortOrder(Integer value) { this.sortOrder = value; }
    /**
     * String of data for field
     */
    public String getStringValue() { return this.stringValue; }
    /**
     * String of data for field
     */
    public void setStringValue(String value) { this.stringValue = value; }
    /**
     * Number data for field
     */
    public Double getNumericValue() { return this.numericValue; }
    /**
     * Number data for field
     */
    public void setNumericValue(Double value) { this.numericValue = value; }
};
