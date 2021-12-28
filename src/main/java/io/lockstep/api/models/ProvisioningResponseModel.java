/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
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
     */
    public String getuserName() { return this.userName; }
    /**
     * If provisioning is successful, contains the username of the created user.
     */
    public void setuserName(String value) { this.userName = value; }
    /**
     * If provisioning is successful, contains subscription account name of created user.
     */
    public String getaccountName() { return this.accountName; }
    /**
     * If provisioning is successful, contains subscription account name of created user.
     */
    public void setaccountName(String value) { this.accountName = value; }
    /**
     * If provisioning is successful, contains the unique identifier of the created user.
     */
    public String getuserId() { return this.userId; }
    /**
     * If provisioning is successful, contains the unique identifier of the created user.
     */
    public void setuserId(String value) { this.userId = value; }
    /**
     * If provisioning is successful, contains the group key of the created user.
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * If provisioning is successful, contains the group key of the created user.
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * If provisioning is successful, contains the app enrollment id of the created app enrollment.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * If provisioning is successful, contains the app enrollment id of the created app enrollment.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * if provisioning is successful, contains the sync request id of the sync that was started for the app enrollment.
     */
    public String getsyncRequestId() { return this.syncRequestId; }
    /**
     * if provisioning is successful, contains the sync request id of the sync that was started for the app enrollment.
     */
    public void setsyncRequestId(String value) { this.syncRequestId = value; }
    /**
     * The error message(s).
     */
    public String geterrorMessage() { return this.errorMessage; }
    /**
     * The error message(s).
     */
    public void seterrorMessage(String value) { this.errorMessage = value; }
};
