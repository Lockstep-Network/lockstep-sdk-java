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

public class ContactModel
{
    private String contactId;
    private String companyId;
    private String groupKey;
    private String erpKey;
    private String contactName;
    private String contactCode;
    private String title;
    private String roleCode;
    private String emailAddress;
    private String phone;
    private String fax;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateRegion;
    private String postalCode;
    private String countryCode;
    private Boolean isActive;
    private String webpageUrl;
    private String pictureUrl;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getcontactId() { return this.contactId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setcontactId(String value) { this.contactId = value; }
    /**
     * The ID of the company to which this contact belongs.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this contact belongs.
     */
    public void setcompanyId(String value) { this.companyId = value; }
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
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * The name of the contact.
     */
    public String getcontactName() { return this.contactName; }
    /**
     * The name of the contact.
     */
    public void setcontactName(String value) { this.contactName = value; }
    /**
     * A friendly human-readable code that describes this Contact.
     */
    public String getcontactCode() { return this.contactCode; }
    /**
     * A friendly human-readable code that describes this Contact.
     */
    public void setcontactCode(String value) { this.contactCode = value; }
    /**
     * The title of the contact.
     */
    public String gettitle() { return this.title; }
    /**
     * The title of the contact.
     */
    public void settitle(String value) { this.title = value; }
    /**
     * The role code for the contact.
     */
    public String getroleCode() { return this.roleCode; }
    /**
     * The role code for the contact.
     */
    public void setroleCode(String value) { this.roleCode = value; }
    /**
     * The email address of the contact.
     */
    public String getemailAddress() { return this.emailAddress; }
    /**
     * The email address of the contact.
     */
    public void setemailAddress(String value) { this.emailAddress = value; }
    /**
     * The phone number of the contact.
     */
    public String getphone() { return this.phone; }
    /**
     * The phone number of the contact.
     */
    public void setphone(String value) { this.phone = value; }
    /**
     * The fax number of the contact.
     */
    public String getfax() { return this.fax; }
    /**
     * The fax number of the contact.
     */
    public void setfax(String value) { this.fax = value; }
    /**
     * The first line of the address.
     */
    public String getaddress1() { return this.address1; }
    /**
     * The first line of the address.
     */
    public void setaddress1(String value) { this.address1 = value; }
    /**
     * The second line of the address.
     */
    public String getaddress2() { return this.address2; }
    /**
     * The second line of the address.
     */
    public void setaddress2(String value) { this.address2 = value; }
    /**
     * The third line of the address.
     */
    public String getaddress3() { return this.address3; }
    /**
     * The third line of the address.
     */
    public void setaddress3(String value) { this.address3 = value; }
    /**
     * The city of the address.
     */
    public String getcity() { return this.city; }
    /**
     * The city of the address.
     */
    public void setcity(String value) { this.city = value; }
    /**
     * The state/region of the address.
     */
    public String getstateRegion() { return this.stateRegion; }
    /**
     * The state/region of the address.
     */
    public void setstateRegion(String value) { this.stateRegion = value; }
    /**
     * The postal/zip code of the address.
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * The postal/zip code of the address.
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * The two character country code of the address. This will be validated by the /api/v1/countries data set
     */
    public String getcountryCode() { return this.countryCode; }
    /**
     * The two character country code of the address. This will be validated by the /api/v1/countries data set
     */
    public void setcountryCode(String value) { this.countryCode = value; }
    /**
     * Flag indicating if the contact is active.
     */
    public Boolean getisActive() { return this.isActive; }
    /**
     * Flag indicating if the contact is active.
     */
    public void setisActive(Boolean value) { this.isActive = value; }
    /**
     * The webpage url of the contact.
     */
    public String getwebpageUrl() { return this.webpageUrl; }
    /**
     * The webpage url of the contact.
     */
    public void setwebpageUrl(String value) { this.webpageUrl = value; }
    /**
     * The picture/avatar url of the contact.
     */
    public String getpictureUrl() { return this.pictureUrl; }
    /**
     * The picture/avatar url of the contact.
     */
    public void setpictureUrl(String value) { this.pictureUrl = value; }
    /**
     * The date on which this record was created.
     */
    public Date getcreated() { return this.created; }
    /**
     * The date on which this record was created.
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created this contact.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this contact.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this record was last modified.
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date on which this record was last modified.
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified this contact.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this contact.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to this contact.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this contact.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this contact.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this contact.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
