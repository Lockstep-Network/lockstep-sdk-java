
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
    private String erpKey;
    private String companyErpKey;
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
    private String created;
    private String modified;

    /**
     * This is the primary key of the Contact record. For this field, you should use whatever the contact's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your contact records in a database, whatever the primary key for the contact table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Contact record. For this field, you should use whatever the contact's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your contact records in a database, whatever the primary key for the contact table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The original primary key or unique ID of the company to which this contact belongs.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * @return The field companyErpKey
     */
    public String getCompanyErpKey() { return this.companyErpKey; }
    /**
     * The original primary key or unique ID of the company to which this contact belongs.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * @param value The new value for companyErpKey
     */
    public void setCompanyErpKey(String value) { this.companyErpKey = value; }
    /**
     * The name of the contact.
     *
     * @return The field contactName
     */
    public String getContactName() { return this.contactName; }
    /**
     * The name of the contact.
     *
     * @param value The new value for contactName
     */
    public void setContactName(String value) { this.contactName = value; }
    /**
     * A friendly human-readable code that describes this Contact.
     *
     * @return The field contactCode
     */
    public String getContactCode() { return this.contactCode; }
    /**
     * A friendly human-readable code that describes this Contact.
     *
     * @param value The new value for contactCode
     */
    public void setContactCode(String value) { this.contactCode = value; }
    /**
     * The title of the contact.
     *
     * @return The field title
     */
    public String getTitle() { return this.title; }
    /**
     * The title of the contact.
     *
     * @param value The new value for title
     */
    public void setTitle(String value) { this.title = value; }
    /**
     * The role code for the contact.
     *
     * @return The field roleCode
     */
    public String getRoleCode() { return this.roleCode; }
    /**
     * The role code for the contact.
     *
     * @param value The new value for roleCode
     */
    public void setRoleCode(String value) { this.roleCode = value; }
    /**
     * The email address of the contact.
     *
     * @return The field emailAddress
     */
    public String getEmailAddress() { return this.emailAddress; }
    /**
     * The email address of the contact.
     *
     * @param value The new value for emailAddress
     */
    public void setEmailAddress(String value) { this.emailAddress = value; }
    /**
     * The phone number of the contact.
     *
     * @return The field phone
     */
    public String getPhone() { return this.phone; }
    /**
     * The phone number of the contact.
     *
     * @param value The new value for phone
     */
    public void setPhone(String value) { this.phone = value; }
    /**
     * The fax number of the contact.
     *
     * @return The field fax
     */
    public String getFax() { return this.fax; }
    /**
     * The fax number of the contact.
     *
     * @param value The new value for fax
     */
    public void setFax(String value) { this.fax = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field address1
     */
    public String getAddress1() { return this.address1; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for address1
     */
    public void setAddress1(String value) { this.address1 = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field address2
     */
    public String getAddress2() { return this.address2; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for address2
     */
    public void setAddress2(String value) { this.address2 = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field address3
     */
    public String getAddress3() { return this.address3; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for address3
     */
    public void setAddress3(String value) { this.address3 = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field city
     */
    public String getCity() { return this.city; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for city
     */
    public void setCity(String value) { this.city = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field stateRegion
     */
    public String getStateRegion() { return this.stateRegion; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for stateRegion
     */
    public void setStateRegion(String value) { this.stateRegion = value; }
    /**
     * The mailing address information for this contact.
     *
     * @return The field postalCode
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * The mailing address information for this contact.
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * The mailing address information for this contact. This will be validated by the /api/v1/countries data set
     *
     * @return The field countryCode
     */
    public String getCountryCode() { return this.countryCode; }
    /**
     * The mailing address information for this contact. This will be validated by the /api/v1/countries data set
     *
     * @param value The new value for countryCode
     */
    public void setCountryCode(String value) { this.countryCode = value; }
    /**
     * True if this contact is considered "active".
     *
     * @return The field isActive
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * True if this contact is considered "active".
     *
     * @param value The new value for isActive
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * A webpage URL for more information about this contact.
     *
     * @return The field webpageUrl
     */
    public String getWebpageUrl() { return this.webpageUrl; }
    /**
     * A webpage URL for more information about this contact.
     *
     * @param value The new value for webpageUrl
     */
    public void setWebpageUrl(String value) { this.webpageUrl = value; }
    /**
     * If available, the URL of a photograph that shows this contact.
     *
     * @return The field pictureUrl
     */
    public String getPictureUrl() { return this.pictureUrl; }
    /**
     * If available, the URL of a photograph that shows this contact.
     *
     * @param value The new value for pictureUrl
     */
    public void setPictureUrl(String value) { this.pictureUrl = value; }
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
};
