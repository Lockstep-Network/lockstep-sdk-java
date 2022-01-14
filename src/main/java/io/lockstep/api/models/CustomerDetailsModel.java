
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


/**
 * Contains customer details data
 */
public class CustomerDetailsModel
{
    private String groupKey;
    private String customerId;
    private String name;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String phoneNumber;
    private String faxNumber;
    private String email;
    private String contactId;
    private String contactName;
    private String contactEmail;
    private Integer outstandingInvoices;
    private Double outstandingAmount;
    private Double amountPastDue;
    private CustomerDetailsPaymentModel[] payments;

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
     * The unique ID of this customer
     *
     * @return The field customerId
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * The unique ID of this customer
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID of this customer
     *
     * @return The field name
     */
    public String getName() { return this.name; }
    /**
     * The unique ID of this customer
     *
     * @param value The new value for name
     */
    public void setName(String value) { this.name = value; }
    /**
     * Customer address info
     *
     * @return The field address1
     */
    public String getAddress1() { return this.address1; }
    /**
     * Customer address info
     *
     * @param value The new value for address1
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * Customer address info
     *
     * @return The field address2
     */
    public String getAddress2() { return this.address2; }
    /**
     * Customer address info
     *
     * @param value The new value for address2
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * Customer address info
     *
     * @return The field address3
     */
    public String getAddress3() { return this.address3; }
    /**
     * Customer address info
     *
     * @param value The new value for address3
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * Customer address info
     *
     * @return The field city
     */
    public String getCity() { return this.city; }
    /**
     * Customer address info
     *
     * @param value The new value for city
     */
    public void setCity(String value) { this.city = value; }
    /**
     * Customer address info
     *
     * @return The field state
     */
    public String getState() { return this.state; }
    /**
     * Customer address info
     *
     * @param value The new value for state
     */
    public void setState(String value) { this.state = value; }
    /**
     * Customer address info
     *
     * @return The field postalCode
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * Customer address info
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * Customer address country
     *
     * @return The field country
     */
    public String getCountry() { return this.country; }
    /**
     * Customer address country
     *
     * @param value The new value for country
     */
    public void setCountry(String value) { this.country = value; }
    /**
     * Customer phone number
     *
     * @return The field phoneNumber
     */
    public String getPhoneNumber() { return this.phoneNumber; }
    /**
     * Customer phone number
     *
     * @param value The new value for phoneNumber
     */
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
    /**
     * Customer fax number
     *
     * @return The field faxNumber
     */
    public String getFaxNumber() { return this.faxNumber; }
    /**
     * Customer fax number
     *
     * @param value The new value for faxNumber
     */
    public void setFaxNumber(String value) { this.faxNumber = value; }
    /**
     * Customer AR email address
     *
     * @return The field email
     */
    public String getEmail() { return this.email; }
    /**
     * Customer AR email address
     *
     * @param value The new value for email
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * Customer primary contact id
     *
     * @return The field contactId
     */
    public String getContactId() { return this.contactId; }
    /**
     * Customer primary contact id
     *
     * @param value The new value for contactId
     */
    public void setContactId(String value) { this.contactId = value; }
    /**
     * Customer primary contact name
     *
     * @return The field contactName
     */
    public String getContactName() { return this.contactName; }
    /**
     * Customer primary contact name
     *
     * @param value The new value for contactName
     */
    public void setContactName(String value) { this.contactName = value; }
    /**
     * Customer primary contact email address
     *
     * @return The field contactEmail
     */
    public String getContactEmail() { return this.contactEmail; }
    /**
     * Customer primary contact email address
     *
     * @param value The new value for contactEmail
     */
    public void setContactEmail(String value) { this.contactEmail = value; }
    /**
     * Customer number of outstanding invoices
     *
     * @return The field outstandingInvoices
     */
    public Integer getOutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * Customer number of outstanding invoices
     *
     * @param value The new value for outstandingInvoices
     */
    public void setOutstandingInvoices(Integer value) { this.outstandingInvoices = value; }
    /**
     * Customer total outstanding invoice amount
     *
     * @return The field outstandingAmount
     */
    public Double getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * Customer total outstanding invoice amount
     *
     * @param value The new value for outstandingAmount
     */
    public void setOutstandingAmount(Double value) { this.outstandingAmount = value; }
    /**
     * Customer total past due amount
     *
     * @return The field amountPastDue
     */
    public Double getAmountPastDue() { return this.amountPastDue; }
    /**
     * Customer total past due amount
     *
     * @param value The new value for amountPastDue
     */
    public void setAmountPastDue(Double value) { this.amountPastDue = value; }
    /**
     * Customer payments collected
     *
     * @return The field payments
     */
    public CustomerDetailsPaymentModel[] getPayments() { return this.payments; }
    /**
     * Customer payments collected
     *
     * @param value The new value for payments
     */
    public void setPayments(CustomerDetailsPaymentModel[] value) { this.payments = value; }
};
