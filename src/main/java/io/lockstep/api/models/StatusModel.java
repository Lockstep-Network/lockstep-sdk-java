
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
 * Represents the status of a user's credentials
 */
public class StatusModel
{
    private @Nullable String userName;
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
    private @Nullable Object dependencies;

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
};
