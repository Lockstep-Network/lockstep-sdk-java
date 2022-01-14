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
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The unique ID of this customer
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * @param value - The unique ID of this customer
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * @return The unique ID of this customer
     */
    public String getName() { return this.name; }
    /**
     * @param value - The unique ID of this customer
     */
    public void setName(String value) { this.name = value; }
    /**
     * @return Customer address info
     */
    public String getAddress1() { return this.address1; }
    /**
     * @param value - Customer address info
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * @return Customer address info
     */
    public String getAddress2() { return this.address2; }
    /**
     * @param value - Customer address info
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * @return Customer address info
     */
    public String getAddress3() { return this.address3; }
    /**
     * @param value - Customer address info
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * @return Customer address info
     */
    public String getCity() { return this.city; }
    /**
     * @param value - Customer address info
     */
    public void setCity(String value) { this.city = value; }
    /**
     * @return Customer address info
     */
    public String getState() { return this.state; }
    /**
     * @param value - Customer address info
     */
    public void setState(String value) { this.state = value; }
    /**
     * @return Customer address info
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * @param value - Customer address info
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * @return Customer address country
     */
    public String getCountry() { return this.country; }
    /**
     * @param value - Customer address country
     */
    public void setCountry(String value) { this.country = value; }
    /**
     * @return Customer phone number
     */
    public String getPhoneNumber() { return this.phoneNumber; }
    /**
     * @param value - Customer phone number
     */
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
    /**
     * @return Customer fax number
     */
    public String getFaxNumber() { return this.faxNumber; }
    /**
     * @param value - Customer fax number
     */
    public void setFaxNumber(String value) { this.faxNumber = value; }
    /**
     * @return Customer AR email address
     */
    public String getEmail() { return this.email; }
    /**
     * @param value - Customer AR email address
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * @return Customer primary contact id
     */
    public String getContactId() { return this.contactId; }
    /**
     * @param value - Customer primary contact id
     */
    public void setContactId(String value) { this.contactId = value; }
    /**
     * @return Customer primary contact name
     */
    public String getContactName() { return this.contactName; }
    /**
     * @param value - Customer primary contact name
     */
    public void setContactName(String value) { this.contactName = value; }
    /**
     * @return Customer primary contact email address
     */
    public String getContactEmail() { return this.contactEmail; }
    /**
     * @param value - Customer primary contact email address
     */
    public void setContactEmail(String value) { this.contactEmail = value; }
    /**
     * @return Customer number of outstanding invoices
     */
    public Integer getOutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * @param value - Customer number of outstanding invoices
     */
    public void setOutstandingInvoices(Integer value) { this.outstandingInvoices = value; }
    /**
     * @return Customer total outstanding invoice amount
     */
    public Double getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * @param value - Customer total outstanding invoice amount
     */
    public void setOutstandingAmount(Double value) { this.outstandingAmount = value; }
    /**
     * @return Customer total past due amount
     */
    public Double getAmountPastDue() { return this.amountPastDue; }
    /**
     * @param value - Customer total past due amount
     */
    public void setAmountPastDue(Double value) { this.amountPastDue = value; }
    /**
     * @return Customer payments collected
     */
    public CustomerDetailsPaymentModel[] getPayments() { return this.payments; }
    /**
     * @param value - Customer payments collected
     */
    public void setPayments(CustomerDetailsPaymentModel[] value) { this.payments = value; }
};
