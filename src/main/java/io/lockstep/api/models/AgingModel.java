
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
 * Represents an aging record
 */
public class AgingModel
{
    private @NotNull Integer bucket;
    private @Nullable String currencyCode;
    private @NotNull Double outstandingBalance;

    /**
     * Aging bucket of outstanding balance data (days past due date of invoice)
     *
     * @return The field bucket
     */
    public @NotNull Integer getBucket() { return this.bucket; }
    /**
     * Aging bucket of outstanding balance data (days past due date of invoice)
     *
     * @param value The new value for bucket
     */
    public void setBucket(@NotNull Integer value) { this.bucket = value; }
    /**
     * Currency code of aging bucket
     *
     * @return The field currencyCode
     */
    public @Nullable String getCurrencyCode() { return this.currencyCode; }
    /**
     * Currency code of aging bucket
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(@Nullable String value) { this.currencyCode = value; }
    /**
     * Outstanding balance for the given aging bucket
     *
     * @return The field outstandingBalance
     */
    public @NotNull Double getOutstandingBalance() { return this.outstandingBalance; }
    /**
     * Outstanding balance for the given aging bucket
     *
     * @param value The new value for outstandingBalance
     */
    public void setOutstandingBalance(@NotNull Double value) { this.outstandingBalance = value; }
};
