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
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * The ID of the company to which this payment belongs.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this payment belongs.
     */
    public void setcompanyId(String value) { this.companyId = value; }
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
     * The type of payment, cash or check.
     */
    public String getpaymentType() { return this.paymentType; }
    /**
     * The type of payment, cash or check.
     */
    public void setpaymentType(String value) { this.paymentType = value; }
    /**
     * Cash, check, credit card, wire transfer.
     */
    public String gettenderType() { return this.tenderType; }
    /**
     * Cash, check, credit card, wire transfer.
     */
    public void settenderType(String value) { this.tenderType = value; }
    /**
     * Has the payment been fully applied?
     */
    public Boolean getisOpen() { return this.isOpen; }
    /**
     * Has the payment been fully applied?
     */
    public void setisOpen(Boolean value) { this.isOpen = value; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public String getmemoText() { return this.memoText; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public void setmemoText(String value) { this.memoText = value; }
    /**
     * The date of this payment.
     */
    public Date getpaymentDate() { return this.paymentDate; }
    /**
     * The date of this payment.
     */
    public void setpaymentDate(Date value) { this.paymentDate = value; }
    /**
     * Payment post date.
     */
    public Date getpostDate() { return this.postDate; }
    /**
     * Payment post date.
     */
    public void setpostDate(Date value) { this.postDate = value; }
    /**
     * Total amount of this payment.
     */
    public Double getpaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this payment.
     */
    public void setpaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this payment.
     */
    public Double getunappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this payment.
     */
    public void setunappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * Currency of the payment. This will be validated by the /api/v1/currencies data set
     */
    public String getcurrencyCode() { return this.currencyCode; }
    /**
     * Currency of the payment. This will be validated by the /api/v1/currencies data set
     */
    public void setcurrencyCode(String value) { this.currencyCode = value; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * The date on which this record was created.
     */
    public Date getcreated() { return this.created; }
    /**
     * The date on which this record was created.
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created this payment.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this payment.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this record was last modified.
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date on which this record was last modified.
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified this payment.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this payment.
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
     * Is the payment voided?
     */
    public Boolean getisVoided() { return this.isVoided; }
    /**
     * Is the payment voided?
     */
    public void setisVoided(Boolean value) { this.isVoided = value; }
    /**
     * Is the payment in dispute?
     */
    public Boolean getinDispute() { return this.inDispute; }
    /**
     * Is the payment in dispute?
     */
    public void setinDispute(Boolean value) { this.inDispute = value; }
    /**
     * All applications this payment is associated with.
     * To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     */
    public PaymentAppliedModel[] getapplications() { return this.applications; }
    /**
     * All applications this payment is associated with.
     * To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     */
    public void setapplications(PaymentAppliedModel[] value) { this.applications = value; }
    /**
     * All notes attached to this payment.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this payment.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this payment.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this payment.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
