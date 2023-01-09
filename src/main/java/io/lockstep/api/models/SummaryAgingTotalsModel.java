
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
 * Represents summary aging bucket total.
 */
public class SummaryAgingTotalsModel
{
    private @Nullable String bucket;
    private @NotNull Double outstandingBalance;

    /**
     * Aging bucket outstanding balance is associated to.
     *
     * @return The field bucket
     */
    public @Nullable String getBucket() { return this.bucket; }
    /**
     * Aging bucket outstanding balance is associated to.
     *
     * @param value The new value for bucket
     */
    public void setBucket(@Nullable String value) { this.bucket = value; }
    /**
     * Aging outstanding balance value.
     *
     * @return The field outstandingBalance
     */
    public @NotNull Double getOutstandingBalance() { return this.outstandingBalance; }
    /**
     * Aging outstanding balance value.
     *
     * @param value The new value for outstandingBalance
     */
    public void setOutstandingBalance(@NotNull Double value) { this.outstandingBalance = value; }
};
