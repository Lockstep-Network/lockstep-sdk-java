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
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public String getCreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public void setCreditMemoAppliedId(String value) { this.creditMemoAppliedId = value; }
    /**
     * @return The id of the invoice
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * @param value - The id of the invoice
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * @return The id of the credit memo invoice
     */
    public String getCreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * @param value - The id of the credit memo invoice
     */
    public void setCreditMemoInvoiceId(String value) { this.creditMemoInvoiceId = value; }
    /**
     * @return Date invoice applied to credit memo.
     */
    public Date getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * @param value - Date invoice applied to credit memo.
     */
    public void setApplyToInvoiceDate(Date value) { this.applyToInvoiceDate = value; }
    /**
     * @return Amount applied to credit memo.
     */
    public Double getCreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * @param value - Amount applied to credit memo.
     */
    public void setCreditMemoAppliedAmount(Double value) { this.creditMemoAppliedAmount = value; }
    /**
     * @return An additional reference code that is sometimes used to identify this invoice. The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getReferenceCode() { return this.referenceCode; }
    /**
     * @param value - An additional reference code that is sometimes used to identify this invoice. The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setReferenceCode(String value) { this.referenceCode = value; }
    /**
     * @return The ID number of the company that created this invoice.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * @param value - The ID number of the company that created this invoice.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * @return The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * @param value - The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * @return A code identifying the status of this invoice.
     */
    public String getInvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * @param value - A code identifying the status of this invoice.
     */
    public void setInvoiceStatusCode(String value) { this.invoiceStatusCode = value; }
    /**
     * @return The total value of this invoice, inclusive of all taxes and line items.
     */
    public Double getTotalAmount() { return this.totalAmount; }
    /**
     * @param value - The total value of this invoice, inclusive of all taxes and line items.
     */
    public void setTotalAmount(Double value) { this.totalAmount = value; }
    /**
     * @return The remaining balance value of this invoice.
     */
    public Double getOutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * @param value - The remaining balance value of this invoice.
     */
    public void setOutstandingBalanceAmount(Double value) { this.outstandingBalanceAmount = value; }
};
