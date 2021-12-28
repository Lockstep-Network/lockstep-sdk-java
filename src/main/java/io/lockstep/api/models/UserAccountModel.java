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

public class UserAccountModel
{
    private String userId;
    private String groupKey;
    private String userName;
    private String email;
    private String status;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String modifiedUserName;
    private String b2CUserId;
    private String userRole;
    private Date inviteSent;
    private String phoneNumber;
    private String faxNumber;
    private String title;
    private String accountingRoleCodeDefId;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateRegion;
    private String postalCode;
    private String country;
    private String imageURL;
    private String description;
    private Date b2CLastLoggedIn;
    private String defaultCurrencyCode;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldValueModel[] customFieldValues;
    private CodeDefinitionModel accountingRoleCodeDefinition;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * This record provides a link to the user's Azure AD B2C OID.
     */
    public String getuserId() { return this.userId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * This record provides a link to the user's Azure AD B2C OID.
     */
    public void setuserId(String value) { this.userId = value; }
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
     * The full name of the user
     */
    public String getuserName() { return this.userName; }
    /**
     * The full name of the user
     */
    public void setuserName(String value) { this.userName = value; }
    /**
     * The email of the user
     */
    public String getemail() { return this.email; }
    /**
     * The email of the user
     */
    public void setemail(String value) { this.email = value; }
    /**
     * The status of the user's account
     */
    public String getstatus() { return this.status; }
    /**
     * The status of the user's account
     */
    public void setstatus(String value) { this.status = value; }
    /**
     * The date that the user account was created
     */
    public Date getcreated() { return this.created; }
    /**
     * The date that the user account was created
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created the user account
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the user account
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the user account was last modified
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date the user account was last modified
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified the user account
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the user account
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The name of the user who last modified the user account
     */
    public String getmodifiedUserName() { return this.modifiedUserName; }
    /**
     * The name of the user who last modified the user account
     */
    public void setmodifiedUserName(String value) { this.modifiedUserName = value; }
    /**
     * The ID of the user in Azure B2C
     */
    public String getb2CUserId() { return this.b2CUserId; }
    /**
     * The ID of the user in Azure B2C
     */
    public void setb2CUserId(String value) { this.b2CUserId = value; }
    /**
     * The id of the Permission Level for the user.
     */
    public String getuserRole() { return this.userRole; }
    /**
     * The id of the Permission Level for the user.
     */
    public void setuserRole(String value) { this.userRole = value; }
    /**
     * The date timestamp when the invite was sent to the user.
     */
    public Date getinviteSent() { return this.inviteSent; }
    /**
     * The date timestamp when the invite was sent to the user.
     */
    public void setinviteSent(Date value) { this.inviteSent = value; }
    /**
     * The phone number of the user.
     */
    public String getphoneNumber() { return this.phoneNumber; }
    /**
     * The phone number of the user.
     */
    public void setphoneNumber(String value) { this.phoneNumber = value; }
    /**
     * The fax number of the user.
     */
    public String getfaxNumber() { return this.faxNumber; }
    /**
     * The fax number of the user.
     */
    public void setfaxNumber(String value) { this.faxNumber = value; }
    /**
     * The title of the user; free text field
     */
    public String gettitle() { return this.title; }
    /**
     * The title of the user; free text field
     */
    public void settitle(String value) { this.title = value; }
    /**
     * FK to the CodeDefinition table; CodeType = 'AccountingRole'
     */
    public String getaccountingRoleCodeDefId() { return this.accountingRoleCodeDefId; }
    /**
     * FK to the CodeDefinition table; CodeType = 'AccountingRole'
     */
    public void setaccountingRoleCodeDefId(String value) { this.accountingRoleCodeDefId = value; }
    /**
     * Address Line 1 for this User
     */
    public String getaddress1() { return this.address1; }
    /**
     * Address Line 1 for this User
     */
    public void setaddress1(String value) { this.address1 = value; }
    /**
     * Address Line 2 for this User
     */
    public String getaddress2() { return this.address2; }
    /**
     * Address Line 2 for this User
     */
    public void setaddress2(String value) { this.address2 = value; }
    /**
     * Address Line 3 for this User
     */
    public String getaddress3() { return this.address3; }
    /**
     * Address Line 3 for this User
     */
    public void setaddress3(String value) { this.address3 = value; }
    /**
     * City for this User
     */
    public String getcity() { return this.city; }
    /**
     * City for this User
     */
    public void setcity(String value) { this.city = value; }
    /**
     * Region ("state" in the US) for this User
     */
    public String getstateRegion() { return this.stateRegion; }
    /**
     * Region ("state" in the US) for this User
     */
    public void setstateRegion(String value) { this.stateRegion = value; }
    /**
     * Postal Code this User
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * Postal Code this User
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * Country for this User This will be validated by the /api/v1/countries data set
     */
    public String getcountry() { return this.country; }
    /**
     * Country for this User This will be validated by the /api/v1/countries data set
     */
    public void setcountry(String value) { this.country = value; }
    /**
     * Image URL for this User
     */
    public String getimageURL() { return this.imageURL; }
    /**
     * Image URL for this User
     */
    public void setimageURL(String value) { this.imageURL = value; }
    /**
     * Description for this User.
     */
    public String getdescription() { return this.description; }
    /**
     * Description for this User.
     */
    public void setdescription(String value) { this.description = value; }
    /**
     * Last date time user logged into Azure B2C.
     */
    public Date getb2CLastLoggedIn() { return this.b2CLastLoggedIn; }
    /**
     * Last date time user logged into Azure B2C.
     */
    public void setb2CLastLoggedIn(Date value) { this.b2CLastLoggedIn = value; }
    /**
     * The default currency code used by this user entity.  This value can be overridden
     * for invoices in a different currency code.
     * 
     * For a list of defined currency codes, see [TODO]()
     */
    public String getdefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code used by this user entity.  This value can be overridden
     * for invoices in a different currency code.
     * 
     * For a list of defined currency codes, see [TODO]()
     */
    public void setdefaultCurrencyCode(String value) { this.defaultCurrencyCode = value; }
    /**
     * All notes attached to this User.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this User.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this User.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this User.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All values attached to this User.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this User.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Accounting role definition for this User.
     * To retrieve this collection, specify `AccountingRole` in the "Include" parameter for your query.
     */
    public CodeDefinitionModel getaccountingRoleCodeDefinition() { return this.accountingRoleCodeDefinition; }
    /**
     * Accounting role definition for this User.
     * To retrieve this collection, specify `AccountingRole` in the "Include" parameter for your query.
     */
    public void setaccountingRoleCodeDefinition(CodeDefinitionModel value) { this.accountingRoleCodeDefinition = value; }
};
