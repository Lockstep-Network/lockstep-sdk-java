
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
 * Represents a cell of a financial report
 */
public class FinancialReportCellModel
{
    private @Nullable String value;

    /**
     * The value of the financial report cell
     *
     * @return The field value
     */
    public @Nullable String getValue() { return this.value; }
    /**
     * The value of the financial report cell
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable String value) { this.value = value; }
};
