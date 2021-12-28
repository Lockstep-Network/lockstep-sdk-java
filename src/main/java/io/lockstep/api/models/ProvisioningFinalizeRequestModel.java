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


public class ProvisioningFinalizeRequestModel
{
    private String fullName;
    private String timeZone;
    private String defaultCurrency;
    private CompanyModel company;
    private ErpInfoModel emailConnector;

    /**
     * The full name of the user
     */
    public String getfullName() { return this.fullName; }
    /**
     * The full name of the user
     */
    public void setfullName(String value) { this.fullName = value; }
    /**
     * The time zone of the user
     */
    public String gettimeZone() { return this.timeZone; }
    /**
     * The time zone of the user
     */
    public void settimeZone(String value) { this.timeZone = value; }
    /**
     * The default currency of the user
     */
    public String getdefaultCurrency() { return this.defaultCurrency; }
    /**
     * The default currency of the user
     */
    public void setdefaultCurrency(String value) { this.defaultCurrency = value; }
    /**
     * The company information for the user and group
     */
    public CompanyModel getcompany() { return this.company; }
    /**
     * The company information for the user and group
     */
    public void setcompany(CompanyModel value) { this.company = value; }
    /**
     * Optional connector information needed to enroll user to their email connector
     */
    public ErpInfoModel getemailConnector() { return this.emailConnector; }
    /**
     * Optional connector information needed to enroll user to their email connector
     */
    public void setemailConnector(ErpInfoModel value) { this.emailConnector = value; }
};
