
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
     * @return a {@link java.lang.String} object.
     */
    public String getUserName() { return this.userName; }
    /**
     * If provisioning is successful, contains the username of the created user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setUserName(String value) { this.userName = value; }
    /**
     * If provisioning is successful, contains subscription account name of created user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAccountName() { return this.accountName; }
    /**
     * If provisioning is successful, contains subscription account name of created user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAccountName(String value) { this.accountName = value; }
    /**
     * If provisioning is successful, contains the unique identifier of the created user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserId() { return this.userId; }
    /**
     * If provisioning is successful, contains the unique identifier of the created user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setUserId(String value) { this.userId = value; }
    /**
     * If provisioning is successful, contains the group key of the created user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * If provisioning is successful, contains the group key of the created user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * If provisioning is successful, contains the app enrollment id of the created app enrollment.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * If provisioning is successful, contains the app enrollment id of the created app enrollment.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * if provisioning is successful, contains the sync request id of the sync that was started for the app enrollment.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSyncRequestId() { return this.syncRequestId; }
    /**
     * if provisioning is successful, contains the sync request id of the sync that was started for the app enrollment.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setSyncRequestId(String value) { this.syncRequestId = value; }
    /**
     * The error message(s).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getErrorMessage() { return this.errorMessage; }
    /**
     * The error message(s).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setErrorMessage(String value) { this.errorMessage = value; }
};
