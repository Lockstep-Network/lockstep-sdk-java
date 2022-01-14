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

public class PaymentModel
{
    private String groupKey;
    private String paymentId;
    private String companyId;
    private String erpKey;
    private String paymentType;
    private String tenderType;
    private Boolean isOpen;
    private String memoText;
    private Date paymentDate;
    private Date postDate;
    private Double paymentAmount;
    private Double unappliedAmount;
    private String currencyCode;
    private String referenceCode;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private Boolean isVoided;
    private Boolean inDispute;
    private PaymentAppliedModel[] applications;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform. For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getPaymentId() { return this.paymentId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform. For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setPaymentId(String value) { this.paymentId = value; }
    /**
     * @return The ID of the company to which this payment belongs.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * @param value - The ID of the company to which this payment belongs.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * @return The unique ID of this record as it was known in its originating financial system. If this company record was imported from a financial system, it will have the value `ErpKey` set to the original primary key number of the record as it was known in the originating financial system. If this record was not imported, this value will be `null`. For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * @param value - The unique ID of this record as it was known in its originating financial system. If this company record was imported from a financial system, it will have the value `ErpKey` set to the original primary key number of the record as it was known in the originating financial system. If this record was not imported, this value will be `null`. For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * @return The type of payment, cash or check.
     */
    public String getPaymentType() { return this.paymentType; }
    /**
     * @param value - The type of payment, cash or check.
     */
    public void setPaymentType(String value) { this.paymentType = value; }
    /**
     * @return Cash, check, credit card, wire transfer.
     */
    public String getTenderType() { return this.tenderType; }
    /**
     * @param value - Cash, check, credit card, wire transfer.
     */
    public void setTenderType(String value) { this.tenderType = value; }
    /**
     * @return Has the payment been fully applied?
     */
    public Boolean getIsOpen() { return this.isOpen; }
    /**
     * @param value - Has the payment been fully applied?
     */
    public void setIsOpen(Boolean value) { this.isOpen = value; }
    /**
     * @return Memo or reference text (ex. memo field on a check).
     */
    public String getMemoText() { return this.memoText; }
    /**
     * @param value - Memo or reference text (ex. memo field on a check).
     */
    public void setMemoText(String value) { this.memoText = value; }
    /**
     * @return The date of this payment.
     */
    public Date getPaymentDate() { return this.paymentDate; }
    /**
     * @param value - The date of this payment.
     */
    public void setPaymentDate(Date value) { this.paymentDate = value; }
    /**
     * @return Payment post date.
     */
    public Date getPostDate() { return this.postDate; }
    /**
     * @param value - Payment post date.
     */
    public void setPostDate(Date value) { this.postDate = value; }
    /**
     * @return Total amount of this payment.
     */
    public Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * @param value - Total amount of this payment.
     */
    public void setPaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * @return Unapplied balance of this payment.
     */
    public Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * @param value - Unapplied balance of this payment.
     */
    public void setUnappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * @return Currency of the payment. This will be validated by the /api/v1/currencies data set
     */
    public String getCurrencyCode() { return this.currencyCode; }
    /**
     * @param value - Currency of the payment. This will be validated by the /api/v1/currencies data set
     */
    public void setCurrencyCode(String value) { this.currencyCode = value; }
    /**
     * @return Reference code for the payment for the given Erp system.
     */
    public String getReferenceCode() { return this.referenceCode; }
    /**
     * @param value - Reference code for the payment for the given Erp system.
     */
    public void setReferenceCode(String value) { this.referenceCode = value; }
    /**
     * @return The date on which this record was created.
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - The date on which this record was created.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The ID of the user who created this payment.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The ID of the user who created this payment.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return The date on which this record was last modified.
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - The date on which this record was last modified.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return The ID of the user who last modified this payment.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - The ID of the user who last modified this payment.
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
     * @return Is the payment voided?
     */
    public Boolean getIsVoided() { return this.isVoided; }
    /**
     * @param value - Is the payment voided?
     */
    public void setIsVoided(Boolean value) { this.isVoided = value; }
    /**
     * @return Is the payment in dispute?
     */
    public Boolean getInDispute() { return this.inDispute; }
    /**
     * @param value - Is the payment in dispute?
     */
    public void setInDispute(Boolean value) { this.inDispute = value; }
    /**
     * @return All applications this payment is associated with. To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     */
    public PaymentAppliedModel[] getApplications() { return this.applications; }
    /**
     * @param value - All applications this payment is associated with. To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     */
    public void setApplications(PaymentAppliedModel[] value) { this.applications = value; }
    /**
     * @return All notes attached to this payment. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * @param value - All notes attached to this payment. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * @return All attachments attached to this payment. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * @param value - All attachments attached to this payment. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * @return All definitions attached to this payment. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * @param value - All definitions attached to this payment. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * @return All values attached to this payment. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * @param value - All values attached to this payment. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
