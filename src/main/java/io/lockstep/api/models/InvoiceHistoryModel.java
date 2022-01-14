
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
public class InvoiceHistoryModel
{
    private String groupKey;
    private String invoiceHistoryId;
    private String invoiceId;
    private String companyId;
    private String customerId;
    private String erpKey;
    private String purchaseOrderCode;
    private String referenceCode;
    private String salespersonCode;
    private String salespersonName;
    private String invoiceTypeCode;
    private String invoiceStatusCode;
    private String termsCode;
    private String specialTerms;
    private String currencyCode;
    private Double totalAmount;
    private Double salesTaxAmount;
    private Double discountAmount;
    private Double outstandingBalanceAmount;
    private Date invoiceDate;
    private Date discountDate;
    private Date postedDate;
    private Date invoiceClosedDate;
    private Date paymentDueDate;
    private Date importedDate;
    private String primaryOriginAddressId;
    private String primaryBillToAddressId;
    private String primaryShipToAddressId;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID number of this invoice history entry.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceHistoryId() { return this.invoiceHistoryId; }
    /**
     * The unique ID number of this invoice history entry.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceHistoryId(String value) { this.invoiceHistoryId = value; }
    /**
     * The unique ID of the Invoice represented by this history entry.  This ID was automatically assigned
     * by Lockstep to the Invoice record when it was added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The unique ID of the Invoice represented by this history entry.  This ID was automatically assigned
     * by Lockstep to the Invoice record when it was added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * The ID number of the company that created this invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The purchase order code as it exists in the user's ERP or accounting system.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPurchaseOrderCode() { return this.purchaseOrderCode; }
    /**
     * The purchase order code as it exists in the user's ERP or accounting system.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPurchaseOrderCode(String value) { this.purchaseOrderCode = value; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getReferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setReferenceCode(String value) { this.referenceCode = value; }
    /**
     * A code identifying the salesperson responsible for writing this invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSalespersonCode() { return this.salespersonCode; }
    /**
     * A code identifying the salesperson responsible for writing this invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setSalespersonCode(String value) { this.salespersonCode = value; }
    /**
     * A string identifying the salesperson responsible for writing this invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSalespersonName() { return this.salespersonName; }
    /**
     * A string identifying the salesperson responsible for writing this invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setSalespersonName(String value) { this.salespersonName = value; }
    /**
     * A code identifying the type of this invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * A code identifying the status of this invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceStatusCode(String value) { this.invoiceStatusCode = value; }
    /**
     * A code identifying the terms given to the purchaser.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTermsCode() { return this.termsCode; }
    /**
     * A code identifying the terms given to the purchaser.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setTermsCode(String value) { this.termsCode = value; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSpecialTerms() { return this.specialTerms; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setSpecialTerms(String value) { this.specialTerms = value; }
    /**
     * The three-character ISO 4217 currency code used for this invoice. This will be validated by the /api/v1/currencies data set
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCurrencyCode() { return this.currencyCode; }
    /**
     * The three-character ISO 4217 currency code used for this invoice. This will be validated by the /api/v1/currencies data set
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCurrencyCode(String value) { this.currencyCode = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalAmount() { return this.totalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalAmount(Double value) { this.totalAmount = value; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getSalesTaxAmount() { return this.salesTaxAmount; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setSalesTaxAmount(Double value) { this.salesTaxAmount = value; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getDiscountAmount() { return this.discountAmount; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setDiscountAmount(Double value) { this.discountAmount = value; }
    /**
     * The remaining balance value of this invoice.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getOutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setOutstandingBalanceAmount(Double value) { this.outstandingBalanceAmount = value; }
    /**
     * The reporting date for this invoice.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getInvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setInvoiceDate(Date value) { this.invoiceDate = value; }
    /**
     * The date when discounts were adjusted for this invoice.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getDiscountDate() { return this.discountDate; }
    /**
     * The date when discounts were adjusted for this invoice.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setDiscountDate(Date value) { this.discountDate = value; }
    /**
     * The date when this invoice posted to the company's general ledger.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getPostedDate() { return this.postedDate; }
    /**
     * The date when this invoice posted to the company's general ledger.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setPostedDate(Date value) { this.postedDate = value; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getInvoiceClosedDate() { return this.invoiceClosedDate; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setInvoiceClosedDate(Date value) { this.invoiceClosedDate = value; }
    /**
     * The date when the remaining outstanding balance is due.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getPaymentDueDate() { return this.paymentDueDate; }
    /**
     * The date when the remaining outstanding balance is due.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setPaymentDueDate(Date value) { this.paymentDueDate = value; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getImportedDate() { return this.importedDate; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setImportedDate(Date value) { this.importedDate = value; }
    /**
     * The ID number of the invoice's origination address
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPrimaryOriginAddressId() { return this.primaryOriginAddressId; }
    /**
     * The ID number of the invoice's origination address
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPrimaryOriginAddressId(String value) { this.primaryOriginAddressId = value; }
    /**
     * The ID number of the invoice's bill-to address
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPrimaryBillToAddressId() { return this.primaryBillToAddressId; }
    /**
     * The ID number of the invoice's bill-to address
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPrimaryBillToAddressId(String value) { this.primaryBillToAddressId = value; }
    /**
     * The ID number of the invoice's ship-to address
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPrimaryShipToAddressId() { return this.primaryShipToAddressId; }
    /**
     * The ID number of the invoice's ship-to address
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPrimaryShipToAddressId(String value) { this.primaryShipToAddressId = value; }
    /**
     * The date on which this invoice record was created.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * The date on which this invoice record was created.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID number of the user who created this invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this invoice record was last modified.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * The date on which this invoice record was last modified.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
};
