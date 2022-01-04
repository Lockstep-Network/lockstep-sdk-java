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
 * @version    2021.39
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


public class LeadModel
{
    private String leadId;
    private String name;
    private String company;
    private String email;
    private String erpSystem;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getLeadId() { return this.leadId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setLeadId(String value) { this.leadId = value; }
    /**
     * Name of lead
     */
    public String getName() { return this.name; }
    /**
     * Name of lead
     */
    public void setName(String value) { this.name = value; }
    /**
     * Name of company of lead
     */
    public String getCompany() { return this.company; }
    /**
     * Name of company of lead
     */
    public void setCompany(String value) { this.company = value; }
    /**
     * Email of lead
     */
    public String getEmail() { return this.email; }
    /**
     * Email of lead
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * Requested ERP of lead
     */
    public String getErpSystem() { return this.erpSystem; }
    /**
     * Requested ERP of lead
     */
    public void setErpSystem(String value) { this.erpSystem = value; }
};
