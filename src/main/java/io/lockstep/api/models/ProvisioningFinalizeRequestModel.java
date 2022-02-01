
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


/**
 * Represents the data to finalize onboarding for a user
 */
public class ProvisioningFinalizeRequestModel
{
    private String fullName;
    private String timeZone;
    private String defaultCurrency;
    private CompanyModel company;
    private ErpInfoModel emailConnector;

    /**
     * The full name of the user
     *
     * @return The field fullName
     */
    public String getFullName() { return this.fullName; }
    /**
     * The full name of the user
     *
     * @param value The new value for fullName
     */
    public void setFullName(String value) { this.fullName = value; }
    /**
     * The time zone of the user
     *
     * @return The field timeZone
     */
    public String getTimeZone() { return this.timeZone; }
    /**
     * The time zone of the user
     *
     * @param value The new value for timeZone
     */
    public void setTimeZone(String value) { this.timeZone = value; }
    /**
     * The default currency of the user
     *
     * @return The field defaultCurrency
     */
    public String getDefaultCurrency() { return this.defaultCurrency; }
    /**
     * The default currency of the user
     *
     * @param value The new value for defaultCurrency
     */
    public void setDefaultCurrency(String value) { this.defaultCurrency = value; }
    /**
     * The company information for the user and group
     *
     * @return The field company
     */
    public CompanyModel getCompany() { return this.company; }
    /**
     * The company information for the user and group
     *
     * @param value The new value for company
     */
    public void setCompany(CompanyModel value) { this.company = value; }
    /**
     * Optional connector information needed to enroll user to their email connector
     *
     * @return The field emailConnector
     */
    public ErpInfoModel getEmailConnector() { return this.emailConnector; }
    /**
     * Optional connector information needed to enroll user to their email connector
     *
     * @param value The new value for emailConnector
     */
    public void setEmailConnector(ErpInfoModel value) { this.emailConnector = value; }
};
