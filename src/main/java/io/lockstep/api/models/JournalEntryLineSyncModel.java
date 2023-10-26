
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
 * The JournalEntryLineSyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the JournalEntryLineSyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as a JournalEntryLineModel
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class JournalEntryLineSyncModel
{
    private @NotNull Integer onMatchAction;
    private @NotNull String erpKey;
    private @NotNull String journalEntryErpKey;
    private @Nullable String financialAccountErpKey;
    private @NotNull String accountNumber;
    private @NotNull String accountName;
    private @NotNull Double debit;
    private @NotNull Double credit;
    private @NotNull String currencyCode;
    private @NotNull Double baseDebit;
    private @NotNull Double baseCredit;
    private @NotNull String baseCurrencyCode;
    private @NotNull String sourceCreatedUser;
    private @Nullable String memo;
    private @Nullable Object dimensions;
    private @Nullable String created;
    private @Nullable String modified;

    /**
     * Indicates what action to take when an existing object has been found during the sync process.
     *
     * @return The field onMatchAction
     */
    public @NotNull Integer getOnMatchAction() { return this.onMatchAction; }
    /**
     * Indicates what action to take when an existing object has been found during the sync process.
     *
     * @param value The new value for onMatchAction
     */
    public void setOnMatchAction(@NotNull Integer value) { this.onMatchAction = value; }
    /**
     * This is the primary key of the Journal Entry Line record. For this field, you should use whatever the Journal Entry Line's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your Journal Entry Line records in a database, whatever the primary key for the Journal Entry Line table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public @NotNull String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Journal Entry Line record. For this field, you should use whatever the Journal Entry Line's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your Journal Entry Line records in a database, whatever the primary key for the Journal Entry Line table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@NotNull String value) { this.erpKey = value; }
    /**
     * The original primary key or unique ID of the journal entry to which this line belongs.  This value should
     * match the Journal Entry ErpKey field on the JournalEntrySyncModel.
     *
     * @return The field journalEntryErpKey
     */
    public @NotNull String getJournalEntryErpKey() { return this.journalEntryErpKey; }
    /**
     * The original primary key or unique ID of the journal entry to which this line belongs.  This value should
     * match the Journal Entry ErpKey field on the JournalEntrySyncModel.
     *
     * @param value The new value for journalEntryErpKey
     */
    public void setJournalEntryErpKey(@NotNull String value) { this.journalEntryErpKey = value; }
    /**
     * An optional Financial Account with which this line is associated. This value should
     * match the Financial Account ErpKey field on the FinancialAccountSyncModel.
     *
     * @return The field financialAccountErpKey
     */
    public @Nullable String getFinancialAccountErpKey() { return this.financialAccountErpKey; }
    /**
     * An optional Financial Account with which this line is associated. This value should
     * match the Financial Account ErpKey field on the FinancialAccountSyncModel.
     *
     * @param value The new value for financialAccountErpKey
     */
    public void setFinancialAccountErpKey(@Nullable String value) { this.financialAccountErpKey = value; }
    /**
     * The unique code/identifier assigned to each account in the chart of accounts.
     *
     * @return The field accountNumber
     */
    public @NotNull String getAccountNumber() { return this.accountNumber; }
    /**
     * The unique code/identifier assigned to each account in the chart of accounts.
     *
     * @param value The new value for accountNumber
     */
    public void setAccountNumber(@NotNull String value) { this.accountNumber = value; }
    /**
     * The name of the account.
     *
     * @return The field accountName
     */
    public @NotNull String getAccountName() { return this.accountName; }
    /**
     * The name of the account.
     *
     * @param value The new value for accountName
     */
    public void setAccountName(@NotNull String value) { this.accountName = value; }
    /**
     * Debit to account.
     *
     * @return The field debit
     */
    public @NotNull Double getDebit() { return this.debit; }
    /**
     * Debit to account.
     *
     * @param value The new value for debit
     */
    public void setDebit(@NotNull Double value) { this.debit = value; }
    /**
     * Credit to account.
     *
     * @return The field credit
     */
    public @NotNull Double getCredit() { return this.credit; }
    /**
     * Credit to account.
     *
     * @param value The new value for credit
     */
    public void setCredit(@NotNull Double value) { this.credit = value; }
    /**
     * The transaction currency in which the entry is recorded, especially useful for multi-currency environments.
     *
     * @return The field currencyCode
     */
    public @NotNull String getCurrencyCode() { return this.currencyCode; }
    /**
     * The transaction currency in which the entry is recorded, especially useful for multi-currency environments.
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(@NotNull String value) { this.currencyCode = value; }
    /**
     * The base currency debit amount for the account.
     *
     * @return The field baseDebit
     */
    public @NotNull Double getBaseDebit() { return this.baseDebit; }
    /**
     * The base currency debit amount for the account.
     *
     * @param value The new value for baseDebit
     */
    public void setBaseDebit(@NotNull Double value) { this.baseDebit = value; }
    /**
     * The base currency credit amount for the account.
     *
     * @return The field baseCredit
     */
    public @NotNull Double getBaseCredit() { return this.baseCredit; }
    /**
     * The base currency credit amount for the account.
     *
     * @param value The new value for baseCredit
     */
    public void setBaseCredit(@NotNull Double value) { this.baseCredit = value; }
    /**
     * The base currency in which the entry is recorded, especially useful for multi-currency environments.
     *
     * @return The field baseCurrencyCode
     */
    public @NotNull String getBaseCurrencyCode() { return this.baseCurrencyCode; }
    /**
     * The base currency in which the entry is recorded, especially useful for multi-currency environments.
     *
     * @param value The new value for baseCurrencyCode
     */
    public void setBaseCurrencyCode(@NotNull String value) { this.baseCurrencyCode = value; }
    /**
     * The ERP’s identifier for the user who recorded the journal entry line.
     *
     * @return The field sourceCreatedUser
     */
    public @NotNull String getSourceCreatedUser() { return this.sourceCreatedUser; }
    /**
     * The ERP’s identifier for the user who recorded the journal entry line.
     *
     * @param value The new value for sourceCreatedUser
     */
    public void setSourceCreatedUser(@NotNull String value) { this.sourceCreatedUser = value; }
    /**
     * A memo related to this line.
     *
     * @return The field memo
     */
    public @Nullable String getMemo() { return this.memo; }
    /**
     * A memo related to this line.
     *
     * @param value The new value for memo
     */
    public void setMemo(@Nullable String value) { this.memo = value; }
    /**
     * A JSON string representing the dimensions for this journal entry line.
     *
     * @return The field dimensions
     */
    public @Nullable Object getDimensions() { return this.dimensions; }
    /**
     * A JSON string representing the dimensions for this journal entry line.
     *
     * @param value The new value for dimensions
     */
    public void setDimensions(@Nullable Object value) { this.dimensions = value; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @return The field created
     */
    public @Nullable String getCreated() { return this.created; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @param value The new value for created
     */
    public void setCreated(@Nullable String value) { this.created = value; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @return The field modified
     */
    public @Nullable String getModified() { return this.modified; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @param value The new value for modified
     */
    public void setModified(@Nullable String value) { this.modified = value; }
};
