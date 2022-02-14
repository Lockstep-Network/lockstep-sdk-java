
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
 * The CreditMemoAppliedSyncModel represents information coming into Lockstep from an external financial system or
 * other enterprise resource planning system.  To import data from an external system, convert your original data
 * into the CreditMemoAppliedSyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as a [CreditMemoAppliedModel](https://developer.lockstep.io/docs/creditmemoappliedmodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class CreditMemoAppliedSyncModel
{
    private String erpKey;
    private String invoiceErpKey;
    private String creditMemoInvoiceErpKey;
    private Integer entryNumber;
    private String applyToInvoiceDate;
    private Double creditMemoAppliedAmount;
    private String created;
    private String modified;

    /**
     * This is the primary key of the Credit Memo Application record. For this field, you should use whatever this
     * transaction's unique identifying number is in the originating system. Search for a unique, non-changing
     * number within the originating financial system for this record.
     *
     * Since Credit Memo Applications are often considered transactions, a typical value to look for will be
     * the transaction ID number, the payment confirmation number, or some other record of this payment.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Credit Memo Application record. For this field, you should use whatever this
     * transaction's unique identifying number is in the originating system. Search for a unique, non-changing
     * number within the originating financial system for this record.
     *
     * Since Credit Memo Applications are often considered transactions, a typical value to look for will be
     * the transaction ID number, the payment confirmation number, or some other record of this payment.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * This field indicates which Invoice had its balanced reduced by applying a credit memo.  In this field,
     * identify the original primary key or unique ID of the Invoice which had its balanced reduced.
     *
     * Example: Company ABC received a credit memo, CM000123 for $500.  Company ABC then chooses to apply this
     * credit memo to reduce the balance of the invoice PO1000578.  The `InvoiceErpKey` is `PO1000578`.
     *
     * @return The field invoiceErpKey
     */
    public String getInvoiceErpKey() { return this.invoiceErpKey; }
    /**
     * This field indicates which Invoice had its balanced reduced by applying a credit memo.  In this field,
     * identify the original primary key or unique ID of the Invoice which had its balanced reduced.
     *
     * Example: Company ABC received a credit memo, CM000123 for $500.  Company ABC then chooses to apply this
     * credit memo to reduce the balance of the invoice PO1000578.  The `InvoiceErpKey` is `PO1000578`.
     *
     * @param value The new value for invoiceErpKey
     */
    public void setInvoiceErpKey(String value) { this.invoiceErpKey = value; }
    /**
     * This field indicates which Invoice is the original credit memo that was used to make this payment
     * application event.  In this field, identify the original primary key or unique ID of the Invoice which
     * created the credit memo that was consumed in this event.
     *
     * Example: Company ABC received a credit memo, CM000123 for $500.  Company ABC then chooses to apply this
     * credit memo to reduce the balance of the invoice PO1000578.  The `CreditMemoInvoiceErpKey` is `CM000123`.
     *
     * @return The field creditMemoInvoiceErpKey
     */
    public String getCreditMemoInvoiceErpKey() { return this.creditMemoInvoiceErpKey; }
    /**
     * This field indicates which Invoice is the original credit memo that was used to make this payment
     * application event.  In this field, identify the original primary key or unique ID of the Invoice which
     * created the credit memo that was consumed in this event.
     *
     * Example: Company ABC received a credit memo, CM000123 for $500.  Company ABC then chooses to apply this
     * credit memo to reduce the balance of the invoice PO1000578.  The `CreditMemoInvoiceErpKey` is `CM000123`.
     *
     * @param value The new value for creditMemoInvoiceErpKey
     */
    public void setCreditMemoInvoiceErpKey(String value) { this.creditMemoInvoiceErpKey = value; }
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
     * The date on which this credit memo was applied to the Invoice.
     *
     * @return The field applyToInvoiceDate
     */
    public String getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * The date on which this credit memo was applied to the Invoice.
     *
     * @param value The new value for applyToInvoiceDate
     */
    public void setApplyToInvoiceDate(String value) { this.applyToInvoiceDate = value; }
    /**
     * The amount of this credit memo that was applied to this Invoice.
     *
     * @return The field creditMemoAppliedAmount
     */
    public Double getCreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * The amount of this credit memo that was applied to this Invoice.
     *
     * @param value The new value for creditMemoAppliedAmount
     */
    public void setCreditMemoAppliedAmount(Double value) { this.creditMemoAppliedAmount = value; }
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
};
