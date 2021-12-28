/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
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
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getcreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setcreditMemoAppliedId(String value) { this.creditMemoAppliedId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The id of the invoice
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The id of the invoice
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The id of the credit memo invoice
     */
    public String getcreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * The id of the credit memo invoice
     */
    public void setcreditMemoInvoiceId(String value) { this.creditMemoInvoiceId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * Reference number for the applied credit memo.
     */
    public Integer getentryNumber() { return this.entryNumber; }
    /**
     * Reference number for the applied credit memo.
     */
    public void setentryNumber(Integer value) { this.entryNumber = value; }
    /**
     * Date payment applied to credit memo.
     */
    public Date getapplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date payment applied to credit memo.
     */
    public void setapplyToInvoiceDate(Date value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to credit memo.
     */
    public Double getcreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * Amount applied to credit memo.
     */
    public void setcreditMemoAppliedAmount(Double value) { this.creditMemoAppliedAmount = value; }
    /**
     * Date credit memo applied record was created.
     */
    public Date getcreated() { return this.created; }
    /**
     * Date credit memo applied record was created.
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The id of the user who created this applied credit memo.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The id of the user who created this applied credit memo.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date credit memo applied record was modified.
     */
    public Date getmodified() { return this.modified; }
    /**
     * Date credit memo applied record was modified.
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The id of the user who modified this applied credit memo.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The id of the user who modified this applied credit memo.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All attachments attached to applied Credit Memo.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to applied Credit Memo.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All notes attached to this applied Credit Memo.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this applied Credit Memo.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All definitions attached to this applied Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this applied Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
