
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
 * The InvoiceSyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the InvoiceSyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as an [InvoiceModel](https://developer.lockstep.io/docs/invoicemodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class InvoiceSyncModel
{
    private String erpKey;
    private String companyErpKey;
    private String customerErpKey;
    private String salespersonName;
    private String purchaseOrderCode;
    private String referenceCode;
    private String salespersonCode;
    private String invoiceTypeCode;
    private String invoiceStatusCode;
    private String termsCode;
    private String specialTerms;
    private String currencyCode;
    private Double totalAmount;
    private Double salesTaxAmount;
    private Double discountAmount;
    private Double outstandingBalanceAmount;
    private String invoiceDate;
    private String discountDate;
    private String postedDate;
    private String invoiceClosedDate;
    private String paymentDueDate;
    private String importedDate;
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
    private Boolean isVoided;
    private Boolean inDispute;

    /**
     * This is the primary key of the Invoice record. For this field, you should use whatever the invoice's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your invoice records in a database, whatever the primary key for the invoice table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Invoice record. For this field, you should use whatever the invoice's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your invoice records in a database, whatever the primary key for the invoice table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The original primary key or unique ID of the company to which this invoice belongs.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * An Invoice has two relationships: The Company and the Customer.  The field `CompanyErpKey` identifies the
     * company that created the invoice, and the field `CustomerErpKey` is the customer to whom the invoice
     * was sent.
     *
     * @return The field companyErpKey
     */
    public String getCompanyErpKey() { return this.companyErpKey; }
    /**
     * The original primary key or unique ID of the company to which this invoice belongs.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * An Invoice has two relationships: The Company and the Customer.  The field `CompanyErpKey` identifies the
     * company that created the invoice, and the field `CustomerErpKey` is the customer to whom the invoice
     * was sent.
     *
     * @param value The new value for companyErpKey
     */
    public void setCompanyErpKey(String value) { this.companyErpKey = value; }
    /**
     * The original primary key or unique ID of the company to which this invoice was sent.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * An Invoice has two relationships: The Company and the Customer.  The field `CompanyErpKey` identifies the
     * company that created the invoice, and the field `CustomerErpKey` is the customer to whom the invoice
     * was sent.
     *
     * @return The field customerErpKey
     */
    public String getCustomerErpKey() { return this.customerErpKey; }
    /**
     * The original primary key or unique ID of the company to which this invoice was sent.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * An Invoice has two relationships: The Company and the Customer.  The field `CompanyErpKey` identifies the
     * company that created the invoice, and the field `CustomerErpKey` is the customer to whom the invoice
     * was sent.
     *
     * @param value The new value for customerErpKey
     */
    public void setCustomerErpKey(String value) { this.customerErpKey = value; }
    /**
     * The name of the salesperson that wrote this invoice.  This is just text, it is not a reference to the
     * "Contacts" table.  You will not receive an error if this field does not match a known contact person.
     *
     * @return The field salespersonName
     */
    public String getSalespersonName() { return this.salespersonName; }
    /**
     * The name of the salesperson that wrote this invoice.  This is just text, it is not a reference to the
     * "Contacts" table.  You will not receive an error if this field does not match a known contact person.
     *
     * @param value The new value for salespersonName
     */
    public void setSalespersonName(String value) { this.salespersonName = value; }
    /**
     * The "Purchase Order Code" is a code that is sometimes used by companies to refer to the original PO
     * that was sent that caused this invoice to be written.  If a customer sends a purchase order to a vendor,
     * the vendor can then create an invoice and refer back to the originating purchase order using this field.
     *
     * @return The field purchaseOrderCode
     */
    public String getPurchaseOrderCode() { return this.purchaseOrderCode; }
    /**
     * The "Purchase Order Code" is a code that is sometimes used by companies to refer to the original PO
     * that was sent that caused this invoice to be written.  If a customer sends a purchase order to a vendor,
     * the vendor can then create an invoice and refer back to the originating purchase order using this field.
     *
     * @param value The new value for purchaseOrderCode
     */
    public void setPurchaseOrderCode(String value) { this.purchaseOrderCode = value; }
    /**
     * An additional reference code that is sometimes used to identify this invoice. The meaning of this field
     * is specific to the ERP or accounting system used by the user.
     *
     * @return The field referenceCode
     */
    public String getReferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this invoice. The meaning of this field
     * is specific to the ERP or accounting system used by the user.
     *
     * @param value The new value for referenceCode
     */
    public void setReferenceCode(String value) { this.referenceCode = value; }
    /**
     * A code identifying the salesperson responsible for writing this quote, invoice, or order.  This is just
     * text, it is not a reference to the "Contacts" table.  You will not receive an error if this field does
     * not match a known contact person.
     *
     * @return The field salespersonCode
     */
    public String getSalespersonCode() { return this.salespersonCode; }
    /**
     * A code identifying the salesperson responsible for writing this quote, invoice, or order.  This is just
     * text, it is not a reference to the "Contacts" table.  You will not receive an error if this field does
     * not match a known contact person.
     *
     * @param value The new value for salespersonCode
     */
    public void setSalespersonCode(String value) { this.salespersonCode = value; }
    /**
     * A code identifying the type of this invoice.
     *
     * Recognized Invoice types are:
     * * `Invoice` - Represents an invoice sent by Company to the Customer
     * * `AP Invoice` - Represents an invoice sent by Customer to the Company
     * * `Credit Memo` - Represents a credit memo generated by Customer given to Company
     *
     * @return The field invoiceTypeCode
     */
    public String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this invoice.
     *
     * Recognized Invoice types are:
     * * `Invoice` - Represents an invoice sent by Company to the Customer
     * * `AP Invoice` - Represents an invoice sent by Customer to the Company
     * * `Credit Memo` - Represents a credit memo generated by Customer given to Company
     *
     * @param value The new value for invoiceTypeCode
     */
    public void setInvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * A code identifying the status of this invoice.
     *
     * Recognized Invoice status codes are:
     * * `Open` - Represents an invoice that is considered open and needs more work to complete
     * * `Closed` - Represents an invoice that is considered closed and resolved
     *
     * @return The field invoiceStatusCode
     */
    public String getInvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     *
     * Recognized Invoice status codes are:
     * * `Open` - Represents an invoice that is considered open and needs more work to complete
     * * `Closed` - Represents an invoice that is considered closed and resolved
     *
     * @param value The new value for invoiceStatusCode
     */
    public void setInvoiceStatusCode(String value) { this.invoiceStatusCode = value; }
    /**
     * A code identifying the terms given to the purchaser.  This field is imported directly from the originating
     * financial system and does not follow a specified format.
     *
     * @return The field termsCode
     */
    public String getTermsCode() { return this.termsCode; }
    /**
     * A code identifying the terms given to the purchaser.  This field is imported directly from the originating
     * financial system and does not follow a specified format.
     *
     * @param value The new value for termsCode
     */
    public void setTermsCode(String value) { this.termsCode = value; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     *
     * @return The field specialTerms
     */
    public String getSpecialTerms() { return this.specialTerms; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     *
     * @param value The new value for specialTerms
     */
    public void setSpecialTerms(String value) { this.specialTerms = value; }
    /**
     * The three-character ISO 4217 currency code used for this invoice. This will be validated by the /api/v1/currencies data set
     *
     * @return The field currencyCode
     */
    public String getCurrencyCode() { return this.currencyCode; }
    /**
     * The three-character ISO 4217 currency code used for this invoice. This will be validated by the /api/v1/currencies data set
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(String value) { this.currencyCode = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     *
     * @return The field totalAmount
     */
    public Double getTotalAmount() { return this.totalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     *
     * @param value The new value for totalAmount
     */
    public void setTotalAmount(Double value) { this.totalAmount = value; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     *
     * @return The field salesTaxAmount
     */
    public Double getSalesTaxAmount() { return this.salesTaxAmount; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     *
     * @param value The new value for salesTaxAmount
     */
    public void setSalesTaxAmount(Double value) { this.salesTaxAmount = value; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     *
     * @return The field discountAmount
     */
    public Double getDiscountAmount() { return this.discountAmount; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     *
     * @param value The new value for discountAmount
     */
    public void setDiscountAmount(Double value) { this.discountAmount = value; }
    /**
     * The remaining balance value of this invoice.
     *
     * @return The field outstandingBalanceAmount
     */
    public Double getOutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice.
     *
     * @param value The new value for outstandingBalanceAmount
     */
    public void setOutstandingBalanceAmount(Double value) { this.outstandingBalanceAmount = value; }
    /**
     * The reporting date for this invoice.
     *
     * @return The field invoiceDate
     */
    public String getInvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     *
     * @param value The new value for invoiceDate
     */
    public void setInvoiceDate(String value) { this.invoiceDate = value; }
    /**
     * The date when discounts were adjusted for this invoice.
     *
     * @return The field discountDate
     */
    public String getDiscountDate() { return this.discountDate; }
    /**
     * The date when discounts were adjusted for this invoice.
     *
     * @param value The new value for discountDate
     */
    public void setDiscountDate(String value) { this.discountDate = value; }
    /**
     * The date when this invoice posted to the company's general ledger.
     *
     * @return The field postedDate
     */
    public String getPostedDate() { return this.postedDate; }
    /**
     * The date when this invoice posted to the company's general ledger.
     *
     * @param value The new value for postedDate
     */
    public void setPostedDate(String value) { this.postedDate = value; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     *
     * @return The field invoiceClosedDate
     */
    public String getInvoiceClosedDate() { return this.invoiceClosedDate; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     *
     * @param value The new value for invoiceClosedDate
     */
    public void setInvoiceClosedDate(String value) { this.invoiceClosedDate = value; }
    /**
     * The date when the remaining outstanding balance is due.
     *
     * @return The field paymentDueDate
     */
    public String getPaymentDueDate() { return this.paymentDueDate; }
    /**
     * The date when the remaining outstanding balance is due.
     *
     * @param value The new value for paymentDueDate
     */
    public void setPaymentDueDate(String value) { this.paymentDueDate = value; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     *
     * @return The field importedDate
     */
    public String getImportedDate() { return this.importedDate; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     *
     * @param value The new value for importedDate
     */
    public void setImportedDate(String value) { this.importedDate = value; }
    /**
     * The origination address for this invoice
     *
     * @return The field originAddressLine1
     */
    public String getOriginAddressLine1() { return this.originAddressLine1; }
    /**
     * The origination address for this invoice
     *
     * @param value The new value for originAddressLine1
     */
    public void setOriginAddressLine1(String value) { this.originAddressLine1 = value; }
    /**
     * The origination address for this invoice
     *
     * @return The field originAddressLine2
     */
    public String getOriginAddressLine2() { return this.originAddressLine2; }
    /**
     * The origination address for this invoice
     *
     * @param value The new value for originAddressLine2
     */
    public void setOriginAddressLine2(String value) { this.originAddressLine2 = value; }
    /**
     * The origination address for this invoice
     *
     * @return The field originAddressLine3
     */
    public String getOriginAddressLine3() { return this.originAddressLine3; }
    /**
     * The origination address for this invoice
     *
     * @param value The new value for originAddressLine3
     */
    public void setOriginAddressLine3(String value) { this.originAddressLine3 = value; }
    /**
     * The origination address for this invoice
     *
     * @return The field originAddressCity
     */
    public String getOriginAddressCity() { return this.originAddressCity; }
    /**
     * The origination address for this invoice
     *
     * @param value The new value for originAddressCity
     */
    public void setOriginAddressCity(String value) { this.originAddressCity = value; }
    /**
     * The origination address for this invoice
     *
     * @return The field originAddressRegion
     */
    public String getOriginAddressRegion() { return this.originAddressRegion; }
    /**
     * The origination address for this invoice
     *
     * @param value The new value for originAddressRegion
     */
    public void setOriginAddressRegion(String value) { this.originAddressRegion = value; }
    /**
     * The origination address for this invoice
     *
     * @return The field originAddressPostalCode
     */
    public String getOriginAddressPostalCode() { return this.originAddressPostalCode; }
    /**
     * The origination address for this invoice
     *
     * @param value The new value for originAddressPostalCode
     */
    public void setOriginAddressPostalCode(String value) { this.originAddressPostalCode = value; }
    /**
     * The origination address for this invoice This will be validated by the /api/v1/countries data set
     *
     * @return The field originAddressCountry
     */
    public String getOriginAddressCountry() { return this.originAddressCountry; }
    /**
     * The origination address for this invoice This will be validated by the /api/v1/countries data set
     *
     * @param value The new value for originAddressCountry
     */
    public void setOriginAddressCountry(String value) { this.originAddressCountry = value; }
    /**
     * The origination address for this invoice
     *
     * @return The field originAddressLatitude
     */
    public Float getOriginAddressLatitude() { return this.originAddressLatitude; }
    /**
     * The origination address for this invoice
     *
     * @param value The new value for originAddressLatitude
     */
    public void setOriginAddressLatitude(Float value) { this.originAddressLatitude = value; }
    /**
     * The origination address for this invoice
     *
     * @return The field originAddressLongitude
     */
    public Float getOriginAddressLongitude() { return this.originAddressLongitude; }
    /**
     * The origination address for this invoice
     *
     * @param value The new value for originAddressLongitude
     */
    public void setOriginAddressLongitude(Float value) { this.originAddressLongitude = value; }
    /**
     * The billing address for this invoice
     *
     * @return The field billToAddressLine1
     */
    public String getBillToAddressLine1() { return this.billToAddressLine1; }
    /**
     * The billing address for this invoice
     *
     * @param value The new value for billToAddressLine1
     */
    public void setBillToAddressLine1(String value) { this.billToAddressLine1 = value; }
    /**
     * The billing address for this invoice
     *
     * @return The field billToAddressLine2
     */
    public String getBillToAddressLine2() { return this.billToAddressLine2; }
    /**
     * The billing address for this invoice
     *
     * @param value The new value for billToAddressLine2
     */
    public void setBillToAddressLine2(String value) { this.billToAddressLine2 = value; }
    /**
     * The billing address for this invoice
     *
     * @return The field billToAddressLine3
     */
    public String getBillToAddressLine3() { return this.billToAddressLine3; }
    /**
     * The billing address for this invoice
     *
     * @param value The new value for billToAddressLine3
     */
    public void setBillToAddressLine3(String value) { this.billToAddressLine3 = value; }
    /**
     * The billing address for this invoice
     *
     * @return The field billToAddressCity
     */
    public String getBillToAddressCity() { return this.billToAddressCity; }
    /**
     * The billing address for this invoice
     *
     * @param value The new value for billToAddressCity
     */
    public void setBillToAddressCity(String value) { this.billToAddressCity = value; }
    /**
     * The billing address for this invoice
     *
     * @return The field billToAddressRegion
     */
    public String getBillToAddressRegion() { return this.billToAddressRegion; }
    /**
     * The billing address for this invoice
     *
     * @param value The new value for billToAddressRegion
     */
    public void setBillToAddressRegion(String value) { this.billToAddressRegion = value; }
    /**
     * The billing address for this invoice
     *
     * @return The field billToAddressPostalCode
     */
    public String getBillToAddressPostalCode() { return this.billToAddressPostalCode; }
    /**
     * The billing address for this invoice
     *
     * @param value The new value for billToAddressPostalCode
     */
    public void setBillToAddressPostalCode(String value) { this.billToAddressPostalCode = value; }
    /**
     * The billing address for this invoice This will be validated by the /api/v1/countries data set
     *
     * @return The field billToAddressCountry
     */
    public String getBillToAddressCountry() { return this.billToAddressCountry; }
    /**
     * The billing address for this invoice This will be validated by the /api/v1/countries data set
     *
     * @param value The new value for billToAddressCountry
     */
    public void setBillToAddressCountry(String value) { this.billToAddressCountry = value; }
    /**
     * The billing address for this invoice
     *
     * @return The field billToAddressLatitude
     */
    public Float getBillToAddressLatitude() { return this.billToAddressLatitude; }
    /**
     * The billing address for this invoice
     *
     * @param value The new value for billToAddressLatitude
     */
    public void setBillToAddressLatitude(Float value) { this.billToAddressLatitude = value; }
    /**
     * The billing address for this invoice
     *
     * @return The field billToAddressLongitude
     */
    public Float getBillToAddressLongitude() { return this.billToAddressLongitude; }
    /**
     * The billing address for this invoice
     *
     * @param value The new value for billToAddressLongitude
     */
    public void setBillToAddressLongitude(Float value) { this.billToAddressLongitude = value; }
    /**
     * The shipping address for this invoice
     *
     * @return The field shipToAddressLine1
     */
    public String getShipToAddressLine1() { return this.shipToAddressLine1; }
    /**
     * The shipping address for this invoice
     *
     * @param value The new value for shipToAddressLine1
     */
    public void setShipToAddressLine1(String value) { this.shipToAddressLine1 = value; }
    /**
     * The shipping address for this invoice
     *
     * @return The field shipToAddressLine2
     */
    public String getShipToAddressLine2() { return this.shipToAddressLine2; }
    /**
     * The shipping address for this invoice
     *
     * @param value The new value for shipToAddressLine2
     */
    public void setShipToAddressLine2(String value) { this.shipToAddressLine2 = value; }
    /**
     * The shipping address for this invoice
     *
     * @return The field shipToAddressLine3
     */
    public String getShipToAddressLine3() { return this.shipToAddressLine3; }
    /**
     * The shipping address for this invoice
     *
     * @param value The new value for shipToAddressLine3
     */
    public void setShipToAddressLine3(String value) { this.shipToAddressLine3 = value; }
    /**
     * The shipping address for this invoice
     *
     * @return The field shipToAddressCity
     */
    public String getShipToAddressCity() { return this.shipToAddressCity; }
    /**
     * The shipping address for this invoice
     *
     * @param value The new value for shipToAddressCity
     */
    public void setShipToAddressCity(String value) { this.shipToAddressCity = value; }
    /**
     * The shipping address for this invoice
     *
     * @return The field shipToAddressRegion
     */
    public String getShipToAddressRegion() { return this.shipToAddressRegion; }
    /**
     * The shipping address for this invoice
     *
     * @param value The new value for shipToAddressRegion
     */
    public void setShipToAddressRegion(String value) { this.shipToAddressRegion = value; }
    /**
     * The shipping address for this invoice
     *
     * @return The field shipToAddressPostalCode
     */
    public String getShipToAddressPostalCode() { return this.shipToAddressPostalCode; }
    /**
     * The shipping address for this invoice
     *
     * @param value The new value for shipToAddressPostalCode
     */
    public void setShipToAddressPostalCode(String value) { this.shipToAddressPostalCode = value; }
    /**
     * The shipping address for this invoice This will be validated by the /api/v1/countries data set
     *
     * @return The field shipToAddressCountry
     */
    public String getShipToAddressCountry() { return this.shipToAddressCountry; }
    /**
     * The shipping address for this invoice This will be validated by the /api/v1/countries data set
     *
     * @param value The new value for shipToAddressCountry
     */
    public void setShipToAddressCountry(String value) { this.shipToAddressCountry = value; }
    /**
     * The shipping address for this invoice
     *
     * @return The field shipToAddressLatitude
     */
    public Float getShipToAddressLatitude() { return this.shipToAddressLatitude; }
    /**
     * The shipping address for this invoice
     *
     * @param value The new value for shipToAddressLatitude
     */
    public void setShipToAddressLatitude(Float value) { this.shipToAddressLatitude = value; }
    /**
     * The shipping address for this invoice
     *
     * @return The field shipToAddressLongitude
     */
    public Float getShipToAddressLongitude() { return this.shipToAddressLongitude; }
    /**
     * The shipping address for this invoice
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
    /**
     * Is the invoice voided?
     *
     * @return The field isVoided
     */
    public Boolean getIsVoided() { return this.isVoided; }
    /**
     * Is the invoice voided?
     *
     * @param value The new value for isVoided
     */
    public void setIsVoided(Boolean value) { this.isVoided = value; }
    /**
     * Is the invoice in dispute?
     *
     * @return The field inDispute
     */
    public Boolean getInDispute() { return this.inDispute; }
    /**
     * Is the invoice in dispute?
     *
     * @param value The new value for inDispute
     */
    public void setInDispute(Boolean value) { this.inDispute = value; }
};
