
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents the data to finalize onboarding for a user
 */
public class ProvisioningFinalizeRequestModel
{
    private @NotNull String fullName;
    private @Nullable String timeZone;
    private @Nullable String defaultCurrency;
    private @Nullable CompanyModel company;
    private @Nullable ErpInfoModel emailConnector;

    /**
     * The full name of the user
     *
     * @return The field fullName
     */
    public @NotNull String getFullName() { return this.fullName; }
    /**
     * The full name of the user
     *
     * @param value The new value for fullName
     */
    public void setFullName(@NotNull String value) { this.fullName = value; }
    /**
     * The time zone of the user
     *
     * @return The field timeZone
     */
    public @Nullable String getTimeZone() { return this.timeZone; }
    /**
     * The time zone of the user
     *
     * @param value The new value for timeZone
     */
    public void setTimeZone(@Nullable String value) { this.timeZone = value; }
    /**
     * The default currency of the user
     *
     * @return The field defaultCurrency
     */
    public @Nullable String getDefaultCurrency() { return this.defaultCurrency; }
    /**
     * The default currency of the user
     *
     * @param value The new value for defaultCurrency
     */
    public void setDefaultCurrency(@Nullable String value) { this.defaultCurrency = value; }
    /**
     * The company information for the user and group
     *
     * @return The field company
     */
    public @Nullable CompanyModel getCompany() { return this.company; }
    /**
     * The company information for the user and group
     *
     * @param value The new value for company
     */
    public void setCompany(@Nullable CompanyModel value) { this.company = value; }
    /**
     * Optional connector information needed to enroll user to their email connector
     *
     * @return The field emailConnector
     */
    public @Nullable ErpInfoModel getEmailConnector() { return this.emailConnector; }
    /**
     * Optional connector information needed to enroll user to their email connector
     *
     * @param value The new value for emailConnector
     */
    public void setEmailConnector(@Nullable ErpInfoModel value) { this.emailConnector = value; }
};
