
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    private @NotNull String groupKey;
    private @NotNull String customFieldDefinitionId;
    private @NotNull String recordKey;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String appEnrollmentId;
    private @Nullable String value;
    private @Nullable CustomFieldDefinitionModel customFieldDefinition;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field customFieldDefinitionId
     */
    public @NotNull String getCustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for customFieldDefinitionId
     */
    public void setCustomFieldDefinitionId(@NotNull String value) { this.customFieldDefinitionId = value; }
    /**
     * Additional key if source table doesn't have a unique id
     *
     * @return The field recordKey
     */
    public @NotNull String getRecordKey() { return this.recordKey; }
    /**
     * Additional key if source table doesn't have a unique id
     *
     * @param value The new value for recordKey
     */
    public void setRecordKey(@NotNull String value) { this.recordKey = value; }
    /**
     * Date created
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * Date created
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * Id of user who created this value
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * Id of user who created this value
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * Date modified
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * Date modified
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * Id of user who modified this value
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * Id of user who modified this value
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
    /**
     * The AppEnrollmentId of the application that imported this attachment record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this attachment record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * The value of this custom field.
     *
     * @return The field value
     */
    public @Nullable String getValue() { return this.value; }
    /**
     * The value of this custom field.
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable String value) { this.value = value; }
    /**
     * Definition of the value
     *
     * @return The field customFieldDefinition
     */
    public @Nullable CustomFieldDefinitionModel getCustomFieldDefinition() { return this.customFieldDefinition; }
    /**
     * Definition of the value
     *
     * @param value The new value for customFieldDefinition
     */
    public void setCustomFieldDefinition(@Nullable CustomFieldDefinitionModel value) { this.customFieldDefinition = value; }
};
