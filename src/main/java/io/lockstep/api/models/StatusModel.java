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
 * @version    2021.39
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
    private Object dependencies;

    /**
     * If authentication is successful, contains the username of the logged-in user.
     */
    public String getUserName() { return this.userName; }
    /**
     * If authentication is successful, contains the username of the logged-in user.
     */
    public void setUserName(String value) { this.userName = value; }
    /**
     * If authentication is successful, contains subscription account name of logged-in user.
     */
    public String getAccountName() { return this.accountName; }
    /**
     * If authentication is successful, contains subscription account name of logged-in user.
     */
    public void setAccountName(String value) { this.accountName = value; }
    /**
     * If authentication is successful, contains subscription account company id of logged-in user.
     */
    public String getAccountCompanyId() { return this.accountCompanyId; }
    /**
     * If authentication is successful, contains subscription account company id of logged-in user.
     */
    public void setAccountCompanyId(String value) { this.accountCompanyId = value; }
    /**
     * If authentication is successful, contains the unique identifier of the logged-in user.
     */
    public String getUserId() { return this.userId; }
    /**
     * If authentication is successful, contains the unique identifier of the logged-in user.
     */
    public void setUserId(String value) { this.userId = value; }
    /**
     * If authentication is successful, contains the group key of the logged-in user.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * If authentication is successful, contains the group key of the logged-in user.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * Returns true if authentication for this API was successful.
     */
    public Boolean getLoggedIn() { return this.loggedIn; }
    /**
     * Returns true if authentication for this API was successful.
     */
    public void setLoggedIn(Boolean value) { this.loggedIn = value; }
    /**
     * The error message.
     */
    public String getErrorMessage() { return this.errorMessage; }
    /**
     * The error message.
     */
    public void setErrorMessage(String value) { this.errorMessage = value; }
    /**
     * The set of roles for this user.
     */
    public String[] getRoles() { return this.roles; }
    /**
     * The set of roles for this user.
     */
    public void setRoles(String[] value) { this.roles = value; }
    /**
     * Date and time user has last logged into Azure B2C.
     */
    public Date getLastLoggedIn() { return this.lastLoggedIn; }
    /**
     * Date and time user has last logged into Azure B2C.
     */
    public void setLastLoggedIn(Date value) { this.lastLoggedIn = value; }
    /**
     * The id of the API key used to authenticate.
     */
    public String getApiKeyId() { return this.apiKeyId; }
    /**
     * The id of the API key used to authenticate.
     */
    public void setApiKeyId(String value) { this.apiKeyId = value; }
    /**
     * If authentication is successful, contains the user status of the logged-in user.
     */
    public String getUserStatus() { return this.userStatus; }
    /**
     * If authentication is successful, contains the user status of the logged-in user.
     */
    public void setUserStatus(String value) { this.userStatus = value; }
    /**
     * Statuses for the dependencies of this api.
     * OK if the dependency is working.
     */
    public Object getDependencies() { return this.dependencies; }
    /**
     * Statuses for the dependencies of this api.
     * OK if the dependency is working.
     */
    public void setDependencies(Object value) { this.dependencies = value; }
};
