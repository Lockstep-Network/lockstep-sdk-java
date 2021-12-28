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

import java.util.Date;

public class PaymentDetailModel
{
    private String groupKey;
    private String paymentId;
    private String customerId;
    private String customerName;
    private String memoText;
    private String referenceCode;
    private String primaryContact;
    private String email;
    private Double paymentAmount;
    private Double unappliedAmount;
    private String paymentType;
    private Date paymentDate;
    private Date postDate;
    private String phone;
    private String fax;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateRegion;
    private String postalCode;
    private String countryCode;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this Payment.
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * The unique ID of this Payment.
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * The ID of the customer to which this Payment belongs.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID of the customer to which this Payment belongs.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The name of the customer to which this Payment belongs.
     */
    public String getcustomerName() { return this.customerName; }
    /**
     * The name of the customer to which this Payment belongs.
     */
    public void setcustomerName(String value) { this.customerName = value; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public String getmemoText() { return this.memoText; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public void setmemoText(String value) { this.memoText = value; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * The name of the Primary Contact for the Customer.
     */
    public String getprimaryContact() { return this.primaryContact; }
    /**
     * The name of the Primary Contact for the Customer.
     */
    public void setprimaryContact(String value) { this.primaryContact = value; }
    /**
     * The Email address of the Customer.
     */
    public String getemail() { return this.email; }
    /**
     * The Email address of the Customer.
     */
    public void setemail(String value) { this.email = value; }
    /**
     * Total amount of this Payment.
     */
    public Double getpaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this Payment.
     */
    public void setpaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this Payment.
     */
    public Double getunappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this Payment.
     */
    public void setunappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * The type of payment, Payment or AP Payment.
     */
    public String getpaymentType() { return this.paymentType; }
    /**
     * The type of payment, Payment or AP Payment.
     */
    public void setpaymentType(String value) { this.paymentType = value; }
    /**
     * The date of this Payment.
     */
    public Date getpaymentDate() { return this.paymentDate; }
    /**
     * The date of this Payment.
     */
    public void setpaymentDate(Date value) { this.paymentDate = value; }
    /**
     * Payment post date.
     */
    public Date getpostDate() { return this.postDate; }
    /**
     * Payment post date.
     */
    public void setpostDate(Date value) { this.postDate = value; }
    /**
     * The phone number of the Customer's Primary Contact.
     */
    public String getphone() { return this.phone; }
    /**
     * The phone number of the Customer's Primary Contact.
     */
    public void setphone(String value) { this.phone = value; }
    /**
     * The fax number of the Customer's Primary Contact.
     */
    public String getfax() { return this.fax; }
    /**
     * The fax number of the Customer's Primary Contact.
     */
    public void setfax(String value) { this.fax = value; }
    /**
     * The first line of the address for the Customer's Primary Contact.
     */
    public String getaddress1() { return this.address1; }
    /**
     * The first line of the address for the Customer's Primary Contact.
     */
    public void setaddress1(String value) { this.address1 = value; }
    /**
     * The second line of the address for the Customer's Primary Contact.
     */
    public String getaddress2() { return this.address2; }
    /**
     * The second line of the address for the Customer's Primary Contact.
     */
    public void setaddress2(String value) { this.address2 = value; }
    /**
     * The third line of the address for the Customer's Primary Contact.
     */
    public String getaddress3() { return this.address3; }
    /**
     * The third line of the address for the Customer's Primary Contact.
     */
    public void setaddress3(String value) { this.address3 = value; }
    /**
     * The city of the address for the Customer's Primary Contact.
     */
    public String getcity() { return this.city; }
    /**
     * The city of the address for the Customer's Primary Contact.
     */
    public void setcity(String value) { this.city = value; }
    /**
     * The state/region of the address for the Customer's Primary Contact.
     */
    public String getstateRegion() { return this.stateRegion; }
    /**
     * The state/region of the address for the Customer's Primary Contact.
     */
    public void setstateRegion(String value) { this.stateRegion = value; }
    /**
     * The postal/zip code of the address for the Customer's Primary Contact.
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * The postal/zip code of the address for the Customer's Primary Contact.
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * The 2 character country code of the address for the Customer's Primary Contact.
     */
    public String getcountryCode() { return this.countryCode; }
    /**
     * The 2 character country code of the address for the Customer's Primary Contact.
     */
    public void setcountryCode(String value) { this.countryCode = value; }
};
