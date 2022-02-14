
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * The CompanySyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the CompanySyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as a [CompanyModel](https://developer.lockstep.io/docs/companymodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class CompanySyncModel
{
    private String erpKey;
    private String companyName;
    private String companyType;
    private String companyStatus;
    private String parentCompanyErpKey;
    private Boolean isActive;
    private String defaultCurrencyCode;
    private String companyLogoUrl;
    private String primaryContactErpKey;
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
    private String modified;
    private String taxId;
    private String dunsNumber;
    private String apEmailAddress;
    private String arEmailAddress;

    /**
     * This is the primary key of the Company record. For this field, you should use whatever the company's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your company records in a database, whatever the primary key for the company table is
     * in the database should be the `ErpKey`.
     *
     * Example: If you use a financial system such as Quickbooks or Xero, look for the primary ID number of the
     * company record within that financial system.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Company record. For this field, you should use whatever the company's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your company records in a database, whatever the primary key for the company table is
     * in the database should be the `ErpKey`.
     *
     * Example: If you use a financial system such as Quickbooks or Xero, look for the primary ID number of the
     * company record within that financial system.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * A friendly, short name of the company.
     *
     * @return The field companyName
     */
    public String getCompanyName() { return this.companyName; }
    /**
     * A friendly, short name of the company.
     *
     * @param value The new value for companyName
     */
    public void setCompanyName(String value) { this.companyName = value; }
    /**
     * This field indicates the type of company. It can be one of a limited number of values: `Company`,
     * `Customer`, `Group`, `Vendor`, or `Third Party`. A company that represents both a customer and a vendor is
     * identified as a `CustomerVendor`.
     *
     * When loading data into Lockstep, you should focus on the distinction between a company that is part of
     * your own enterprise, or a company that is external to your enterprise.
     *
     * For a company that is within your enterprise, you should set this value to be `Company`.
     *
     * For a company that is external to your enterprise, you should set this value to either `Customer`,
     * `Vendor`, `Third Party`, or `CustomerVendor`.  If you don't know what value to choose, select
     * `CustomerVendor`.
     *
     * @return The field companyType
     */
    public String getCompanyType() { return this.companyType; }
    /**
     * This field indicates the type of company. It can be one of a limited number of values: `Company`,
     * `Customer`, `Group`, `Vendor`, or `Third Party`. A company that represents both a customer and a vendor is
     * identified as a `CustomerVendor`.
     *
     * When loading data into Lockstep, you should focus on the distinction between a company that is part of
     * your own enterprise, or a company that is external to your enterprise.
     *
     * For a company that is within your enterprise, you should set this value to be `Company`.
     *
     * For a company that is external to your enterprise, you should set this value to either `Customer`,
     * `Vendor`, `Third Party`, or `CustomerVendor`.  If you don't know what value to choose, select
     * `CustomerVendor`.
     *
     * @param value The new value for companyType
     */
    public void setCompanyType(String value) { this.companyType = value; }
    /**
     * Either `Active` or `Inactive`.
     *
     * @return The field companyStatus
     */
    public String getCompanyStatus() { return this.companyStatus; }
    /**
     * Either `Active` or `Inactive`.
     *
     * @param value The new value for companyStatus
     */
    public void setCompanyStatus(String value) { this.companyStatus = value; }
    /**
     * If this company has a parent company, identify the parent company's `ErpKey` value here. This value should
     * be the original primary key or unique ID of the parent company to this company belongs. This value should
     * match the original ErpKey field on the parent company.
     *
     * If this company is not a child company, leave this field null.
     *
     * @return The field parentCompanyErpKey
     */
    public String getParentCompanyErpKey() { return this.parentCompanyErpKey; }
    /**
     * If this company has a parent company, identify the parent company's `ErpKey` value here. This value should
     * be the original primary key or unique ID of the parent company to this company belongs. This value should
     * match the original ErpKey field on the parent company.
     *
     * If this company is not a child company, leave this field null.
     *
     * @param value The new value for parentCompanyErpKey
     */
    public void setParentCompanyErpKey(String value) { this.parentCompanyErpKey = value; }
    /**
     * This flag indicates whether the company is currently active. An inactive company will be hidden from the
     * user interface but will still be available for querying.
     *
     * @return The field isActive
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * This flag indicates whether the company is currently active. An inactive company will be hidden from the
     * user interface but will still be available for querying.
     *
     * @param value The new value for isActive
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * The default currency code for transactions related to this company.  For a list of currency codes, see
     * [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies). This will be validated by the /api/v1/currencies data set
     *
     * @return The field defaultCurrencyCode
     */
    public String getDefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code for transactions related to this company.  For a list of currency codes, see
     * [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies). This will be validated by the /api/v1/currencies data set
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
     * The `ErpKey` of the primary contact for this company.  This value should match the `ErpKey` value of the
     * [Importing Contacts](https://developer.lockstep.io/docs/importing-contacts) record for the contact table.
     *
     * @return The field primaryContactErpKey
     */
    public String getPrimaryContactErpKey() { return this.primaryContactErpKey; }
    /**
     * The `ErpKey` of the primary contact for this company.  This value should match the `ErpKey` value of the
     * [Importing Contacts](https://developer.lockstep.io/docs/importing-contacts) record for the contact table.
     *
     * @param value The new value for primaryContactErpKey
     */
    public void setPrimaryContactErpKey(String value) { this.primaryContactErpKey = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field address1
     */
    public String getAddress1() { return this.address1; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for address1
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field address2
     */
    public String getAddress2() { return this.address2; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for address2
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field address3
     */
    public String getAddress3() { return this.address3; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for address3
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field city
     */
    public String getCity() { return this.city; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for city
     */
    public void setCity(String value) { this.city = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field stateRegion
     */
    public String getStateRegion() { return this.stateRegion; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for stateRegion
     */
    public void setStateRegion(String value) { this.stateRegion = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field postalCode
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * The company's primary mailing address information This will be validated by the /api/v1/countries data set
     *
     * @return The field country
     */
    public String getCountry() { return this.country; }
    /**
     * The company's primary mailing address information This will be validated by the /api/v1/countries data set
     *
     * @param value The new value for country
     */
    public void setCountry(String value) { this.country = value; }
    /**
     * The main phone number of this company.
     *
     * @return The field phoneNumber
     */
    public String getPhoneNumber() { return this.phoneNumber; }
    /**
     * The main phone number of this company.
     *
     * @param value The new value for phoneNumber
     */
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
    /**
     * The main fax number of this company.
     *
     * @return The field faxNumber
     */
    public String getFaxNumber() { return this.faxNumber; }
    /**
     * The main fax number of this company.
     *
     * @param value The new value for faxNumber
     */
    public void setFaxNumber(String value) { this.faxNumber = value; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * The company's Tax ID number for the appropriate government for this company.
     *
     * @return The field taxId
     */
    public String getTaxId() { return this.taxId; }
    /**
     * The company's Tax ID number for the appropriate government for this company.
     *
     * @param value The new value for taxId
     */
    public void setTaxId(String value) { this.taxId = value; }
    /**
     * The Dun and Bradstreet number for this company, if known.
     *
     * @return The field dunsNumber
     */
    public String getDunsNumber() { return this.dunsNumber; }
    /**
     * The Dun and Bradstreet number for this company, if known.
     *
     * @param value The new value for dunsNumber
     */
    public void setDunsNumber(String value) { this.dunsNumber = value; }
    /**
     * If you know the AP (accounts payable) email address of this company, fill it in here. This is the email
     * address where you would send questions to the company if the company owed you money.
     *
     * @return The field apEmailAddress
     */
    public String getApEmailAddress() { return this.apEmailAddress; }
    /**
     * If you know the AP (accounts payable) email address of this company, fill it in here. This is the email
     * address where you would send questions to the company if the company owed you money.
     *
     * @param value The new value for apEmailAddress
     */
    public void setApEmailAddress(String value) { this.apEmailAddress = value; }
    /**
     * If you know the AR (accounts receivable) email address of this company, fill it in here. This is the email
     * address where you would send questions to the company if you owed this company money.
     *
     * @return The field arEmailAddress
     */
    public String getArEmailAddress() { return this.arEmailAddress; }
    /**
     * If you know the AR (accounts receivable) email address of this company, fill it in here. This is the email
     * address where you would send questions to the company if you owed this company money.
     *
     * @param value The new value for arEmailAddress
     */
    public void setArEmailAddress(String value) { this.arEmailAddress = value; }
};
