
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
 * @version    2022.4
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Contains information about a credit memo invoice
 */
public class CreditMemoInvoiceModel
{
    private String groupKey;
    private String creditMemoAppliedId;
    private String invoiceId;
    private String creditMemoInvoiceId;
    private String applyToInvoiceDate;
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
     * @return The field creditMemoAppliedId
     */
    public String getCreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for creditMemoAppliedId
     */
    public void setCreditMemoAppliedId(String value) { this.creditMemoAppliedId = value; }
    /**
     * The id of the invoice
     *
     * @return The field invoiceId
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The id of the invoice
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * The id of the credit memo invoice
     *
     * @return The field creditMemoInvoiceId
     */
    public String getCreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * The id of the credit memo invoice
     *
     * @param value The new value for creditMemoInvoiceId
     */
    public void setCreditMemoInvoiceId(String value) { this.creditMemoInvoiceId = value; }
    /**
     * Date invoice applied to credit memo.
     *
     * @return The field applyToInvoiceDate
     */
    public String getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date invoice applied to credit memo.
     *
     * @param value The new value for applyToInvoiceDate
     */
    public void setApplyToInvoiceDate(String value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to credit memo.
     *
     * @return The field creditMemoAppliedAmount
     */
    public Double getCreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * Amount applied to credit memo.
     *
     * @param value The new value for creditMemoAppliedAmount
     */
    public void setCreditMemoAppliedAmount(Double value) { this.creditMemoAppliedAmount = value; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @return The field referenceCode
     */
    public String getReferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @param value The new value for referenceCode
     */
    public void setReferenceCode(String value) { this.referenceCode = value; }
    /**
     * The ID number of the company that created this invoice.
     *
     * @return The field companyId
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this invoice.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @return The field customerId
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * A code identifying the status of this invoice.
     *
     * @return The field invoiceStatusCode
     */
    public String getInvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     *
     * @param value The new value for invoiceStatusCode
     */
    public void setInvoiceStatusCode(String value) { this.invoiceStatusCode = value; }
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
};
