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

public class InvoicePaymentDetailModel
{
    private String groupKey;
    private String paymentAppliedId;
    private String invoiceId;
    private String paymentId;
    private Date applyToInvoiceDate;
    private Double paymentAppliedAmount;
    private String referenceCode;
    private String companyId;
    private Double paymentAmount;
    private Double unappliedAmount;

    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The unique identifier of this PaymentApplied record.
     */
    public String getPaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * @param value - The unique identifier of this PaymentApplied record.
     */
    public void setPaymentAppliedId(String value) { this.paymentAppliedId = value; }
    /**
     * @return The database id of the invoice
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * @param value - The database id of the invoice
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * @return The database id of the Payment.
     */
    public String getPaymentId() { return this.paymentId; }
    /**
     * @param value - The database id of the Payment.
     */
    public void setPaymentId(String value) { this.paymentId = value; }
    /**
     * @return Date Payment applied to Invoice.
     */
    public Date getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * @param value - Date Payment applied to Invoice.
     */
    public void setApplyToInvoiceDate(Date value) { this.applyToInvoiceDate = value; }
    /**
     * @return Amount applied to Invoice.
     */
    public Double getPaymentAppliedAmount() { return this.paymentAppliedAmount; }
    /**
     * @param value - Amount applied to Invoice.
     */
    public void setPaymentAppliedAmount(Double value) { this.paymentAppliedAmount = value; }
    /**
     * @return An additional reference code that is sometimes used to identify this Payment. The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getReferenceCode() { return this.referenceCode; }
    /**
     * @param value - An additional reference code that is sometimes used to identify this Payment. The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setReferenceCode(String value) { this.referenceCode = value; }
    /**
     * @return The ID number of the Company (CompanyType = "Customer") that created this Payment.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * @param value - The ID number of the Company (CompanyType = "Customer") that created this Payment.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * @return The total value of this Payment.
     */
    public Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * @param value - The total value of this Payment.
     */
    public void setPaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * @return The remaining balance value of this Payment.
     */
    public Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * @param value - The remaining balance value of this Payment.
     */
    public void setUnappliedAmount(Double value) { this.unappliedAmount = value; }
};
