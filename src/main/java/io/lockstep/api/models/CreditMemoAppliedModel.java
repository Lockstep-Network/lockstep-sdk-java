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
 * @version    2022.2
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;

public class CreditMemoAppliedModel
{
    private String creditMemoAppliedId;
    private String groupKey;
    private String invoiceId;
    private String creditMemoInvoiceId;
    private String erpKey;
    private Integer entryNumber;
    private Date applyToInvoiceDate;
    private Double creditMemoAppliedAmount;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private AttachmentModel[] attachments;
    private NoteModel[] notes;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform. For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getCreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform. For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setCreditMemoAppliedId(String value) { this.creditMemoAppliedId = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The id of the invoice
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * @param value - The id of the invoice
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * @return The id of the credit memo invoice
     */
    public String getCreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * @param value - The id of the credit memo invoice
     */
    public void setCreditMemoInvoiceId(String value) { this.creditMemoInvoiceId = value; }
    /**
     * @return The unique ID of this record as it was known in its originating financial system. If this company record was imported from a financial system, it will have the value `ErpKey` set to the original primary key number of the record as it was known in the originating financial system. If this record was not imported, this value will be `null`. For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * @param value - The unique ID of this record as it was known in its originating financial system. If this company record was imported from a financial system, it will have the value `ErpKey` set to the original primary key number of the record as it was known in the originating financial system. If this record was not imported, this value will be `null`. For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * @return Reference number for the applied credit memo.
     */
    public Integer getEntryNumber() { return this.entryNumber; }
    /**
     * @param value - Reference number for the applied credit memo.
     */
    public void setEntryNumber(Integer value) { this.entryNumber = value; }
    /**
     * @return Date payment applied to credit memo.
     */
    public Date getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * @param value - Date payment applied to credit memo.
     */
    public void setApplyToInvoiceDate(Date value) { this.applyToInvoiceDate = value; }
    /**
     * @return Amount applied to credit memo.
     */
    public Double getCreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * @param value - Amount applied to credit memo.
     */
    public void setCreditMemoAppliedAmount(Double value) { this.creditMemoAppliedAmount = value; }
    /**
     * @return Date credit memo applied record was created.
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - Date credit memo applied record was created.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The id of the user who created this applied credit memo.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The id of the user who created this applied credit memo.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return Date credit memo applied record was modified.
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - Date credit memo applied record was modified.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return The id of the user who modified this applied credit memo.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - The id of the user who modified this applied credit memo.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * @return AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * @param value - AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * @return All attachments attached to applied Credit Memo. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * @param value - All attachments attached to applied Credit Memo. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * @return All notes attached to this applied Credit Memo. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * @param value - All notes attached to this applied Credit Memo. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * @return All definitions attached to this applied Credit Memo. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * @param value - All definitions attached to this applied Credit Memo. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * @return All values attached to this Credit Memo. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * @param value - All values attached to this Credit Memo. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
