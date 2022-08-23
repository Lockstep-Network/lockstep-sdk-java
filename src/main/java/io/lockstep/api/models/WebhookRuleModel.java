
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
 * A Webhook Rule is a subscription to receive notifications whenever a specific event occurs.
 *
 * With the rule, you specify the Table and event you want to subscribe to.
 * You can also optionally specify a filter to further refine the updates you want to receive.
 */
public class WebhookRuleModel
{
    private @NotNull String webhookRuleId;
    private @NotNull String webhookId;
    private @NotNull String groupKey;
    private @NotNull String tableKey;
    private @NotNull String eventType;
    private @Nullable String filter;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field webhookRuleId
     */
    public @NotNull String getWebhookRuleId() { return this.webhookRuleId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for webhookRuleId
     */
    public void setWebhookRuleId(@NotNull String value) { this.webhookRuleId = value; }
    /**
     * The unique Webhook ID that will be used to fire the webhook for this rule.
     *
     * @return The field webhookId
     */
    public @NotNull String getWebhookId() { return this.webhookId; }
    /**
     * The unique Webhook ID that will be used to fire the webhook for this rule.
     *
     * @param value The new value for webhookId
     */
    public void setWebhookId(@NotNull String value) { this.webhookId = value; }
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
     * A Webhook rule is setup to be fired based on `TableKey` and `EventType`.
     * For example, a Webhook setup for when an Invoice is Created would have a `TableKey` value of
     * `Invoice` and an `EventType` value of `I` (Insert).
     *
     * The `TableKey` value contains the name of the table within the Lockstep Platform to which this metadata
     * is connected.
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field tableKey
     */
    public @NotNull String getTableKey() { return this.tableKey; }
    /**
     * A Webhook rule is setup to be fired based on `TableKey` and `EventType`.
     * For example, a Webhook setup for when an Invoice is Created would have a `TableKey` value of
     * `Invoice` and an `EventType` value of `I` (Insert).
     *
     * The `TableKey` value contains the name of the table within the Lockstep Platform to which this metadata
     * is connected.
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for tableKey
     */
    public void setTableKey(@NotNull String value) { this.tableKey = value; }
    /**
     * A Webhook rule is setup to be fired based on `TableKey` and `EventType`.
     * For example, a Webhook setup for when an Invoice is Created would have a `TableKey` value of
     * `Invoice` and an `EventType` value of `I` (Insert).
     *
     * The `EventType` value is one of the following:
     * - I (Insert)
     * - D (Delete)
     * - U (Update)
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field eventType
     */
    public @NotNull String getEventType() { return this.eventType; }
    /**
     * A Webhook rule is setup to be fired based on `TableKey` and `EventType`.
     * For example, a Webhook setup for when an Invoice is Created would have a `TableKey` value of
     * `Invoice` and an `EventType` value of `I` (Insert).
     *
     * The `EventType` value is one of the following:
     * - I (Insert)
     * - D (Delete)
     * - U (Update)
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for eventType
     */
    public void setEventType(@NotNull String value) { this.eventType = value; }
    /**
     * An optional Searchlight filter for this webhook rule. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     *
     * @return The field filter
     */
    public @Nullable String getFilter() { return this.filter; }
    /**
     * An optional Searchlight filter for this webhook rule. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     *
     * @param value The new value for filter
     */
    public void setFilter(@Nullable String value) { this.filter = value; }
    /**
     * The date this webhook rule was created
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date this webhook rule was created
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created this webhook rule
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this webhook rule
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date this webhook rule was last modified
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date this webhook rule was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this webhook rule
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this webhook rule
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
};
