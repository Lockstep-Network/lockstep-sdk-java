
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2023 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2023 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Company represents a customer, a vendor, or a company within the organization of the account holder.
 * Companies can have parents and children, representing an organizational hierarchy of corporate entities.
 * You can use Companies to track projects and financial data under this Company label.
 *
 * See [Vendors, Customers, and Companies](https://developer.lockstep.io/docs/companies-customers-and-vendors) for more information.
 */
public class CompanyModel
{
    private @NotNull String companyId;
    private @NotNull String companyName;
    private @Nullable String erpKey;
    private @Nullable String companyType;
    private @Nullable String parentCompanyId;
    private @NotNull String enterpriseId;
    private @NotNull String groupKey;
    private @NotNull Boolean isActive;
    private @Nullable String defaultCurrencyCode;
    private @Nullable String companyLogoUrl;
    private @Nullable String primaryContactId;
    private @Nullable String address1;
    private @Nullable String address2;
    private @Nullable String address3;
    private @Nullable String city;
    private @Nullable String stateRegion;
    private @Nullable String postalCode;
    private @Nullable String country;
    private @Nullable String timeZone;
    private @Nullable String phoneNumber;
    private @Nullable String faxNumber;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String modifiedUserName;
    private @Nullable String taxId;
    private @Nullable String dunsNumber;
    private @Nullable String preferredDeliveryMethod;
    private @Nullable String domainName;
    private @Nullable String companyClassificationCodeDefId;
    private @Nullable String description;
    private @Nullable String website;
    private @Nullable String appEnrollmentId;
    private @Nullable String emailAddress;
    private @Nullable String publicUrlSlug;
    private @Nullable String stateTaxId;
    private @Nullable String stateOfIncorporation;
    private @Nullable String linkedInUrlSlug;
    private @NotNull Boolean isVerified;
    private @Nullable String lastVerifiedDate;
    private @Nullable ViewBoxSettingsModel viewBoxSettings;
    private @Nullable String serviceFabricOrgId;
    private @Nullable String serviceFabricCompanyId;
    private @Nullable NoteModel[] notes;
    private @Nullable AttachmentModel[] attachments;
    private @Nullable ContactModel[] contacts;
    private @Nullable Object[] invoices;
    private @Nullable CustomFieldDefinitionModel[] customFieldDefinitions;
    private @Nullable CustomFieldValueModel[] customFieldValues;
    private @Nullable CodeDefinitionModel companyClassificationCodeDefinition;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field companyId
     */
    public @NotNull String getCompanyId() { return this.companyId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@NotNull String value) { this.companyId = value; }
    /**
     * The short name of the company.
     *
     * @return The field companyName
     */
    public @NotNull String getCompanyName() { return this.companyName; }
    /**
     * The short name of the company.
     *
     * @param value The new value for companyName
     */
    public void setCompanyName(@NotNull String value) { this.companyName = value; }
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
    public @Nullable String getErpKey() { return this.erpKey; }
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
    public void setErpKey(@Nullable String value) { this.erpKey = value; }
    /**
     * This field indicates the type of company.  It can be one of a limited number of values:
     * Company, Customer, Group, Vendor, or Third Party.  A company that represents both a customer and a vendor
     * is identified as a CustomerVendor.
     *
     * * `Company` - This record represents a company that is part of the organization of the account holder.
     * * `Customer` - This record represents a business entity that purchases things from the account holder.
     * * `Group` - Only one record of type `GROUP` exists in each account.  Contains your account profile.
     * * `Vendor` - This record represents a business entity that sells things to the account holder.
     * * `Third Party` - This record represents a business entity that is neither a customer nor vendor.
     * * `CustomerVendor` - Both a customer and a vendor.
     *
     * @return The field companyType
     */
    public @Nullable String getCompanyType() { return this.companyType; }
    /**
     * This field indicates the type of company.  It can be one of a limited number of values:
     * Company, Customer, Group, Vendor, or Third Party.  A company that represents both a customer and a vendor
     * is identified as a CustomerVendor.
     *
     * * `Company` - This record represents a company that is part of the organization of the account holder.
     * * `Customer` - This record represents a business entity that purchases things from the account holder.
     * * `Group` - Only one record of type `GROUP` exists in each account.  Contains your account profile.
     * * `Vendor` - This record represents a business entity that sells things to the account holder.
     * * `Third Party` - This record represents a business entity that is neither a customer nor vendor.
     * * `CustomerVendor` - Both a customer and a vendor.
     *
     * @param value The new value for companyType
     */
    public void setCompanyType(@Nullable String value) { this.companyType = value; }
    /**
     * If this business entity is part of an organization, this value is non-null and it is set
     * to the `CompanyId` value of the parent company of this business entity.
     *
     * If this value is null, this business entity is a standalone.
     *
     * @return The field parentCompanyId
     */
    public @Nullable String getParentCompanyId() { return this.parentCompanyId; }
    /**
     * If this business entity is part of an organization, this value is non-null and it is set
     * to the `CompanyId` value of the parent company of this business entity.
     *
     * If this value is null, this business entity is a standalone.
     *
     * @param value The new value for parentCompanyId
     */
    public void setParentCompanyId(@Nullable String value) { this.parentCompanyId = value; }
    /**
     * For convenience, this field indicates the top-level parent company.  This can be used
     * to jump directly to the top parent in complex organizational hierarchies.
     *
     * @return The field enterpriseId
     */
    public @NotNull String getEnterpriseId() { return this.enterpriseId; }
    /**
     * For convenience, this field indicates the top-level parent company.  This can be used
     * to jump directly to the top parent in complex organizational hierarchies.
     *
     * @param value The new value for enterpriseId
     */
    public void setEnterpriseId(@NotNull String value) { this.enterpriseId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * This flag indicates whether the company is currently active.  An inactive company
     * should be hidden from the user interface but will still be available for querying.
     *
     * @return The field isActive
     */
    public @NotNull Boolean getIsActive() { return this.isActive; }
    /**
     * This flag indicates whether the company is currently active.  An inactive company
     * should be hidden from the user interface but will still be available for querying.
     *
     * @param value The new value for isActive
     */
    public void setIsActive(@NotNull Boolean value) { this.isActive = value; }
    /**
     * The default currency code used by this business entity.  This value can be overridden
     * for invoices in a different currency code.
     *
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     *
     * @return The field defaultCurrencyCode
     */
    public @Nullable String getDefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code used by this business entity.  This value can be overridden
     * for invoices in a different currency code.
     *
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     *
     * @param value The new value for defaultCurrencyCode
     */
    public void setDefaultCurrencyCode(@Nullable String value) { this.defaultCurrencyCode = value; }
    /**
     * The URL of this company's logo, if known.
     *
     * @return The field companyLogoUrl
     */
    public @Nullable String getCompanyLogoUrl() { return this.companyLogoUrl; }
    /**
     * The URL of this company's logo, if known.
     *
     * @param value The new value for companyLogoUrl
     */
    public void setCompanyLogoUrl(@Nullable String value) { this.companyLogoUrl = value; }
    /**
     * The Lockstep `ContactId` of the primary contact for this company.
     *
     * @return The field primaryContactId
     */
    public @Nullable String getPrimaryContactId() { return this.primaryContactId; }
    /**
     * The Lockstep `ContactId` of the primary contact for this company.
     *
     * @param value The new value for primaryContactId
     */
    public void setPrimaryContactId(@Nullable String value) { this.primaryContactId = value; }
    /**
     * Address info
     *
     * @return The field address1
     */
    public @Nullable String getAddress1() { return this.address1; }
    /**
     * Address info
     *
     * @param value The new value for address1
     */
    public void setAddress1(@Nullable String value) { this.address1 = value; }
    /**
     * Address info
     *
     * @return The field address2
     */
    public @Nullable String getAddress2() { return this.address2; }
    /**
     * Address info
     *
     * @param value The new value for address2
     */
    public void setAddress2(@Nullable String value) { this.address2 = value; }
    /**
     * Address info
     *
     * @return The field address3
     */
    public @Nullable String getAddress3() { return this.address3; }
    /**
     * Address info
     *
     * @param value The new value for address3
     */
    public void setAddress3(@Nullable String value) { this.address3 = value; }
    /**
     * Address info
     *
     * @return The field city
     */
    public @Nullable String getCity() { return this.city; }
    /**
     * Address info
     *
     * @param value The new value for city
     */
    public void setCity(@Nullable String value) { this.city = value; }
    /**
     * Address info
     *
     * @return The field stateRegion
     */
    public @Nullable String getStateRegion() { return this.stateRegion; }
    /**
     * Address info
     *
     * @param value The new value for stateRegion
     */
    public void setStateRegion(@Nullable String value) { this.stateRegion = value; }
    /**
     * Address info
     *
     * @return The field postalCode
     */
    public @Nullable String getPostalCode() { return this.postalCode; }
    /**
     * Address info
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(@Nullable String value) { this.postalCode = value; }
    /**
     * Address info
     *
     * @return The field country
     */
    public @Nullable String getCountry() { return this.country; }
    /**
     * Address info
     *
     * @param value The new value for country
     */
    public void setCountry(@Nullable String value) { this.country = value; }
    /**
     * Time zone
     *
     * @return The field timeZone
     */
    public @Nullable String getTimeZone() { return this.timeZone; }
    /**
     * Time zone
     *
     * @param value The new value for timeZone
     */
    public void setTimeZone(@Nullable String value) { this.timeZone = value; }
    /**
     * Phone number
     *
     * @return The field phoneNumber
     */
    public @Nullable String getPhoneNumber() { return this.phoneNumber; }
    /**
     * Phone number
     *
     * @param value The new value for phoneNumber
     */
    public void setPhoneNumber(@Nullable String value) { this.phoneNumber = value; }
    /**
     * Fax number
     *
     * @return The field faxNumber
     */
    public @Nullable String getFaxNumber() { return this.faxNumber; }
    /**
     * Fax number
     *
     * @param value The new value for faxNumber
     */
    public void setFaxNumber(@Nullable String value) { this.faxNumber = value; }
    /**
     * The date this company was created
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date this company was created
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created this company
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this company
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date this company was last modified
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date this company was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this company
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this company
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
    /**
     * The name of the user who last modified this company
     *
     * @return The field modifiedUserName
     */
    public @Nullable String getModifiedUserName() { return this.modifiedUserName; }
    /**
     * The name of the user who last modified this company
     *
     * @param value The new value for modifiedUserName
     */
    public void setModifiedUserName(@Nullable String value) { this.modifiedUserName = value; }
    /**
     * Federal Tax ID
     *
     * @return The field taxId
     */
    public @Nullable String getTaxId() { return this.taxId; }
    /**
     * Federal Tax ID
     *
     * @param value The new value for taxId
     */
    public void setTaxId(@Nullable String value) { this.taxId = value; }
    /**
     * Dun and Bradstreet Number
     *
     * @return The field dunsNumber
     */
    public @Nullable String getDunsNumber() { return this.dunsNumber; }
    /**
     * Dun and Bradstreet Number
     *
     * @param value The new value for dunsNumber
     */
    public void setDunsNumber(@Nullable String value) { this.dunsNumber = value; }
    /**
     * Indicates the preferred invoice delivery method. Examples include Print, Email, Fax
     *
     * @return The field preferredDeliveryMethod
     */
    public @Nullable String getPreferredDeliveryMethod() { return this.preferredDeliveryMethod; }
    /**
     * Indicates the preferred invoice delivery method. Examples include Print, Email, Fax
     *
     * @param value The new value for preferredDeliveryMethod
     */
    public void setPreferredDeliveryMethod(@Nullable String value) { this.preferredDeliveryMethod = value; }
    /**
     * For companies that use a custom domain name for their email system, this is
     * the domain name used by this company.  If this value is known, new emails that
     * come in from this domain will be connected to this company.
     *
     * @return The field domainName
     */
    public @Nullable String getDomainName() { return this.domainName; }
    /**
     * For companies that use a custom domain name for their email system, this is
     * the domain name used by this company.  If this value is known, new emails that
     * come in from this domain will be connected to this company.
     *
     * @param value The new value for domainName
     */
    public void setDomainName(@Nullable String value) { this.domainName = value; }
    /**
     * Identifier for classification of this company.
     *
     * @return The field companyClassificationCodeDefId
     */
    public @Nullable String getCompanyClassificationCodeDefId() { return this.companyClassificationCodeDefId; }
    /**
     * Identifier for classification of this company.
     *
     * @param value The new value for companyClassificationCodeDefId
     */
    public void setCompanyClassificationCodeDefId(@Nullable String value) { this.companyClassificationCodeDefId = value; }
    /**
     * Description of the company.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * Description of the company.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * Website URL for this company.
     *
     * @return The field website
     */
    public @Nullable String getWebsite() { return this.website; }
    /**
     * Website URL for this company.
     *
     * @param value The new value for website
     */
    public void setWebsite(@Nullable String value) { this.website = value; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * Company Email Address
     *
     * @return The field emailAddress
     */
    public @Nullable String getEmailAddress() { return this.emailAddress; }
    /**
     * Company Email Address
     *
     * @param value The new value for emailAddress
     */
    public void setEmailAddress(@Nullable String value) { this.emailAddress = value; }
    /**
     * The public url slug for the Company.
     *
     * @return The field publicUrlSlug
     */
    public @Nullable String getPublicUrlSlug() { return this.publicUrlSlug; }
    /**
     * The public url slug for the Company.
     *
     * @param value The new value for publicUrlSlug
     */
    public void setPublicUrlSlug(@Nullable String value) { this.publicUrlSlug = value; }
    /**
     * State Tax ID
     *
     * @return The field stateTaxId
     */
    public @Nullable String getStateTaxId() { return this.stateTaxId; }
    /**
     * State Tax ID
     *
     * @param value The new value for stateTaxId
     */
    public void setStateTaxId(@Nullable String value) { this.stateTaxId = value; }
    /**
     * The state where the company was registered.
     *
     * @return The field stateOfIncorporation
     */
    public @Nullable String getStateOfIncorporation() { return this.stateOfIncorporation; }
    /**
     * The state where the company was registered.
     *
     * @param value The new value for stateOfIncorporation
     */
    public void setStateOfIncorporation(@Nullable String value) { this.stateOfIncorporation = value; }
    /**
     * Linkedin Url
     *
     * @return The field linkedInUrlSlug
     */
    public @Nullable String getLinkedInUrlSlug() { return this.linkedInUrlSlug; }
    /**
     * Linkedin Url
     *
     * @param value The new value for linkedInUrlSlug
     */
    public void setLinkedInUrlSlug(@Nullable String value) { this.linkedInUrlSlug = value; }
    /**
     * This flag indicates whether the company is verified.
     *
     * @return The field isVerified
     */
    public @NotNull Boolean getIsVerified() { return this.isVerified; }
    /**
     * This flag indicates whether the company is verified.
     *
     * @param value The new value for isVerified
     */
    public void setIsVerified(@NotNull Boolean value) { this.isVerified = value; }
    /**
     * The date this company was last verified.
     *
     * @return The field lastVerifiedDate
     */
    public @Nullable String getLastVerifiedDate() { return this.lastVerifiedDate; }
    /**
     * The date this company was last verified.
     *
     * @param value The new value for lastVerifiedDate
     */
    public void setLastVerifiedDate(@Nullable String value) { this.lastVerifiedDate = value; }
    /**
     * View box settings for the company logo.
     *
     * @return The field viewBoxSettings
     */
    public @Nullable ViewBoxSettingsModel getViewBoxSettings() { return this.viewBoxSettings; }
    /**
     * View box settings for the company logo.
     *
     * @param value The new value for viewBoxSettings
     */
    public void setViewBoxSettings(@Nullable ViewBoxSettingsModel value) { this.viewBoxSettings = value; }
    /**
     * The unique ID of the Service Fabric organisation to which this record belongs.
     *
     * @return The field serviceFabricOrgId
     */
    public @Nullable String getServiceFabricOrgId() { return this.serviceFabricOrgId; }
    /**
     * The unique ID of the Service Fabric organisation to which this record belongs.
     *
     * @param value The new value for serviceFabricOrgId
     */
    public void setServiceFabricOrgId(@Nullable String value) { this.serviceFabricOrgId = value; }
    /**
     * The unique ID of this record within Service Fabric.
     *
     * @return The field serviceFabricCompanyId
     */
    public @Nullable String getServiceFabricCompanyId() { return this.serviceFabricCompanyId; }
    /**
     * The unique ID of this record within Service Fabric.
     *
     * @param value The new value for serviceFabricCompanyId
     */
    public void setServiceFabricCompanyId(@Nullable String value) { this.serviceFabricCompanyId = value; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `Company` and the `ObjectKey` set to the `CompanyId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field notes
     */
    public @Nullable NoteModel[] getNotes() { return this.notes; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `Company` and the `ObjectKey` set to the `CompanyId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable NoteModel[] value) { this.notes = value; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `Company` and the `ObjectKey` set to the `CompanyId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field attachments
     */
    public @Nullable AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `Company` and the `ObjectKey` set to the `CompanyId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for attachments
     */
    public void setAttachments(@Nullable AttachmentModel[] value) { this.attachments = value; }
    /**
     * All contacts attached to this company.
     *
     * To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     *
     * @return The field contacts
     */
    public @Nullable ContactModel[] getContacts() { return this.contacts; }
    /**
     * All contacts attached to this company.
     *
     * To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     *
     * @param value The new value for contacts
     */
    public void setContacts(@Nullable ContactModel[] value) { this.contacts = value; }
    /**
     * All invoices attached to this company.
     *
     * To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     *
     * @return The field invoices
     */
    public @Nullable Object[] getInvoices() { return this.invoices; }
    /**
     * All invoices attached to this company.
     *
     * To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     *
     * @param value The new value for invoices
     */
    public void setInvoices(@Nullable Object[] value) { this.invoices = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Company` and the `ObjectKey` set to the `CompanyId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldDefinitions
     */
    public @Nullable CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Company` and the `ObjectKey` set to the `CompanyId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(@Nullable CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Company` and the `ObjectKey` set to the `CompanyId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldValues
     */
    public @Nullable CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Company` and the `ObjectKey` set to the `CompanyId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(@Nullable CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Classification code definition for this company.
     *
     * To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     *
     * @return The field companyClassificationCodeDefinition
     */
    public @Nullable CodeDefinitionModel getCompanyClassificationCodeDefinition() { return this.companyClassificationCodeDefinition; }
    /**
     * Classification code definition for this company.
     *
     * To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     *
     * @param value The new value for companyClassificationCodeDefinition
     */
    public void setCompanyClassificationCodeDefinition(@Nullable CodeDefinitionModel value) { this.companyClassificationCodeDefinition = value; }
};
