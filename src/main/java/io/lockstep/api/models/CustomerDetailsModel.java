
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Contains customer details data
 */
public class CustomerDetailsModel
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
    private @Nullable CustomerDetailsPaymentModel[] payments;

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
     * The unique ID of this customer
     *
     * @return The field customerId
     */
    public @NotNull String getCustomerId() { return this.customerId; }
    /**
     * The unique ID of this customer
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(@NotNull String value) { this.customerId = value; }
    /**
     * The unique ID of this customer
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The unique ID of this customer
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Customer address info
     *
     * @return The field address1
     */
    public @Nullable String getAddress1() { return this.address1; }
    /**
     * Customer address info
     *
     * @param value The new value for address1
     */
    public void setAddress1(@Nullable String value) { this.address1 = value; }
    /**
     * Customer address info
     *
     * @return The field address2
     */
    public @Nullable String getAddress2() { return this.address2; }
    /**
     * Customer address info
     *
     * @param value The new value for address2
     */
    public void setAddress2(@Nullable String value) { this.address2 = value; }
    /**
     * Customer address info
     *
     * @return The field address3
     */
    public @Nullable String getAddress3() { return this.address3; }
    /**
     * Customer address info
     *
     * @param value The new value for address3
     */
    public void setAddress3(@Nullable String value) { this.address3 = value; }
    /**
     * Customer address info
     *
     * @return The field city
     */
    public @Nullable String getCity() { return this.city; }
    /**
     * Customer address info
     *
     * @param value The new value for city
     */
    public void setCity(@Nullable String value) { this.city = value; }
    /**
     * Customer address info
     *
     * @return The field state
     */
    public @Nullable String getState() { return this.state; }
    /**
     * Customer address info
     *
     * @param value The new value for state
     */
    public void setState(@Nullable String value) { this.state = value; }
    /**
     * Customer address info
     *
     * @return The field postalCode
     */
    public @Nullable String getPostalCode() { return this.postalCode; }
    /**
     * Customer address info
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(@Nullable String value) { this.postalCode = value; }
    /**
     * Customer address country
     *
     * @return The field country
     */
    public @Nullable String getCountry() { return this.country; }
    /**
     * Customer address country
     *
     * @param value The new value for country
     */
    public void setCountry(@Nullable String value) { this.country = value; }
    /**
     * Customer phone number
     *
     * @return The field phoneNumber
     */
    public @Nullable String getPhoneNumber() { return this.phoneNumber; }
    /**
     * Customer phone number
     *
     * @param value The new value for phoneNumber
     */
    public void setPhoneNumber(@Nullable String value) { this.phoneNumber = value; }
    /**
     * Customer fax number
     *
     * @return The field faxNumber
     */
    public @Nullable String getFaxNumber() { return this.faxNumber; }
    /**
     * Customer fax number
     *
     * @param value The new value for faxNumber
     */
    public void setFaxNumber(@Nullable String value) { this.faxNumber = value; }
    /**
     * Customer AR email address
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     * Customer AR email address
     *
     * @param value The new value for email
     */
    public void setEmail(@Nullable String value) { this.email = value; }
    /**
     * Customer primary contact id
     *
     * @return The field contactId
     */
    public @NotNull String getContactId() { return this.contactId; }
    /**
     * Customer primary contact id
     *
     * @param value The new value for contactId
     */
    public void setContactId(@NotNull String value) { this.contactId = value; }
    /**
     * Customer primary contact name
     *
     * @return The field contactName
     */
    public @Nullable String getContactName() { return this.contactName; }
    /**
     * Customer primary contact name
     *
     * @param value The new value for contactName
     */
    public void setContactName(@Nullable String value) { this.contactName = value; }
    /**
     * Customer primary contact email address
     *
     * @return The field contactEmail
     */
    public @Nullable String getContactEmail() { return this.contactEmail; }
    /**
     * Customer primary contact email address
     *
     * @param value The new value for contactEmail
     */
    public void setContactEmail(@Nullable String value) { this.contactEmail = value; }
    /**
     * Customer number of outstanding invoices
     *
     * @return The field outstandingInvoices
     */
    public @NotNull Integer getOutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * Customer number of outstanding invoices
     *
     * @param value The new value for outstandingInvoices
     */
    public void setOutstandingInvoices(@NotNull Integer value) { this.outstandingInvoices = value; }
    /**
     * Customer total outstanding invoice amount
     *
     * @return The field outstandingAmount
     */
    public @NotNull Double getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * Customer total outstanding invoice amount
     *
     * @param value The new value for outstandingAmount
     */
    public void setOutstandingAmount(@NotNull Double value) { this.outstandingAmount = value; }
    /**
     * Customer total past due amount
     *
     * @return The field amountPastDue
     */
    public @NotNull Double getAmountPastDue() { return this.amountPastDue; }
    /**
     * Customer total past due amount
     *
     * @param value The new value for amountPastDue
     */
    public void setAmountPastDue(@NotNull Double value) { this.amountPastDue = value; }
    /**
     * Customer payments collected
     *
     * @return The field payments
     */
    public @Nullable CustomerDetailsPaymentModel[] getPayments() { return this.payments; }
    /**
     * Customer payments collected
     *
     * @param value The new value for payments
     */
    public void setPayments(@Nullable CustomerDetailsPaymentModel[] value) { this.payments = value; }
};
