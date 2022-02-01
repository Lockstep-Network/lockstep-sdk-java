
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
 * Represents the status of a user's credentials
 */
public class StatusModel
{
    private String userName;
    private String accountName;
    private String accountCompanyId;
    private String userId;
    private String groupKey;
    private Boolean loggedIn;
    private String errorMessage;
    private String[] roles;
    private String lastLoggedIn;
    private String apiKeyId;
    private String userStatus;
    private String environment;
    private String version;
    private Object dependencies;

    /**
     * If authentication is successful, contains the username of the logged-in user.
     *
     * @return The field userName
     */
    public String getUserName() { return this.userName; }
    /**
     * If authentication is successful, contains the username of the logged-in user.
     *
     * @param value The new value for userName
     */
    public void setUserName(String value) { this.userName = value; }
    /**
     * If authentication is successful, contains subscription account name of logged-in user.
     *
     * @return The field accountName
     */
    public String getAccountName() { return this.accountName; }
    /**
     * If authentication is successful, contains subscription account name of logged-in user.
     *
     * @param value The new value for accountName
     */
    public void setAccountName(String value) { this.accountName = value; }
    /**
     * If authentication is successful, contains subscription account company id of logged-in user.
     *
     * @return The field accountCompanyId
     */
    public String getAccountCompanyId() { return this.accountCompanyId; }
    /**
     * If authentication is successful, contains subscription account company id of logged-in user.
     *
     * @param value The new value for accountCompanyId
     */
    public void setAccountCompanyId(String value) { this.accountCompanyId = value; }
    /**
     * If authentication is successful, contains the unique identifier of the logged-in user.
     *
     * @return The field userId
     */
    public String getUserId() { return this.userId; }
    /**
     * If authentication is successful, contains the unique identifier of the logged-in user.
     *
     * @param value The new value for userId
     */
    public void setUserId(String value) { this.userId = value; }
    /**
     * If authentication is successful, contains the group key of the logged-in user.
     *
     * @return The field groupKey
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * If authentication is successful, contains the group key of the logged-in user.
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * Returns true if authentication for this API was successful.
     *
     * @return The field loggedIn
     */
    public Boolean getLoggedIn() { return this.loggedIn; }
    /**
     * Returns true if authentication for this API was successful.
     *
     * @param value The new value for loggedIn
     */
    public void setLoggedIn(Boolean value) { this.loggedIn = value; }
    /**
     * The error message.
     *
     * @return The field errorMessage
     */
    public String getErrorMessage() { return this.errorMessage; }
    /**
     * The error message.
     *
     * @param value The new value for errorMessage
     */
    public void setErrorMessage(String value) { this.errorMessage = value; }
    /**
     * The set of roles for this user.
     *
     * @return The field roles
     */
    public String[] getRoles() { return this.roles; }
    /**
     * The set of roles for this user.
     *
     * @param value The new value for roles
     */
    public void setRoles(String[] value) { this.roles = value; }
    /**
     * Date and time user has last logged into Azure B2C.
     *
     * @return The field lastLoggedIn
     */
    public String getLastLoggedIn() { return this.lastLoggedIn; }
    /**
     * Date and time user has last logged into Azure B2C.
     *
     * @param value The new value for lastLoggedIn
     */
    public void setLastLoggedIn(String value) { this.lastLoggedIn = value; }
    /**
     * The id of the API key used to authenticate.
     *
     * @return The field apiKeyId
     */
    public String getApiKeyId() { return this.apiKeyId; }
    /**
     * The id of the API key used to authenticate.
     *
     * @param value The new value for apiKeyId
     */
    public void setApiKeyId(String value) { this.apiKeyId = value; }
    /**
     * If authentication is successful, contains the user status of the logged-in user.
     *
     * @return The field userStatus
     */
    public String getUserStatus() { return this.userStatus; }
    /**
     * If authentication is successful, contains the user status of the logged-in user.
     *
     * @param value The new value for userStatus
     */
    public void setUserStatus(String value) { this.userStatus = value; }
    /**
     * The environment currently being used
     *
     * @return The field environment
     */
    public String getEnvironment() { return this.environment; }
    /**
     * The environment currently being used
     *
     * @param value The new value for environment
     */
    public void setEnvironment(String value) { this.environment = value; }
    /**
     * The version currently being used
     *
     * @return The field version
     */
    public String getVersion() { return this.version; }
    /**
     * The version currently being used
     *
     * @param value The new value for version
     */
    public void setVersion(String value) { this.version = value; }
    /**
     * Statuses for the dependencies of this api.
     * OK if the dependency is working.
     *
     * @return The field dependencies
     */
    public Object getDependencies() { return this.dependencies; }
    /**
     * Statuses for the dependencies of this api.
     * OK if the dependency is working.
     *
     * @param value The new value for dependencies
     */
    public void setDependencies(Object value) { this.dependencies = value; }
};
