
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
 * Lockstep.Shared.Models.Sync.ErpWriteSyncSubmitModel`1 represents a request to write back a collection
 *             of requests to the connected AppEnrollment.
 */
public class InsertPaymentRequestModelErpWriteSyncSubmitModel
{
    private @NotNull String appEnrollmentId;
    private @NotNull InsertPaymentRequestModel[] requests;

    /**
     * The connected App Enrollment id.
     *
     * @return The field appEnrollmentId
     */
    public @NotNull String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The connected App Enrollment id.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@NotNull String value) { this.appEnrollmentId = value; }
    /**
     * An array of requests to write back.
     *
     * @return The field requests
     */
    public @NotNull InsertPaymentRequestModel[] getRequests() { return this.requests; }
    /**
     * An array of requests to write back.
     *
     * @param value The new value for requests
     */
    public void setRequests(@NotNull InsertPaymentRequestModel[] value) { this.requests = value; }
};
