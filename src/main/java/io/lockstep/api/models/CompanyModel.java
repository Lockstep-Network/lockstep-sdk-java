
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
 * @version    2022.3
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * A Company represents a customer, a vendor, or a company within the organization of the account holder.
 * Companies can have parents and children, representing an organizational hierarchy of corporate entities.
 * You can use Companies to track projects and financial data under this Company label.
 *
 * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
 */
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
    private String created;
    private String createdUserId;
    private String modified;
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
     * @return The field companyId
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * The short name of the company.
     *
     * @return The field companyName
     */
    public String getCompanyName() { return this.companyName; }
    /**
     * The short name of the company.
     *
     * @param value The new value for companyName
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
     * @return The field erpKey
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
     * @param value The new value for erpKey
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
     * @return The field companyType
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
     * @param value The new value for companyType
     */
    public void setCompanyType(String value) { this.companyType = value; }
    /**
     * The status of the company.  Companies can be either `Active` or `Inactive`.  When matched to a
     * Lockstep corporate profile, this value will change to reflect that this record will be kept
     * in sync with that company's identity.
     *
     * @return The field companyStatus
     */
    public String getCompanyStatus() { return this.companyStatus; }
    /**
     * The status of the company.  Companies can be either `Active` or `Inactive`.  When matched to a
     * Lockstep corporate profile, this value will change to reflect that this record will be kept
     * in sync with that company's identity.
     *
     * @param value The new value for companyStatus
     */
    public void setCompanyStatus(String value) { this.companyStatus = value; }
    /**
     * If this business entity is part of an organization, this value is non-null and it is set
     * to the `CompanyId` value of the parent company of this business entity.
     *
     * If this value is null, this business entity is a standalone.
     *
     * @return The field parentCompanyId
     */
    public String getParentCompanyId() { return this.parentCompanyId; }
    /**
     * If this business entity is part of an organization, this value is non-null and it is set
     * to the `CompanyId` value of the parent company of this business entity.
     *
     * If this value is null, this business entity is a standalone.
     *
     * @param value The new value for parentCompanyId
     */
    public void setParentCompanyId(String value) { this.parentCompanyId = value; }
    /**
     * For convenience, this field indicates the top-level parent company.  This can be used
     * to jump directly to the top parent in complex organizational hierarchies.
     *
     * @return The field enterpriseId
     */
    public String getEnterpriseId() { return this.enterpriseId; }
    /**
     * For convenience, this field indicates the top-level parent company.  This can be used
     * to jump directly to the top parent in complex organizational hierarchies.
     *
     * @param value The new value for enterpriseId
     */
    public void setEnterpriseId(String value) { this.enterpriseId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * This flag indicates whether the company is currently active.  An inactive company
     * should be hidden from the user interface but will still be available for querying.
     *
     * @return The field isActive
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * This flag indicates whether the company is currently active.  An inactive company
     * should be hidden from the user interface but will still be available for querying.
     *
     * @param value The new value for isActive
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * The default currency code used by this business entity.  This value can be overridden
     * for invoices in a different currency code.
     *
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     *
     * @return The field defaultCurrencyCode
     */
    public String getDefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code used by this business entity.  This value can be overridden
     * for invoices in a different currency code.
     *
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     *
     * @param value The new value for defaultCurrencyCode
     */
    public void setDefaultCurrencyCode(String value) { this.defaultCurrencyCode = value; }
    /**
     * The URL of this company's logo, if known.
     *
     * @return The field companyLogoUrl
     */
    public String getCompanyLogoUrl() { return this.companyLogoUrl; }
    /**
     * The URL of this company's logo, if known.
     *
     * @param value The new value for companyLogoUrl
     */
    public void setCompanyLogoUrl(String value) { this.companyLogoUrl = value; }
    /**
     * The Lockstep `ContactId` of the primary contact for this company.
     *
     * @return The field primaryContactId
     */
    public String getPrimaryContactId() { return this.primaryContactId; }
    /**
     * The Lockstep `ContactId` of the primary contact for this company.
     *
     * @param value The new value for primaryContactId
     */
    public void setPrimaryContactId(String value) { this.primaryContactId = value; }
    /**
     * Address info
     *
     * @return The field address1
     */
    public String getAddress1() { return this.address1; }
    /**
     * Address info
     *
     * @param value The new value for address1
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * Address info
     *
     * @return The field address2
     */
    public String getAddress2() { return this.address2; }
    /**
     * Address info
     *
     * @param value The new value for address2
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * Address info
     *
     * @return The field address3
     */
    public String getAddress3() { return this.address3; }
    /**
     * Address info
     *
     * @param value The new value for address3
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * Address info
     *
     * @return The field city
     */
    public String getCity() { return this.city; }
    /**
     * Address info
     *
     * @param value The new value for city
     */
    public void setCity(String value) { this.city = value; }
    /**
     * Address info
     *
     * @return The field stateRegion
     */
    public String getStateRegion() { return this.stateRegion; }
    /**
     * Address info
     *
     * @param value The new value for stateRegion
     */
    public void setStateRegion(String value) { this.stateRegion = value; }
    /**
     * Address info
     *
     * @return The field postalCode
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * Address info
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * Address info
     *
     * @return The field country
     */
    public String getCountry() { return this.country; }
    /**
     * Address info
     *
     * @param value The new value for country
     */
    public void setCountry(String value) { this.country = value; }
    /**
     * Phone number
     *
     * @return The field phoneNumber
     */
    public String getPhoneNumber() { return this.phoneNumber; }
    /**
     * Phone number
     *
     * @param value The new value for phoneNumber
     */
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
    /**
     * Fax number
     *
     * @return The field faxNumber
     */
    public String getFaxNumber() { return this.faxNumber; }
    /**
     * Fax number
     *
     * @param value The new value for faxNumber
     */
    public void setFaxNumber(String value) { this.faxNumber = value; }
    /**
     * The date this company was created
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date this company was created
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The ID of the user who created this company
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this company
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date this company was last modified
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * The date this company was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this company
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this company
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The name of the user who last modified this company
     *
     * @return The field modifiedUserName
     */
    public String getModifiedUserName() { return this.modifiedUserName; }
    /**
     * The name of the user who last modified this company
     *
     * @param value The new value for modifiedUserName
     */
    public void setModifiedUserName(String value) { this.modifiedUserName = value; }
    /**
     * Federal Tax ID
     *
     * @return The field taxId
     */
    public String getTaxId() { return this.taxId; }
    /**
     * Federal Tax ID
     *
     * @param value The new value for taxId
     */
    public void setTaxId(String value) { this.taxId = value; }
    /**
     * Dun and Bradstreet Number
     *
     * @return The field dunsNumber
     */
    public String getDunsNumber() { return this.dunsNumber; }
    /**
     * Dun and Bradstreet Number
     *
     * @param value The new value for dunsNumber
     */
    public void setDunsNumber(String value) { this.dunsNumber = value; }
    /**
     * AP (Accounts Payable) Email Address
     *
     * @return The field apEmailAddress
     */
    public String getApEmailAddress() { return this.apEmailAddress; }
    /**
     * AP (Accounts Payable) Email Address
     *
     * @param value The new value for apEmailAddress
     */
    public void setApEmailAddress(String value) { this.apEmailAddress = value; }
    /**
     * AR (Accounts Receivable) Email Address
     *
     * @return The field arEmailAddress
     */
    public String getArEmailAddress() { return this.arEmailAddress; }
    /**
     * AR (Accounts Receivable) Email Address
     *
     * @param value The new value for arEmailAddress
     */
    public void setArEmailAddress(String value) { this.arEmailAddress = value; }
    /**
     * For companies that use a custom domain name for their email system, this is
     * the domain name used by this company.  If this value is known, new emails that
     * come in from this domain will be connected to this company.
     *
     * @return The field domainName
     */
    public String getDomainName() { return this.domainName; }
    /**
     * For companies that use a custom domain name for their email system, this is
     * the domain name used by this company.  If this value is known, new emails that
     * come in from this domain will be connected to this company.
     *
     * @param value The new value for domainName
     */
    public void setDomainName(String value) { this.domainName = value; }
    /**
     * Identifier for classification of this company.
     *
     * @return The field companyClassificationCodeDefId
     */
    public String getCompanyClassificationCodeDefId() { return this.companyClassificationCodeDefId; }
    /**
     * Identifier for classification of this company.
     *
     * @param value The new value for companyClassificationCodeDefId
     */
    public void setCompanyClassificationCodeDefId(String value) { this.companyClassificationCodeDefId = value; }
    /**
     * Description of the company.
     *
     * @return The field description
     */
    public String getDescription() { return this.description; }
    /**
     * Description of the company.
     *
     * @param value The new value for description
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * Website URL for this company.
     *
     * @return The field website
     */
    public String getWebsite() { return this.website; }
    /**
     * Website URL for this company.
     *
     * @param value The new value for website
     */
    public void setWebsite(String value) { this.website = value; }
    /**
     * The AppEnrollmentId of the application that imported this company record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this company record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All notes attached to this company.
     *
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return The field notes
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this company.
     *
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value The new value for notes
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     *
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return The field attachments
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     *
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value The new value for attachments
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All contacts attached to this company.
     *
     * To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     *
     * @return The field contacts
     */
    public ContactModel[] getContacts() { return this.contacts; }
    /**
     * All contacts attached to this company.
     *
     * To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     *
     * @param value The new value for contacts
     */
    public void setContacts(ContactModel[] value) { this.contacts = value; }
    /**
     * All invoices attached to this company.
     *
     * To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     *
     * @return The field invoices
     */
    public Object[] getInvoices() { return this.invoices; }
    /**
     * All invoices attached to this company.
     *
     * To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     *
     * @param value The new value for invoices
     */
    public void setInvoices(Object[] value) { this.invoices = value; }
    /**
     * All definitions attached to this company.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldDefinitions
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this company.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this company.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldValues
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this company.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Classification code definition for this company.
     *
     * To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     *
     * @return The field companyClassificationCodeDefinition
     */
    public CodeDefinitionModel getCompanyClassificationCodeDefinition() { return this.companyClassificationCodeDefinition; }
    /**
     * Classification code definition for this company.
     *
     * To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     *
     * @param value The new value for companyClassificationCodeDefinition
     */
    public void setCompanyClassificationCodeDefinition(CodeDefinitionModel value) { this.companyClassificationCodeDefinition = value; }
};
