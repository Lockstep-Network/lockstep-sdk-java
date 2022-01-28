
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
 * @version    2022.4
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Credit Memos reflect credits granted to a customer for various reasons, such as discounts or refunds.
 * Credit Memos may be applied to Invoices as Payments. When a Credit Memo is applied as payment to an Invoice,
 * Lockstep creates a Credit Memo Application record to track the amount from the Credit Memo that was applied
 * as payment to the Invoice. You can examine Credit Memo Application records to track which Invoices were paid
 * using this Credit.
 */
public class CreditMemoAppliedModel
{
    private String creditMemoAppliedId;
    private String groupKey;
    private String invoiceId;
    private String creditMemoInvoiceId;
    private String erpKey;
    private Integer entryNumber;
    private String applyToInvoiceDate;
    private Double creditMemoAppliedAmount;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private AttachmentModel[] attachments;
    private NoteModel[] notes;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field creditMemoAppliedId
     */
    public String getCreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for creditMemoAppliedId
     */
    public void setCreditMemoAppliedId(String value) { this.creditMemoAppliedId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The id of the invoice
     *
     * @return The field invoiceId
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The id of the invoice
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * The id of the credit memo invoice
     *
     * @return The field creditMemoInvoiceId
     */
    public String getCreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * The id of the credit memo invoice
     *
     * @param value The new value for creditMemoInvoiceId
     */
    public void setCreditMemoInvoiceId(String value) { this.creditMemoInvoiceId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * Reference number for the applied credit memo.
     *
     * @return The field entryNumber
     */
    public Integer getEntryNumber() { return this.entryNumber; }
    /**
     * Reference number for the applied credit memo.
     *
     * @param value The new value for entryNumber
     */
    public void setEntryNumber(Integer value) { this.entryNumber = value; }
    /**
     * Date payment applied to credit memo.
     *
     * @return The field applyToInvoiceDate
     */
    public String getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date payment applied to credit memo.
     *
     * @param value The new value for applyToInvoiceDate
     */
    public void setApplyToInvoiceDate(String value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to credit memo.
     *
     * @return The field creditMemoAppliedAmount
     */
    public Double getCreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * Amount applied to credit memo.
     *
     * @param value The new value for creditMemoAppliedAmount
     */
    public void setCreditMemoAppliedAmount(Double value) { this.creditMemoAppliedAmount = value; }
    /**
     * Date credit memo applied record was created.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * Date credit memo applied record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The id of the user who created this applied credit memo.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The id of the user who created this applied credit memo.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date credit memo applied record was modified.
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * Date credit memo applied record was modified.
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * The id of the user who modified this applied credit memo.
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The id of the user who modified this applied credit memo.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All attachments attached to applied Credit Memo.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return The field attachments
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to applied Credit Memo.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value The new value for attachments
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All notes attached to this applied Credit Memo.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return The field notes
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this applied Credit Memo.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value The new value for notes
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All definitions attached to this applied Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldDefinitions
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this applied Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldValues
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
