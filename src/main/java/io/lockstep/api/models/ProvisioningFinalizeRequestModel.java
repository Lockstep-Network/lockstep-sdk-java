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


public class ProvisioningFinalizeRequestModel
{
    private String fullName;
    private String timeZone;
    private String defaultCurrency;
    private CompanyModel company;
    private ErpInfoModel emailConnector;

    /**
     * @return The full name of the user
     */
    public String getFullName() { return this.fullName; }
    /**
     * @param value - The full name of the user
     */
    public void setFullName(String value) { this.fullName = value; }
    /**
     * @return The time zone of the user
     */
    public String getTimeZone() { return this.timeZone; }
    /**
     * @param value - The time zone of the user
     */
    public void setTimeZone(String value) { this.timeZone = value; }
    /**
     * @return The default currency of the user
     */
    public String getDefaultCurrency() { return this.defaultCurrency; }
    /**
     * @param value - The default currency of the user
     */
    public void setDefaultCurrency(String value) { this.defaultCurrency = value; }
    /**
     * @return The company information for the user and group
     */
    public CompanyModel getCompany() { return this.company; }
    /**
     * @param value - The company information for the user and group
     */
    public void setCompany(CompanyModel value) { this.company = value; }
    /**
     * @return Optional connector information needed to enroll user to their email connector
     */
    public ErpInfoModel getEmailConnector() { return this.emailConnector; }
    /**
     * @param value - Optional connector information needed to enroll user to their email connector
     */
    public void setEmailConnector(ErpInfoModel value) { this.emailConnector = value; }
};
