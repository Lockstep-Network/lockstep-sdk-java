
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
 * The FinancialAccountBalanceHistorySyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the FinancialAccountBalanceHistorySyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * If the FinancialAccountBalanceHistorySyncModels are imported via a connector instead, please ensure that all records are passed in
 * on every sync. Records that are not passed in will be assumed to be deleted.
 *
 * Once imported, this record will be available in the Lockstep API as a [FinancialAccountBalanceHistoryModel](https://developer.lockstep.io/docs/financialaccountbalancehistorymodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class FinancialAccountBalanceHistorySyncModel
{
    private @Nullable String financialAccountCode;
    private @Nullable String financialAccountErpKey;
    private @NotNull Integer financialYear;
    private @NotNull Integer periodNumber;
    private @NotNull String periodStartDate;
    private @NotNull String periodEndDate;
    private @NotNull String status;
    private @NotNull Double balance;
    private @Nullable Integer balanceType;

    /**
     * The code for the Financial Account. Can either be a general ledger or
     * an account code.
     *
     * @return The field financialAccountCode
     */
    public @Nullable String getFinancialAccountCode() { return this.financialAccountCode; }
    /**
     * The code for the Financial Account. Can either be a general ledger or
     * an account code.
     *
     * @param value The new value for financialAccountCode
     */
    public void setFinancialAccountCode(@Nullable String value) { this.financialAccountCode = value; }
    /**
     * This is the primary key of the FinancialAccount record. For this field, you should use whatever the company's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     * Example: If you store your company records in a database, whatever the primary key for the company table is
     * in the database should be the ErpKey.
     * Example: If you use a financial system such as QuickBooks or Xero, look for the primary ID number of the
     * company record within that financial system.
     *
     * @return The field financialAccountErpKey
     */
    public @Nullable String getFinancialAccountErpKey() { return this.financialAccountErpKey; }
    /**
     * This is the primary key of the FinancialAccount record. For this field, you should use whatever the company's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     * Example: If you store your company records in a database, whatever the primary key for the company table is
     * in the database should be the ErpKey.
     * Example: If you use a financial system such as QuickBooks or Xero, look for the primary ID number of the
     * company record within that financial system.
     *
     * @param value The new value for financialAccountErpKey
     */
    public void setFinancialAccountErpKey(@Nullable String value) { this.financialAccountErpKey = value; }
    /**
     * The financial year that this period falls under
     *
     * @return The field financialYear
     */
    public @NotNull Integer getFinancialYear() { return this.financialYear; }
    /**
     * The financial year that this period falls under
     *
     * @param value The new value for financialYear
     */
    public void setFinancialYear(@NotNull Integer value) { this.financialYear = value; }
    /**
     * The period number (1-12 or 1-13) that this balance history is for
     *
     * @return The field periodNumber
     */
    public @NotNull Integer getPeriodNumber() { return this.periodNumber; }
    /**
     * The period number (1-12 or 1-13) that this balance history is for
     *
     * @param value The new value for periodNumber
     */
    public void setPeriodNumber(@NotNull Integer value) { this.periodNumber = value; }
    /**
     * The start date of this period.
     *
     * @return The field periodStartDate
     */
    public @NotNull String getPeriodStartDate() { return this.periodStartDate; }
    /**
     * The start date of this period.
     *
     * @param value The new value for periodStartDate
     */
    public void setPeriodStartDate(@NotNull String value) { this.periodStartDate = value; }
    /**
     * The end date of this period.
     *
     * @return The field periodEndDate
     */
    public @NotNull String getPeriodEndDate() { return this.periodEndDate; }
    /**
     * The end date of this period.
     *
     * @param value The new value for periodEndDate
     */
    public void setPeriodEndDate(@NotNull String value) { this.periodEndDate = value; }
    /**
     * The status of this period. The status should be Closed if the books for this period have been closed,
     * if not the status should be Open. The status can also be Deleted if there was a recalculation that needed
     * to occur, for example due to a change in financial year settings.
     *
     * @return The field status
     */
    public @NotNull String getStatus() { return this.status; }
    /**
     * The status of this period. The status should be Closed if the books for this period have been closed,
     * if not the status should be Open. The status can also be Deleted if there was a recalculation that needed
     * to occur, for example due to a change in financial year settings.
     *
     * @param value The new value for status
     */
    public void setStatus(@NotNull String value) { this.status = value; }
    /**
     * The current or end balance of this period.
     *
     * @return The field balance
     */
    public @NotNull Double getBalance() { return this.balance; }
    /**
     * The current or end balance of this period.
     *
     * @param value The new value for balance
     */
    public void setBalance(@NotNull Double value) { this.balance = value; }
    /**
     * The balance type of this period. If left null, the balance type will be determined by the balance.
     *
     * @return The field balanceType
     */
    public @Nullable Integer getBalanceType() { return this.balanceType; }
    /**
     * The balance type of this period. If left null, the balance type will be determined by the balance.
     *
     * @param value The new value for balanceType
     */
    public void setBalanceType(@Nullable Integer value) { this.balanceType = value; }
};
