
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
 * A summary of companies combined with their most recent magic links
 */
public class CompanyMagicLinkSummaryModel
{
    private @NotNull String companyId;
    private @NotNull String companyName;
    private @Nullable String companyType;
    private @NotNull String groupKey;
    private @Nullable String primaryContactName;
    private @Nullable String primaryContactEmailAddress;
    private @Nullable String pointOfContact;
    private @NotNull Integer outstandingAmount;
    private @NotNull Integer totalOpenInvoices;
    private @NotNull Integer pastDue;
    private @NotNull Integer totalVisits;
    private @NotNull Integer linksSent;
    private @Nullable String latestMagicLinkDate;
    private @Nullable String latestMagicLinkId;
    private @Nullable Integer latestMagicLinkStatus;

    /**
     * The unique id for this company
     *
     * @return The field companyId
     */
    public @NotNull String getCompanyId() { return this.companyId; }
    /**
     * The unique id for this company
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
     * * `CompanyProfile` - Profile for a Company, each Company should have at most 1 profile, used only for Profile Management.
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
     * * `CompanyProfile` - Profile for a Company, each Company should have at most 1 profile, used only for Profile Management.
     *
     * @param value The new value for companyType
     */
    public void setCompanyType(@Nullable String value) { this.companyType = value; }
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
     * The name of the primary contact for this company
     *
     * @return The field primaryContactName
     */
    public @Nullable String getPrimaryContactName() { return this.primaryContactName; }
    /**
     * The name of the primary contact for this company
     *
     * @param value The new value for primaryContactName
     */
    public void setPrimaryContactName(@Nullable String value) { this.primaryContactName = value; }
    /**
     * The email of the primary contact for this company
     *
     * @return The field primaryContactEmailAddress
     */
    public @Nullable String getPrimaryContactEmailAddress() { return this.primaryContactEmailAddress; }
    /**
     * The email of the primary contact for this company
     *
     * @param value The new value for primaryContactEmailAddress
     */
    public void setPrimaryContactEmailAddress(@Nullable String value) { this.primaryContactEmailAddress = value; }
    /**
     * The point of contact for this company
     *
     * @return The field pointOfContact
     */
    public @Nullable String getPointOfContact() { return this.pointOfContact; }
    /**
     * The point of contact for this company
     *
     * @param value The new value for pointOfContact
     */
    public void setPointOfContact(@Nullable String value) { this.pointOfContact = value; }
    /**
     * The total outstanding amount for this company
     *
     * @return The field outstandingAmount
     */
    public @NotNull Integer getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * The total outstanding amount for this company
     *
     * @param value The new value for outstandingAmount
     */
    public void setOutstandingAmount(@NotNull Integer value) { this.outstandingAmount = value; }
    /**
     * The total number of open invoices for this company
     *
     * @return The field totalOpenInvoices
     */
    public @NotNull Integer getTotalOpenInvoices() { return this.totalOpenInvoices; }
    /**
     * The total number of open invoices for this company
     *
     * @param value The new value for totalOpenInvoices
     */
    public void setTotalOpenInvoices(@NotNull Integer value) { this.totalOpenInvoices = value; }
    /**
     * The total number of invoices that are past due for this company
     *
     * @return The field pastDue
     */
    public @NotNull Integer getPastDue() { return this.pastDue; }
    /**
     * The total number of invoices that are past due for this company
     *
     * @param value The new value for pastDue
     */
    public void setPastDue(@NotNull Integer value) { this.pastDue = value; }
    /**
     * Total number of visits for all magic links sent for this company
     *
     * @return The field totalVisits
     */
    public @NotNull Integer getTotalVisits() { return this.totalVisits; }
    /**
     * Total number of visits for all magic links sent for this company
     *
     * @param value The new value for totalVisits
     */
    public void setTotalVisits(@NotNull Integer value) { this.totalVisits = value; }
    /**
     * Total number of sent links for this company
     *
     * @return The field linksSent
     */
    public @NotNull Integer getLinksSent() { return this.linksSent; }
    /**
     * Total number of sent links for this company
     *
     * @param value The new value for linksSent
     */
    public void setLinksSent(@NotNull Integer value) { this.linksSent = value; }
    /**
     * Created date of the most recent magic link made for this company
     *
     * @return The field latestMagicLinkDate
     */
    public @Nullable String getLatestMagicLinkDate() { return this.latestMagicLinkDate; }
    /**
     * Created date of the most recent magic link made for this company
     *
     * @param value The new value for latestMagicLinkDate
     */
    public void setLatestMagicLinkDate(@Nullable String value) { this.latestMagicLinkDate = value; }
    /**
     * Id of the most recent magic link made for this company
     *
     * @return The field latestMagicLinkId
     */
    public @Nullable String getLatestMagicLinkId() { return this.latestMagicLinkId; }
    /**
     * Id of the most recent magic link made for this company
     *
     * @param value The new value for latestMagicLinkId
     */
    public void setLatestMagicLinkId(@Nullable String value) { this.latestMagicLinkId = value; }
    /**
     * Status of the most recent magic link made for this company
     *
     * @return The field latestMagicLinkStatus
     */
    public @Nullable Integer getLatestMagicLinkStatus() { return this.latestMagicLinkStatus; }
    /**
     * Status of the most recent magic link made for this company
     *
     * @param value The new value for latestMagicLinkStatus
     */
    public void setLatestMagicLinkStatus(@Nullable Integer value) { this.latestMagicLinkStatus = value; }
};
