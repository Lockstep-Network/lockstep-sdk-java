
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Input format used for bulk conversion route
 */
public class BulkCurrencyConversionModel
{
    private @NotNull String date;
    private @NotNull String sourceCurrency;

    /**
     * The date for the currency rate
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * The date for the currency rate
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
    /**
     * The currency code This will be validated by the /api/v1/currencies data set
     *
     * @return The field sourceCurrency
     */
    public @NotNull String getSourceCurrency() { return this.sourceCurrency; }
    /**
     * The currency code This will be validated by the /api/v1/currencies data set
     *
     * @param value The new value for sourceCurrency
     */
    public void setSourceCurrency(@NotNull String value) { this.sourceCurrency = value; }
};
