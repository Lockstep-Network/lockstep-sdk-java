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

public class CreditMemoInvoiceModel
{
    private String groupKey;
    private String creditMemoAppliedId;
    private String invoiceId;
    private String creditMemoInvoiceId;
    private Date applyToInvoiceDate;
    private Double creditMemoAppliedAmount;
    private String referenceCode;
    private String companyId;
    private String customerId;
    private String invoiceStatusCode;
    private Double totalAmount;
    private Double outstandingBalanceAmount;

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
     */
    public String getcreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setcreditMemoAppliedId(String value) { this.creditMemoAppliedId = value; }
    /**
     * The id of the invoice
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The id of the invoice
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The id of the credit memo invoice
     */
    public String getcreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * The id of the credit memo invoice
     */
    public void setcreditMemoInvoiceId(String value) { this.creditMemoInvoiceId = value; }
    /**
     * Date invoice applied to credit memo.
     */
    public Date getapplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date invoice applied to credit memo.
     */
    public void setapplyToInvoiceDate(Date value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to credit memo.
     */
    public Double getcreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * Amount applied to credit memo.
     */
    public void setcreditMemoAppliedAmount(Double value) { this.creditMemoAppliedAmount = value; }
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
     * A code identifying the status of this invoice.
     */
    public String getinvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     */
    public void setinvoiceStatusCode(String value) { this.invoiceStatusCode = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     */
    public Double gettotalAmount() { return this.totalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     */
    public void settotalAmount(Double value) { this.totalAmount = value; }
    /**
     * The remaining balance value of this invoice.
     */
    public Double getoutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice.
     */
    public void setoutstandingBalanceAmount(Double value) { this.outstandingBalanceAmount = value; }
};
