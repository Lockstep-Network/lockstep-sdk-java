
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
 * Represents leads for creating new ERP connectors
 */
public class LeadModel
{
    private @NotNull String leadId;
    private @Nullable String name;
    private @Nullable String company;
    private @Nullable String email;
    private @Nullable String erpSystem;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field leadId
     */
    public @NotNull String getLeadId() { return this.leadId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for leadId
     */
    public void setLeadId(@NotNull String value) { this.leadId = value; }
    /**
     * Name of lead
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * Name of lead
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Name of company of lead
     *
     * @return The field company
     */
    public @Nullable String getCompany() { return this.company; }
    /**
     * Name of company of lead
     *
     * @param value The new value for company
     */
    public void setCompany(@Nullable String value) { this.company = value; }
    /**
     * Email of lead
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     * Email of lead
     *
     * @param value The new value for email
     */
    public void setEmail(@Nullable String value) { this.email = value; }
    /**
     * Requested ERP of lead
     *
     * @return The field erpSystem
     */
    public @Nullable String getErpSystem() { return this.erpSystem; }
    /**
     * Requested ERP of lead
     *
     * @param value The new value for erpSystem
     */
    public void setErpSystem(@Nullable String value) { this.erpSystem = value; }
};
