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
     * The unique identifier of this PaymentApplied record.
     */
    public String getpaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * The unique identifier of this PaymentApplied record.
     */
    public void setpaymentAppliedId(String value) { this.paymentAppliedId = value; }
    /**
     * The database id of the invoice
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The database id of the invoice
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The database id of the Payment.
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * The database id of the Payment.
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * Date Payment applied to Invoice.
     */
    public Date getapplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date Payment applied to Invoice.
     */
    public void setapplyToInvoiceDate(Date value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to Invoice.
     */
    public Double getpaymentAppliedAmount() { return this.paymentAppliedAmount; }
    /**
     * Amount applied to Invoice.
     */
    public void setpaymentAppliedAmount(Double value) { this.paymentAppliedAmount = value; }
    /**
     * An additional reference code that is sometimes used to identify this Payment.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this Payment.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * The ID number of the Company (CompanyType = "Customer") that created this Payment.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID number of the Company (CompanyType = "Customer") that created this Payment.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The total value of this Payment.
     */
    public Double getpaymentAmount() { return this.paymentAmount; }
    /**
     * The total value of this Payment.
     */
    public void setpaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * The remaining balance value of this Payment.
     */
    public Double getunappliedAmount() { return this.unappliedAmount; }
    /**
     * The remaining balance value of this Payment.
     */
    public void setunappliedAmount(Double value) { this.unappliedAmount = value; }
};
