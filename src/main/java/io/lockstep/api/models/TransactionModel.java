
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2023 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2023 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents detailed transaction information which represents either Invoices, Credit Memos or Payments
 * within the group account.
 */
public class TransactionModel
{
    private @NotNull String groupKey;
    private @Nullable String baseCurrencyCode;
    private @Nullable String referenceNumber;
    private @NotNull String transactionId;
    private @Nullable String transactionStatus;
    private @Nullable String transactionType;
    private @Nullable String transactionSubType;
    private @Nullable String transactionDate;
    private @Nullable String dueDate;
    private @NotNull Integer daysPastDue;
    private @Nullable String currencyCode;
    private @NotNull Double transactionAmount;
    private @Nullable Double outstandingAmount;
    private @NotNull Double baseCurrencyTransactionAmount;
    private @Nullable Double baseCurrencyOutstandingAmount;
    private @NotNull Integer transactionDetailCount;
    private @NotNull Boolean supportsErpPdfRetrieval;

    /**
     * Group account transaction is associated with.
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * Group account transaction is associated with.
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * The base currency code of the group.
     *
     * @return The field baseCurrencyCode
     */
    public @Nullable String getBaseCurrencyCode() { return this.baseCurrencyCode; }
    /**
     * The base currency code of the group.
     *
     * @param value The new value for baseCurrencyCode
     */
    public void setBaseCurrencyCode(@Nullable String value) { this.baseCurrencyCode = value; }
    /**
     * An additional reference number that is sometimes used to identify a transaction.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @return The field referenceNumber
     */
    public @Nullable String getReferenceNumber() { return this.referenceNumber; }
    /**
     * An additional reference number that is sometimes used to identify a transaction.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @param value The new value for referenceNumber
     */
    public void setReferenceNumber(@Nullable String value) { this.referenceNumber = value; }
    /**
     * The unique ID of the transaction record.
     *
     * @return The field transactionId
     */
    public @NotNull String getTransactionId() { return this.transactionId; }
    /**
     * The unique ID of the transaction record.
     *
     * @param value The new value for transactionId
     */
    public void setTransactionId(@NotNull String value) { this.transactionId = value; }
    /**
     * The status of the transaction record.
     *
     * Recognized Invoice status codes are:
     * * `Open` - Represents an invoice that is considered open and needs more work to complete
     * * `Closed` - Represents an invoice that is considered closed and resolved
     *
     * Recognized Payment status codes are:
     * * `Open` - Represents an payment that includes some unassigned amount that has not yet been applied to an invoice
     * * `Closed` - Represents an payment where `UnappliedAmount` will be zero
     *
     * @return The field transactionStatus
     */
    public @Nullable String getTransactionStatus() { return this.transactionStatus; }
    /**
     * The status of the transaction record.
     *
     * Recognized Invoice status codes are:
     * * `Open` - Represents an invoice that is considered open and needs more work to complete
     * * `Closed` - Represents an invoice that is considered closed and resolved
     *
     * Recognized Payment status codes are:
     * * `Open` - Represents an payment that includes some unassigned amount that has not yet been applied to an invoice
     * * `Closed` - Represents an payment where `UnappliedAmount` will be zero
     *
     * @param value The new value for transactionStatus
     */
    public void setTransactionStatus(@Nullable String value) { this.transactionStatus = value; }
    /**
     * The type of the transaction record.
     *
     * Recognized Invoice types are:
     * * `AR Invoice` - Represents an invoice sent by Company to the Customer
     * * `AP Invoice` - Represents an invoice sent by Vendor to the Company
     * * `AR Credit Memo` - Represents a credit memo generated by Company given to Customer
     * * `AP Credit Memo` - Represents a credit memo generated by Vendor given to Company
     *
     * Recognized PaymentType values are:
     * * `AR Payment` - A payment made by a Customer to the Company
     * * `AP Payment` - A payment made by the Company to a Vendor
     *
     * @return The field transactionType
     */
    public @Nullable String getTransactionType() { return this.transactionType; }
    /**
     * The type of the transaction record.
     *
     * Recognized Invoice types are:
     * * `AR Invoice` - Represents an invoice sent by Company to the Customer
     * * `AP Invoice` - Represents an invoice sent by Vendor to the Company
     * * `AR Credit Memo` - Represents a credit memo generated by Company given to Customer
     * * `AP Credit Memo` - Represents a credit memo generated by Vendor given to Company
     *
     * Recognized PaymentType values are:
     * * `AR Payment` - A payment made by a Customer to the Company
     * * `AP Payment` - A payment made by the Company to a Vendor
     *
     * @param value The new value for transactionType
     */
    public void setTransactionType(@Nullable String value) { this.transactionType = value; }
    /**
     * Additional type categorization of the transaction.
     *
     * @return The field transactionSubType
     */
    public @Nullable String getTransactionSubType() { return this.transactionSubType; }
    /**
     * Additional type categorization of the transaction.
     *
     * @param value The new value for transactionSubType
     */
    public void setTransactionSubType(@Nullable String value) { this.transactionSubType = value; }
    /**
     * The date when a transaction record was reported.
     *
     * @return The field transactionDate
     */
    public @Nullable String getTransactionDate() { return this.transactionDate; }
    /**
     * The date when a transaction record was reported.
     *
     * @param value The new value for transactionDate
     */
    public void setTransactionDate(@Nullable String value) { this.transactionDate = value; }
    /**
     * The date when a transaction record is due for payment or completion.
     *
     * @return The field dueDate
     */
    public @Nullable String getDueDate() { return this.dueDate; }
    /**
     * The date when a transaction record is due for payment or completion.
     *
     * @param value The new value for dueDate
     */
    public void setDueDate(@Nullable String value) { this.dueDate = value; }
    /**
     * The amount of days past the due date the transaction is left un-closed.
     *
     * @return The field daysPastDue
     */
    public @NotNull Integer getDaysPastDue() { return this.daysPastDue; }
    /**
     * The amount of days past the due date the transaction is left un-closed.
     *
     * @param value The new value for daysPastDue
     */
    public void setDaysPastDue(@NotNull Integer value) { this.daysPastDue = value; }
    /**
     * The currency code of the transaction.
     *
     * @return The field currencyCode
     */
    public @Nullable String getCurrencyCode() { return this.currencyCode; }
    /**
     * The currency code of the transaction.
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(@Nullable String value) { this.currencyCode = value; }
    /**
     * The total value of this transaction, inclusive or all taxes and line items.
     *
     * @return The field transactionAmount
     */
    public @NotNull Double getTransactionAmount() { return this.transactionAmount; }
    /**
     * The total value of this transaction, inclusive or all taxes and line items.
     *
     * @param value The new value for transactionAmount
     */
    public void setTransactionAmount(@NotNull Double value) { this.transactionAmount = value; }
    /**
     * The remaining balance of this transaction.
     *
     * @return The field outstandingAmount
     */
    public @Nullable Double getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * The remaining balance of this transaction.
     *
     * @param value The new value for outstandingAmount
     */
    public void setOutstandingAmount(@Nullable Double value) { this.outstandingAmount = value; }
    /**
     * The total value of this transaction, inclusive or all taxes and line items in the group's base currency.
     *
     * @return The field baseCurrencyTransactionAmount
     */
    public @NotNull Double getBaseCurrencyTransactionAmount() { return this.baseCurrencyTransactionAmount; }
    /**
     * The total value of this transaction, inclusive or all taxes and line items in the group's base currency.
     *
     * @param value The new value for baseCurrencyTransactionAmount
     */
    public void setBaseCurrencyTransactionAmount(@NotNull Double value) { this.baseCurrencyTransactionAmount = value; }
    /**
     * The remaining balance of this transaction in the group's base currency.
     *
     * @return The field baseCurrencyOutstandingAmount
     */
    public @Nullable Double getBaseCurrencyOutstandingAmount() { return this.baseCurrencyOutstandingAmount; }
    /**
     * The remaining balance of this transaction in the group's base currency.
     *
     * @param value The new value for baseCurrencyOutstandingAmount
     */
    public void setBaseCurrencyOutstandingAmount(@Nullable Double value) { this.baseCurrencyOutstandingAmount = value; }
    /**
     * The count of items associated to the transaction.
     *
     * Examples:
     * * Number of payments for an invoice.
     * * Number of invoices a payment or credit memo is applied to.
     *
     * @return The field transactionDetailCount
     */
    public @NotNull Integer getTransactionDetailCount() { return this.transactionDetailCount; }
    /**
     * The count of items associated to the transaction.
     *
     * Examples:
     * * Number of payments for an invoice.
     * * Number of invoices a payment or credit memo is applied to.
     *
     * @param value The new value for transactionDetailCount
     */
    public void setTransactionDetailCount(@NotNull Integer value) { this.transactionDetailCount = value; }
    /**
     * Specific transactions have support for pdf retrieval from their respective erp. When this flag is true, an additional
     * call to Invoices/{id}/pdf or Payments/{id}/pdf can be made to retrieve a pdf directly from the erp.
     *
     * @return The field supportsErpPdfRetrieval
     */
    public @NotNull Boolean getSupportsErpPdfRetrieval() { return this.supportsErpPdfRetrieval; }
    /**
     * Specific transactions have support for pdf retrieval from their respective erp. When this flag is true, an additional
     * call to Invoices/{id}/pdf or Payments/{id}/pdf can be made to retrieve a pdf directly from the erp.
     *
     * @param value The new value for supportsErpPdfRetrieval
     */
    public void setSupportsErpPdfRetrieval(@NotNull Boolean value) { this.supportsErpPdfRetrieval = value; }
};
