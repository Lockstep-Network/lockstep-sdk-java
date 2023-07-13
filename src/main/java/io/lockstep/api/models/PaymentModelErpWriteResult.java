
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
 * Contains results of a write back request
 */
public class PaymentModelErpWriteResult
{
    private @NotNull String appEnrollmentId;
    private @Nullable String erpKey;
    private @NotNull String groupKey;
    private @Nullable String message;
    private @NotNull String syncRequestId;
    private @Nullable PaymentModel[] results;

    /**
     * The id of the connected AppEnrollmentModel
     *
     * @return The field appEnrollmentId
     */
    public @NotNull String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The id of the connected AppEnrollmentModel
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@NotNull String value) { this.appEnrollmentId = value; }
    /**
     * The ErpKey for the object written to the Erp if created
     *
     * @return The field erpKey
     */
    public @Nullable String getErpKey() { return this.erpKey; }
    /**
     * The ErpKey for the object written to the Erp if created
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@Nullable String value) { this.erpKey = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * An optional message to return with the result
     *
     * @return The field message
     */
    public @Nullable String getMessage() { return this.message; }
    /**
     * An optional message to return with the result
     *
     * @param value The new value for message
     */
    public void setMessage(@Nullable String value) { this.message = value; }
    /**
     * The id of the SyncRequestModel the requests were added to
     *
     * @return The field syncRequestId
     */
    public @NotNull String getSyncRequestId() { return this.syncRequestId; }
    /**
     * The id of the SyncRequestModel the requests were added to
     *
     * @param value The new value for syncRequestId
     */
    public void setSyncRequestId(@NotNull String value) { this.syncRequestId = value; }
    /**
     * Results from the ERP write operation
     *
     * @return The field results
     */
    public @Nullable PaymentModel[] getResults() { return this.results; }
    /**
     * Results from the ERP write operation
     *
     * @param value The new value for results
     */
    public void setResults(@Nullable PaymentModel[] value) { this.results = value; }
};
