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
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * Unique id for the app enrollment
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Id of enrolled app
     */
    public String getappId() { return this.appId; }
    /**
     * Id of enrolled app
     */
    public void setappId(String value) { this.appId = value; }
    /**
     * The name of the application
     */
    public String getname() { return this.name; }
    /**
     * The name of the application
     */
    public void setname(String value) { this.name = value; }
    /**
     * Tag for what type of app the application is
     */
    public String getappType() { return this.appType; }
    /**
     * Tag for what type of app the application is
     */
    public void setappType(String value) { this.appType = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * Unique Id for the custom field definition
     */
    public String getcustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * Unique Id for the custom field definition
     */
    public void setcustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * Text to display in-application for custom field
     */
    public String getcustomFieldLabel() { return this.customFieldLabel; }
    /**
     * Text to display in-application for custom field
     */
    public void setcustomFieldLabel(String value) { this.customFieldLabel = value; }
    /**
     * Data type of the custom field definition
     */
    public String getdataType() { return this.dataType; }
    /**
     * Data type of the custom field definition
     */
    public void setdataType(String value) { this.dataType = value; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     */
    public Integer getsortOrder() { return this.sortOrder; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     */
    public void setsortOrder(Integer value) { this.sortOrder = value; }
    /**
     * String of data for field
     */
    public String getstringValue() { return this.stringValue; }
    /**
     * String of data for field
     */
    public void setstringValue(String value) { this.stringValue = value; }
    /**
     * Number data for field
     */
    public Double getnumericValue() { return this.numericValue; }
    /**
     * Number data for field
     */
    public void setnumericValue(Double value) { this.numericValue = value; }
};
