
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
 * The ContactSyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the ContactSyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as a [ContactModel](https://developer.lockstep.io/docs/contactmodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class ContactSyncModel
{
    private @NotNull Integer onMatchAction;
    private @Nullable String networkId;
    private @NotNull String erpKey;
    private @NotNull String companyErpKey;
    private @Nullable String companyNetworkId;
    private @Nullable String contactName;
    private @Nullable String contactCode;
    private @Nullable String title;
    private @Nullable String roleCode;
    private @Nullable String emailAddress;
    private @Nullable String phone;
    private @Nullable String fax;
    private @Nullable String address1;
    private @Nullable String address2;
    private @Nullable String address3;
    private @Nullable String city;
    private @Nullable String stateRegion;
    private @Nullable String postalCode;
    private @Nullable String countryCode;
    private @NotNull Boolean isActive;
    private @Nullable String webpageUrl;
    private @Nullable String pictureUrl;
    private @Nullable String created;
    private @Nullable String modified;

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
     * The unique identifier of this object in the Sage Network platform.
     *
     * @return The field networkId
     */
    public @Nullable String getNetworkId() { return this.networkId; }
    /**
     * The unique identifier of this object in the Sage Network platform.
     *
     * @param value The new value for networkId
     */
    public void setNetworkId(@Nullable String value) { this.networkId = value; }
    /**
     * This is the primary key of the Contact record. For this field, you should use whatever the contact's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your contact records in a database, whatever the primary key for the contact table is
     * in the database should be the "ErpKey".
     *
     * As some ERP systems don't maintain a unique key for Contacts, we also support syncing Contacts with ERP keys
     * of the form {prefix}|{index}, for example ContactPrefix|1, ContactPrefix|2 and so on.
     *
     * For this reason, please ensure that your Contact ERP keys don't otherwise contain the '|' symbol or that it
     * is replaced by an alternate symbol if they do.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public @NotNull String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Contact record. For this field, you should use whatever the contact's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your contact records in a database, whatever the primary key for the contact table is
     * in the database should be the "ErpKey".
     *
     * As some ERP systems don't maintain a unique key for Contacts, we also support syncing Contacts with ERP keys
     * of the form {prefix}|{index}, for example ContactPrefix|1, ContactPrefix|2 and so on.
     *
     * For this reason, please ensure that your Contact ERP keys don't otherwise contain the '|' symbol or that it
     * is replaced by an alternate symbol if they do.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@NotNull String value) { this.erpKey = value; }
    /**
     * The original primary key or unique ID of the company to which this contact belongs.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * @return The field companyErpKey
     */
    public @NotNull String getCompanyErpKey() { return this.companyErpKey; }
    /**
     * The original primary key or unique ID of the company to which this contact belongs.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * @param value The new value for companyErpKey
     */
    public void setCompanyErpKey(@NotNull String value) { this.companyErpKey = value; }
    /**
     * The network id of the related Company.
     *
     * @return The field companyNetworkId
     */
    public @Nullable String getCompanyNetworkId() { return this.companyNetworkId; }
    /**
     * The network id of the related Company.
     *
     * @param value The new value for companyNetworkId
     */
    public void setCompanyNetworkId(@Nullable String value) { this.companyNetworkId = value; }
    /**
     * The name of the contact.
     *
     * @return The field contactName
     */
    public @Nullable String getContactName() { return this.contactName; }
    /**
     * The name of the contact.
     *
     * @param value The new value for contactName
     */
    public void setContactName(@Nullable String value) { this.contactName = value; }
    /**
     * A friendly human-readable code that describes this Contact.
     *
     * @return The field contactCode
     */
    public @Nullable String getContactCode() { return this.contactCode; }
    /**
     * A friendly human-readable code that describes this Contact.
     *
     * @param value The new value for contactCode
     */
    public void setContactCode(@Nullable String value) { this.contactCode = value; }
    /**
     * The title of the contact.
     *
     * @return The field title
     */
    public @Nullable String getTitle() { return this.title; }
    /**
     * The title of the contact.
     *
     * @param value The new value for title
     */
    public void setTitle(@Nullable String value) { this.title = value; }
    /**
     * The role code for the contact.
     *
     * @return The field roleCode
     */
    public @Nullable String getRoleCode() { return this.roleCode; }
    /**
     * The role code for the contact.
     *
     * @param value The new value for roleCode
     */
    public void setRoleCode(@Nullable String value) { this.roleCode = value; }
    /**
     * The email address of the contact.
     *
     * @return The field emailAddress
     */
    public @Nullable String getEmailAddress() { return this.emailAddress; }
    /**
     * The email address of the contact.
     *
     * @param value The new value for emailAddress
     */
    public void setEmailAddress(@Nullable String value) { this.emailAddress = value; }
    /**
     * The phone number of the contact.
     *
     * @return The field phone
     */
    public @Nullable String getPhone() { return this.phone; }
    /**
     * The phone number of the contact.
     *
     * @param value The new value for phone
     */
    public void setPhone(@Nullable String value) { this.phone = value; }
    /**
     * The fax number of the contact.
     *
     * @return The field fax
     */
    public @Nullable String getFax() { return this.fax; }
    /**
     * The fax number of the contact.
     *
     * @param value The new value for fax
     */
    public void setFax(@Nullable String value) { this.fax = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field address1
     */
    public @Nullable String getAddress1() { return this.address1; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for address1
     */
    public void setAddress1(@Nullable String value) { this.address1 = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field address2
     */
    public @Nullable String getAddress2() { return this.address2; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for address2
     */
    public void setAddress2(@Nullable String value) { this.address2 = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field address3
     */
    public @Nullable String getAddress3() { return this.address3; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for address3
     */
    public void setAddress3(@Nullable String value) { this.address3 = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field city
     */
    public @Nullable String getCity() { return this.city; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for city
     */
    public void setCity(@Nullable String value) { this.city = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field stateRegion
     */
    public @Nullable String getStateRegion() { return this.stateRegion; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for stateRegion
     */
    public void setStateRegion(@Nullable String value) { this.stateRegion = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field postalCode
     */
    public @Nullable String getPostalCode() { return this.postalCode; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(@Nullable String value) { this.postalCode = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field countryCode
     */
    public @Nullable String getCountryCode() { return this.countryCode; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for countryCode
     */
    public void setCountryCode(@Nullable String value) { this.countryCode = value; }
    /**
     * True if this contact is considered "active".
     *
     * @return The field isActive
     */
    public @NotNull Boolean getIsActive() { return this.isActive; }
    /**
     * True if this contact is considered "active".
     *
     * @param value The new value for isActive
     */
    public void setIsActive(@NotNull Boolean value) { this.isActive = value; }
    /**
     * A webpage URL for more information about this contact.
     *
     * @return The field webpageUrl
     */
    public @Nullable String getWebpageUrl() { return this.webpageUrl; }
    /**
     * A webpage URL for more information about this contact.
     *
     * @param value The new value for webpageUrl
     */
    public void setWebpageUrl(@Nullable String value) { this.webpageUrl = value; }
    /**
     * If available, the URL of a photograph that shows this contact.
     *
     * @return The field pictureUrl
     */
    public @Nullable String getPictureUrl() { return this.pictureUrl; }
    /**
     * If available, the URL of a photograph that shows this contact.
     *
     * @param value The new value for pictureUrl
     */
    public void setPictureUrl(@Nullable String value) { this.pictureUrl = value; }
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
};
