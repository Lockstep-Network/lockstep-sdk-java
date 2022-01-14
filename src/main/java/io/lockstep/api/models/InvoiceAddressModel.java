
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

/**
 * Represents a single address for an invoice
 */
public class InvoiceAddressModel
{
    private String invoiceAddressId;
    private String groupKey;
    private String invoiceId;
    private String line1;
    private String line2;
    private String line3;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private Float latitude;
    private Float longitude;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field invoiceAddressId
     */
    public String getInvoiceAddressId() { return this.invoiceAddressId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for invoiceAddressId
     */
    public void setInvoiceAddressId(String value) { this.invoiceAddressId = value; }
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
     * The ID number of the invoice this address belongs to
     *
     * @return The field invoiceId
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The ID number of the invoice this address belongs to
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * The first line of the address.
     *
     * @return The field line1
     */
    public String getLine1() { return this.line1; }
    /**
     * The first line of the address.
     *
     * @param value The new value for line1
     */
    public void setLine1(String value) { this.line1 = value; }
    /**
     * The second line of the address.
     *
     * @return The field line2
     */
    public String getLine2() { return this.line2; }
    /**
     * The second line of the address.
     *
     * @param value The new value for line2
     */
    public void setLine2(String value) { this.line2 = value; }
    /**
     * The third line of the address.
     *
     * @return The field line3
     */
    public String getLine3() { return this.line3; }
    /**
     * The third line of the address.
     *
     * @param value The new value for line3
     */
    public void setLine3(String value) { this.line3 = value; }
    /**
     * The name of the city for this address.
     *
     * @return The field city
     */
    public String getCity() { return this.city; }
    /**
     * The name of the city for this address.
     *
     * @param value The new value for city
     */
    public void setCity(String value) { this.city = value; }
    /**
     * The state or region part of this address.
     *
     * @return The field region
     */
    public String getRegion() { return this.region; }
    /**
     * The state or region part of this address.
     *
     * @param value The new value for region
     */
    public void setRegion(String value) { this.region = value; }
    /**
     * The postal code for this address.
     *
     * @return The field postalCode
     */
    public String getPostalCode() { return this.postalCode; }
    /**
     * The postal code for this address.
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(String value) { this.postalCode = value; }
    /**
     * The country for this address.
     *
     * @return The field country
     */
    public String getCountry() { return this.country; }
    /**
     * The country for this address.
     *
     * @param value The new value for country
     */
    public void setCountry(String value) { this.country = value; }
    /**
     * The latitude of this address, if available.
     *
     * @return The field latitude
     */
    public Float getLatitude() { return this.latitude; }
    /**
     * The latitude of this address, if available.
     *
     * @param value The new value for latitude
     */
    public void setLatitude(Float value) { this.latitude = value; }
    /**
     * The longitude of this address, if available.
     *
     * @return The field longitude
     */
    public Float getLongitude() { return this.longitude; }
    /**
     * The longitude of this address, if available.
     *
     * @param value The new value for longitude
     */
    public void setLongitude(Float value) { this.longitude = value; }
    /**
     * The date on which this address record was created.
     *
     * @return The field created
     */
    public Date getCreated() { return this.created; }
    /**
     * The date on which this address record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID number of the user who created this address.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this address.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this address record was last modified.
     *
     * @return The field modified
     */
    public Date getModified() { return this.modified; }
    /**
     * The date on which this address record was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this address.
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this address.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
};
