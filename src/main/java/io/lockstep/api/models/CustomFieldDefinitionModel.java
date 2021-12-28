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

public class CustomFieldDefinitionModel
{
    private String groupKey;
    private String customFieldDefinitionId;
    private String tableKey;
    private String appId;
    private String customFieldLabel;
    private String dataType;
    private Integer sortOrder;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;

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
     * Table to which this definition belongs
     */
    public String gettableKey() { return this.tableKey; }
    /**
     * Table to which this definition belongs
     */
    public void settableKey(String value) { this.tableKey = value; }
    /**
     * Id of app this definition belongs to
     */
    public String getappId() { return this.appId; }
    /**
     * Id of app this definition belongs to
     */
    public void setappId(String value) { this.appId = value; }
    /**
     * Text to display in-application for custom field
     */
    public String getcustomFieldLabel() { return this.customFieldLabel; }
    /**
     * Text to display in-application for custom field
     */
    public void setcustomFieldLabel(String value) { this.customFieldLabel = value; }
    /**
     * Data type of this definition
     */
    public String getdataType() { return this.dataType; }
    /**
     * Data type of this definition
     */
    public void setdataType(String value) { this.dataType = value; }
    /**
     * Used for display logic when multiple custom fields exist
     */
    public Integer getsortOrder() { return this.sortOrder; }
    /**
     * Used for display logic when multiple custom fields exist
     */
    public void setsortOrder(Integer value) { this.sortOrder = value; }
    /**
     * Date created
     */
    public Date getcreated() { return this.created; }
    /**
     * Date created
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * Id of user who created this definition
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * Id of user who created this definition
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
     * Id of user who modified this definition
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * Id of user who modified this definition
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
};
