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
     * @return If authentication is successful, contains the username of the logged-in user.
     */
    public String getUserName() { return this.userName; }
    /**
     * @param value - If authentication is successful, contains the username of the logged-in user.
     */
    public void setUserName(String value) { this.userName = value; }
    /**
     * @return If authentication is successful, contains subscription account name of logged-in user.
     */
    public String getAccountName() { return this.accountName; }
    /**
     * @param value - If authentication is successful, contains subscription account name of logged-in user.
     */
    public void setAccountName(String value) { this.accountName = value; }
    /**
     * @return If authentication is successful, contains subscription account company id of logged-in user.
     */
    public String getAccountCompanyId() { return this.accountCompanyId; }
    /**
     * @param value - If authentication is successful, contains subscription account company id of logged-in user.
     */
    public void setAccountCompanyId(String value) { this.accountCompanyId = value; }
    /**
     * @return If authentication is successful, contains the unique identifier of the logged-in user.
     */
    public String getUserId() { return this.userId; }
    /**
     * @param value - If authentication is successful, contains the unique identifier of the logged-in user.
     */
    public void setUserId(String value) { this.userId = value; }
    /**
     * @return If authentication is successful, contains the group key of the logged-in user.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - If authentication is successful, contains the group key of the logged-in user.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return Returns true if authentication for this API was successful.
     */
    public Boolean getLoggedIn() { return this.loggedIn; }
    /**
     * @param value - Returns true if authentication for this API was successful.
     */
    public void setLoggedIn(Boolean value) { this.loggedIn = value; }
    /**
     * @return The error message.
     */
    public String getErrorMessage() { return this.errorMessage; }
    /**
     * @param value - The error message.
     */
    public void setErrorMessage(String value) { this.errorMessage = value; }
    /**
     * @return The set of roles for this user.
     */
    public String[] getRoles() { return this.roles; }
    /**
     * @param value - The set of roles for this user.
     */
    public void setRoles(String[] value) { this.roles = value; }
    /**
     * @return Date and time user has last logged into Azure B2C.
     */
    public Date getLastLoggedIn() { return this.lastLoggedIn; }
    /**
     * @param value - Date and time user has last logged into Azure B2C.
     */
    public void setLastLoggedIn(Date value) { this.lastLoggedIn = value; }
    /**
     * @return The id of the API key used to authenticate.
     */
    public String getApiKeyId() { return this.apiKeyId; }
    /**
     * @param value - The id of the API key used to authenticate.
     */
    public void setApiKeyId(String value) { this.apiKeyId = value; }
    /**
     * @return If authentication is successful, contains the user status of the logged-in user.
     */
    public String getUserStatus() { return this.userStatus; }
    /**
     * @param value - If authentication is successful, contains the user status of the logged-in user.
     */
    public void setUserStatus(String value) { this.userStatus = value; }
    /**
     * @return The environment currently being used
     */
    public String getEnvironment() { return this.environment; }
    /**
     * @param value - The environment currently being used
     */
    public void setEnvironment(String value) { this.environment = value; }
    /**
     * @return The version currently being used
     */
    public String getVersion() { return this.version; }
    /**
     * @param value - The version currently being used
     */
    public void setVersion(String value) { this.version = value; }
    /**
     * @return Statuses for the dependencies of this api. OK if the dependency is working.
     */
    public Object getDependencies() { return this.dependencies; }
    /**
     * @param value - Statuses for the dependencies of this api. OK if the dependency is working.
     */
    public void setDependencies(Object value) { this.dependencies = value; }
};
