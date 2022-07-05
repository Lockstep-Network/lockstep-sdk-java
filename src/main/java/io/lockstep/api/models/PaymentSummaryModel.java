
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Contains summary information for a Payment
 */
public class PaymentSummaryModel
{
    private @NotNull String groupKey;
    private @NotNull String paymentId;
    private @Nullable String memoText;
    private @Nullable String referenceCode;
    private @Nullable String tenderType;
    private @Nullable String paymentType;
    private @Nullable String paymentDate;
    private @NotNull Double paymentAmount;
    private @NotNull Double unappliedAmount;
    private @NotNull Boolean isOpen;
    private @Nullable Integer invoiceCount;
    private @Nullable Double totalPaymentsApplied;
    private @Nullable String[] invoiceList;
    private @Nullable String[] invoiceIdList;
    private @Nullable String paymentCompanyId;
    private @Nullable String paymentCompanyName;
    private @Nullable String[] customerIds;
    private @Nullable String[] customerNames;
    private @Nullable String[] companyIds;
    private @Nullable String[] companyNames;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * The id of the payment
     *
     * @return The field paymentId
     */
    public @NotNull String getPaymentId() { return this.paymentId; }
    /**
     * The id of the payment
     *
     * @param value The new value for paymentId
     */
    public void setPaymentId(@NotNull String value) { this.paymentId = value; }
    /**
     * Memo or reference text (ex. memo field on a check).
     *
     * @return The field memoText
     */
    public @Nullable String getMemoText() { return this.memoText; }
    /**
     * Memo or reference text (ex. memo field on a check).
     *
     * @param value The new value for memoText
     */
    public void setMemoText(@Nullable String value) { this.memoText = value; }
    /**
     * Reference code for the payment for the given Erp system.
     *
     * @return The field referenceCode
     */
    public @Nullable String getReferenceCode() { return this.referenceCode; }
    /**
     * Reference code for the payment for the given Erp system.
     *
     * @param value The new value for referenceCode
     */
    public void setReferenceCode(@Nullable String value) { this.referenceCode = value; }
    /**
     * The tender type of payment (Cash, Check, etc.)
     *
     * @return The field tenderType
     */
    public @Nullable String getTenderType() { return this.tenderType; }
    /**
     * The tender type of payment (Cash, Check, etc.)
     *
     * @param value The new value for tenderType
     */
    public void setTenderType(@Nullable String value) { this.tenderType = value; }
    /**
     * The type of payment, AR Payment or AP Payment.
     *
     * @return The field paymentType
     */
    public @Nullable String getPaymentType() { return this.paymentType; }
    /**
     * The type of payment, AR Payment or AP Payment.
     *
     * @param value The new value for paymentType
     */
    public void setPaymentType(@Nullable String value) { this.paymentType = value; }
    /**
     * The date of this payment.
     *
     * @return The field paymentDate
     */
    public @Nullable String getPaymentDate() { return this.paymentDate; }
    /**
     * The date of this payment.
     *
     * @param value The new value for paymentDate
     */
    public void setPaymentDate(@Nullable String value) { this.paymentDate = value; }
    /**
     * Total amount of this payment.
     *
     * @return The field paymentAmount
     */
    public @NotNull Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this payment.
     *
     * @param value The new value for paymentAmount
     */
    public void setPaymentAmount(@NotNull Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this payment.
     *
     * @return The field unappliedAmount
     */
    public @NotNull Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this payment.
     *
     * @param value The new value for unappliedAmount
     */
    public void setUnappliedAmount(@NotNull Double value) { this.unappliedAmount = value; }
    /**
     * True if this payment includes some unassigned amount that has not yet been applied to an invoice.  If this
     * value is true, the field `UnappliedAmount` will be nonzero.
     *
     * @return The field isOpen
     */
    public @NotNull Boolean getIsOpen() { return this.isOpen; }
    /**
     * True if this payment includes some unassigned amount that has not yet been applied to an invoice.  If this
     * value is true, the field `UnappliedAmount` will be nonzero.
     *
     * @param value The new value for isOpen
     */
    public void setIsOpen(@NotNull Boolean value) { this.isOpen = value; }
    /**
     * The number of invoices associated to this payment.
     *
     * @return The field invoiceCount
     */
    public @Nullable Integer getInvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices associated to this payment.
     *
     * @param value The new value for invoiceCount
     */
    public void setInvoiceCount(@Nullable Integer value) { this.invoiceCount = value; }
    /**
     * The number of payments applied to this payment.
     *
     * @return The field totalPaymentsApplied
     */
    public @Nullable Double getTotalPaymentsApplied() { return this.totalPaymentsApplied; }
    /**
     * The number of payments applied to this payment.
     *
     * @param value The new value for totalPaymentsApplied
     */
    public void setTotalPaymentsApplied(@Nullable Double value) { this.totalPaymentsApplied = value; }
    /**
     * The reference codes of the invoices associated to this payment.
     *
     * @return The field invoiceList
     */
    public @Nullable String[] getInvoiceList() { return this.invoiceList; }
    /**
     * The reference codes of the invoices associated to this payment.
     *
     * @param value The new value for invoiceList
     */
    public void setInvoiceList(@Nullable String[] value) { this.invoiceList = value; }
    /**
     * The ids of the invoices associated to this payment.
     *
     * @return The field invoiceIdList
     */
    public @Nullable String[] getInvoiceIdList() { return this.invoiceIdList; }
    /**
     * The ids of the invoices associated to this payment.
     *
     * @param value The new value for invoiceIdList
     */
    public void setInvoiceIdList(@Nullable String[] value) { this.invoiceIdList = value; }
    /**
     * The id of the company for this payment.
     *
     * @return The field paymentCompanyId
     */
    public @Nullable String getPaymentCompanyId() { return this.paymentCompanyId; }
    /**
     * The id of the company for this payment.
     *
     * @param value The new value for paymentCompanyId
     */
    public void setPaymentCompanyId(@Nullable String value) { this.paymentCompanyId = value; }
    /**
     * The name of the company for this payment.
     *
     * @return The field paymentCompanyName
     */
    public @Nullable String getPaymentCompanyName() { return this.paymentCompanyName; }
    /**
     * The name of the company for this payment.
     *
     * @param value The new value for paymentCompanyName
     */
    public void setPaymentCompanyName(@Nullable String value) { this.paymentCompanyName = value; }
    /**
     * The ids of the customer for the associated invoices.
     *
     * @return The field customerIds
     */
    public @Nullable String[] getCustomerIds() { return this.customerIds; }
    /**
     * The ids of the customer for the associated invoices.
     *
     * @param value The new value for customerIds
     */
    public void setCustomerIds(@Nullable String[] value) { this.customerIds = value; }
    /**
     * The names of the customer for the associated invoices.
     *
     * @return The field customerNames
     */
    public @Nullable String[] getCustomerNames() { return this.customerNames; }
    /**
     * The names of the customer for the associated invoices.
     *
     * @param value The new value for customerNames
     */
    public void setCustomerNames(@Nullable String[] value) { this.customerNames = value; }
    /**
     * The ids of the company for the associated invoices.
     *
     * @return The field companyIds
     */
    public @Nullable String[] getCompanyIds() { return this.companyIds; }
    /**
     * The ids of the company for the associated invoices.
     *
     * @param value The new value for companyIds
     */
    public void setCompanyIds(@Nullable String[] value) { this.companyIds = value; }
    /**
     * The names of the company for the associated invoices.
     *
     * @return The field companyNames
     */
    public @Nullable String[] getCompanyNames() { return this.companyNames; }
    /**
     * The names of the company for the associated invoices.
     *
     * @param value The new value for companyNames
     */
    public void setCompanyNames(@Nullable String[] value) { this.companyNames = value; }
};
