
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
 * Contains detailed information about a Payment.
 */
public class PaymentDetailModel
{
    private @NotNull String groupKey;
    private @NotNull String paymentId;
    private @NotNull String customerId;
    private @Nullable String customerName;
    private @Nullable String memoText;
    private @Nullable String referenceCode;
    private @Nullable String primaryContact;
    private @Nullable String email;
    private @Nullable String currencyCode;
    private @NotNull Double paymentAmount;
    private @NotNull Double unappliedAmount;
    private @Nullable String baseCurrencyCode;
    private @NotNull Double baseCurrencyPaymentAmount;
    private @NotNull Double baseCurrencyUnappliedAmount;
    private @Nullable String paymentType;
    private @Nullable String tenderType;
    private @Nullable String paymentDate;
    private @Nullable String postDate;
    private @Nullable String phone;
    private @Nullable String fax;
    private @Nullable String address1;
    private @Nullable String address2;
    private @Nullable String address3;
    private @Nullable String city;
    private @Nullable String stateRegion;
    private @Nullable String postalCode;
    private @Nullable String countryCode;

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
     * The unique ID of this Payment.
     *
     * @return The field paymentId
     */
    public @NotNull String getPaymentId() { return this.paymentId; }
    /**
     * The unique ID of this Payment.
     *
     * @param value The new value for paymentId
     */
    public void setPaymentId(@NotNull String value) { this.paymentId = value; }
    /**
     * The ID of the customer to which this Payment belongs.
     *
     * @return The field customerId
     */
    public @NotNull String getCustomerId() { return this.customerId; }
    /**
     * The ID of the customer to which this Payment belongs.
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(@NotNull String value) { this.customerId = value; }
    /**
     * The name of the customer to which this Payment belongs.
     *
     * @return The field customerName
     */
    public @Nullable String getCustomerName() { return this.customerName; }
    /**
     * The name of the customer to which this Payment belongs.
     *
     * @param value The new value for customerName
     */
    public void setCustomerName(@Nullable String value) { this.customerName = value; }
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
     * The name of the Primary Contact for the Customer.
     *
     * @return The field primaryContact
     */
    public @Nullable String getPrimaryContact() { return this.primaryContact; }
    /**
     * The name of the Primary Contact for the Customer.
     *
     * @param value The new value for primaryContact
     */
    public void setPrimaryContact(@Nullable String value) { this.primaryContact = value; }
    /**
     * The Email address of the Customer.
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     * The Email address of the Customer.
     *
     * @param value The new value for email
     */
    public void setEmail(@Nullable String value) { this.email = value; }
    /**
     * The currency code of the payment.
     *
     * @return The field currencyCode
     */
    public @Nullable String getCurrencyCode() { return this.currencyCode; }
    /**
     * The currency code of the payment.
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(@Nullable String value) { this.currencyCode = value; }
    /**
     * Total amount of this Payment.
     *
     * @return The field paymentAmount
     */
    public @NotNull Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this Payment.
     *
     * @param value The new value for paymentAmount
     */
    public void setPaymentAmount(@NotNull Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this Payment.
     *
     * @return The field unappliedAmount
     */
    public @NotNull Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this Payment.
     *
     * @param value The new value for unappliedAmount
     */
    public void setUnappliedAmount(@NotNull Double value) { this.unappliedAmount = value; }
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
     * The payment amount in the group's base currency.
     *
     * @return The field baseCurrencyPaymentAmount
     */
    public @NotNull Double getBaseCurrencyPaymentAmount() { return this.baseCurrencyPaymentAmount; }
    /**
     * The payment amount in the group's base currency.
     *
     * @param value The new value for baseCurrencyPaymentAmount
     */
    public void setBaseCurrencyPaymentAmount(@NotNull Double value) { this.baseCurrencyPaymentAmount = value; }
    /**
     * The payment amount in the group's base currency.
     *
     * @return The field baseCurrencyUnappliedAmount
     */
    public @NotNull Double getBaseCurrencyUnappliedAmount() { return this.baseCurrencyUnappliedAmount; }
    /**
     * The payment amount in the group's base currency.
     *
     * @param value The new value for baseCurrencyUnappliedAmount
     */
    public void setBaseCurrencyUnappliedAmount(@NotNull Double value) { this.baseCurrencyUnappliedAmount = value; }
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
     * The date of this Payment.
     *
     * @return The field paymentDate
     */
    public @Nullable String getPaymentDate() { return this.paymentDate; }
    /**
     * The date of this Payment.
     *
     * @param value The new value for paymentDate
     */
    public void setPaymentDate(@Nullable String value) { this.paymentDate = value; }
    /**
     * Payment post date.
     *
     * @return The field postDate
     */
    public @Nullable String getPostDate() { return this.postDate; }
    /**
     * Payment post date.
     *
     * @param value The new value for postDate
     */
    public void setPostDate(@Nullable String value) { this.postDate = value; }
    /**
     * The phone number of the Customer's Primary Contact.
     *
     * @return The field phone
     */
    public @Nullable String getPhone() { return this.phone; }
    /**
     * The phone number of the Customer's Primary Contact.
     *
     * @param value The new value for phone
     */
    public void setPhone(@Nullable String value) { this.phone = value; }
    /**
     * The fax number of the Customer's Primary Contact.
     *
     * @return The field fax
     */
    public @Nullable String getFax() { return this.fax; }
    /**
     * The fax number of the Customer's Primary Contact.
     *
     * @param value The new value for fax
     */
    public void setFax(@Nullable String value) { this.fax = value; }
    /**
     * The first line of the address for the Customer's Primary Contact.
     *
     * @return The field address1
     */
    public @Nullable String getAddress1() { return this.address1; }
    /**
     * The first line of the address for the Customer's Primary Contact.
     *
     * @param value The new value for address1
     */
    public void setAddress1(@Nullable String value) { this.address1 = value; }
    /**
     * The second line of the address for the Customer's Primary Contact.
     *
     * @return The field address2
     */
    public @Nullable String getAddress2() { return this.address2; }
    /**
     * The second line of the address for the Customer's Primary Contact.
     *
     * @param value The new value for address2
     */
    public void setAddress2(@Nullable String value) { this.address2 = value; }
    /**
     * The third line of the address for the Customer's Primary Contact.
     *
     * @return The field address3
     */
    public @Nullable String getAddress3() { return this.address3; }
    /**
     * The third line of the address for the Customer's Primary Contact.
     *
     * @param value The new value for address3
     */
    public void setAddress3(@Nullable String value) { this.address3 = value; }
    /**
     * The city of the address for the Customer's Primary Contact.
     *
     * @return The field city
     */
    public @Nullable String getCity() { return this.city; }
    /**
     * The city of the address for the Customer's Primary Contact.
     *
     * @param value The new value for city
     */
    public void setCity(@Nullable String value) { this.city = value; }
    /**
     * The state/region of the address for the Customer's Primary Contact.
     *
     * @return The field stateRegion
     */
    public @Nullable String getStateRegion() { return this.stateRegion; }
    /**
     * The state/region of the address for the Customer's Primary Contact.
     *
     * @param value The new value for stateRegion
     */
    public void setStateRegion(@Nullable String value) { this.stateRegion = value; }
    /**
     * The postal/zip code of the address for the Customer's Primary Contact.
     *
     * @return The field postalCode
     */
    public @Nullable String getPostalCode() { return this.postalCode; }
    /**
     * The postal/zip code of the address for the Customer's Primary Contact.
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(@Nullable String value) { this.postalCode = value; }
    /**
     * The 2 character country code of the address for the Customer's Primary Contact.
     *
     * @return The field countryCode
     */
    public @Nullable String getCountryCode() { return this.countryCode; }
    /**
     * The 2 character country code of the address for the Customer's Primary Contact.
     *
     * @param value The new value for countryCode
     */
    public void setCountryCode(@Nullable String value) { this.countryCode = value; }
};
