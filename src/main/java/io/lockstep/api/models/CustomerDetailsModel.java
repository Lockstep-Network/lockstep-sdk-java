
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
 * @version    2021.39
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
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this customer
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * The unique ID of this customer
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID of this customer
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName() { return this.name; }
    /**
     * The unique ID of this customer
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setName(String value) { this.name = value; }
    /**
     * Customer address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress1() { return this.address1; }
    /**
     * Customer address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * Customer address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress2() { return this.address2; }
    /**
     * Customer address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * Customer address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress3() { return this.address3; }
    /**
     * Customer address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * Customer address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCity() { return this.city; }
    /**
     * Customer address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCity(String value) { this.city = value; }
    /**
     * Customer address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getState() { return this.state; }
    /**
     * Customer address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setState(String value) { this.state = value; }
    /**
     * Customer address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * Customer address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * Customer address country
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCountry() { return this.country; }
    /**
     * Customer address country
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCountry(String value) { this.country = value; }
    /**
     * Customer phone number
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPhoneNumber() { return this.phoneNumber; }
    /**
     * Customer phone number
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
    /**
     * Customer fax number
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFaxNumber() { return this.faxNumber; }
    /**
     * Customer fax number
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setFaxNumber(String value) { this.faxNumber = value; }
    /**
     * Customer AR email address
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEmail() { return this.email; }
    /**
     * Customer AR email address
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * Customer primary contact id
     *
     * @return a {@link java.lang.String} object.
     */
    public String getContactId() { return this.contactId; }
    /**
     * Customer primary contact id
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setContactId(String value) { this.contactId = value; }
    /**
     * Customer primary contact name
     *
     * @return a {@link java.lang.String} object.
     */
    public String getContactName() { return this.contactName; }
    /**
     * Customer primary contact name
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setContactName(String value) { this.contactName = value; }
    /**
     * Customer primary contact email address
     *
     * @return a {@link java.lang.String} object.
     */
    public String getContactEmail() { return this.contactEmail; }
    /**
     * Customer primary contact email address
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setContactEmail(String value) { this.contactEmail = value; }
    /**
     * Customer number of outstanding invoices
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getOutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * Customer number of outstanding invoices
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setOutstandingInvoices(Integer value) { this.outstandingInvoices = value; }
    /**
     * Customer total outstanding invoice amount
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * Customer total outstanding invoice amount
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setOutstandingAmount(Double value) { this.outstandingAmount = value; }
    /**
     * Customer total past due amount
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getAmountPastDue() { return this.amountPastDue; }
    /**
     * Customer total past due amount
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setAmountPastDue(Double value) { this.amountPastDue = value; }
    /**
     * Customer payments collected
     *
     * @return an array of {@link io.lockstep.api.models.CustomerDetailsPaymentModel} objects.
     */
    public CustomerDetailsPaymentModel[] getPayments() { return this.payments; }
    /**
     * Customer payments collected
     *
     * @param value an array of {@link io.lockstep.api.models.CustomerDetailsPaymentModel} objects.
     */
    public void setPayments(CustomerDetailsPaymentModel[] value) { this.payments = value; }
};
