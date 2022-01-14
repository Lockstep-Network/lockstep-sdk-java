
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


/**
 * Represents the response to either a successful or failed account provisioning
 */
public class ProvisioningResponseModel
{
    private String userName;
    private String accountName;
    private String userId;
    private String groupKey;
    private String appEnrollmentId;
    private String syncRequestId;
    private String errorMessage;

    /**
     * If provisioning is successful, contains the username of the created user.
     *
     * @return The field userName
     */
    public String getUserName() { return this.userName; }
    /**
     * If provisioning is successful, contains the username of the created user.
     *
     * @param value The new value for userName
     */
    public void setUserName(String value) { this.userName = value; }
    /**
     * If provisioning is successful, contains subscription account name of created user.
     *
     * @return The field accountName
     */
    public String getAccountName() { return this.accountName; }
    /**
     * If provisioning is successful, contains subscription account name of created user.
     *
     * @param value The new value for accountName
     */
    public void setAccountName(String value) { this.accountName = value; }
    /**
     * If provisioning is successful, contains the unique identifier of the created user.
     *
     * @return The field userId
     */
    public String getUserId() { return this.userId; }
    /**
     * If provisioning is successful, contains the unique identifier of the created user.
     *
     * @param value The new value for userId
     */
    public void setUserId(String value) { this.userId = value; }
    /**
     * If provisioning is successful, contains the group key of the created user.
     *
     * @return The field groupKey
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * If provisioning is successful, contains the group key of the created user.
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * If provisioning is successful, contains the app enrollment id of the created app enrollment.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * If provisioning is successful, contains the app enrollment id of the created app enrollment.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * if provisioning is successful, contains the sync request id of the sync that was started for the app enrollment.
     *
     * @return The field syncRequestId
     */
    public String getSyncRequestId() { return this.syncRequestId; }
    /**
     * if provisioning is successful, contains the sync request id of the sync that was started for the app enrollment.
     *
     * @param value The new value for syncRequestId
     */
    public void setSyncRequestId(String value) { this.syncRequestId = value; }
    /**
     * The error message(s).
     *
     * @return The field errorMessage
     */
    public String getErrorMessage() { return this.errorMessage; }
    /**
     * The error message(s).
     *
     * @param value The new value for errorMessage
     */
    public void setErrorMessage(String value) { this.errorMessage = value; }
};
