
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
 * The FinancialYearSettingSyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the FinancialYearSettingSyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as a [FinancialYearSettingModel](https://developer.lockstep.io/docs/financialyearsettingmodel).
 * Sync is supported for only one FinancialYearSetting per app enrollment and one FinancialYearSetting imported outside of
 * an app enrollment - please submit only one model here.  If multiple models are submitted, only the latest one is considered for Sync.
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class FinancialYearSettingSyncModel
{
    private @NotNull String yearType;
    private @NotNull Integer totalPeriods;
    private @NotNull String startDate;
    private @NotNull String endDate;

    /**
     * The type of financial year, either Calendar or Fiscal.
     *
     * @return The field yearType
     */
    public @NotNull String getYearType() { return this.yearType; }
    /**
     * The type of financial year, either Calendar or Fiscal.
     *
     * @param value The new value for yearType
     */
    public void setYearType(@NotNull String value) { this.yearType = value; }
    /**
     * Total number of periods in the year. For Calendar year types this should always be 12. For Fiscal year types
     * this can either be 12 or 13 for a 4 week 13 period year.
     *
     * @return The field totalPeriods
     */
    public @NotNull Integer getTotalPeriods() { return this.totalPeriods; }
    /**
     * Total number of periods in the year. For Calendar year types this should always be 12. For Fiscal year types
     * this can either be 12 or 13 for a 4 week 13 period year.
     *
     * @param value The new value for totalPeriods
     */
    public void setTotalPeriods(@NotNull Integer value) { this.totalPeriods = value; }
    /**
     * The start date of the financial year. Should be entered in MM-DD format.
     *
     * @return The field startDate
     */
    public @NotNull String getStartDate() { return this.startDate; }
    /**
     * The start date of the financial year. Should be entered in MM-DD format.
     *
     * @param value The new value for startDate
     */
    public void setStartDate(@NotNull String value) { this.startDate = value; }
    /**
     * The end date of the financial year. Should be entered in MM-DD format.
     *
     * @return The field endDate
     */
    public @NotNull String getEndDate() { return this.endDate; }
    /**
     * The end date of the financial year. Should be entered in MM-DD format.
     *
     * @param value The new value for endDate
     */
    public void setEndDate(@NotNull String value) { this.endDate = value; }
};
