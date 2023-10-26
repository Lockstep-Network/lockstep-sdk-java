
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
 * The JournalEntrySyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the JournalEntrySyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as a JournalEntryModel
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class JournalEntrySyncModel
{
    private @NotNull Integer onMatchAction;
    private @NotNull String erpKey;
    private @Nullable String journalId;
    private @NotNull Integer source;
    private @NotNull Integer status;
    private @Nullable String description;
    private @Nullable String comment;
    private @Nullable String referenceNumber;
    private @NotNull String sourcePostingDate;
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
     * This is the primary key of the Journal Entry record. For this field, you should use whatever the Journal Entry's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your Journal Entry records in a database, whatever the primary key for the Journal Entry table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public @NotNull String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Journal Entry record. For this field, you should use whatever the Journal Entry's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your Journal Entry records in a database, whatever the primary key for the Journal Entry table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@NotNull String value) { this.erpKey = value; }
    /**
     * The ERP’s identifier for this journal entry, usually has meaning to the user.
     * May be the same value of the ERP Key.
     *
     * @return The field journalId
     */
    public @Nullable String getJournalId() { return this.journalId; }
    /**
     * The ERP’s identifier for this journal entry, usually has meaning to the user.
     * May be the same value of the ERP Key.
     *
     * @param value The new value for journalId
     */
    public void setJournalId(@Nullable String value) { this.journalId = value; }
    /**
     * Possible sources for a Journal Entry.
     *
     * @return The field source
     */
    public @NotNull Integer getSource() { return this.source; }
    /**
     * Possible sources for a Journal Entry.
     *
     * @param value The new value for source
     */
    public void setSource(@NotNull Integer value) { this.source = value; }
    /**
     * Possible statuses for a Journal Entry.
     *
     * @return The field status
     */
    public @NotNull Integer getStatus() { return this.status; }
    /**
     * Possible statuses for a Journal Entry.
     *
     * @param value The new value for status
     */
    public void setStatus(@NotNull Integer value) { this.status = value; }
    /**
     * A brief description explaining the purpose of the journal entry.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * A brief description explaining the purpose of the journal entry.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * An additional comment related to the entry.
     *
     * @return The field comment
     */
    public @Nullable String getComment() { return this.comment; }
    /**
     * An additional comment related to the entry.
     *
     * @param value The new value for comment
     */
    public void setComment(@Nullable String value) { this.comment = value; }
    /**
     * Any reference number or identifier associated with the entry, such as an invoice number or purchase order.
     *
     * @return The field referenceNumber
     */
    public @Nullable String getReferenceNumber() { return this.referenceNumber; }
    /**
     * Any reference number or identifier associated with the entry, such as an invoice number or purchase order.
     *
     * @param value The new value for referenceNumber
     */
    public void setReferenceNumber(@Nullable String value) { this.referenceNumber = value; }
    /**
     * The raw posting date from the source.
     *
     * @return The field sourcePostingDate
     */
    public @NotNull String getSourcePostingDate() { return this.sourcePostingDate; }
    /**
     * The raw posting date from the source.
     *
     * @param value The new value for sourcePostingDate
     */
    public void setSourcePostingDate(@NotNull String value) { this.sourcePostingDate = value; }
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
