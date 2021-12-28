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
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getcustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setcustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * Additional key if source table doesn't have a unique id
     */
    public String getrecordKey() { return this.recordKey; }
    /**
     * Additional key if source table doesn't have a unique id
     */
    public void setrecordKey(String value) { this.recordKey = value; }
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
    /**
     * Date created
     */
    public Date getcreated() { return this.created; }
    /**
     * Date created
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * Id of user who created this value
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * Id of user who created this value
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date modified
     */
    public Date getmodified() { return this.modified; }
    /**
     * Date modified
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * Id of user who modified this value
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * Id of user who modified this value
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Definition of the value
     */
    public CustomFieldDefinitionModel getcustomFieldDefinition() { return this.customFieldDefinition; }
    /**
     * Definition of the value
     */
    public void setcustomFieldDefinition(CustomFieldDefinitionModel value) { this.customFieldDefinition = value; }
};
