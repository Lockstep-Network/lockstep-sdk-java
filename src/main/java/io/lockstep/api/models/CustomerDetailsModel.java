/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
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
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this customer
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * The unique ID of this customer
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID of this customer
     */
    public String getName() { return this.name; }
    /**
     * The unique ID of this customer
     */
    public void setName(String value) { this.name = value; }
    /**
     * Customer address info
     */
    public String getAddress1() { return this.address1; }
    /**
     * Customer address info
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * Customer address info
     */
    public String getAddress2() { return this.address2; }
    /**
     * Customer address info
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * Customer address info
     */
    public String getAddress3() { return this.address3; }
    /**
     * Customer address info
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * Customer address info
     */
    public String getCity() { return this.city; }
    /**
     * Customer address info
     */
    public void setCity(String value) { this.city = value; }
    /**
     * Customer address info
     */
    public String getState() { return this.state; }
    /**
     * Customer address info
     */
    public void setState(String value) { this.state = value; }
    /**
     * Customer address info
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * Customer address info
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * Customer address country
     */
    public String getCountry() { return this.country; }
    /**
     * Customer address country
     */
    public void setCountry(String value) { this.country = value; }
    /**
     * Customer phone number
     */
    public String getPhoneNumber() { return this.phoneNumber; }
    /**
     * Customer phone number
     */
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
    /**
     * Customer fax number
     */
    public String getFaxNumber() { return this.faxNumber; }
    /**
     * Customer fax number
     */
    public void setFaxNumber(String value) { this.faxNumber = value; }
    /**
     * Customer AR email address
     */
    public String getEmail() { return this.email; }
    /**
     * Customer AR email address
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * Customer primary contact id
     */
    public String getContactId() { return this.contactId; }
    /**
     * Customer primary contact id
     */
    public void setContactId(String value) { this.contactId = value; }
    /**
     * Customer primary contact name
     */
    public String getContactName() { return this.contactName; }
    /**
     * Customer primary contact name
     */
    public void setContactName(String value) { this.contactName = value; }
    /**
     * Customer primary contact email address
     */
    public String getContactEmail() { return this.contactEmail; }
    /**
     * Customer primary contact email address
     */
    public void setContactEmail(String value) { this.contactEmail = value; }
    /**
     * Customer number of outstanding invoices
     */
    public Integer getOutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * Customer number of outstanding invoices
     */
    public void setOutstandingInvoices(Integer value) { this.outstandingInvoices = value; }
    /**
     * Customer total outstanding invoice amount
     */
    public Double getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * Customer total outstanding invoice amount
     */
    public void setOutstandingAmount(Double value) { this.outstandingAmount = value; }
    /**
     * Customer total past due amount
     */
    public Double getAmountPastDue() { return this.amountPastDue; }
    /**
     * Customer total past due amount
     */
    public void setAmountPastDue(Double value) { this.amountPastDue = value; }
    /**
     * Customer payments collected
     */
    public CustomerDetailsPaymentModel[] getPayments() { return this.payments; }
    /**
     * Customer payments collected
     */
    public void setPayments(CustomerDetailsPaymentModel[] value) { this.payments = value; }
};
