
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2023 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2023 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The InvoiceLineSyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the InvoiceLineSyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as an [InvoiceLineModel](https://developer.lockstep.io/docs/invoicelinemodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class InvoiceLineSyncModel
{
    private @NotNull String erpKey;
    private @NotNull String invoiceErpKey;
    private @NotNull String lineNumber;
    private @Nullable String productCode;
    private @Nullable String description;
    private @Nullable String unitMeasureCode;
    private @Nullable Double unitPrice;
    private @Nullable Double quantity;
    private @Nullable Double quantityShipped;
    private @Nullable Double quantityReceived;
    private @Nullable Double totalAmount;
    private @Nullable String exemptionCode;
    private @Nullable String reportingDate;
    private @Nullable String originAddressLine1;
    private @Nullable String originAddressLine2;
    private @Nullable String originAddressLine3;
    private @Nullable String originAddressCity;
    private @Nullable String originAddressRegion;
    private @Nullable String originAddressPostalCode;
    private @Nullable String originAddressCountry;
    private @Nullable Float originAddressLatitude;
    private @Nullable Float originAddressLongitude;
    private @Nullable String billToAddressLine1;
    private @Nullable String billToAddressLine2;
    private @Nullable String billToAddressLine3;
    private @Nullable String billToAddressCity;
    private @Nullable String billToAddressRegion;
    private @Nullable String billToAddressPostalCode;
    private @Nullable String billToAddressCountry;
    private @Nullable Float billToAddressLatitude;
    private @Nullable Float billToAddressLongitude;
    private @Nullable String shipToAddressLine1;
    private @Nullable String shipToAddressLine2;
    private @Nullable String shipToAddressLine3;
    private @Nullable String shipToAddressCity;
    private @Nullable String shipToAddressRegion;
    private @Nullable String shipToAddressPostalCode;
    private @Nullable String shipToAddressCountry;
    private @Nullable Float shipToAddressLatitude;
    private @Nullable Float shipToAddressLongitude;
    private @Nullable String created;
    private @Nullable String modified;

    /**
     * This is the primary key of the Invoice Line record. For this field, you should use whatever the contact's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your invoice line records in a database, whatever the primary key for the invoice
     * line table is in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public @NotNull String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Invoice Line record. For this field, you should use whatever the contact's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your invoice line records in a database, whatever the primary key for the invoice
     * line table is in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@NotNull String value) { this.erpKey = value; }
    /**
     * The original primary key or unique ID of the invoice to which this line belongs.  This value should
     * match the [Invoice ErpKey](https://developer.lockstep.io/docs/importing-invoices#erpkey) field on the
     * [InvoiceSyncModel](https://developer.lockstep.io/docs/importing-invoices).
     *
     * @return The field invoiceErpKey
     */
    public @NotNull String getInvoiceErpKey() { return this.invoiceErpKey; }
    /**
     * The original primary key or unique ID of the invoice to which this line belongs.  This value should
     * match the [Invoice ErpKey](https://developer.lockstep.io/docs/importing-invoices#erpkey) field on the
     * [InvoiceSyncModel](https://developer.lockstep.io/docs/importing-invoices).
     *
     * @param value The new value for invoiceErpKey
     */
    public void setInvoiceErpKey(@NotNull String value) { this.invoiceErpKey = value; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     *
     * @return The field lineNumber
     */
    public @NotNull String getLineNumber() { return this.lineNumber; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     *
     * @param value The new value for lineNumber
     */
    public void setLineNumber(@NotNull String value) { this.lineNumber = value; }
    /**
     * A code number identifying the product or service that is specified on this line.
     *
     * @return The field productCode
     */
    public @Nullable String getProductCode() { return this.productCode; }
    /**
     * A code number identifying the product or service that is specified on this line.
     *
     * @param value The new value for productCode
     */
    public void setProductCode(@Nullable String value) { this.productCode = value; }
    /**
     * Description of this invoice line.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * Description of this invoice line.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     *
     * @return The field unitMeasureCode
     */
    public @Nullable String getUnitMeasureCode() { return this.unitMeasureCode; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     *
     * @param value The new value for unitMeasureCode
     */
    public void setUnitMeasureCode(@Nullable String value) { this.unitMeasureCode = value; }
    /**
     * The price of a single unit for this line.
     *
     * @return The field unitPrice
     */
    public @Nullable Double getUnitPrice() { return this.unitPrice; }
    /**
     * The price of a single unit for this line.
     *
     * @param value The new value for unitPrice
     */
    public void setUnitPrice(@Nullable Double value) { this.unitPrice = value; }
    /**
     * The quantity of items for ths line.
     *
     * @return The field quantity
     */
    public @Nullable Double getQuantity() { return this.quantity; }
    /**
     * The quantity of items for ths line.
     *
     * @param value The new value for quantity
     */
    public void setQuantity(@Nullable Double value) { this.quantity = value; }
    /**
     * The number of items that have been shipped.
     *
     * @return The field quantityShipped
     */
    public @Nullable Double getQuantityShipped() { return this.quantityShipped; }
    /**
     * The number of items that have been shipped.
     *
     * @param value The new value for quantityShipped
     */
    public void setQuantityShipped(@Nullable Double value) { this.quantityShipped = value; }
    /**
     * The number of items that has been received.
     *
     * @return The field quantityReceived
     */
    public @Nullable Double getQuantityReceived() { return this.quantityReceived; }
    /**
     * The number of items that has been received.
     *
     * @param value The new value for quantityReceived
     */
    public void setQuantityReceived(@Nullable Double value) { this.quantityReceived = value; }
    /**
     * The total amount for this line.
     *
     * @return The field totalAmount
     */
    public @Nullable Double getTotalAmount() { return this.totalAmount; }
    /**
     * The total amount for this line.
     *
     * @param value The new value for totalAmount
     */
    public void setTotalAmount(@Nullable Double value) { this.totalAmount = value; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     *
     * @return The field exemptionCode
     */
    public @Nullable String getExemptionCode() { return this.exemptionCode; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     *
     * @param value The new value for exemptionCode
     */
    public void setExemptionCode(@Nullable String value) { this.exemptionCode = value; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     *
     * @return The field reportingDate
     */
    public @Nullable String getReportingDate() { return this.reportingDate; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     *
     * @param value The new value for reportingDate
     */
    public void setReportingDate(@Nullable String value) { this.reportingDate = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressLine1
     */
    public @Nullable String getOriginAddressLine1() { return this.originAddressLine1; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressLine1
     */
    public void setOriginAddressLine1(@Nullable String value) { this.originAddressLine1 = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressLine2
     */
    public @Nullable String getOriginAddressLine2() { return this.originAddressLine2; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressLine2
     */
    public void setOriginAddressLine2(@Nullable String value) { this.originAddressLine2 = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressLine3
     */
    public @Nullable String getOriginAddressLine3() { return this.originAddressLine3; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressLine3
     */
    public void setOriginAddressLine3(@Nullable String value) { this.originAddressLine3 = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressCity
     */
    public @Nullable String getOriginAddressCity() { return this.originAddressCity; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressCity
     */
    public void setOriginAddressCity(@Nullable String value) { this.originAddressCity = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressRegion
     */
    public @Nullable String getOriginAddressRegion() { return this.originAddressRegion; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressRegion
     */
    public void setOriginAddressRegion(@Nullable String value) { this.originAddressRegion = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressPostalCode
     */
    public @Nullable String getOriginAddressPostalCode() { return this.originAddressPostalCode; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressPostalCode
     */
    public void setOriginAddressPostalCode(@Nullable String value) { this.originAddressPostalCode = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressCountry
     */
    public @Nullable String getOriginAddressCountry() { return this.originAddressCountry; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressCountry
     */
    public void setOriginAddressCountry(@Nullable String value) { this.originAddressCountry = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressLatitude
     */
    public @Nullable Float getOriginAddressLatitude() { return this.originAddressLatitude; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressLatitude
     */
    public void setOriginAddressLatitude(@Nullable Float value) { this.originAddressLatitude = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressLongitude
     */
    public @Nullable Float getOriginAddressLongitude() { return this.originAddressLongitude; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressLongitude
     */
    public void setOriginAddressLongitude(@Nullable Float value) { this.originAddressLongitude = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressLine1
     */
    public @Nullable String getBillToAddressLine1() { return this.billToAddressLine1; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressLine1
     */
    public void setBillToAddressLine1(@Nullable String value) { this.billToAddressLine1 = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressLine2
     */
    public @Nullable String getBillToAddressLine2() { return this.billToAddressLine2; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressLine2
     */
    public void setBillToAddressLine2(@Nullable String value) { this.billToAddressLine2 = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressLine3
     */
    public @Nullable String getBillToAddressLine3() { return this.billToAddressLine3; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressLine3
     */
    public void setBillToAddressLine3(@Nullable String value) { this.billToAddressLine3 = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressCity
     */
    public @Nullable String getBillToAddressCity() { return this.billToAddressCity; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressCity
     */
    public void setBillToAddressCity(@Nullable String value) { this.billToAddressCity = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressRegion
     */
    public @Nullable String getBillToAddressRegion() { return this.billToAddressRegion; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressRegion
     */
    public void setBillToAddressRegion(@Nullable String value) { this.billToAddressRegion = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressPostalCode
     */
    public @Nullable String getBillToAddressPostalCode() { return this.billToAddressPostalCode; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressPostalCode
     */
    public void setBillToAddressPostalCode(@Nullable String value) { this.billToAddressPostalCode = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressCountry
     */
    public @Nullable String getBillToAddressCountry() { return this.billToAddressCountry; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressCountry
     */
    public void setBillToAddressCountry(@Nullable String value) { this.billToAddressCountry = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressLatitude
     */
    public @Nullable Float getBillToAddressLatitude() { return this.billToAddressLatitude; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressLatitude
     */
    public void setBillToAddressLatitude(@Nullable Float value) { this.billToAddressLatitude = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressLongitude
     */
    public @Nullable Float getBillToAddressLongitude() { return this.billToAddressLongitude; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressLongitude
     */
    public void setBillToAddressLongitude(@Nullable Float value) { this.billToAddressLongitude = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressLine1
     */
    public @Nullable String getShipToAddressLine1() { return this.shipToAddressLine1; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressLine1
     */
    public void setShipToAddressLine1(@Nullable String value) { this.shipToAddressLine1 = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressLine2
     */
    public @Nullable String getShipToAddressLine2() { return this.shipToAddressLine2; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressLine2
     */
    public void setShipToAddressLine2(@Nullable String value) { this.shipToAddressLine2 = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressLine3
     */
    public @Nullable String getShipToAddressLine3() { return this.shipToAddressLine3; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressLine3
     */
    public void setShipToAddressLine3(@Nullable String value) { this.shipToAddressLine3 = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressCity
     */
    public @Nullable String getShipToAddressCity() { return this.shipToAddressCity; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressCity
     */
    public void setShipToAddressCity(@Nullable String value) { this.shipToAddressCity = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressRegion
     */
    public @Nullable String getShipToAddressRegion() { return this.shipToAddressRegion; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressRegion
     */
    public void setShipToAddressRegion(@Nullable String value) { this.shipToAddressRegion = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressPostalCode
     */
    public @Nullable String getShipToAddressPostalCode() { return this.shipToAddressPostalCode; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressPostalCode
     */
    public void setShipToAddressPostalCode(@Nullable String value) { this.shipToAddressPostalCode = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressCountry
     */
    public @Nullable String getShipToAddressCountry() { return this.shipToAddressCountry; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressCountry
     */
    public void setShipToAddressCountry(@Nullable String value) { this.shipToAddressCountry = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressLatitude
     */
    public @Nullable Float getShipToAddressLatitude() { return this.shipToAddressLatitude; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressLatitude
     */
    public void setShipToAddressLatitude(@Nullable Float value) { this.shipToAddressLatitude = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressLongitude
     */
    public @Nullable Float getShipToAddressLongitude() { return this.shipToAddressLongitude; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressLongitude
     */
    public void setShipToAddressLongitude(@Nullable Float value) { this.shipToAddressLongitude = value; }
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
