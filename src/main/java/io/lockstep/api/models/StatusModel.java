
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
 * Represents the status of a user's credentials
 */
public class StatusModel
{
    private @Nullable String userName;
    private @Nullable String emailAddress;
    private @Nullable String accountName;
    private @Nullable String accountCompanyId;
    private @Nullable String userId;
    private @Nullable String groupKey;
    private @NotNull Boolean loggedIn;
    private @Nullable String errorMessage;
    private @Nullable String[] roles;
    private @Nullable String lastLoggedIn;
    private @Nullable String apiKeyId;
    private @Nullable String userStatus;
    private @Nullable String environment;
    private @Nullable String version;
    private @Nullable Boolean onboardingScheduled;
    private @Nullable MagicLinkStatusModel magicLink;
    private @Nullable Object dependencies;
    private @Nullable UserGroupModel[] userGroups;
    private @Nullable String baseCurrencyCode;

    /**
     * If authentication is successful, contains the username of the logged-in user.
     *
     * @return The field userName
     */
    public @Nullable String getUserName() { return this.userName; }
    /**
     * If authentication is successful, contains the username of the logged-in user.
     *
     * @param value The new value for userName
     */
    public void setUserName(@Nullable String value) { this.userName = value; }
    /**
     * If authentication is successful, contains the email address of the logged-in user.
     *
     * @return The field emailAddress
     */
    public @Nullable String getEmailAddress() { return this.emailAddress; }
    /**
     * If authentication is successful, contains the email address of the logged-in user.
     *
     * @param value The new value for emailAddress
     */
    public void setEmailAddress(@Nullable String value) { this.emailAddress = value; }
    /**
     * If authentication is successful, contains subscription account name of logged-in user.
     *
     * @return The field accountName
     */
    public @Nullable String getAccountName() { return this.accountName; }
    /**
     * If authentication is successful, contains subscription account name of logged-in user.
     *
     * @param value The new value for accountName
     */
    public void setAccountName(@Nullable String value) { this.accountName = value; }
    /**
     * If authentication is successful, contains subscription account company id of logged-in user.
     *
     * @return The field accountCompanyId
     */
    public @Nullable String getAccountCompanyId() { return this.accountCompanyId; }
    /**
     * If authentication is successful, contains subscription account company id of logged-in user.
     *
     * @param value The new value for accountCompanyId
     */
    public void setAccountCompanyId(@Nullable String value) { this.accountCompanyId = value; }
    /**
     * If authentication is successful, contains the unique identifier of the logged-in user.
     *
     * @return The field userId
     */
    public @Nullable String getUserId() { return this.userId; }
    /**
     * If authentication is successful, contains the unique identifier of the logged-in user.
     *
     * @param value The new value for userId
     */
    public void setUserId(@Nullable String value) { this.userId = value; }
    /**
     * If authentication is successful, contains the group key of the logged-in user.
     *
     * @return The field groupKey
     */
    public @Nullable String getGroupKey() { return this.groupKey; }
    /**
     * If authentication is successful, contains the group key of the logged-in user.
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@Nullable String value) { this.groupKey = value; }
    /**
     * Returns true if authentication for this API was successful.
     *
     * @return The field loggedIn
     */
    public @NotNull Boolean getLoggedIn() { return this.loggedIn; }
    /**
     * Returns true if authentication for this API was successful.
     *
     * @param value The new value for loggedIn
     */
    public void setLoggedIn(@NotNull Boolean value) { this.loggedIn = value; }
    /**
     * The error message.
     *
     * @return The field errorMessage
     */
    public @Nullable String getErrorMessage() { return this.errorMessage; }
    /**
     * The error message.
     *
     * @param value The new value for errorMessage
     */
    public void setErrorMessage(@Nullable String value) { this.errorMessage = value; }
    /**
     * The set of roles for this user.
     *
     * @return The field roles
     */
    public @Nullable String[] getRoles() { return this.roles; }
    /**
     * The set of roles for this user.
     *
     * @param value The new value for roles
     */
    public void setRoles(@Nullable String[] value) { this.roles = value; }
    /**
     * Date and time user has last logged into Azure B2C.
     *
     * @return The field lastLoggedIn
     */
    public @Nullable String getLastLoggedIn() { return this.lastLoggedIn; }
    /**
     * Date and time user has last logged into Azure B2C.
     *
     * @param value The new value for lastLoggedIn
     */
    public void setLastLoggedIn(@Nullable String value) { this.lastLoggedIn = value; }
    /**
     * The id of the API key used to authenticate.
     *
     * @return The field apiKeyId
     */
    public @Nullable String getApiKeyId() { return this.apiKeyId; }
    /**
     * The id of the API key used to authenticate.
     *
     * @param value The new value for apiKeyId
     */
    public void setApiKeyId(@Nullable String value) { this.apiKeyId = value; }
    /**
     * If authentication is successful, contains the user status of the logged-in user.
     *
     * @return The field userStatus
     */
    public @Nullable String getUserStatus() { return this.userStatus; }
    /**
     * If authentication is successful, contains the user status of the logged-in user.
     *
     * @param value The new value for userStatus
     */
    public void setUserStatus(@Nullable String value) { this.userStatus = value; }
    /**
     * The environment currently being used
     *
     * @return The field environment
     */
    public @Nullable String getEnvironment() { return this.environment; }
    /**
     * The environment currently being used
     *
     * @param value The new value for environment
     */
    public void setEnvironment(@Nullable String value) { this.environment = value; }
    /**
     * The version currently being used
     *
     * @return The field version
     */
    public @Nullable String getVersion() { return this.version; }
    /**
     * The version currently being used
     *
     * @param value The new value for version
     */
    public void setVersion(@Nullable String value) { this.version = value; }
    /**
     * If authentication is successful, contains the onboarding session status of the logged-in user's group account.
     *
     * @return The field onboardingScheduled
     */
    public @Nullable Boolean getOnboardingScheduled() { return this.onboardingScheduled; }
    /**
     * If authentication is successful, contains the onboarding session status of the logged-in user's group account.
     *
     * @param value The new value for onboardingScheduled
     */
    public void setOnboardingScheduled(@Nullable Boolean value) { this.onboardingScheduled = value; }
    /**
     * Magic link information about the user
     *
     * @return The field magicLink
     */
    public @Nullable MagicLinkStatusModel getMagicLink() { return this.magicLink; }
    /**
     * Magic link information about the user
     *
     * @param value The new value for magicLink
     */
    public void setMagicLink(@Nullable MagicLinkStatusModel value) { this.magicLink = value; }
    /**
     * Statuses for the dependencies of this api.
     * OK if the dependency is working.
     *
     * @return The field dependencies
     */
    public @Nullable Object getDependencies() { return this.dependencies; }
    /**
     * Statuses for the dependencies of this api.
     * OK if the dependency is working.
     *
     * @param value The new value for dependencies
     */
    public void setDependencies(@Nullable Object value) { this.dependencies = value; }
    /**
     * The set of Groups that the user has access to.
     * You can use the /api/v1/useraccounts/change-group endpoint to change your active group.
     *
     * @return The field userGroups
     */
    public @Nullable UserGroupModel[] getUserGroups() { return this.userGroups; }
    /**
     * The set of Groups that the user has access to.
     * You can use the /api/v1/useraccounts/change-group endpoint to change your active group.
     *
     * @param value The new value for userGroups
     */
    public void setUserGroups(@Nullable UserGroupModel[] value) { this.userGroups = value; }
    /**
     * Base Currency of the group
     *
     * @return The field baseCurrencyCode
     */
    public @Nullable String getBaseCurrencyCode() { return this.baseCurrencyCode; }
    /**
     * Base Currency of the group
     *
     * @param value The new value for baseCurrencyCode
     */
    public void setBaseCurrencyCode(@Nullable String value) { this.baseCurrencyCode = value; }
};
