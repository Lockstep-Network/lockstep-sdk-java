
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
    private String erpKey;
    private String invoiceErpKey;
    private String lineNumber;
    private String productCode;
    private String description;
    private String unitMeasureCode;
    private Double unitPrice;
    private Double quantity;
    private Double quantityShipped;
    private Double quantityReceived;
    private Double totalAmount;
    private String exemptionCode;
    private String reportingDate;
    private String originAddressLine1;
    private String originAddressLine2;
    private String originAddressLine3;
    private String originAddressCity;
    private String originAddressRegion;
    private String originAddressPostalCode;
    private String originAddressCountry;
    private Float originAddressLatitude;
    private Float originAddressLongitude;
    private String billToAddressLine1;
    private String billToAddressLine2;
    private String billToAddressLine3;
    private String billToAddressCity;
    private String billToAddressRegion;
    private String billToAddressPostalCode;
    private String billToAddressCountry;
    private Float billToAddressLatitude;
    private Float billToAddressLongitude;
    private String shipToAddressLine1;
    private String shipToAddressLine2;
    private String shipToAddressLine3;
    private String shipToAddressCity;
    private String shipToAddressRegion;
    private String shipToAddressPostalCode;
    private String shipToAddressCountry;
    private Float shipToAddressLatitude;
    private Float shipToAddressLongitude;
    private String created;
    private String modified;

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
    public String getErpKey() { return this.erpKey; }
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
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The original primary key or unique ID of the invoice to which this line belongs.  This value should
     * match the [Invoice ErpKey](https://developer.lockstep.io/docs/importing-invoices#erpkey) field on the
     * [InvoiceSyncModel](https://developer.lockstep.io/docs/importing-invoices).
     *
     * @return The field invoiceErpKey
     */
    public String getInvoiceErpKey() { return this.invoiceErpKey; }
    /**
     * The original primary key or unique ID of the invoice to which this line belongs.  This value should
     * match the [Invoice ErpKey](https://developer.lockstep.io/docs/importing-invoices#erpkey) field on the
     * [InvoiceSyncModel](https://developer.lockstep.io/docs/importing-invoices).
     *
     * @param value The new value for invoiceErpKey
     */
    public void setInvoiceErpKey(String value) { this.invoiceErpKey = value; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     *
     * @return The field lineNumber
     */
    public String getLineNumber() { return this.lineNumber; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     *
     * @param value The new value for lineNumber
     */
    public void setLineNumber(String value) { this.lineNumber = value; }
    /**
     * A code number identifying the product or service that is specified on this line.
     *
     * @return The field productCode
     */
    public String getProductCode() { return this.productCode; }
    /**
     * A code number identifying the product or service that is specified on this line.
     *
     * @param value The new value for productCode
     */
    public void setProductCode(String value) { this.productCode = value; }
    /**
     * Description of this invoice line.
     *
     * @return The field description
     */
    public String getDescription() { return this.description; }
    /**
     * Description of this invoice line.
     *
     * @param value The new value for description
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     *
     * @return The field unitMeasureCode
     */
    public String getUnitMeasureCode() { return this.unitMeasureCode; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     *
     * @param value The new value for unitMeasureCode
     */
    public void setUnitMeasureCode(String value) { this.unitMeasureCode = value; }
    /**
     * The price of a single unit for this line.
     *
     * @return The field unitPrice
     */
    public Double getUnitPrice() { return this.unitPrice; }
    /**
     * The price of a single unit for this line.
     *
     * @param value The new value for unitPrice
     */
    public void setUnitPrice(Double value) { this.unitPrice = value; }
    /**
     * The quantity of items for ths line.
     *
     * @return The field quantity
     */
    public Double getQuantity() { return this.quantity; }
    /**
     * The quantity of items for ths line.
     *
     * @param value The new value for quantity
     */
    public void setQuantity(Double value) { this.quantity = value; }
    /**
     * The number of items that have been shipped.
     *
     * @return The field quantityShipped
     */
    public Double getQuantityShipped() { return this.quantityShipped; }
    /**
     * The number of items that have been shipped.
     *
     * @param value The new value for quantityShipped
     */
    public void setQuantityShipped(Double value) { this.quantityShipped = value; }
    /**
     * The number of items that has been received.
     *
     * @return The field quantityReceived
     */
    public Double getQuantityReceived() { return this.quantityReceived; }
    /**
     * The number of items that has been received.
     *
     * @param value The new value for quantityReceived
     */
    public void setQuantityReceived(Double value) { this.quantityReceived = value; }
    /**
     * The total amount for this line.
     *
     * @return The field totalAmount
     */
    public Double getTotalAmount() { return this.totalAmount; }
    /**
     * The total amount for this line.
     *
     * @param value The new value for totalAmount
     */
    public void setTotalAmount(Double value) { this.totalAmount = value; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     *
     * @return The field exemptionCode
     */
    public String getExemptionCode() { return this.exemptionCode; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     *
     * @param value The new value for exemptionCode
     */
    public void setExemptionCode(String value) { this.exemptionCode = value; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     *
     * @return The field reportingDate
     */
    public String getReportingDate() { return this.reportingDate; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     *
     * @param value The new value for reportingDate
     */
    public void setReportingDate(String value) { this.reportingDate = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressLine1
     */
    public String getOriginAddressLine1() { return this.originAddressLine1; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressLine1
     */
    public void setOriginAddressLine1(String value) { this.originAddressLine1 = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressLine2
     */
    public String getOriginAddressLine2() { return this.originAddressLine2; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressLine2
     */
    public void setOriginAddressLine2(String value) { this.originAddressLine2 = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressLine3
     */
    public String getOriginAddressLine3() { return this.originAddressLine3; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressLine3
     */
    public void setOriginAddressLine3(String value) { this.originAddressLine3 = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressCity
     */
    public String getOriginAddressCity() { return this.originAddressCity; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressCity
     */
    public void setOriginAddressCity(String value) { this.originAddressCity = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressRegion
     */
    public String getOriginAddressRegion() { return this.originAddressRegion; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressRegion
     */
    public void setOriginAddressRegion(String value) { this.originAddressRegion = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressPostalCode
     */
    public String getOriginAddressPostalCode() { return this.originAddressPostalCode; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressPostalCode
     */
    public void setOriginAddressPostalCode(String value) { this.originAddressPostalCode = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address This will be validated by the /api/v1/countries data set
     *
     * @return The field originAddressCountry
     */
    public String getOriginAddressCountry() { return this.originAddressCountry; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address This will be validated by the /api/v1/countries data set
     *
     * @param value The new value for originAddressCountry
     */
    public void setOriginAddressCountry(String value) { this.originAddressCountry = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressLatitude
     */
    public Float getOriginAddressLatitude() { return this.originAddressLatitude; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressLatitude
     */
    public void setOriginAddressLatitude(Float value) { this.originAddressLatitude = value; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @return The field originAddressLongitude
     */
    public Float getOriginAddressLongitude() { return this.originAddressLongitude; }
    /**
     * Origination address for this invoice line, if this line item was originated from a different address
     *
     * @param value The new value for originAddressLongitude
     */
    public void setOriginAddressLongitude(Float value) { this.originAddressLongitude = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressLine1
     */
    public String getBillToAddressLine1() { return this.billToAddressLine1; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressLine1
     */
    public void setBillToAddressLine1(String value) { this.billToAddressLine1 = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressLine2
     */
    public String getBillToAddressLine2() { return this.billToAddressLine2; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressLine2
     */
    public void setBillToAddressLine2(String value) { this.billToAddressLine2 = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressLine3
     */
    public String getBillToAddressLine3() { return this.billToAddressLine3; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressLine3
     */
    public void setBillToAddressLine3(String value) { this.billToAddressLine3 = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressCity
     */
    public String getBillToAddressCity() { return this.billToAddressCity; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressCity
     */
    public void setBillToAddressCity(String value) { this.billToAddressCity = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressRegion
     */
    public String getBillToAddressRegion() { return this.billToAddressRegion; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressRegion
     */
    public void setBillToAddressRegion(String value) { this.billToAddressRegion = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressPostalCode
     */
    public String getBillToAddressPostalCode() { return this.billToAddressPostalCode; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressPostalCode
     */
    public void setBillToAddressPostalCode(String value) { this.billToAddressPostalCode = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address This will be validated by the /api/v1/countries data set
     *
     * @return The field billToAddressCountry
     */
    public String getBillToAddressCountry() { return this.billToAddressCountry; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address This will be validated by the /api/v1/countries data set
     *
     * @param value The new value for billToAddressCountry
     */
    public void setBillToAddressCountry(String value) { this.billToAddressCountry = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressLatitude
     */
    public Float getBillToAddressLatitude() { return this.billToAddressLatitude; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressLatitude
     */
    public void setBillToAddressLatitude(Float value) { this.billToAddressLatitude = value; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @return The field billToAddressLongitude
     */
    public Float getBillToAddressLongitude() { return this.billToAddressLongitude; }
    /**
     * Billing address for this invoice line, if this line item is to be billed to a different address
     *
     * @param value The new value for billToAddressLongitude
     */
    public void setBillToAddressLongitude(Float value) { this.billToAddressLongitude = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressLine1
     */
    public String getShipToAddressLine1() { return this.shipToAddressLine1; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressLine1
     */
    public void setShipToAddressLine1(String value) { this.shipToAddressLine1 = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressLine2
     */
    public String getShipToAddressLine2() { return this.shipToAddressLine2; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressLine2
     */
    public void setShipToAddressLine2(String value) { this.shipToAddressLine2 = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressLine3
     */
    public String getShipToAddressLine3() { return this.shipToAddressLine3; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressLine3
     */
    public void setShipToAddressLine3(String value) { this.shipToAddressLine3 = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressCity
     */
    public String getShipToAddressCity() { return this.shipToAddressCity; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressCity
     */
    public void setShipToAddressCity(String value) { this.shipToAddressCity = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressRegion
     */
    public String getShipToAddressRegion() { return this.shipToAddressRegion; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressRegion
     */
    public void setShipToAddressRegion(String value) { this.shipToAddressRegion = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressPostalCode
     */
    public String getShipToAddressPostalCode() { return this.shipToAddressPostalCode; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressPostalCode
     */
    public void setShipToAddressPostalCode(String value) { this.shipToAddressPostalCode = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address This will be validated by the /api/v1/countries data set
     *
     * @return The field shipToAddressCountry
     */
    public String getShipToAddressCountry() { return this.shipToAddressCountry; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address This will be validated by the /api/v1/countries data set
     *
     * @param value The new value for shipToAddressCountry
     */
    public void setShipToAddressCountry(String value) { this.shipToAddressCountry = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressLatitude
     */
    public Float getShipToAddressLatitude() { return this.shipToAddressLatitude; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressLatitude
     */
    public void setShipToAddressLatitude(Float value) { this.shipToAddressLatitude = value; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @return The field shipToAddressLongitude
     */
    public Float getShipToAddressLongitude() { return this.shipToAddressLongitude; }
    /**
     * Shipping address for this invoice line, if this line item is to be shipped to a different address
     *
     * @param value The new value for shipToAddressLongitude
     */
    public void setShipToAddressLongitude(Float value) { this.shipToAddressLongitude = value; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
};
