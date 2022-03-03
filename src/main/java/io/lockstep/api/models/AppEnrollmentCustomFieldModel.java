
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * App enrollment and custom field merged into one
 */
public class AppEnrollmentCustomFieldModel
{
    private @NotNull String appEnrollmentId;
    private @NotNull String appId;
    private @Nullable String name;
    private @Nullable String appType;
    private @NotNull String groupKey;
    private @NotNull String customFieldDefinitionId;
    private @Nullable String customFieldLabel;
    private @Nullable String dataType;
    private @NotNull Integer sortOrder;
    private @Nullable String value;

    /**
     * Unique id for the app enrollment
     *
     * @return The field appEnrollmentId
     */
    public @NotNull String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * Unique id for the app enrollment
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@NotNull String value) { this.appEnrollmentId = value; }
    /**
     * Id of enrolled app
     *
     * @return The field appId
     */
    public @NotNull String getAppId() { return this.appId; }
    /**
     * Id of enrolled app
     *
     * @param value The new value for appId
     */
    public void setAppId(@NotNull String value) { this.appId = value; }
    /**
     * The name of the application
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of the application
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Tag for what type of app the application is
     *
     * @return The field appType
     */
    public @Nullable String getAppType() { return this.appType; }
    /**
     * Tag for what type of app the application is
     *
     * @param value The new value for appType
     */
    public void setAppType(@Nullable String value) { this.appType = value; }
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
     * Unique Id for the custom field definition
     *
     * @return The field customFieldDefinitionId
     */
    public @NotNull String getCustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * Unique Id for the custom field definition
     *
     * @param value The new value for customFieldDefinitionId
     */
    public void setCustomFieldDefinitionId(@NotNull String value) { this.customFieldDefinitionId = value; }
    /**
     * Text to display in-application for custom field
     *
     * @return The field customFieldLabel
     */
    public @Nullable String getCustomFieldLabel() { return this.customFieldLabel; }
    /**
     * Text to display in-application for custom field
     *
     * @param value The new value for customFieldLabel
     */
    public void setCustomFieldLabel(@Nullable String value) { this.customFieldLabel = value; }
    /**
     * Data type of the custom field definition
     *
     * @return The field dataType
     */
    public @Nullable String getDataType() { return this.dataType; }
    /**
     * Data type of the custom field definition
     *
     * @param value The new value for dataType
     */
    public void setDataType(@Nullable String value) { this.dataType = value; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     *
     * @return The field sortOrder
     */
    public @NotNull Integer getSortOrder() { return this.sortOrder; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     *
     * @param value The new value for sortOrder
     */
    public void setSortOrder(@NotNull Integer value) { this.sortOrder = value; }
    /**
     * Value for the field
     *
     * @return The field value
     */
    public @Nullable String getValue() { return this.value; }
    /**
     * Value for the field
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable String value) { this.value = value; }
};
