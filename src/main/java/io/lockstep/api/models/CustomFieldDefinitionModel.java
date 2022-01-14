
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

/**
 * A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a
 * core definition for each object.  The core definition is intended to represent a level of compatibility
 * that provides support across most accounting systems and products.  When a user or developer requires
 * information beyond this core definition, you can use Custom Fields to represent this information.
 *
 * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
 */
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
     * Table to which this definition belongs
     *
     * @return The field tableKey
     */
    public String getTableKey() { return this.tableKey; }
    /**
     * Table to which this definition belongs
     *
     * @param value The new value for tableKey
     */
    public void setTableKey(String value) { this.tableKey = value; }
    /**
     * Id of app this definition belongs to
     *
     * @return The field appId
     */
    public String getAppId() { return this.appId; }
    /**
     * Id of app this definition belongs to
     *
     * @param value The new value for appId
     */
    public void setAppId(String value) { this.appId = value; }
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
     * Data type of this definition
     *
     * @return The field dataType
     */
    public String getDataType() { return this.dataType; }
    /**
     * Data type of this definition
     *
     * @param value The new value for dataType
     */
    public void setDataType(String value) { this.dataType = value; }
    /**
     * Used for display logic when multiple custom fields exist
     *
     * @return The field sortOrder
     */
    public Integer getSortOrder() { return this.sortOrder; }
    /**
     * Used for display logic when multiple custom fields exist
     *
     * @param value The new value for sortOrder
     */
    public void setSortOrder(Integer value) { this.sortOrder = value; }
    /**
     * Date created
     *
     * @return The field created
     */
    public Date getCreated() { return this.created; }
    /**
     * Date created
     *
     * @param value The new value for created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * Id of user who created this definition
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * Id of user who created this definition
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date modified
     *
     * @return The field modified
     */
    public Date getModified() { return this.modified; }
    /**
     * Date modified
     *
     * @param value The new value for modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * Id of user who modified this definition
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * Id of user who modified this definition
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
};
