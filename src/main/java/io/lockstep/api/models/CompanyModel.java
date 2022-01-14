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
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform. For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform. For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * @return The short name of the company.
     */
    public String getCompanyName() { return this.companyName; }
    /**
     * @param value - The short name of the company.
     */
    public void setCompanyName(String value) { this.companyName = value; }
    /**
     * @return The unique ID of this record as it was known in its originating financial system. If this company record was imported from a financial system, it will have the value `ErpKey` set to the original primary key number of the record as it was known in the originating financial system. If this record was not imported, this value will be `null`. For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * @param value - The unique ID of this record as it was known in its originating financial system. If this company record was imported from a financial system, it will have the value `ErpKey` set to the original primary key number of the record as it was known in the originating financial system. If this record was not imported, this value will be `null`. For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * @return This field indicates the type of company. It can be one of a limited number of values: Company, Customer, Group, or Vendor. A company that represents both a customer and a vendor is identified as a CustomerVendor. * `Company` - This record represents a company that is part of the organization of the account holder. * `Customer` - This record represents a business entity that purchases things from the account holder. * `Group` - Only one record of type `GROUP` exists in each account. Contains your account profile. * `Vendor` - This record represents a business entity that sells things to the account holder. * `CustomerVendor` - Both a customer and a vendor.
     */
    public String getCompanyType() { return this.companyType; }
    /**
     * @param value - This field indicates the type of company. It can be one of a limited number of values: Company, Customer, Group, or Vendor. A company that represents both a customer and a vendor is identified as a CustomerVendor. * `Company` - This record represents a company that is part of the organization of the account holder. * `Customer` - This record represents a business entity that purchases things from the account holder. * `Group` - Only one record of type `GROUP` exists in each account. Contains your account profile. * `Vendor` - This record represents a business entity that sells things to the account holder. * `CustomerVendor` - Both a customer and a vendor.
     */
    public void setCompanyType(String value) { this.companyType = value; }
    /**
     * @return The status of the company. Companies can be either `Active` or `Inactive`. When matched to a Lockstep corporate profile, this value will change to reflect that this record will be kept in sync with that company's identity.
     */
    public String getCompanyStatus() { return this.companyStatus; }
    /**
     * @param value - The status of the company. Companies can be either `Active` or `Inactive`. When matched to a Lockstep corporate profile, this value will change to reflect that this record will be kept in sync with that company's identity.
     */
    public void setCompanyStatus(String value) { this.companyStatus = value; }
    /**
     * @return If this business entity is part of an organization, this value is non-null and it is set to the `CompanyId` value of the parent company of this business entity. If this value is null, this business entity is a standalone.
     */
    public String getParentCompanyId() { return this.parentCompanyId; }
    /**
     * @param value - If this business entity is part of an organization, this value is non-null and it is set to the `CompanyId` value of the parent company of this business entity. If this value is null, this business entity is a standalone.
     */
    public void setParentCompanyId(String value) { this.parentCompanyId = value; }
    /**
     * @return For convenience, this field indicates the top-level parent company. This can be used to jump directly to the top parent in complex organizational hierarchies.
     */
    public String getEnterpriseId() { return this.enterpriseId; }
    /**
     * @param value - For convenience, this field indicates the top-level parent company. This can be used to jump directly to the top parent in complex organizational hierarchies.
     */
    public void setEnterpriseId(String value) { this.enterpriseId = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return This flag indicates whether the company is currently active. An inactive company should be hidden from the user interface but will still be available for querying.
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * @param value - This flag indicates whether the company is currently active. An inactive company should be hidden from the user interface but will still be available for querying.
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * @return The default currency code used by this business entity. This value can be overridden for invoices in a different currency code. For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     */
    public String getDefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * @param value - The default currency code used by this business entity. This value can be overridden for invoices in a different currency code. For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     */
    public void setDefaultCurrencyCode(String value) { this.defaultCurrencyCode = value; }
    /**
     * @return The URL of this company's logo, if known.
     */
    public String getCompanyLogoUrl() { return this.companyLogoUrl; }
    /**
     * @param value - The URL of this company's logo, if known.
     */
    public void setCompanyLogoUrl(String value) { this.companyLogoUrl = value; }
    /**
     * @return The Lockstep `ContactId` of the primary contact for this company.
     */
    public String getPrimaryContactId() { return this.primaryContactId; }
    /**
     * @param value - The Lockstep `ContactId` of the primary contact for this company.
     */
    public void setPrimaryContactId(String value) { this.primaryContactId = value; }
    /**
     * @return Address info
     */
    public String getAddress1() { return this.address1; }
    /**
     * @param value - Address info
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * @return Address info
     */
    public String getAddress2() { return this.address2; }
    /**
     * @param value - Address info
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * @return Address info
     */
    public String getAddress3() { return this.address3; }
    /**
     * @param value - Address info
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * @return Address info
     */
    public String getCity() { return this.city; }
    /**
     * @param value - Address info
     */
    public void setCity(String value) { this.city = value; }
    /**
     * @return Address info
     */
    public String getStateRegion() { return this.stateRegion; }
    /**
     * @param value - Address info
     */
    public void setStateRegion(String value) { this.stateRegion = value; }
    /**
     * @return Address info
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * @param value - Address info
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * @return Address info
     */
    public String getCountry() { return this.country; }
    /**
     * @param value - Address info
     */
    public void setCountry(String value) { this.country = value; }
    /**
     * @return Phone number
     */
    public String getPhoneNumber() { return this.phoneNumber; }
    /**
     * @param value - Phone number
     */
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
    /**
     * @return Fax number
     */
    public String getFaxNumber() { return this.faxNumber; }
    /**
     * @param value - Fax number
     */
    public void setFaxNumber(String value) { this.faxNumber = value; }
    /**
     * @return The date this company was created
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - The date this company was created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The ID of the user who created this company
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The ID of the user who created this company
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return The date this company was last modified
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - The date this company was last modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return The ID of the user who last modified this company
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - The ID of the user who last modified this company
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * @return The name of the user who last modified this company
     */
    public String getModifiedUserName() { return this.modifiedUserName; }
    /**
     * @param value - The name of the user who last modified this company
     */
    public void setModifiedUserName(String value) { this.modifiedUserName = value; }
    /**
     * @return Federal Tax ID
     */
    public String getTaxId() { return this.taxId; }
    /**
     * @param value - Federal Tax ID
     */
    public void setTaxId(String value) { this.taxId = value; }
    /**
     * @return Dun & Bradstreet Number
     */
    public String getDunsNumber() { return this.dunsNumber; }
    /**
     * @param value - Dun & Bradstreet Number
     */
    public void setDunsNumber(String value) { this.dunsNumber = value; }
    /**
     * @return AP (Accounts Payable) Email Address
     */
    public String getApEmailAddress() { return this.apEmailAddress; }
    /**
     * @param value - AP (Accounts Payable) Email Address
     */
    public void setApEmailAddress(String value) { this.apEmailAddress = value; }
    /**
     * @return AR (Accounts Receivable) Email Address
     */
    public String getArEmailAddress() { return this.arEmailAddress; }
    /**
     * @param value - AR (Accounts Receivable) Email Address
     */
    public void setArEmailAddress(String value) { this.arEmailAddress = value; }
    /**
     * @return For companies that use a custom domain name for their email system, this is the domain name used by this company. If this value is known, new emails that come in from this domain will be connected to this company.
     */
    public String getDomainName() { return this.domainName; }
    /**
     * @param value - For companies that use a custom domain name for their email system, this is the domain name used by this company. If this value is known, new emails that come in from this domain will be connected to this company.
     */
    public void setDomainName(String value) { this.domainName = value; }
    /**
     * @return Identifier for classification of this company.
     */
    public String getCompanyClassificationCodeDefId() { return this.companyClassificationCodeDefId; }
    /**
     * @param value - Identifier for classification of this company.
     */
    public void setCompanyClassificationCodeDefId(String value) { this.companyClassificationCodeDefId = value; }
    /**
     * @return Description of the company.
     */
    public String getDescription() { return this.description; }
    /**
     * @param value - Description of the company.
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * @return Website URL for this company.
     */
    public String getWebsite() { return this.website; }
    /**
     * @param value - Website URL for this company.
     */
    public void setWebsite(String value) { this.website = value; }
    /**
     * @return The AppEnrollmentId of the application that imported this company record. For accounts with more than one financial system connected, this field identifies the originating financial system that produced this record.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * @param value - The AppEnrollmentId of the application that imported this company record. For accounts with more than one financial system connected, this field identifies the originating financial system that produced this record.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * @return All notes attached to this company. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * @param value - All notes attached to this company. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * @return All attachments attached to this company. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * @param value - All attachments attached to this company. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * @return All contacts attached to this company. To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     */
    public ContactModel[] getContacts() { return this.contacts; }
    /**
     * @param value - All contacts attached to this company. To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     */
    public void setContacts(ContactModel[] value) { this.contacts = value; }
    /**
     * @return All invoices attached to this company. To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     */
    public Object[] getInvoices() { return this.invoices; }
    /**
     * @param value - All invoices attached to this company. To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     */
    public void setInvoices(Object[] value) { this.invoices = value; }
    /**
     * @return All definitions attached to this company. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * @param value - All definitions attached to this company. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * @return All values attached to this company. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * @param value - All values attached to this company. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * @return Classification code definition for this company. To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     */
    public CodeDefinitionModel getCompanyClassificationCodeDefinition() { return this.companyClassificationCodeDefinition; }
    /**
     * @param value - Classification code definition for this company. To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     */
    public void setCompanyClassificationCodeDefinition(CodeDefinitionModel value) { this.companyClassificationCodeDefinition = value; }
};
