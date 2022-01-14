
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
public class CompanyModel
{
    private String companyId;
    private String companyName;
    private String erpKey;
    private String companyType;
    private String companyStatus;
    private String parentCompanyId;
    private String enterpriseId;
    private String groupKey;
    private Boolean isActive;
    private String defaultCurrencyCode;
    private String companyLogoUrl;
    private String primaryContactId;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateRegion;
    private String postalCode;
    private String country;
    private String phoneNumber;
    private String faxNumber;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String modifiedUserName;
    private String taxId;
    private String dunsNumber;
    private String apEmailAddress;
    private String arEmailAddress;
    private String domainName;
    private String companyClassificationCodeDefId;
    private String description;
    private String website;
    private String appEnrollmentId;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private ContactModel[] contacts;
    private Object[] invoices;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;
    private CodeDefinitionModel companyClassificationCodeDefinition;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * The short name of the company.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyName() { return this.companyName; }
    /**
     * The short name of the company.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyName(String value) { this.companyName = value; }
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
     * This field indicates the type of company.  It can be one of a limited number of values:
     * Company, Customer, Group, or Vendor.  A company that represents both a customer and a vendor
     * is identified as a CustomerVendor.
     *
     * * `Company` - This record represents a company that is part of the organization of the account holder.
     * * `Customer` - This record represents a business entity that purchases things from the account holder.
     * * `Group` - Only one record of type `GROUP` exists in each account.  Contains your account profile.
     * * `Vendor` - This record represents a business entity that sells things to the account holder.
     * * `CustomerVendor` - Both a customer and a vendor.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyType() { return this.companyType; }
    /**
     * This field indicates the type of company.  It can be one of a limited number of values:
     * Company, Customer, Group, or Vendor.  A company that represents both a customer and a vendor
     * is identified as a CustomerVendor.
     *
     * * `Company` - This record represents a company that is part of the organization of the account holder.
     * * `Customer` - This record represents a business entity that purchases things from the account holder.
     * * `Group` - Only one record of type `GROUP` exists in each account.  Contains your account profile.
     * * `Vendor` - This record represents a business entity that sells things to the account holder.
     * * `CustomerVendor` - Both a customer and a vendor.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyType(String value) { this.companyType = value; }
    /**
     * The status of the company.  Companies can be either `Active` or `Inactive`.  When matched to a
     * Lockstep corporate profile, this value will change to reflect that this record will be kept
     * in sync with that company's identity.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyStatus() { return this.companyStatus; }
    /**
     * The status of the company.  Companies can be either `Active` or `Inactive`.  When matched to a
     * Lockstep corporate profile, this value will change to reflect that this record will be kept
     * in sync with that company's identity.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyStatus(String value) { this.companyStatus = value; }
    /**
     * If this business entity is part of an organization, this value is non-null and it is set
     * to the `CompanyId` value of the parent company of this business entity.
     *
     * If this value is null, this business entity is a standalone.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getParentCompanyId() { return this.parentCompanyId; }
    /**
     * If this business entity is part of an organization, this value is non-null and it is set
     * to the `CompanyId` value of the parent company of this business entity.
     *
     * If this value is null, this business entity is a standalone.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setParentCompanyId(String value) { this.parentCompanyId = value; }
    /**
     * For convenience, this field indicates the top-level parent company.  This can be used
     * to jump directly to the top parent in complex organizational hierarchies.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEnterpriseId() { return this.enterpriseId; }
    /**
     * For convenience, this field indicates the top-level parent company.  This can be used
     * to jump directly to the top parent in complex organizational hierarchies.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setEnterpriseId(String value) { this.enterpriseId = value; }
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
     * This flag indicates whether the company is currently active.  An inactive company
     * should be hidden from the user interface but will still be available for querying.
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * This flag indicates whether the company is currently active.  An inactive company
     * should be hidden from the user interface but will still be available for querying.
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * The default currency code used by this business entity.  This value can be overridden
     * for invoices in a different currency code.
     *
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code used by this business entity.  This value can be overridden
     * for invoices in a different currency code.
     *
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setDefaultCurrencyCode(String value) { this.defaultCurrencyCode = value; }
    /**
     * The URL of this company's logo, if known.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyLogoUrl() { return this.companyLogoUrl; }
    /**
     * The URL of this company's logo, if known.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyLogoUrl(String value) { this.companyLogoUrl = value; }
    /**
     * The Lockstep `ContactId` of the primary contact for this company.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPrimaryContactId() { return this.primaryContactId; }
    /**
     * The Lockstep `ContactId` of the primary contact for this company.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPrimaryContactId(String value) { this.primaryContactId = value; }
    /**
     * Address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress1() { return this.address1; }
    /**
     * Address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * Address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress2() { return this.address2; }
    /**
     * Address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * Address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress3() { return this.address3; }
    /**
     * Address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * Address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCity() { return this.city; }
    /**
     * Address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCity(String value) { this.city = value; }
    /**
     * Address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getStateRegion() { return this.stateRegion; }
    /**
     * Address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setStateRegion(String value) { this.stateRegion = value; }
    /**
     * Address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * Address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * Address info
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCountry() { return this.country; }
    /**
     * Address info
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCountry(String value) { this.country = value; }
    /**
     * Phone number
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPhoneNumber() { return this.phoneNumber; }
    /**
     * Phone number
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
    /**
     * Fax number
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFaxNumber() { return this.faxNumber; }
    /**
     * Fax number
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setFaxNumber(String value) { this.faxNumber = value; }
    /**
     * The date this company was created
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * The date this company was created
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created this company
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this company
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date this company was last modified
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * The date this company was last modified
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified this company
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this company
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The name of the user who last modified this company
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserName() { return this.modifiedUserName; }
    /**
     * The name of the user who last modified this company
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserName(String value) { this.modifiedUserName = value; }
    /**
     * Federal Tax ID
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTaxId() { return this.taxId; }
    /**
     * Federal Tax ID
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setTaxId(String value) { this.taxId = value; }
    /**
     * Dun and Bradstreet Number
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDunsNumber() { return this.dunsNumber; }
    /**
     * Dun and Bradstreet Number
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setDunsNumber(String value) { this.dunsNumber = value; }
    /**
     * AP (Accounts Payable) Email Address
     *
     * @return a {@link java.lang.String} object.
     */
    public String getApEmailAddress() { return this.apEmailAddress; }
    /**
     * AP (Accounts Payable) Email Address
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setApEmailAddress(String value) { this.apEmailAddress = value; }
    /**
     * AR (Accounts Receivable) Email Address
     *
     * @return a {@link java.lang.String} object.
     */
    public String getArEmailAddress() { return this.arEmailAddress; }
    /**
     * AR (Accounts Receivable) Email Address
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setArEmailAddress(String value) { this.arEmailAddress = value; }
    /**
     * For companies that use a custom domain name for their email system, this is
     * the domain name used by this company.  If this value is known, new emails that
     * come in from this domain will be connected to this company.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDomainName() { return this.domainName; }
    /**
     * For companies that use a custom domain name for their email system, this is
     * the domain name used by this company.  If this value is known, new emails that
     * come in from this domain will be connected to this company.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setDomainName(String value) { this.domainName = value; }
    /**
     * Identifier for classification of this company.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyClassificationCodeDefId() { return this.companyClassificationCodeDefId; }
    /**
     * Identifier for classification of this company.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyClassificationCodeDefId(String value) { this.companyClassificationCodeDefId = value; }
    /**
     * Description of the company.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDescription() { return this.description; }
    /**
     * Description of the company.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * Website URL for this company.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getWebsite() { return this.website; }
    /**
     * Website URL for this company.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setWebsite(String value) { this.website = value; }
    /**
     * The AppEnrollmentId of the application that imported this company record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this company record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All notes attached to this company.
     *
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this company.
     *
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     *
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     *
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All contacts attached to this company.
     *
     * To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.ContactModel} objects.
     */
    public ContactModel[] getContacts() { return this.contacts; }
    /**
     * All contacts attached to this company.
     *
     * To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.ContactModel} objects.
     */
    public void setContacts(ContactModel[] value) { this.contacts = value; }
    /**
     * All invoices attached to this company.
     *
     * To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     *
     * @return an array of {@link java.lang.Object} objects.
     */
    public Object[] getInvoices() { return this.invoices; }
    /**
     * All invoices attached to this company.
     *
     * To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     *
     * @param value an array of {@link java.lang.Object} objects.
     */
    public void setInvoices(Object[] value) { this.invoices = value; }
    /**
     * All definitions attached to this company.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this company.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this company.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this company.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Classification code definition for this company.
     *
     * To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     *
     * @return a {@link io.lockstep.api.models.CodeDefinitionModel} object.
     */
    public CodeDefinitionModel getCompanyClassificationCodeDefinition() { return this.companyClassificationCodeDefinition; }
    /**
     * Classification code definition for this company.
     *
     * To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     *
     * @param value a {@link io.lockstep.api.models.CodeDefinitionModel} object.
     */
    public void setCompanyClassificationCodeDefinition(CodeDefinitionModel value) { this.companyClassificationCodeDefinition = value; }
};
