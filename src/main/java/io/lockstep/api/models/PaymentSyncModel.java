
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * The PaymentSyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the PaymentSyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as a [PaymentModel](https://developer.lockstep.io/docs/paymentmodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class PaymentSyncModel
{
    private String erpKey;
    private String companyErpKey;
    private String paymentType;
    private String tenderType;
    private Boolean isOpen;
    private String memoText;
    private String paymentDate;
    private String postDate;
    private Double paymentAmount;
    private Double unappliedAmount;
    private String currencyCode;
    private String created;
    private String modified;
    private String referenceCode;
    private Boolean isVoided;
    private Boolean inDispute;

    /**
     * This is the primary key of the Payment record. For this field, you should use whatever the payment's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your payment records in a database, whatever the primary key for the payment table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Payment record. For this field, you should use whatever the payment's unique
     * identifying number is in the originating system. Search for a unique, non-changing number within the
     * originating financial system for this record.
     *
     * Example: If you store your payment records in a database, whatever the primary key for the payment table is
     * in the database should be the "ErpKey".
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The original primary key or unique ID of the company to which this payment belongs.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * @return The field companyErpKey
     */
    public String getCompanyErpKey() { return this.companyErpKey; }
    /**
     * The original primary key or unique ID of the company to which this payment belongs.  This value should
     * match the [Company ErpKey](https://developer.lockstep.io/docs/importing-companies#erpkey) field on the
     * [CompanySyncModel](https://developer.lockstep.io/docs/importing-companies).
     *
     * @param value The new value for companyErpKey
     */
    public void setCompanyErpKey(String value) { this.companyErpKey = value; }
    /**
     * The type of payment, cash or check.
     *
     * Recognized PaymentType values are:
     * * `Cash` - A cash payment or other direct transfer.
     * * `Check` - A check payment.
     *
     * @return The field paymentType
     */
    public String getPaymentType() { return this.paymentType; }
    /**
     * The type of payment, cash or check.
     *
     * Recognized PaymentType values are:
     * * `Cash` - A cash payment or other direct transfer.
     * * `Check` - A check payment.
     *
     * @param value The new value for paymentType
     */
    public void setPaymentType(String value) { this.paymentType = value; }
    /**
     * Cash, check, credit card, wire transfer.
     *
     * Recognized TenderType values are:
     * * `Cash` - A cash payment or other direct transfer.
     * * `Check` - A check payment.
     * * `Credit Card` - A payment made via a credit card.
     * * `Wire Transfer` - A payment made via wire transfer from another financial institution.
     *
     * @return The field tenderType
     */
    public String getTenderType() { return this.tenderType; }
    /**
     * Cash, check, credit card, wire transfer.
     *
     * Recognized TenderType values are:
     * * `Cash` - A cash payment or other direct transfer.
     * * `Check` - A check payment.
     * * `Credit Card` - A payment made via a credit card.
     * * `Wire Transfer` - A payment made via wire transfer from another financial institution.
     *
     * @param value The new value for tenderType
     */
    public void setTenderType(String value) { this.tenderType = value; }
    /**
     * True if this payment includes some unassigned amount that has not yet been applied to an invoice.  If this
     * value is true, the field `UnappliedAmount` will be nonzero.
     *
     * @return The field isOpen
     */
    public Boolean getIsOpen() { return this.isOpen; }
    /**
     * True if this payment includes some unassigned amount that has not yet been applied to an invoice.  If this
     * value is true, the field `UnappliedAmount` will be nonzero.
     *
     * @param value The new value for isOpen
     */
    public void setIsOpen(Boolean value) { this.isOpen = value; }
    /**
     * Memo or reference text (ex. memo field on a check).
     *
     * @return The field memoText
     */
    public String getMemoText() { return this.memoText; }
    /**
     * Memo or reference text (ex. memo field on a check).
     *
     * @param value The new value for memoText
     */
    public void setMemoText(String value) { this.memoText = value; }
    /**
     * The date when this payment was received.  This typically is the date when an accounting employee recorded
     * that they received notification that the payment had occurred, whether they were notified by email, postal
     * mail, or financial transaction notification.
     *
     * @return The field paymentDate
     */
    public String getPaymentDate() { return this.paymentDate; }
    /**
     * The date when this payment was received.  This typically is the date when an accounting employee recorded
     * that they received notification that the payment had occurred, whether they were notified by email, postal
     * mail, or financial transaction notification.
     *
     * @param value The new value for paymentDate
     */
    public void setPaymentDate(String value) { this.paymentDate = value; }
    /**
     * The date when a payment was posted to a ledger.  This date is often determined by a company's accounting
     * practices and may be different than the date when the payment was received.  This date may be affected by
     * issues such as temporary holds on funds transferred, bank holidays, or other actions.
     *
     * @return The field postDate
     */
    public String getPostDate() { return this.postDate; }
    /**
     * The date when a payment was posted to a ledger.  This date is often determined by a company's accounting
     * practices and may be different than the date when the payment was received.  This date may be affected by
     * issues such as temporary holds on funds transferred, bank holidays, or other actions.
     *
     * @param value The new value for postDate
     */
    public void setPostDate(String value) { this.postDate = value; }
    /**
     * Total amount of this payment.
     *
     * @return The field paymentAmount
     */
    public Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this payment.
     *
     * @param value The new value for paymentAmount
     */
    public void setPaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this payment.  If this amount is nonzero, the field `IsOpen` will be true.
     *
     * @return The field unappliedAmount
     */
    public Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this payment.  If this amount is nonzero, the field `IsOpen` will be true.
     *
     * @param value The new value for unappliedAmount
     */
    public void setUnappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * The ISO 4217 currency code for this payment.
     *
     * For a list of ISO 4217 currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies). This will be validated by the /api/v1/currencies data set
     *
     * @return The field currencyCode
     */
    public String getCurrencyCode() { return this.currencyCode; }
    /**
     * The ISO 4217 currency code for this payment.
     *
     * For a list of ISO 4217 currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies). This will be validated by the /api/v1/currencies data set
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(String value) { this.currencyCode = value; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * If known, the date when this record was created according to the originating financial system
     * in which this record is maintained.  If the originating financial system does not maintain a
     * created-date, leave this field null.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * If known, the date when this record was most recently modified according to the originating
     * financial system in which this record is maintained.  If the originating financial system does
     * not maintain a most-recently-modified-date, leave this field null.
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * A reference code for the payment for the given financial or ERP system.  This can be any value that the
     * originating system uses to designate the payment, such as a confirmation number or tracking number, that
     * is different from the `ErpKey` value.
     *
     * @return The field referenceCode
     */
    public String getReferenceCode() { return this.referenceCode; }
    /**
     * A reference code for the payment for the given financial or ERP system.  This can be any value that the
     * originating system uses to designate the payment, such as a confirmation number or tracking number, that
     * is different from the `ErpKey` value.
     *
     * @param value The new value for referenceCode
     */
    public void setReferenceCode(String value) { this.referenceCode = value; }
    /**
     * True if this payment was voided.
     *
     * @return The field isVoided
     */
    public Boolean getIsVoided() { return this.isVoided; }
    /**
     * True if this payment was voided.
     *
     * @param value The new value for isVoided
     */
    public void setIsVoided(Boolean value) { this.isVoided = value; }
    /**
     * True if this payment is in dispute.
     *
     * @return The field inDispute
     */
    public Boolean getInDispute() { return this.inDispute; }
    /**
     * True if this payment is in dispute.
     *
     * @param value The new value for inDispute
     */
    public void setInDispute(Boolean value) { this.inDispute = value; }
};
