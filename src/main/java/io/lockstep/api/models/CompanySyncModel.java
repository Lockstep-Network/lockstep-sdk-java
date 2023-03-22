
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
    private @NotNull Integer onMatchAction;
    private @NotNull String erpKey;
    private @NotNull String companyName;
    private @NotNull String companyType;
    private @Nullable String parentCompanyErpKey;
    private @NotNull Boolean isActive;
    private @Nullable String defaultCurrencyCode;
    private @Nullable String companyLogoUrl;
    private @Nullable String primaryContactErpKey;
    private @Nullable String address1;
    private @Nullable String address2;
    private @Nullable String address3;
    private @Nullable String city;
    private @Nullable String stateRegion;
    private @Nullable String postalCode;
    private @Nullable String country;
    private @Nullable String phoneNumber;
    private @Nullable String faxNumber;
    private @Nullable String created;
    private @Nullable String modified;
    private @Nullable String taxId;
    private @Nullable String dunsNumber;
    private @Nullable String preferredDeliveryMethod;
    private @Nullable String emailAddress;
    private @Nullable String externalReference;
    private @Nullable String companyRegistrationNumber;

    /**
     * Indicates what action to take when an existing object has been found during the sync process.
     *
     * @return The field onMatchAction
     */
    public @NotNull Integer getOnMatchAction() { return this.onMatchAction; }
    /**
     * Indicates what action to take when an existing object has been found during the sync process.
     *
     * @param value The new value for onMatchAction
     */
    public void setOnMatchAction(@NotNull Integer value) { this.onMatchAction = value; }
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
    public @NotNull String getErpKey() { return this.erpKey; }
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
    public void setErpKey(@NotNull String value) { this.erpKey = value; }
    /**
     * A friendly, short name of the company.
     *
     * @return The field companyName
     */
    public @NotNull String getCompanyName() { return this.companyName; }
    /**
     * A friendly, short name of the company.
     *
     * @param value The new value for companyName
     */
    public void setCompanyName(@NotNull String value) { this.companyName = value; }
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
    public @NotNull String getCompanyType() { return this.companyType; }
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
    public void setCompanyType(@NotNull String value) { this.companyType = value; }
    /**
     * If this company has a parent company, identify the parent company's `ErpKey` value here. This value should
     * be the original primary key or unique ID of the parent company to this company belongs. This value should
     * match the original ErpKey field on the parent company.
     *
     * If this company is not a child company, leave this field null.
     *
     * @return The field parentCompanyErpKey
     */
    public @Nullable String getParentCompanyErpKey() { return this.parentCompanyErpKey; }
    /**
     * If this company has a parent company, identify the parent company's `ErpKey` value here. This value should
     * be the original primary key or unique ID of the parent company to this company belongs. This value should
     * match the original ErpKey field on the parent company.
     *
     * If this company is not a child company, leave this field null.
     *
     * @param value The new value for parentCompanyErpKey
     */
    public void setParentCompanyErpKey(@Nullable String value) { this.parentCompanyErpKey = value; }
    /**
     * This flag indicates whether the company is currently active. An inactive company will be hidden from the
     * user interface but will still be available for querying.
     *
     * @return The field isActive
     */
    public @NotNull Boolean getIsActive() { return this.isActive; }
    /**
     * This flag indicates whether the company is currently active. An inactive company will be hidden from the
     * user interface but will still be available for querying.
     *
     * @param value The new value for isActive
     */
    public void setIsActive(@NotNull Boolean value) { this.isActive = value; }
    /**
     * The default currency code for transactions related to this company.  For a list of currency codes, see
     * [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies).
     *
     * @return The field defaultCurrencyCode
     */
    public @Nullable String getDefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code for transactions related to this company.  For a list of currency codes, see
     * [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies).
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
     * The `ErpKey` of the primary contact for this company.  This value should match the `ErpKey` value of the
     * [Importing Contacts](https://developer.lockstep.io/docs/importing-contacts) record for the contact table.
     *
     * @return The field primaryContactErpKey
     */
    public @Nullable String getPrimaryContactErpKey() { return this.primaryContactErpKey; }
    /**
     * The `ErpKey` of the primary contact for this company.  This value should match the `ErpKey` value of the
     * [Importing Contacts](https://developer.lockstep.io/docs/importing-contacts) record for the contact table.
     *
     * @param value The new value for primaryContactErpKey
     */
    public void setPrimaryContactErpKey(@Nullable String value) { this.primaryContactErpKey = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field address1
     */
    public @Nullable String getAddress1() { return this.address1; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for address1
     */
    public void setAddress1(@Nullable String value) { this.address1 = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field address2
     */
    public @Nullable String getAddress2() { return this.address2; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for address2
     */
    public void setAddress2(@Nullable String value) { this.address2 = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field address3
     */
    public @Nullable String getAddress3() { return this.address3; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for address3
     */
    public void setAddress3(@Nullable String value) { this.address3 = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field city
     */
    public @Nullable String getCity() { return this.city; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for city
     */
    public void setCity(@Nullable String value) { this.city = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field stateRegion
     */
    public @Nullable String getStateRegion() { return this.stateRegion; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for stateRegion
     */
    public void setStateRegion(@Nullable String value) { this.stateRegion = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field postalCode
     */
    public @Nullable String getPostalCode() { return this.postalCode; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(@Nullable String value) { this.postalCode = value; }
    /**
     * The company's primary mailing address information
     *
     * @return The field country
     */
    public @Nullable String getCountry() { return this.country; }
    /**
     * The company's primary mailing address information
     *
     * @param value The new value for country
     */
    public void setCountry(@Nullable String value) { this.country = value; }
    /**
     * The main phone number of this company.
     *
     * @return The field phoneNumber
     */
    public @Nullable String getPhoneNumber() { return this.phoneNumber; }
    /**
     * The main phone number of this company.
     *
     * @param value The new value for phoneNumber
     */
    public void setPhoneNumber(@Nullable String value) { this.phoneNumber = value; }
    /**
     * The main fax number of this company.
     *
     * @return The field faxNumber
     */
    public @Nullable String getFaxNumber() { return this.faxNumber; }
    /**
     * The main fax number of this company.
     *
     * @param value The new value for faxNumber
     */
    public void setFaxNumber(@Nullable String value) { this.faxNumber = value; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @return The field created
     */
    public @Nullable String getCreated() { return this.created; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @param value The new value for created
     */
    public void setCreated(@Nullable String value) { this.created = value; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @return The field modified
     */
    public @Nullable String getModified() { return this.modified; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @param value The new value for modified
     */
    public void setModified(@Nullable String value) { this.modified = value; }
    /**
     * The company's Tax ID number for the appropriate government for this company.
     *
     * @return The field taxId
     */
    public @Nullable String getTaxId() { return this.taxId; }
    /**
     * The company's Tax ID number for the appropriate government for this company.
     *
     * @param value The new value for taxId
     */
    public void setTaxId(@Nullable String value) { this.taxId = value; }
    /**
     * The Dun and Bradstreet number for this company, if known.
     *
     * @return The field dunsNumber
     */
    public @Nullable String getDunsNumber() { return this.dunsNumber; }
    /**
     * The Dun and Bradstreet number for this company, if known.
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
     * The company email address.
     *
     * @return The field emailAddress
     */
    public @Nullable String getEmailAddress() { return this.emailAddress; }
    /**
     * The company email address.
     *
     * @param value The new value for emailAddress
     */
    public void setEmailAddress(@Nullable String value) { this.emailAddress = value; }
    /**
     * An external reference that identifies the Company from the originating ERP system, separate from the ErpKey.
     *
     * @return The field externalReference
     */
    public @Nullable String getExternalReference() { return this.externalReference; }
    /**
     * An external reference that identifies the Company from the originating ERP system, separate from the ErpKey.
     *
     * @param value The new value for externalReference
     */
    public void setExternalReference(@Nullable String value) { this.externalReference = value; }
    /**
     * A unique identification number assigned to the company by the national registration office.
     *
     * @return The field companyRegistrationNumber
     */
    public @Nullable String getCompanyRegistrationNumber() { return this.companyRegistrationNumber; }
    /**
     * A unique identification number assigned to the company by the national registration office.
     *
     * @param value The new value for companyRegistrationNumber
     */
    public void setCompanyRegistrationNumber(@Nullable String value) { this.companyRegistrationNumber = value; }
};
