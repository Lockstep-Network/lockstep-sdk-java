
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
 * The PaymentSyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the PaymentSyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as a [PaymentModel](https://developer.lockstep.io/docs/paymentmodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class PaymentSyncModel
{
    private @NotNull String erpKey;
    private @NotNull String companyErpKey;
    private @Nullable String paymentType;
    private @Nullable String tenderType;
    private @NotNull Boolean isOpen;
    private @Nullable String memoText;
    private @NotNull String paymentDate;
    private @NotNull String postDate;
    private @NotNull Double paymentAmount;
    private @NotNull Double unappliedAmount;
    private @Nullable String currencyCode;
    private @Nullable String created;
    private @Nullable String modified;
    private @Nullable String referenceCode;
    private @NotNull Boolean isVoided;
    private @NotNull Boolean inDispute;

    /**
     * This is the primary key of the Payment record. For this field, you should use whatever the payment's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your payment records in a database, whatever the primary key for the payment table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public @NotNull String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Payment record. For this field, you should use whatever the payment's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your payment records in a database, whatever the primary key for the payment table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@NotNull String value) { this.erpKey = value; }
    /**
     * The original primary key or unique ID of the company to which this payment belongs.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * @return The field companyErpKey
     */
    public @NotNull String getCompanyErpKey() { return this.companyErpKey; }
    /**
     * The original primary key or unique ID of the company to which this payment belongs.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * @param value The new value for companyErpKey
     */
    public void setCompanyErpKey(@NotNull String value) { this.companyErpKey = value; }
    /**
     * The type of payment, cash or check.
     *
     * Recognized PaymentType values are:
     * * `Cash` - A cash payment or other direct transfer.
     * * `Check` - A check payment.
     *
     * @return The field paymentType
     */
    public @Nullable String getPaymentType() { return this.paymentType; }
    /**
     * The type of payment, cash or check.
     *
     * Recognized PaymentType values are:
     * * `Cash` - A cash payment or other direct transfer.
     * * `Check` - A check payment.
     *
     * @param value The new value for paymentType
     */
    public void setPaymentType(@Nullable String value) { this.paymentType = value; }
    /**
     * Cash, check, credit card, wire transfer.
     *
     * Recognized TenderType values are:
     * * `Cash` - A cash payment or other direct transfer.
     * * `Check` - A check payment.
     * * `Credit Card` - A payment made via a credit card.
     * * `Wire Transfer` - A payment made via wire transfer from another financial institution.
     *
     * @return The field tenderType
     */
    public @Nullable String getTenderType() { return this.tenderType; }
    /**
     * Cash, check, credit card, wire transfer.
     *
     * Recognized TenderType values are:
     * * `Cash` - A cash payment or other direct transfer.
     * * `Check` - A check payment.
     * * `Credit Card` - A payment made via a credit card.
     * * `Wire Transfer` - A payment made via wire transfer from another financial institution.
     *
     * @param value The new value for tenderType
     */
    public void setTenderType(@Nullable String value) { this.tenderType = value; }
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
     * The date when this payment was received.  This typically is the date when an accounting employee recorded
     * that they received notification that the payment had occurred, whether they were notified by email, postal
     * mail, or financial transaction notification.
     *
     * @return The field paymentDate
     */
    public @NotNull String getPaymentDate() { return this.paymentDate; }
    /**
     * The date when this payment was received.  This typically is the date when an accounting employee recorded
     * that they received notification that the payment had occurred, whether they were notified by email, postal
     * mail, or financial transaction notification.
     *
     * @param value The new value for paymentDate
     */
    public void setPaymentDate(@NotNull String value) { this.paymentDate = value; }
    /**
     * The date when a payment was posted to a ledger.  This date is often determined by a company's accounting
     * practices and may be different than the date when the payment was received.  This date may be affected by
     * issues such as temporary holds on funds transferred, bank holidays, or other actions.
     *
     * @return The field postDate
     */
    public @NotNull String getPostDate() { return this.postDate; }
    /**
     * The date when a payment was posted to a ledger.  This date is often determined by a company's accounting
     * practices and may be different than the date when the payment was received.  This date may be affected by
     * issues such as temporary holds on funds transferred, bank holidays, or other actions.
     *
     * @param value The new value for postDate
     */
    public void setPostDate(@NotNull String value) { this.postDate = value; }
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
     * Unapplied balance of this payment.  If this amount is nonzero, the field `IsOpen` will be true.
     *
     * @return The field unappliedAmount
     */
    public @NotNull Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this payment.  If this amount is nonzero, the field `IsOpen` will be true.
     *
     * @param value The new value for unappliedAmount
     */
    public void setUnappliedAmount(@NotNull Double value) { this.unappliedAmount = value; }
    /**
     * The ISO 4217 currency code for this payment.
     *
     * For a list of ISO 4217 currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies). This will be validated by the /api/v1/definitions/currencies data set
     *
     * @return The field currencyCode
     */
    public @Nullable String getCurrencyCode() { return this.currencyCode; }
    /**
     * The ISO 4217 currency code for this payment.
     *
     * For a list of ISO 4217 currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies). This will be validated by the /api/v1/definitions/currencies data set
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(@Nullable String value) { this.currencyCode = value; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @return The field created
     */
    public @Nullable String getCreated() { return this.created; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @param value The new value for created
     */
    public void setCreated(@Nullable String value) { this.created = value; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @return The field modified
     */
    public @Nullable String getModified() { return this.modified; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @param value The new value for modified
     */
    public void setModified(@Nullable String value) { this.modified = value; }
    /**
     * A reference code for the payment for the given financial or ERP system.  This can be any value that the
     * originating system uses to designate the payment, such as a confirmation number or tracking number, that
     * is different from the `ErpKey` value.
     *
     * @return The field referenceCode
     */
    public @Nullable String getReferenceCode() { return this.referenceCode; }
    /**
     * A reference code for the payment for the given financial or ERP system.  This can be any value that the
     * originating system uses to designate the payment, such as a confirmation number or tracking number, that
     * is different from the `ErpKey` value.
     *
     * @param value The new value for referenceCode
     */
    public void setReferenceCode(@Nullable String value) { this.referenceCode = value; }
    /**
     * True if this payment was voided.
     *
     * @return The field isVoided
     */
    public @NotNull Boolean getIsVoided() { return this.isVoided; }
    /**
     * True if this payment was voided.
     *
     * @param value The new value for isVoided
     */
    public void setIsVoided(@NotNull Boolean value) { this.isVoided = value; }
    /**
     * True if this payment is in dispute.
     *
     * @return The field inDispute
     */
    public @NotNull Boolean getInDispute() { return this.inDispute; }
    /**
     * True if this payment is in dispute.
     *
     * @param value The new value for inDispute
     */
    public void setInDispute(@NotNull Boolean value) { this.inDispute = value; }
};
