
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
 * Represents the response to either a successful or failed account provisioning
 */
public class ProvisioningResponseModel
{
    private @Nullable String userName;
    private @Nullable String accountName;
    private @Nullable String userId;
    private @Nullable String groupKey;
    private @Nullable String appEnrollmentId;
    private @Nullable String syncRequestId;
    private @Nullable String errorMessage;

    /**
     * If provisioning is successful, contains the username of the created user.
     *
     * @return The field userName
     */
    public @Nullable String getUserName() { return this.userName; }
    /**
     * If provisioning is successful, contains the username of the created user.
     *
     * @param value The new value for userName
     */
    public void setUserName(@Nullable String value) { this.userName = value; }
    /**
     * If provisioning is successful, contains subscription account name of created user.
     *
     * @return The field accountName
     */
    public @Nullable String getAccountName() { return this.accountName; }
    /**
     * If provisioning is successful, contains subscription account name of created user.
     *
     * @param value The new value for accountName
     */
    public void setAccountName(@Nullable String value) { this.accountName = value; }
    /**
     * If provisioning is successful, contains the unique identifier of the created user.
     *
     * @return The field userId
     */
    public @Nullable String getUserId() { return this.userId; }
    /**
     * If provisioning is successful, contains the unique identifier of the created user.
     *
     * @param value The new value for userId
     */
    public void setUserId(@Nullable String value) { this.userId = value; }
    /**
     * If provisioning is successful, contains the group key of the created user.
     *
     * @return The field groupKey
     */
    public @Nullable String getGroupKey() { return this.groupKey; }
    /**
     * If provisioning is successful, contains the group key of the created user.
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@Nullable String value) { this.groupKey = value; }
    /**
     * If provisioning is successful, contains the app enrollment id of the created app enrollment.
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * If provisioning is successful, contains the app enrollment id of the created app enrollment.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * if provisioning is successful, contains the sync request id of the sync that was started for the app enrollment.
     *
     * @return The field syncRequestId
     */
    public @Nullable String getSyncRequestId() { return this.syncRequestId; }
    /**
     * if provisioning is successful, contains the sync request id of the sync that was started for the app enrollment.
     *
     * @param value The new value for syncRequestId
     */
    public void setSyncRequestId(@Nullable String value) { this.syncRequestId = value; }
    /**
     * The error message(s).
     *
     * @return The field errorMessage
     */
    public @Nullable String getErrorMessage() { return this.errorMessage; }
    /**
     * The error message(s).
     *
     * @param value The new value for errorMessage
     */
    public void setErrorMessage(@Nullable String value) { this.errorMessage = value; }
};
