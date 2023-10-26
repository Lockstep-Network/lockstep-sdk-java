
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
 * Contains information about a journal entry line
 */
public class JournalEntryLineModel
{
    private @NotNull String journalEntryLineId;
    private @NotNull String journalEntryId;
    private @NotNull String groupKey;
    private @Nullable String appEnrollmentId;
    private @Nullable String erpKey;
    private @Nullable String financialAccountId;
    private @Nullable String accountNumber;
    private @Nullable String accountName;
    private @NotNull Double debit;
    private @NotNull Double credit;
    private @Nullable String currencyCode;
    private @NotNull Double baseDebit;
    private @NotNull Double baseCredit;
    private @Nullable String baseCurrencyCode;
    private @Nullable String sourceCreatedUser;
    private @Nullable String memo;
    private @Nullable Object dimensions;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String sourceModifiedDate;
    private @Nullable JournalEntryModel journalEntry;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field journalEntryLineId
     */
    public @NotNull String getJournalEntryLineId() { return this.journalEntryLineId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for journalEntryLineId
     */
    public void setJournalEntryLineId(@NotNull String value) { this.journalEntryLineId = value; }
    /**
     * The Journal Entry with which this line is associated.
     *
     * @return The field journalEntryId
     */
    public @NotNull String getJournalEntryId() { return this.journalEntryId; }
    /**
     * The Journal Entry with which this line is associated.
     *
     * @param value The new value for journalEntryId
     */
    public void setJournalEntryId(@NotNull String value) { this.journalEntryId = value; }
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
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this journal entry record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public @Nullable String getErpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this journal entry record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@Nullable String value) { this.erpKey = value; }
    /**
     * The Financial Account with which this line is associated.
     *
     * @return The field financialAccountId
     */
    public @Nullable String getFinancialAccountId() { return this.financialAccountId; }
    /**
     * The Financial Account with which this line is associated.
     *
     * @param value The new value for financialAccountId
     */
    public void setFinancialAccountId(@Nullable String value) { this.financialAccountId = value; }
    /**
     * The unique code/identifier assigned to each account in the chart of accounts.
     *
     * @return The field accountNumber
     */
    public @Nullable String getAccountNumber() { return this.accountNumber; }
    /**
     * The unique code/identifier assigned to each account in the chart of accounts.
     *
     * @param value The new value for accountNumber
     */
    public void setAccountNumber(@Nullable String value) { this.accountNumber = value; }
    /**
     * The name of the account.
     *
     * @return The field accountName
     */
    public @Nullable String getAccountName() { return this.accountName; }
    /**
     * The name of the account.
     *
     * @param value The new value for accountName
     */
    public void setAccountName(@Nullable String value) { this.accountName = value; }
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
    public @Nullable String getCurrencyCode() { return this.currencyCode; }
    /**
     * The transaction currency in which the entry is recorded, especially useful for multi-currency environments.
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(@Nullable String value) { this.currencyCode = value; }
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
    public @Nullable String getBaseCurrencyCode() { return this.baseCurrencyCode; }
    /**
     * The base currency in which the entry is recorded, especially useful for multi-currency environments.
     *
     * @param value The new value for baseCurrencyCode
     */
    public void setBaseCurrencyCode(@Nullable String value) { this.baseCurrencyCode = value; }
    /**
     * The ERP’s identifier for the user who recorded the journal entry line.
     *
     * @return The field sourceCreatedUser
     */
    public @Nullable String getSourceCreatedUser() { return this.sourceCreatedUser; }
    /**
     * The ERP’s identifier for the user who recorded the journal entry line.
     *
     * @param value The new value for sourceCreatedUser
     */
    public void setSourceCreatedUser(@Nullable String value) { this.sourceCreatedUser = value; }
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
     * Dimensions for this journal entry line.
     *
     * @return The field dimensions
     */
    public @Nullable Object getDimensions() { return this.dimensions; }
    /**
     * Dimensions for this journal entry line.
     *
     * @param value The new value for dimensions
     */
    public void setDimensions(@Nullable Object value) { this.dimensions = value; }
    /**
     * The date that the journal entry line was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date that the journal entry line was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created the journal entry line.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the journal entry line.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date that the journal entry line was last modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date that the journal entry line was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified the journal entry line.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the journal entry line.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
    /**
     * The date on which this record was last modified in source ERP.
     *
     * @return The field sourceModifiedDate
     */
    public @Nullable String getSourceModifiedDate() { return this.sourceModifiedDate; }
    /**
     * The date on which this record was last modified in source ERP.
     *
     * @param value The new value for sourceModifiedDate
     */
    public void setSourceModifiedDate(@Nullable String value) { this.sourceModifiedDate = value; }
    /**
     * The journal entry for this journal entry line.
     * To retrieve this item, specify `JournalEntry` in the "Include" parameter for your query.
     *
     * @return The field journalEntry
     */
    public @Nullable JournalEntryModel getJournalEntry() { return this.journalEntry; }
    /**
     * The journal entry for this journal entry line.
     * To retrieve this item, specify `JournalEntry` in the "Include" parameter for your query.
     *
     * @param value The new value for journalEntry
     */
    public void setJournalEntry(@Nullable JournalEntryModel value) { this.journalEntry = value; }
};
