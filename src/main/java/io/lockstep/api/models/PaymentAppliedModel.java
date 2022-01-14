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

public class PaymentAppliedModel
{
    private String groupKey;
    private String paymentAppliedId;
    private String invoiceId;
    private String paymentId;
    private String erpKey;
    private Integer entryNumber;
    private Date applyToInvoiceDate;
    private Double paymentAppliedAmount;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private InvoiceModel invoice;

    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform. For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getPaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform. For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setPaymentAppliedId(String value) { this.paymentAppliedId = value; }
    /**
     * @return The Invoice this payment is applied to.
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * @param value - The Invoice this payment is applied to.
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * @return The Payment applied to the invoice.
     */
    public String getPaymentId() { return this.paymentId; }
    /**
     * @param value - The Payment applied to the invoice.
     */
    public void setPaymentId(String value) { this.paymentId = value; }
    /**
     * @return The unique ID of this record as it was known in its originating financial system. If this company record was imported from a financial system, it will have the value `ErpKey` set to the original primary key number of the record as it was known in the originating financial system. If this record was not imported, this value will be `null`. For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * @param value - The unique ID of this record as it was known in its originating financial system. If this company record was imported from a financial system, it will have the value `ErpKey` set to the original primary key number of the record as it was known in the originating financial system. If this record was not imported, this value will be `null`. For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * @return Reference number for the payment applied.
     */
    public Integer getEntryNumber() { return this.entryNumber; }
    /**
     * @param value - Reference number for the payment applied.
     */
    public void setEntryNumber(Integer value) { this.entryNumber = value; }
    /**
     * @return Date payment applied to invoice.
     */
    public Date getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * @param value - Date payment applied to invoice.
     */
    public void setApplyToInvoiceDate(Date value) { this.applyToInvoiceDate = value; }
    /**
     * @return Amount applied to invoice.
     */
    public Double getPaymentAppliedAmount() { return this.paymentAppliedAmount; }
    /**
     * @param value - Amount applied to invoice.
     */
    public void setPaymentAppliedAmount(Double value) { this.paymentAppliedAmount = value; }
    /**
     * @return Date payment applied record was created.
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - Date payment applied record was created.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The id of the user who created this applied payment.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The id of the user who created this applied payment.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return Date payment applied record was modified.
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - Date payment applied record was modified.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return The id of the user who modified this applied payment.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - The id of the user who modified this applied payment.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * @return AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * @param value - AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * @return The invoice associated with this applied payment.
     */
    public InvoiceModel getInvoice() { return this.invoice; }
    /**
     * @param value - The invoice associated with this applied payment.
     */
    public void setInvoice(InvoiceModel value) { this.invoice = value; }
};
