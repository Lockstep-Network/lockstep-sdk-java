
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
     *
     * @return a {@link java.lang.String} object.
     */
    public String getContactId() { return this.contactId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setContactId(String value) { this.contactId = value; }
    /**
     * The ID of the company to which this contact belongs.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this contact belongs.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyId(String value) { this.companyId = value; }
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
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The name of the contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getContactName() { return this.contactName; }
    /**
     * The name of the contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setContactName(String value) { this.contactName = value; }
    /**
     * A friendly human-readable code that describes this Contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getContactCode() { return this.contactCode; }
    /**
     * A friendly human-readable code that describes this Contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setContactCode(String value) { this.contactCode = value; }
    /**
     * The title of the contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTitle() { return this.title; }
    /**
     * The title of the contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setTitle(String value) { this.title = value; }
    /**
     * The role code for the contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRoleCode() { return this.roleCode; }
    /**
     * The role code for the contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setRoleCode(String value) { this.roleCode = value; }
    /**
     * The email address of the contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEmailAddress() { return this.emailAddress; }
    /**
     * The email address of the contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setEmailAddress(String value) { this.emailAddress = value; }
    /**
     * The phone number of the contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPhone() { return this.phone; }
    /**
     * The phone number of the contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPhone(String value) { this.phone = value; }
    /**
     * The fax number of the contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFax() { return this.fax; }
    /**
     * The fax number of the contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setFax(String value) { this.fax = value; }
    /**
     * The first line of the address.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress1() { return this.address1; }
    /**
     * The first line of the address.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * The second line of the address.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress2() { return this.address2; }
    /**
     * The second line of the address.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * The third line of the address.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress3() { return this.address3; }
    /**
     * The third line of the address.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * The city of the address.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCity() { return this.city; }
    /**
     * The city of the address.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCity(String value) { this.city = value; }
    /**
     * The state/region of the address.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getStateRegion() { return this.stateRegion; }
    /**
     * The state/region of the address.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setStateRegion(String value) { this.stateRegion = value; }
    /**
     * The postal/zip code of the address.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * The postal/zip code of the address.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * The two character country code of the address. This will be validated by the /api/v1/countries data set
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCountryCode() { return this.countryCode; }
    /**
     * The two character country code of the address. This will be validated by the /api/v1/countries data set
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCountryCode(String value) { this.countryCode = value; }
    /**
     * Flag indicating if the contact is active.
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * Flag indicating if the contact is active.
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * The webpage url of the contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getWebpageUrl() { return this.webpageUrl; }
    /**
     * The webpage url of the contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setWebpageUrl(String value) { this.webpageUrl = value; }
    /**
     * The picture/avatar url of the contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPictureUrl() { return this.pictureUrl; }
    /**
     * The picture/avatar url of the contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPictureUrl(String value) { this.pictureUrl = value; }
    /**
     * The date on which this record was created.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * The date on which this record was created.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created this contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this record was last modified.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * The date on which this record was last modified.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified this contact.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this contact.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to this contact.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this contact.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this contact.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this contact.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
