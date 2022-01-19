
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
 * @version    2022.3
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * A Payment Application is created by a business who receives a Payment from a customer.  A customer may make
 * a single Payment to match an Invoice exactly, a partial Payment for an Invoice, or a single Payment may be
 * made for multiple smaller Invoices.  The Payment Application contains information about which Invoices are connected
 * to which Payments and for which amounts.
 */
public class PaymentAppliedModel
{
    private String groupKey;
    private String paymentAppliedId;
    private String invoiceId;
    private String paymentId;
    private String erpKey;
    private Integer entryNumber;
    private String applyToInvoiceDate;
    private Double paymentAppliedAmount;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private InvoiceModel invoice;

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
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field paymentAppliedId
     */
    public String getPaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for paymentAppliedId
     */
    public void setPaymentAppliedId(String value) { this.paymentAppliedId = value; }
    /**
     * The Invoice this payment is applied to.
     *
     * @return The field invoiceId
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The Invoice this payment is applied to.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * The Payment applied to the invoice.
     *
     * @return The field paymentId
     */
    public String getPaymentId() { return this.paymentId; }
    /**
     * The Payment applied to the invoice.
     *
     * @param value The new value for paymentId
     */
    public void setPaymentId(String value) { this.paymentId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
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
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * Reference number for the payment applied.
     *
     * @return The field entryNumber
     */
    public Integer getEntryNumber() { return this.entryNumber; }
    /**
     * Reference number for the payment applied.
     *
     * @param value The new value for entryNumber
     */
    public void setEntryNumber(Integer value) { this.entryNumber = value; }
    /**
     * Date payment applied to invoice.
     *
     * @return The field applyToInvoiceDate
     */
    public String getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date payment applied to invoice.
     *
     * @param value The new value for applyToInvoiceDate
     */
    public void setApplyToInvoiceDate(String value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to invoice.
     *
     * @return The field paymentAppliedAmount
     */
    public Double getPaymentAppliedAmount() { return this.paymentAppliedAmount; }
    /**
     * Amount applied to invoice.
     *
     * @param value The new value for paymentAppliedAmount
     */
    public void setPaymentAppliedAmount(Double value) { this.paymentAppliedAmount = value; }
    /**
     * Date payment applied record was created.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * Date payment applied record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The id of the user who created this applied payment.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The id of the user who created this applied payment.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date payment applied record was modified.
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * Date payment applied record was modified.
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * The id of the user who modified this applied payment.
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The id of the user who modified this applied payment.
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
    /**
     * The invoice associated with this applied payment.
     *
     * @return The field invoice
     */
    public InvoiceModel getInvoice() { return this.invoice; }
    /**
     * The invoice associated with this applied payment.
     *
     * @param value The new value for invoice
     */
    public void setInvoice(InvoiceModel value) { this.invoice = value; }
};
