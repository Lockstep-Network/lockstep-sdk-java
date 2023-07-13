
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
 * A request to insert a new Payment
 */
public class InsertPaymentRequestModel
{
    private @Nullable String appEnrollmentId;
    private @Nullable String paymentId;
    private @NotNull String companyId;
    private @Nullable String companyErpKey;
    private @Nullable String companyExternalReference;
    private @Nullable String erpKey;
    private @Nullable String paymentType;
    private @Nullable String tenderType;
    private @Nullable String memoText;
    private @Nullable String paymentDate;
    private @Nullable String postDate;
    private @NotNull Double paymentAmount;
    private @NotNull Double unappliedAmount;
    private @Nullable String currencyCode;
    private @Nullable String referenceCode;
    private @NotNull Boolean isVoided;
    private @NotNull Boolean inDispute;
    private @NotNull Double currencyRate;
    private @NotNull Double baseCurrencyPaymentAmount;
    private @NotNull Double baseCurrencyUnappliedAmount;
    private @Nullable String bankAccountId;
    private @NotNull String groupKey;
    private @Nullable InsertPaymentAppliedRequestModel[] applications;

    /**
     * The AppEnrollmentId of the application to write this record to.
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application to write this record to.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field paymentId
     */
    public @Nullable String getPaymentId() { return this.paymentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for paymentId
     */
    public void setPaymentId(@Nullable String value) { this.paymentId = value; }
    /**
     * The ID of the company to which this payment belongs.
     *
     * @return The field companyId
     */
    public @NotNull String getCompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this payment belongs.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@NotNull String value) { this.companyId = value; }
    /**
     * The ERP key for the company to which this payment belongs.
     *
     * @return The field companyErpKey
     */
    public @Nullable String getCompanyErpKey() { return this.companyErpKey; }
    /**
     * The ERP key for the company to which this payment belongs.
     *
     * @param value The new value for companyErpKey
     */
    public void setCompanyErpKey(@Nullable String value) { this.companyErpKey = value; }
    /**
     * A additional reference that may be used in the ERP
     *
     * @return The field companyExternalReference
     */
    public @Nullable String getCompanyExternalReference() { return this.companyExternalReference; }
    /**
     * A additional reference that may be used in the ERP
     *
     * @param value The new value for companyExternalReference
     */
    public void setCompanyExternalReference(@Nullable String value) { this.companyExternalReference = value; }
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
     * The type of payment, AR Payment or AP Payment.
     *
     * Recognized PaymentType values are:
     * * `AR Payment` - A payment made by a Customer to the Company
     * * `AP Payment` - A payment made by the Company to a Vendor
     *
     * @return The field paymentType
     */
    public @Nullable String getPaymentType() { return this.paymentType; }
    /**
     * The type of payment, AR Payment or AP Payment.
     *
     * Recognized PaymentType values are:
     * * `AR Payment` - A payment made by a Customer to the Company
     * * `AP Payment` - A payment made by the Company to a Vendor
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
     * * `Other` - A payment made via another method not listed above.
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
     * * `Other` - A payment made via another method not listed above.
     *
     * @param value The new value for tenderType
     */
    public void setTenderType(@Nullable String value) { this.tenderType = value; }
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
     * The date when this payment was received.
     *
     * @return The field paymentDate
     */
    public @Nullable String getPaymentDate() { return this.paymentDate; }
    /**
     * The date when this payment was received.
     *
     * @param value The new value for paymentDate
     */
    public void setPaymentDate(@Nullable String value) { this.paymentDate = value; }
    /**
     * The date when a payment was posted to a ledger.
     *
     * @return The field postDate
     */
    public @Nullable String getPostDate() { return this.postDate; }
    /**
     * The date when a payment was posted to a ledger.
     *
     * @param value The new value for postDate
     */
    public void setPostDate(@Nullable String value) { this.postDate = value; }
    /**
     * Total amount of this payment in it's received currency.
     *
     * @return The field paymentAmount
     */
    public @NotNull Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this payment in it's received currency.
     *
     * @param value The new value for paymentAmount
     */
    public void setPaymentAmount(@NotNull Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this payment in it's received currency.  If this amount is nonzero, the field `IsOpen` will be true.
     *
     * @return The field unappliedAmount
     */
    public @NotNull Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this payment in it's received currency.  If this amount is nonzero, the field `IsOpen` will be true.
     *
     * @param value The new value for unappliedAmount
     */
    public void setUnappliedAmount(@NotNull Double value) { this.unappliedAmount = value; }
    /**
     * The ISO 4217 currency code for this payment.
     *
     * For a list of ISO 4217 currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies).
     *
     * @return The field currencyCode
     */
    public @Nullable String getCurrencyCode() { return this.currencyCode; }
    /**
     * The ISO 4217 currency code for this payment.
     *
     * For a list of ISO 4217 currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies).
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(@Nullable String value) { this.currencyCode = value; }
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
     * Is the payment voided?
     *
     * @return The field isVoided
     */
    public @NotNull Boolean getIsVoided() { return this.isVoided; }
    /**
     * Is the payment voided?
     *
     * @param value The new value for isVoided
     */
    public void setIsVoided(@NotNull Boolean value) { this.isVoided = value; }
    /**
     * Is the payment in dispute?
     *
     * @return The field inDispute
     */
    public @NotNull Boolean getInDispute() { return this.inDispute; }
    /**
     * Is the payment in dispute?
     *
     * @param value The new value for inDispute
     */
    public void setInDispute(@NotNull Boolean value) { this.inDispute = value; }
    /**
     * The Currency Rate used to get from the account's base currency to the payment amount.
     *
     * @return The field currencyRate
     */
    public @NotNull Double getCurrencyRate() { return this.currencyRate; }
    /**
     * The Currency Rate used to get from the account's base currency to the payment amount.
     *
     * @param value The new value for currencyRate
     */
    public void setCurrencyRate(@NotNull Double value) { this.currencyRate = value; }
    /**
     * Total amount of this payment in the group's base currency.
     *
     * @return The field baseCurrencyPaymentAmount
     */
    public @NotNull Double getBaseCurrencyPaymentAmount() { return this.baseCurrencyPaymentAmount; }
    /**
     * Total amount of this payment in the group's base currency.
     *
     * @param value The new value for baseCurrencyPaymentAmount
     */
    public void setBaseCurrencyPaymentAmount(@NotNull Double value) { this.baseCurrencyPaymentAmount = value; }
    /**
     * Unapplied balance of this payment in the group's base currency.  If this amount is nonzero, the field `IsOpen` will be true.
     *
     * @return The field baseCurrencyUnappliedAmount
     */
    public @NotNull Double getBaseCurrencyUnappliedAmount() { return this.baseCurrencyUnappliedAmount; }
    /**
     * Unapplied balance of this payment in the group's base currency.  If this amount is nonzero, the field `IsOpen` will be true.
     *
     * @param value The new value for baseCurrencyUnappliedAmount
     */
    public void setBaseCurrencyUnappliedAmount(@NotNull Double value) { this.baseCurrencyUnappliedAmount = value; }
    /**
     * The Bank account id for the company to which this payment belongs.
     *
     * @return The field bankAccountId
     */
    public @Nullable String getBankAccountId() { return this.bankAccountId; }
    /**
     * The Bank account id for the company to which this payment belongs.
     *
     * @param value The new value for bankAccountId
     */
    public void setBankAccountId(@Nullable String value) { this.bankAccountId = value; }
    /**
     * The GroupKey this request belongs to.
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey this request belongs to.
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * All applications this payment is associated with.
     * To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     *
     * @return The field applications
     */
    public @Nullable InsertPaymentAppliedRequestModel[] getApplications() { return this.applications; }
    /**
     * All applications this payment is associated with.
     * To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     *
     * @param value The new value for applications
     */
    public void setApplications(@Nullable InsertPaymentAppliedRequestModel[] value) { this.applications = value; }
};
