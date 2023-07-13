
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
 * A request to insert a payment application
 */
public class InsertPaymentAppliedRequestModel
{
    private @Nullable String paymentAppliedId;
    private @Nullable String invoiceId;
    private @Nullable String paymentId;
    private @Nullable String erpKey;
    private @Nullable String invoiceErpKey;
    private @NotNull String applyToInvoiceDate;
    private @NotNull Double paymentAppliedAmount;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field paymentAppliedId
     */
    public @Nullable String getPaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for paymentAppliedId
     */
    public void setPaymentAppliedId(@Nullable String value) { this.paymentAppliedId = value; }
    /**
     * The Invoice this payment is applied to.
     *
     * @return The field invoiceId
     */
    public @Nullable String getInvoiceId() { return this.invoiceId; }
    /**
     * The Invoice this payment is applied to.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@Nullable String value) { this.invoiceId = value; }
    /**
     * The Payment this application applies from.
     *
     * @return The field paymentId
     */
    public @Nullable String getPaymentId() { return this.paymentId; }
    /**
     * The Payment this application applies from.
     *
     * @param value The new value for paymentId
     */
    public void setPaymentId(@Nullable String value) { this.paymentId = value; }
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
    public @Nullable String getErpKey() { return this.erpKey; }
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
    public void setErpKey(@Nullable String value) { this.erpKey = value; }
    /**
     * The ERP key of the Invoice this payment is applied to.
     *
     * @return The field invoiceErpKey
     */
    public @Nullable String getInvoiceErpKey() { return this.invoiceErpKey; }
    /**
     * The ERP key of the Invoice this payment is applied to.
     *
     * @param value The new value for invoiceErpKey
     */
    public void setInvoiceErpKey(@Nullable String value) { this.invoiceErpKey = value; }
    /**
     * The date this payment was applied to this invoice.
     *
     * @return The field applyToInvoiceDate
     */
    public @NotNull String getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * The date this payment was applied to this invoice.
     *
     * @param value The new value for applyToInvoiceDate
     */
    public void setApplyToInvoiceDate(@NotNull String value) { this.applyToInvoiceDate = value; }
    /**
     * The total amount that was applied to this Invoice from the Payment.
     *
     * @return The field paymentAppliedAmount
     */
    public @NotNull Double getPaymentAppliedAmount() { return this.paymentAppliedAmount; }
    /**
     * The total amount that was applied to this Invoice from the Payment.
     *
     * @param value The new value for paymentAppliedAmount
     */
    public void setPaymentAppliedAmount(@NotNull Double value) { this.paymentAppliedAmount = value; }
};
