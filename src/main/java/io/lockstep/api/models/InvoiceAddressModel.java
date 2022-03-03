
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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a single address for an invoice
 */
public class InvoiceAddressModel
{
    private @NotNull String invoiceAddressId;
    private @NotNull String groupKey;
    private @NotNull String invoiceId;
    private @Nullable String line1;
    private @Nullable String line2;
    private @Nullable String line3;
    private @Nullable String city;
    private @Nullable String region;
    private @Nullable String postalCode;
    private @Nullable String country;
    private @Nullable Float latitude;
    private @Nullable Float longitude;
    private @Nullable String created;
    private @Nullable String createdUserId;
    private @Nullable String modified;
    private @Nullable String modifiedUserId;
    private @Nullable String appEnrollmentId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field invoiceAddressId
     */
    public @NotNull String getInvoiceAddressId() { return this.invoiceAddressId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for invoiceAddressId
     */
    public void setInvoiceAddressId(@NotNull String value) { this.invoiceAddressId = value; }
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
     * The ID number of the invoice this address belongs to
     *
     * @return The field invoiceId
     */
    public @NotNull String getInvoiceId() { return this.invoiceId; }
    /**
     * The ID number of the invoice this address belongs to
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@NotNull String value) { this.invoiceId = value; }
    /**
     * The first line of the address.
     *
     * @return The field line1
     */
    public @Nullable String getLine1() { return this.line1; }
    /**
     * The first line of the address.
     *
     * @param value The new value for line1
     */
    public void setLine1(@Nullable String value) { this.line1 = value; }
    /**
     * The second line of the address.
     *
     * @return The field line2
     */
    public @Nullable String getLine2() { return this.line2; }
    /**
     * The second line of the address.
     *
     * @param value The new value for line2
     */
    public void setLine2(@Nullable String value) { this.line2 = value; }
    /**
     * The third line of the address.
     *
     * @return The field line3
     */
    public @Nullable String getLine3() { return this.line3; }
    /**
     * The third line of the address.
     *
     * @param value The new value for line3
     */
    public void setLine3(@Nullable String value) { this.line3 = value; }
    /**
     * The name of the city for this address.
     *
     * @return The field city
     */
    public @Nullable String getCity() { return this.city; }
    /**
     * The name of the city for this address.
     *
     * @param value The new value for city
     */
    public void setCity(@Nullable String value) { this.city = value; }
    /**
     * The state or region part of this address.
     *
     * @return The field region
     */
    public @Nullable String getRegion() { return this.region; }
    /**
     * The state or region part of this address.
     *
     * @param value The new value for region
     */
    public void setRegion(@Nullable String value) { this.region = value; }
    /**
     * The postal code for this address.
     *
     * @return The field postalCode
     */
    public @Nullable String getPostalCode() { return this.postalCode; }
    /**
     * The postal code for this address.
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(@Nullable String value) { this.postalCode = value; }
    /**
     * The country for this address.
     *
     * @return The field country
     */
    public @Nullable String getCountry() { return this.country; }
    /**
     * The country for this address.
     *
     * @param value The new value for country
     */
    public void setCountry(@Nullable String value) { this.country = value; }
    /**
     * The latitude of this address, if available.
     *
     * @return The field latitude
     */
    public @Nullable Float getLatitude() { return this.latitude; }
    /**
     * The latitude of this address, if available.
     *
     * @param value The new value for latitude
     */
    public void setLatitude(@Nullable Float value) { this.latitude = value; }
    /**
     * The longitude of this address, if available.
     *
     * @return The field longitude
     */
    public @Nullable Float getLongitude() { return this.longitude; }
    /**
     * The longitude of this address, if available.
     *
     * @param value The new value for longitude
     */
    public void setLongitude(@Nullable Float value) { this.longitude = value; }
    /**
     * The date on which this address record was created.
     *
     * @return The field created
     */
    public @Nullable String getCreated() { return this.created; }
    /**
     * The date on which this address record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@Nullable String value) { this.created = value; }
    /**
     * The ID number of the user who created this address.
     *
     * @return The field createdUserId
     */
    public @Nullable String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this address.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@Nullable String value) { this.createdUserId = value; }
    /**
     * The date on which this address record was last modified.
     *
     * @return The field modified
     */
    public @Nullable String getModified() { return this.modified; }
    /**
     * The date on which this address record was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@Nullable String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this address.
     *
     * @return The field modifiedUserId
     */
    public @Nullable String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this address.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@Nullable String value) { this.modifiedUserId = value; }
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
};
