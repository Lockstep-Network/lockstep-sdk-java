
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

import java.util.Date;
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
    private Date lastLoggedIn;
    private String apiKeyId;
    private String userStatus;
    private String environment;
    private String version;
    private Object dependencies;

    /**
     * If authentication is successful, contains the username of the logged-in user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserName() { return this.userName; }
    /**
     * If authentication is successful, contains the username of the logged-in user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setUserName(String value) { this.userName = value; }
    /**
     * If authentication is successful, contains subscription account name of logged-in user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAccountName() { return this.accountName; }
    /**
     * If authentication is successful, contains subscription account name of logged-in user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAccountName(String value) { this.accountName = value; }
    /**
     * If authentication is successful, contains subscription account company id of logged-in user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAccountCompanyId() { return this.accountCompanyId; }
    /**
     * If authentication is successful, contains subscription account company id of logged-in user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAccountCompanyId(String value) { this.accountCompanyId = value; }
    /**
     * If authentication is successful, contains the unique identifier of the logged-in user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserId() { return this.userId; }
    /**
     * If authentication is successful, contains the unique identifier of the logged-in user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setUserId(String value) { this.userId = value; }
    /**
     * If authentication is successful, contains the group key of the logged-in user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * If authentication is successful, contains the group key of the logged-in user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * Returns true if authentication for this API was successful.
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getLoggedIn() { return this.loggedIn; }
    /**
     * Returns true if authentication for this API was successful.
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setLoggedIn(Boolean value) { this.loggedIn = value; }
    /**
     * The error message.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getErrorMessage() { return this.errorMessage; }
    /**
     * The error message.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setErrorMessage(String value) { this.errorMessage = value; }
    /**
     * The set of roles for this user.
     *
     * @return an array of {@link java.lang.String} objects.
     */
    public String[] getRoles() { return this.roles; }
    /**
     * The set of roles for this user.
     *
     * @param value an array of {@link java.lang.String} objects.
     */
    public void setRoles(String[] value) { this.roles = value; }
    /**
     * Date and time user has last logged into Azure B2C.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getLastLoggedIn() { return this.lastLoggedIn; }
    /**
     * Date and time user has last logged into Azure B2C.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setLastLoggedIn(Date value) { this.lastLoggedIn = value; }
    /**
     * The id of the API key used to authenticate.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getApiKeyId() { return this.apiKeyId; }
    /**
     * The id of the API key used to authenticate.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setApiKeyId(String value) { this.apiKeyId = value; }
    /**
     * If authentication is successful, contains the user status of the logged-in user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserStatus() { return this.userStatus; }
    /**
     * If authentication is successful, contains the user status of the logged-in user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setUserStatus(String value) { this.userStatus = value; }
    /**
     * The environment currently being used
     */
    public String getEnvironment() { return this.environment; }
    /**
     * The environment currently being used
     */
    public void setEnvironment(String value) { this.environment = value; }
    /**
     * The version currently being used
     */
    public String getVersion() { return this.version; }
    /**
     * The version currently being used
     */
    public void setVersion(String value) { this.version = value; }
    /**
     * Statuses for the dependencies of this api.
     * OK if the dependency is working.
     *
     * @return a {@link java.lang.Object} object.
     */
    public Object getDependencies() { return this.dependencies; }
    /**
     * Statuses for the dependencies of this api.
     * OK if the dependency is working.
     *
     * @param value a {@link java.lang.Object} object.
     */
    public void setDependencies(Object value) { this.dependencies = value; }
};
