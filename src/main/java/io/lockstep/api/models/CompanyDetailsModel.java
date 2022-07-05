
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
 * Contains company details data
 */
public class CompanyDetailsModel
{
    private @NotNull String groupKey;
    private @NotNull String customerId;
    private @Nullable String name;
    private @Nullable String address1;
    private @Nullable String address2;
    private @Nullable String address3;
    private @Nullable String city;
    private @Nullable String state;
    private @Nullable String postalCode;
    private @Nullable String country;
    private @Nullable String phoneNumber;
    private @Nullable String faxNumber;
    private @Nullable String email;
    private @NotNull String contactId;
    private @Nullable String contactName;
    private @Nullable String contactEmail;
    private @NotNull Integer outstandingInvoices;
    private @NotNull Double outstandingAmount;
    private @NotNull Double amountPastDue;
    private @Nullable CompanyDetailsPaymentModel[] payments;

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
     * The unique ID of this company
     *
     * @return The field customerId
     */
    public @NotNull String getCustomerId() { return this.customerId; }
    /**
     * The unique ID of this company
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(@NotNull String value) { this.customerId = value; }
    /**
     * The unique ID of this company
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The unique ID of this company
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Company address info
     *
     * @return The field address1
     */
    public @Nullable String getAddress1() { return this.address1; }
    /**
     * Company address info
     *
     * @param value The new value for address1
     */
    public void setAddress1(@Nullable String value) { this.address1 = value; }
    /**
     * Company address info
     *
     * @return The field address2
     */
    public @Nullable String getAddress2() { return this.address2; }
    /**
     * Company address info
     *
     * @param value The new value for address2
     */
    public void setAddress2(@Nullable String value) { this.address2 = value; }
    /**
     * Company address info
     *
     * @return The field address3
     */
    public @Nullable String getAddress3() { return this.address3; }
    /**
     * Company address info
     *
     * @param value The new value for address3
     */
    public void setAddress3(@Nullable String value) { this.address3 = value; }
    /**
     * Company address info
     *
     * @return The field city
     */
    public @Nullable String getCity() { return this.city; }
    /**
     * Company address info
     *
     * @param value The new value for city
     */
    public void setCity(@Nullable String value) { this.city = value; }
    /**
     * Company address info
     *
     * @return The field state
     */
    public @Nullable String getState() { return this.state; }
    /**
     * Company address info
     *
     * @param value The new value for state
     */
    public void setState(@Nullable String value) { this.state = value; }
    /**
     * Company address info
     *
     * @return The field postalCode
     */
    public @Nullable String getPostalCode() { return this.postalCode; }
    /**
     * Company address info
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(@Nullable String value) { this.postalCode = value; }
    /**
     * Company address country
     *
     * @return The field country
     */
    public @Nullable String getCountry() { return this.country; }
    /**
     * Company address country
     *
     * @param value The new value for country
     */
    public void setCountry(@Nullable String value) { this.country = value; }
    /**
     * Company phone number
     *
     * @return The field phoneNumber
     */
    public @Nullable String getPhoneNumber() { return this.phoneNumber; }
    /**
     * Company phone number
     *
     * @param value The new value for phoneNumber
     */
    public void setPhoneNumber(@Nullable String value) { this.phoneNumber = value; }
    /**
     * Company fax number
     *
     * @return The field faxNumber
     */
    public @Nullable String getFaxNumber() { return this.faxNumber; }
    /**
     * Company fax number
     *
     * @param value The new value for faxNumber
     */
    public void setFaxNumber(@Nullable String value) { this.faxNumber = value; }
    /**
     * Company email address
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     * Company email address
     *
     * @param value The new value for email
     */
    public void setEmail(@Nullable String value) { this.email = value; }
    /**
     * Company primary contact id
     *
     * @return The field contactId
     */
    public @NotNull String getContactId() { return this.contactId; }
    /**
     * Company primary contact id
     *
     * @param value The new value for contactId
     */
    public void setContactId(@NotNull String value) { this.contactId = value; }
    /**
     * Company primary contact name
     *
     * @return The field contactName
     */
    public @Nullable String getContactName() { return this.contactName; }
    /**
     * Company primary contact name
     *
     * @param value The new value for contactName
     */
    public void setContactName(@Nullable String value) { this.contactName = value; }
    /**
     * Company primary contact email address
     *
     * @return The field contactEmail
     */
    public @Nullable String getContactEmail() { return this.contactEmail; }
    /**
     * Company primary contact email address
     *
     * @param value The new value for contactEmail
     */
    public void setContactEmail(@Nullable String value) { this.contactEmail = value; }
    /**
     * Company number of outstanding invoices
     *
     * @return The field outstandingInvoices
     */
    public @NotNull Integer getOutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * Company number of outstanding invoices
     *
     * @param value The new value for outstandingInvoices
     */
    public void setOutstandingInvoices(@NotNull Integer value) { this.outstandingInvoices = value; }
    /**
     * Company total outstanding invoice amount
     *
     * @return The field outstandingAmount
     */
    public @NotNull Double getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * Company total outstanding invoice amount
     *
     * @param value The new value for outstandingAmount
     */
    public void setOutstandingAmount(@NotNull Double value) { this.outstandingAmount = value; }
    /**
     * Company total past due amount
     *
     * @return The field amountPastDue
     */
    public @NotNull Double getAmountPastDue() { return this.amountPastDue; }
    /**
     * Company total past due amount
     *
     * @param value The new value for amountPastDue
     */
    public void setAmountPastDue(@NotNull Double value) { this.amountPastDue = value; }
    /**
     * Company payments collected
     *
     * @return The field payments
     */
    public @Nullable CompanyDetailsPaymentModel[] getPayments() { return this.payments; }
    /**
     * Company payments collected
     *
     * @param value The new value for payments
     */
    public void setPayments(@Nullable CompanyDetailsPaymentModel[] value) { this.payments = value; }
};
