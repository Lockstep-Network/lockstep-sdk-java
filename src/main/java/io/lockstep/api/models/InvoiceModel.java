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

public class InvoiceModel
{
    private String groupKey;
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
    private String appEnrollmentId;
    private Boolean isVoided;
    private Boolean inDispute;
    private Boolean excludeFromAging;
    private InvoiceAddressModel[] addresses;
    private InvoiceLineModel[] lines;
    private InvoicePaymentDetailModel[] payments;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CompanyModel company;
    private CompanyModel customer;
    private ContactModel customerPrimaryContact;
    private CreditMemoInvoiceModel[] creditMemos;
    private CustomFieldValueModel[] customFieldValues;
    private CustomFieldDefinitionModel[] customFieldDefinitions;

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
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The ID number of the company that created this invoice.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this invoice.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * The purchase order code as it exists in the user's ERP or accounting system.
     */
    public String getpurchaseOrderCode() { return this.purchaseOrderCode; }
    /**
     * The purchase order code as it exists in the user's ERP or accounting system.
     */
    public void setpurchaseOrderCode(String value) { this.purchaseOrderCode = value; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * A code identifying the salesperson responsible for writing this quote, invoice, or order.
     */
    public String getsalespersonCode() { return this.salespersonCode; }
    /**
     * A code identifying the salesperson responsible for writing this quote, invoice, or order.
     */
    public void setsalespersonCode(String value) { this.salespersonCode = value; }
    /**
     * A string identifying the salesperson responsible for writing this quote, invoice, or order.
     */
    public String getsalespersonName() { return this.salespersonName; }
    /**
     * A string identifying the salesperson responsible for writing this quote, invoice, or order.
     */
    public void setsalespersonName(String value) { this.salespersonName = value; }
    /**
     * A code identifying the type of this invoice.
     */
    public String getinvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this invoice.
     */
    public void setinvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * A code identifying the status of this invoice.
     */
    public String getinvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     */
    public void setinvoiceStatusCode(String value) { this.invoiceStatusCode = value; }
    /**
     * A code identifying the terms given to the purchaser.
     */
    public String gettermsCode() { return this.termsCode; }
    /**
     * A code identifying the terms given to the purchaser.
     */
    public void settermsCode(String value) { this.termsCode = value; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     */
    public String getspecialTerms() { return this.specialTerms; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     */
    public void setspecialTerms(String value) { this.specialTerms = value; }
    /**
     * The three-character ISO 4217 currency code used for this invoice.
     */
    public String getcurrencyCode() { return this.currencyCode; }
    /**
     * The three-character ISO 4217 currency code used for this invoice.
     */
    public void setcurrencyCode(String value) { this.currencyCode = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     */
    public Double gettotalAmount() { return this.totalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     */
    public void settotalAmount(Double value) { this.totalAmount = value; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     */
    public Double getsalesTaxAmount() { return this.salesTaxAmount; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     */
    public void setsalesTaxAmount(Double value) { this.salesTaxAmount = value; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     */
    public Double getdiscountAmount() { return this.discountAmount; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     */
    public void setdiscountAmount(Double value) { this.discountAmount = value; }
    /**
     * The remaining balance value of this invoice.
     */
    public Double getoutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice.
     */
    public void setoutstandingBalanceAmount(Double value) { this.outstandingBalanceAmount = value; }
    /**
     * The reporting date for this invoice.
     */
    public Date getinvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     */
    public void setinvoiceDate(Date value) { this.invoiceDate = value; }
    /**
     * The date when discounts were adjusted for this invoice.
     */
    public Date getdiscountDate() { return this.discountDate; }
    /**
     * The date when discounts were adjusted for this invoice.
     */
    public void setdiscountDate(Date value) { this.discountDate = value; }
    /**
     * The date when this invoice posted to the company's general ledger.
     */
    public Date getpostedDate() { return this.postedDate; }
    /**
     * The date when this invoice posted to the company's general ledger.
     */
    public void setpostedDate(Date value) { this.postedDate = value; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     */
    public Date getinvoiceClosedDate() { return this.invoiceClosedDate; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     */
    public void setinvoiceClosedDate(Date value) { this.invoiceClosedDate = value; }
    /**
     * The date when the remaining outstanding balance is due.
     */
    public Date getpaymentDueDate() { return this.paymentDueDate; }
    /**
     * The date when the remaining outstanding balance is due.
     */
    public void setpaymentDueDate(Date value) { this.paymentDueDate = value; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     */
    public Date getimportedDate() { return this.importedDate; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     */
    public void setimportedDate(Date value) { this.importedDate = value; }
    /**
     * The ID number of the invoice's origination address
     */
    public String getprimaryOriginAddressId() { return this.primaryOriginAddressId; }
    /**
     * The ID number of the invoice's origination address
     */
    public void setprimaryOriginAddressId(String value) { this.primaryOriginAddressId = value; }
    /**
     * The ID number of the invoice's bill-to address
     */
    public String getprimaryBillToAddressId() { return this.primaryBillToAddressId; }
    /**
     * The ID number of the invoice's bill-to address
     */
    public void setprimaryBillToAddressId(String value) { this.primaryBillToAddressId = value; }
    /**
     * The ID number of the invoice's ship-to address
     */
    public String getprimaryShipToAddressId() { return this.primaryShipToAddressId; }
    /**
     * The ID number of the invoice's ship-to address
     */
    public void setprimaryShipToAddressId(String value) { this.primaryShipToAddressId = value; }
    /**
     * The date on which this address record was created.
     */
    public Date getcreated() { return this.created; }
    /**
     * The date on which this address record was created.
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID number of the user who created this address.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this address.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this address record was last modified.
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date on which this address record was last modified.
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this address.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this address.
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
    /**
     * Is the invoice voided?
     */
    public Boolean getisVoided() { return this.isVoided; }
    /**
     * Is the invoice voided?
     */
    public void setisVoided(Boolean value) { this.isVoided = value; }
    /**
     * Is the invoice in dispute?
     */
    public Boolean getinDispute() { return this.inDispute; }
    /**
     * Is the invoice in dispute?
     */
    public void setinDispute(Boolean value) { this.inDispute = value; }
    /**
     * Should the invoice be excluded from aging calculations?
     */
    public Boolean getexcludeFromAging() { return this.excludeFromAging; }
    /**
     * Should the invoice be excluded from aging calculations?
     */
    public void setexcludeFromAging(Boolean value) { this.excludeFromAging = value; }
    /**
     * All addresses connected to this invoice.
     * To retrieve this collection, specify `Addresses` in the "Include" parameter for your query.
     */
    public InvoiceAddressModel[] getaddresses() { return this.addresses; }
    /**
     * All addresses connected to this invoice.
     * To retrieve this collection, specify `Addresses` in the "Include" parameter for your query.
     */
    public void setaddresses(InvoiceAddressModel[] value) { this.addresses = value; }
    /**
     * All lines attached to this invoice.
     * To retrieve this collection, specify `Lines` in the "Include" parameter for your query.
     */
    public InvoiceLineModel[] getlines() { return this.lines; }
    /**
     * All lines attached to this invoice.
     * To retrieve this collection, specify `Lines` in the "Include" parameter for your query.
     */
    public void setlines(InvoiceLineModel[] value) { this.lines = value; }
    /**
     * All payments attached to this invoice, the amount of the payment applied to this Invoice, and the date the Payment was applied.
     * To retrieve this collection, specify `Payments` in the "Include" parameter for your query.
     */
    public InvoicePaymentDetailModel[] getpayments() { return this.payments; }
    /**
     * All payments attached to this invoice, the amount of the payment applied to this Invoice, and the date the Payment was applied.
     * To retrieve this collection, specify `Payments` in the "Include" parameter for your query.
     */
    public void setpayments(InvoicePaymentDetailModel[] value) { this.payments = value; }
    /**
     * All notes attached to this invoice.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this invoice.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this invoice.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this invoice.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * The Company associated to this invoice.
     * To retrieve this item, specify `Company` in the "Include" parameter for your query.
     */
    public CompanyModel getcompany() { return this.company; }
    /**
     * The Company associated to this invoice.
     * To retrieve this item, specify `Company` in the "Include" parameter for your query.
     */
    public void setcompany(CompanyModel value) { this.company = value; }
    /**
     * The Customer associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     */
    public CompanyModel getcustomer() { return this.customer; }
    /**
     * The Customer associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     */
    public void setcustomer(CompanyModel value) { this.customer = value; }
    /**
     * The Contact associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     */
    public ContactModel getcustomerPrimaryContact() { return this.customerPrimaryContact; }
    /**
     * The Contact associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     */
    public void setcustomerPrimaryContact(ContactModel value) { this.customerPrimaryContact = value; }
    /**
     * The credit memos associated to this invoice.
     * To retrieve this item, specify `CreditMemos` in the "Include" parameter for your query.
     */
    public CreditMemoInvoiceModel[] getcreditMemos() { return this.creditMemos; }
    /**
     * The credit memos associated to this invoice.
     * To retrieve this item, specify `CreditMemos` in the "Include" parameter for your query.
     */
    public void setcreditMemos(CreditMemoInvoiceModel[] value) { this.creditMemos = value; }
    /**
     * All custom field values associated with this invoice
     * To retrieve this item, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All custom field values associated with this invoice
     * To retrieve this item, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * All custom field definitions
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All custom field definitions
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
};
