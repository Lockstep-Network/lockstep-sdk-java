
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
 * The CustomFieldSyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  [Custom Fields](https://developer.lockstep.io/docs/custom-fields#custom-fields)
 * represent custom data extensions that you can use with the Lockstep Platform.  If you need to store extra
 * information about an object that does not match Lockstep's official schema, you can store it in the Custom
 * Field system using CustomFieldSyncModel.
 *
 * To store a custom field for an object, create a CustomFieldSyncModel record containing the `EntityType` and
 * `ErpKey` of the entity to which you will attach a custom field. Next specify the field's `CustomFieldLabel`
 * and either a `StringValue` or `NumericValue`.
 *
 * Once imported, this record will be available in the Lockstep API as a [CustomFieldValueModel](https://developer.lockstep.io/docs/customfieldvaluemodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class CustomFieldSyncModel
{
    private @NotNull String erpKey;
    private @NotNull String entityType;
    private @NotNull String customFieldLabel;
    private @Nullable String value;
    private @Nullable String created;
    private @Nullable String modified;

    /**
     * This is the primary key of the record to which you will attach this custom field. You should provide the
     * identifying number as it is stored in the originating financial system. Search for a unique, non-changing
     * number within the originating financial system for this record.
     *
     * Custom Fields are identified by the `EntityType` and `ErpKey` values together.
     *
     * Example: You have an invoice whose ID number is 100047878, and you wish to store a custom field on that
     * invoice named "ApprovalStatusCode".  For the `ErpKey` field, specify the value `100047878`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public @NotNull String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the record to which you will attach this custom field. You should provide the
     * identifying number as it is stored in the originating financial system. Search for a unique, non-changing
     * number within the originating financial system for this record.
     *
     * Custom Fields are identified by the `EntityType` and `ErpKey` values together.
     *
     * Example: You have an invoice whose ID number is 100047878, and you wish to store a custom field on that
     * invoice named "ApprovalStatusCode".  For the `ErpKey` field, specify the value `100047878`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@NotNull String value) { this.erpKey = value; }
    /**
     * Custom Fields are identified by the `EntityType` and `ErpKey` values together.
     *
     * Example: You have an invoice whose ID number is 100047878, and you wish to store a custom field on that
     * invoice named "ApprovalStatusCode".  For the `EntityType` field, specify the value `Invoice`.
     *
     * Recognized types include:
     * * `Company` - Link this custom field to a CompanySyncModel
     * * `Contact` - Link this custom field to a ContactSyncModel
     * * `Invoice` - Link this custom field to an InvoiceSyncModel
     * * `InvoiceLine` - Link this custom field to an InvoiceLineSyncModel
     * * `Payment` - Link this custom field to a PaymentSyncModel
     *
     * @return The field entityType
     */
    public @NotNull String getEntityType() { return this.entityType; }
    /**
     * Custom Fields are identified by the `EntityType` and `ErpKey` values together.
     *
     * Example: You have an invoice whose ID number is 100047878, and you wish to store a custom field on that
     * invoice named "ApprovalStatusCode".  For the `EntityType` field, specify the value `Invoice`.
     *
     * Recognized types include:
     * * `Company` - Link this custom field to a CompanySyncModel
     * * `Contact` - Link this custom field to a ContactSyncModel
     * * `Invoice` - Link this custom field to an InvoiceSyncModel
     * * `InvoiceLine` - Link this custom field to an InvoiceLineSyncModel
     * * `Payment` - Link this custom field to a PaymentSyncModel
     *
     * @param value The new value for entityType
     */
    public void setEntityType(@NotNull String value) { this.entityType = value; }
    /**
     * A label that uniquely identifies this custom field within your software.
     *
     * Example: You have an invoice whose ID number is 100047878, and you wish to store a custom field on that
     * invoice named "ApprovalStatusCode".  For the `CustomFieldLabel` field, specify the value `ApprovalStatusCode`.
     *
     * @return The field customFieldLabel
     */
    public @NotNull String getCustomFieldLabel() { return this.customFieldLabel; }
    /**
     * A label that uniquely identifies this custom field within your software.
     *
     * Example: You have an invoice whose ID number is 100047878, and you wish to store a custom field on that
     * invoice named "ApprovalStatusCode".  For the `CustomFieldLabel` field, specify the value `ApprovalStatusCode`.
     *
     * @param value The new value for customFieldLabel
     */
    public void setCustomFieldLabel(@NotNull String value) { this.customFieldLabel = value; }
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
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @return The field created
     */
    public @Nullable String getCreated() { return this.created; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @param value The new value for created
     */
    public void setCreated(@Nullable String value) { this.created = value; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @return The field modified
     */
    public @Nullable String getModified() { return this.modified; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @param value The new value for modified
     */
    public void setModified(@Nullable String value) { this.modified = value; }
};
