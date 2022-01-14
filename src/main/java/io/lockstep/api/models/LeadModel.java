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


public class LeadModel
{
    private String leadId;
    private String name;
    private String company;
    private String email;
    private String erpSystem;

    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public String getLeadId() { return this.leadId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public void setLeadId(String value) { this.leadId = value; }
    /**
     * @return Name of lead
     */
    public String getName() { return this.name; }
    /**
     * @param value - Name of lead
     */
    public void setName(String value) { this.name = value; }
    /**
     * @return Name of company of lead
     */
    public String getCompany() { return this.company; }
    /**
     * @param value - Name of company of lead
     */
    public void setCompany(String value) { this.company = value; }
    /**
     * @return Email of lead
     */
    public String getEmail() { return this.email; }
    /**
     * @param value - Email of lead
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * @return Requested ERP of lead
     */
    public String getErpSystem() { return this.erpSystem; }
    /**
     * @param value - Requested ERP of lead
     */
    public void setErpSystem(String value) { this.erpSystem = value; }
};
