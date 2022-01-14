
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
     * Unique id for the app enrollment
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * Unique id for the app enrollment
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Id of enrolled app
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppId() { return this.appId; }
    /**
     * Id of enrolled app
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * The name of the application
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName() { return this.name; }
    /**
     * The name of the application
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setName(String value) { this.name = value; }
    /**
     * Tag for what type of app the application is
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppType() { return this.appType; }
    /**
     * Tag for what type of app the application is
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppType(String value) { this.appType = value; }
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
     * Unique Id for the custom field definition
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * Unique Id for the custom field definition
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * Text to display in-application for custom field
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCustomFieldLabel() { return this.customFieldLabel; }
    /**
     * Text to display in-application for custom field
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCustomFieldLabel(String value) { this.customFieldLabel = value; }
    /**
     * Data type of the custom field definition
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDataType() { return this.dataType; }
    /**
     * Data type of the custom field definition
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setDataType(String value) { this.dataType = value; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getSortOrder() { return this.sortOrder; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setSortOrder(Integer value) { this.sortOrder = value; }
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
};
