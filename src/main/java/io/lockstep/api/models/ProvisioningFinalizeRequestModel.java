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
    public String getFullName() { return this.fullName; }
    /**
     * The full name of the user
     */
    public void setFullName(String value) { this.fullName = value; }
    /**
     * The time zone of the user
     */
    public String getTimeZone() { return this.timeZone; }
    /**
     * The time zone of the user
     */
    public void setTimeZone(String value) { this.timeZone = value; }
    /**
     * The default currency of the user
     */
    public String getDefaultCurrency() { return this.defaultCurrency; }
    /**
     * The default currency of the user
     */
    public void setDefaultCurrency(String value) { this.defaultCurrency = value; }
    /**
     * The company information for the user and group
     */
    public CompanyModel getCompany() { return this.company; }
    /**
     * The company information for the user and group
     */
    public void setCompany(CompanyModel value) { this.company = value; }
    /**
     * Optional connector information needed to enroll user to their email connector
     */
    public ErpInfoModel getEmailConnector() { return this.emailConnector; }
    /**
     * Optional connector information needed to enroll user to their email connector
     */
    public void setEmailConnector(ErpInfoModel value) { this.emailConnector = value; }
};
