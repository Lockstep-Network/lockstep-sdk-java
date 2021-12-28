/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
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
    public String getleadId() { return this.leadId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setleadId(String value) { this.leadId = value; }
    /**
     * Name of lead
     */
    public String getname() { return this.name; }
    /**
     * Name of lead
     */
    public void setname(String value) { this.name = value; }
    /**
     * Name of company of lead
     */
    public String getcompany() { return this.company; }
    /**
     * Name of company of lead
     */
    public void setcompany(String value) { this.company = value; }
    /**
     * Email of lead
     */
    public String getemail() { return this.email; }
    /**
     * Email of lead
     */
    public void setemail(String value) { this.email = value; }
    /**
     * Requested ERP of lead
     */
    public String geterpSystem() { return this.erpSystem; }
    /**
     * Requested ERP of lead
     */
    public void seterpSystem(String value) { this.erpSystem = value; }
};
