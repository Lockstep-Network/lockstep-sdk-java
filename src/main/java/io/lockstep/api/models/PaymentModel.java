
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
 * @version    2021.39
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
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPaymentId() { return this.paymentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPaymentId(String value) { this.paymentId = value; }
    /**
     * The ID of the company to which this payment belongs.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this payment belongs.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return a {@link java.lang.String} object.
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
     * @param value a {@link java.lang.String} object.
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The type of payment, cash or check.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPaymentType() { return this.paymentType; }
    /**
     * The type of payment, cash or check.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPaymentType(String value) { this.paymentType = value; }
    /**
     * Cash, check, credit card, wire transfer.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTenderType() { return this.tenderType; }
    /**
     * Cash, check, credit card, wire transfer.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setTenderType(String value) { this.tenderType = value; }
    /**
     * Has the payment been fully applied?
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getIsOpen() { return this.isOpen; }
    /**
     * Has the payment been fully applied?
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setIsOpen(Boolean value) { this.isOpen = value; }
    /**
     * Memo or reference text (ex. memo field on a check).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMemoText() { return this.memoText; }
    /**
     * Memo or reference text (ex. memo field on a check).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setMemoText(String value) { this.memoText = value; }
    /**
     * The date of this payment.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getPaymentDate() { return this.paymentDate; }
    /**
     * The date of this payment.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setPaymentDate(Date value) { this.paymentDate = value; }
    /**
     * Payment post date.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getPostDate() { return this.postDate; }
    /**
     * Payment post date.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setPostDate(Date value) { this.postDate = value; }
    /**
     * Total amount of this payment.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this payment.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setPaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this payment.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this payment.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setUnappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * Currency of the payment. This will be validated by the /api/v1/currencies data set
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCurrencyCode() { return this.currencyCode; }
    /**
     * Currency of the payment. This will be validated by the /api/v1/currencies data set
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCurrencyCode(String value) { this.currencyCode = value; }
    /**
     * Reference code for the payment for the given Erp system.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getReferenceCode() { return this.referenceCode; }
    /**
     * Reference code for the payment for the given Erp system.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setReferenceCode(String value) { this.referenceCode = value; }
    /**
     * The date on which this record was created.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * The date on which this record was created.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created this payment.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this payment.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this record was last modified.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * The date on which this record was last modified.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified this payment.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this payment.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Is the payment voided?
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getIsVoided() { return this.isVoided; }
    /**
     * Is the payment voided?
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setIsVoided(Boolean value) { this.isVoided = value; }
    /**
     * Is the payment in dispute?
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getInDispute() { return this.inDispute; }
    /**
     * Is the payment in dispute?
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setInDispute(Boolean value) { this.inDispute = value; }
    /**
     * All applications this payment is associated with.
     * To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.PaymentAppliedModel} objects.
     */
    public PaymentAppliedModel[] getApplications() { return this.applications; }
    /**
     * All applications this payment is associated with.
     * To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.PaymentAppliedModel} objects.
     */
    public void setApplications(PaymentAppliedModel[] value) { this.applications = value; }
    /**
     * All notes attached to this payment.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this payment.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this payment.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this payment.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
