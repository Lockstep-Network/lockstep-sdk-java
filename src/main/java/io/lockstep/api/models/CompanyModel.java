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
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The short name of the company.
     */
    public String getcompanyName() { return this.companyName; }
    /**
     * The short name of the company.
     */
    public void setcompanyName(String value) { this.companyName = value; }
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
     * This field indicates the type of company.  It can be one of a limited number of values:
     * Company, Customer, Group, or Vendor.  A company that represents both a customer and a vendor
     * is identified as a CustomerVendor.
     * 
     * * `Company` - This record represents a company that is part of the organization of the account holder.
     * * `Customer` - This record represents a business entity that purchases things from the account holder.
     * * `Group` - Only one record of type `GROUP` exists in each account.  Contains your account profile.
     * * `Vendor` - This record represents a business entity that sells things to the account holder.
     * * `CustomerVendor` - Both a customer and a vendor.
     */
    public String getcompanyType() { return this.companyType; }
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
     */
    public void setcompanyType(String value) { this.companyType = value; }
    /**
     * The status of the company.  Companies can be either `Active` or `Inactive`.  When matched to a
     * Lockstep corporate profile, this value will change to reflect that this record will be kept
     * in sync with that company's identity.
     */
    public String getcompanyStatus() { return this.companyStatus; }
    /**
     * The status of the company.  Companies can be either `Active` or `Inactive`.  When matched to a
     * Lockstep corporate profile, this value will change to reflect that this record will be kept
     * in sync with that company's identity.
     */
    public void setcompanyStatus(String value) { this.companyStatus = value; }
    /**
     * If this business entity is part of an organization, this value is non-null and it is set
     * to the `CompanyId` value of the parent company of this business entity.
     * 
     * If this value is null, this business entity is a standalone.
     */
    public String getparentCompanyId() { return this.parentCompanyId; }
    /**
     * If this business entity is part of an organization, this value is non-null and it is set
     * to the `CompanyId` value of the parent company of this business entity.
     * 
     * If this value is null, this business entity is a standalone.
     */
    public void setparentCompanyId(String value) { this.parentCompanyId = value; }
    /**
     * For convenience, this field indicates the top-level parent company.  This can be used
     * to jump directly to the top parent in complex organizational hierarchies.
     */
    public String getenterpriseId() { return this.enterpriseId; }
    /**
     * For convenience, this field indicates the top-level parent company.  This can be used
     * to jump directly to the top parent in complex organizational hierarchies.
     */
    public void setenterpriseId(String value) { this.enterpriseId = value; }
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
     * This flag indicates whether the company is currently active.  An inactive company
     * should be hidden from the user interface but will still be available for querying.
     */
    public Boolean getisActive() { return this.isActive; }
    /**
     * This flag indicates whether the company is currently active.  An inactive company
     * should be hidden from the user interface but will still be available for querying.
     */
    public void setisActive(Boolean value) { this.isActive = value; }
    /**
     * The default currency code used by this business entity.  This value can be overridden
     * for invoices in a different currency code.
     * 
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     */
    public String getdefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code used by this business entity.  This value can be overridden
     * for invoices in a different currency code.
     * 
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     */
    public void setdefaultCurrencyCode(String value) { this.defaultCurrencyCode = value; }
    /**
     * The URL of this company's logo, if known.
     */
    public String getcompanyLogoUrl() { return this.companyLogoUrl; }
    /**
     * The URL of this company's logo, if known.
     */
    public void setcompanyLogoUrl(String value) { this.companyLogoUrl = value; }
    /**
     * The Lockstep `ContactId` of the primary contact for this company.
     */
    public String getprimaryContactId() { return this.primaryContactId; }
    /**
     * The Lockstep `ContactId` of the primary contact for this company.
     */
    public void setprimaryContactId(String value) { this.primaryContactId = value; }
    /**
     * Address info
     */
    public String getaddress1() { return this.address1; }
    /**
     * Address info
     */
    public void setaddress1(String value) { this.address1 = value; }
    /**
     * Address info
     */
    public String getaddress2() { return this.address2; }
    /**
     * Address info
     */
    public void setaddress2(String value) { this.address2 = value; }
    /**
     * Address info
     */
    public String getaddress3() { return this.address3; }
    /**
     * Address info
     */
    public void setaddress3(String value) { this.address3 = value; }
    /**
     * Address info
     */
    public String getcity() { return this.city; }
    /**
     * Address info
     */
    public void setcity(String value) { this.city = value; }
    /**
     * Address info
     */
    public String getstateRegion() { return this.stateRegion; }
    /**
     * Address info
     */
    public void setstateRegion(String value) { this.stateRegion = value; }
    /**
     * Address info
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * Address info
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * Address info
     */
    public String getcountry() { return this.country; }
    /**
     * Address info
     */
    public void setcountry(String value) { this.country = value; }
    /**
     * Phone number
     */
    public String getphoneNumber() { return this.phoneNumber; }
    /**
     * Phone number
     */
    public void setphoneNumber(String value) { this.phoneNumber = value; }
    /**
     * Fax number
     */
    public String getfaxNumber() { return this.faxNumber; }
    /**
     * Fax number
     */
    public void setfaxNumber(String value) { this.faxNumber = value; }
    /**
     * The date this company was created
     */
    public Date getcreated() { return this.created; }
    /**
     * The date this company was created
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created this company
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this company
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date this company was last modified
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date this company was last modified
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified this company
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this company
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The name of the user who last modified this company
     */
    public String getmodifiedUserName() { return this.modifiedUserName; }
    /**
     * The name of the user who last modified this company
     */
    public void setmodifiedUserName(String value) { this.modifiedUserName = value; }
    /**
     * Federal Tax ID
     */
    public String gettaxId() { return this.taxId; }
    /**
     * Federal Tax ID
     */
    public void settaxId(String value) { this.taxId = value; }
    /**
     * Dun & Bradstreet Number
     */
    public String getdunsNumber() { return this.dunsNumber; }
    /**
     * Dun & Bradstreet Number
     */
    public void setdunsNumber(String value) { this.dunsNumber = value; }
    /**
     * AP (Accounts Payable) Email Address
     */
    public String getapEmailAddress() { return this.apEmailAddress; }
    /**
     * AP (Accounts Payable) Email Address
     */
    public void setapEmailAddress(String value) { this.apEmailAddress = value; }
    /**
     * AR (Accounts Receivable) Email Address
     */
    public String getarEmailAddress() { return this.arEmailAddress; }
    /**
     * AR (Accounts Receivable) Email Address
     */
    public void setarEmailAddress(String value) { this.arEmailAddress = value; }
    /**
     * For companies that use a custom domain name for their email system, this is
     * the domain name used by this company.  If this value is known, new emails that
     * come in from this domain will be connected to this company.
     */
    public String getdomainName() { return this.domainName; }
    /**
     * For companies that use a custom domain name for their email system, this is
     * the domain name used by this company.  If this value is known, new emails that
     * come in from this domain will be connected to this company.
     */
    public void setdomainName(String value) { this.domainName = value; }
    /**
     * Identifier for classification of this company.
     */
    public String getcompanyClassificationCodeDefId() { return this.companyClassificationCodeDefId; }
    /**
     * Identifier for classification of this company.
     */
    public void setcompanyClassificationCodeDefId(String value) { this.companyClassificationCodeDefId = value; }
    /**
     * Description of the company.
     */
    public String getdescription() { return this.description; }
    /**
     * Description of the company.
     */
    public void setdescription(String value) { this.description = value; }
    /**
     * Website URL for this company.
     */
    public String getwebsite() { return this.website; }
    /**
     * Website URL for this company.
     */
    public void setwebsite(String value) { this.website = value; }
    /**
     * The AppEnrollmentId of the application that imported this company record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this company record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All notes attached to this company.
     * 
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this company.
     * 
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     * 
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     * 
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All contacts attached to this company.
     * 
     * To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     */
    public ContactModel[] getcontacts() { return this.contacts; }
    /**
     * All contacts attached to this company.
     * 
     * To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     */
    public void setcontacts(ContactModel[] value) { this.contacts = value; }
    /**
     * All invoices attached to this company.
     * 
     * To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     */
    public Object[] getinvoices() { return this.invoices; }
    /**
     * All invoices attached to this company.
     * 
     * To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     */
    public void setinvoices(Object[] value) { this.invoices = value; }
    /**
     * All definitions attached to this company.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this company.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this company.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this company.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Classification code definition for this company.
     * 
     * To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     */
    public CodeDefinitionModel getcompanyClassificationCodeDefinition() { return this.companyClassificationCodeDefinition; }
    /**
     * Classification code definition for this company.
     * 
     * To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     */
    public void setcompanyClassificationCodeDefinition(CodeDefinitionModel value) { this.companyClassificationCodeDefinition = value; }
};
