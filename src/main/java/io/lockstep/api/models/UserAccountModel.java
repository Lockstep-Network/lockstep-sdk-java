
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
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserId() { return this.userId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * This record provides a link to the user's Azure AD B2C OID.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setUserId(String value) { this.userId = value; }
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
     * The full name of the user
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserName() { return this.userName; }
    /**
     * The full name of the user
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setUserName(String value) { this.userName = value; }
    /**
     * The email of the user
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEmail() { return this.email; }
    /**
     * The email of the user
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * The status of the user's account
     *
     * @return a {@link java.lang.String} object.
     */
    public String getStatus() { return this.status; }
    /**
     * The status of the user's account
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setStatus(String value) { this.status = value; }
    /**
     * The date that the user account was created
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * The date that the user account was created
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created the user account
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the user account
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the user account was last modified
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * The date the user account was last modified
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified the user account
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the user account
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The name of the user who last modified the user account
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserName() { return this.modifiedUserName; }
    /**
     * The name of the user who last modified the user account
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserName(String value) { this.modifiedUserName = value; }
    /**
     * The ID of the user in Azure B2C
     *
     * @return a {@link java.lang.String} object.
     */
    public String getB2CUserId() { return this.b2CUserId; }
    /**
     * The ID of the user in Azure B2C
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setB2CUserId(String value) { this.b2CUserId = value; }
    /**
     * The id of the Permission Level for the user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserRole() { return this.userRole; }
    /**
     * The id of the Permission Level for the user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setUserRole(String value) { this.userRole = value; }
    /**
     * The date timestamp when the invite was sent to the user.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getInviteSent() { return this.inviteSent; }
    /**
     * The date timestamp when the invite was sent to the user.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setInviteSent(Date value) { this.inviteSent = value; }
    /**
     * The phone number of the user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPhoneNumber() { return this.phoneNumber; }
    /**
     * The phone number of the user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
    /**
     * The fax number of the user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFaxNumber() { return this.faxNumber; }
    /**
     * The fax number of the user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setFaxNumber(String value) { this.faxNumber = value; }
    /**
     * The title of the user; free text field
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTitle() { return this.title; }
    /**
     * The title of the user; free text field
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setTitle(String value) { this.title = value; }
    /**
     * FK to the CodeDefinition table; CodeType = 'AccountingRole'
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAccountingRoleCodeDefId() { return this.accountingRoleCodeDefId; }
    /**
     * FK to the CodeDefinition table; CodeType = 'AccountingRole'
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAccountingRoleCodeDefId(String value) { this.accountingRoleCodeDefId = value; }
    /**
     * Address Line 1 for this User
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress1() { return this.address1; }
    /**
     * Address Line 1 for this User
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * Address Line 2 for this User
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress2() { return this.address2; }
    /**
     * Address Line 2 for this User
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * Address Line 3 for this User
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress3() { return this.address3; }
    /**
     * Address Line 3 for this User
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * City for this User
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCity() { return this.city; }
    /**
     * City for this User
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCity(String value) { this.city = value; }
    /**
     * Region ("state" in the US) for this User
     *
     * @return a {@link java.lang.String} object.
     */
    public String getStateRegion() { return this.stateRegion; }
    /**
     * Region ("state" in the US) for this User
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setStateRegion(String value) { this.stateRegion = value; }
    /**
     * Postal Code this User
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * Postal Code this User
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * Country for this User This will be validated by the /api/v1/countries data set
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCountry() { return this.country; }
    /**
     * Country for this User This will be validated by the /api/v1/countries data set
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCountry(String value) { this.country = value; }
    /**
     * Image URL for this User
     *
     * @return a {@link java.lang.String} object.
     */
    public String getImageURL() { return this.imageURL; }
    /**
     * Image URL for this User
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setImageURL(String value) { this.imageURL = value; }
    /**
     * Description for this User.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDescription() { return this.description; }
    /**
     * Description for this User.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * Last date time user logged into Azure B2C.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getB2CLastLoggedIn() { return this.b2CLastLoggedIn; }
    /**
     * Last date time user logged into Azure B2C.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setB2CLastLoggedIn(Date value) { this.b2CLastLoggedIn = value; }
    /**
     * The default currency code used by this user entity.  This value can be overridden
     * for invoices in a different currency code.
     * 
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies) This will be validated by the /api/v1/currencies data set
     */
    public String getDefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code used by this user entity.  This value can be overridden
     * for invoices in a different currency code.
     * 
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies) This will be validated by the /api/v1/currencies data set
     */
    public void setDefaultCurrencyCode(String value) { this.defaultCurrencyCode = value; }
    /**
     * All notes attached to this User.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this User.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this User.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this User.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All values attached to this User.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this User.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Accounting role definition for this User.
     * To retrieve this collection, specify `AccountingRole` in the "Include" parameter for your query.
     *
     * @return a {@link io.lockstep.api.models.CodeDefinitionModel} object.
     */
    public CodeDefinitionModel getAccountingRoleCodeDefinition() { return this.accountingRoleCodeDefinition; }
    /**
     * Accounting role definition for this User.
     * To retrieve this collection, specify `AccountingRole` in the "Include" parameter for your query.
     *
     * @param value a {@link io.lockstep.api.models.CodeDefinitionModel} object.
     */
    public void setAccountingRoleCodeDefinition(CodeDefinitionModel value) { this.accountingRoleCodeDefinition = value; }
};
