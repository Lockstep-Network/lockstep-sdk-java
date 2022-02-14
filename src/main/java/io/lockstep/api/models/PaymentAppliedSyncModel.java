
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
 * The PaymentAppliedSyncModel represents information coming into Lockstep from an external financial system or
 * other enterprise resource planning system.  To import data from an external system, convert your original data
 * into the PaymentAppliedSyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as a [PaymentAppliedModel](https://developer.lockstep.io/docs/paymentappliedmodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class PaymentAppliedSyncModel
{
    private String erpKey;
    private String invoiceErpKey;
    private String paymentErpKey;
    private Integer entryNumber;
    private String applyToInvoiceDate;
    private Double paymentAppliedAmount;
    private String created;
    private String modified;

    /**
     * This is the primary key of the Payment Application record. For this field, you should use whatever this
     * transaction's unique identifying number is in the originating system. Search for a unique, non-changing
     * number within the originating financial system for this record.
     *
     * Since Payment Applications are often considered transactions, a typical value to look for will be
     * the transaction ID number, the payment confirmation number, or some other record of this payment.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * This is the primary key of the Payment Application record. For this field, you should use whatever this
     * transaction's unique identifying number is in the originating system. Search for a unique, non-changing
     * number within the originating financial system for this record.
     *
     * Since Payment Applications are often considered transactions, a typical value to look for will be
     * the transaction ID number, the payment confirmation number, or some other record of this payment.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * This field indicates which Invoice had its balance reduced by applying this payment.  In this field,
     * identify the original primary key or unique ID of the Invoice which had its balance reduced.
     *
     * This information lets you track how an invoice was paid. You can identify what proportion of an invoice's
     * balance was paid by which methods by joining this field to Invoices.
     *
     * This value should match the [Invoice ErpKey](https://developer.lockstep.io/docs/importing-invoices#erpkey)
     * field on the [InvoiceSyncModel](https://developer.lockstep.io/docs/importing-invoices).
     *
     * @return The field invoiceErpKey
     */
    public String getInvoiceErpKey() { return this.invoiceErpKey; }
    /**
     * This field indicates which Invoice had its balance reduced by applying this payment.  In this field,
     * identify the original primary key or unique ID of the Invoice which had its balance reduced.
     *
     * This information lets you track how an invoice was paid. You can identify what proportion of an invoice's
     * balance was paid by which methods by joining this field to Invoices.
     *
     * This value should match the [Invoice ErpKey](https://developer.lockstep.io/docs/importing-invoices#erpkey)
     * field on the [InvoiceSyncModel](https://developer.lockstep.io/docs/importing-invoices).
     *
     * @param value The new value for invoiceErpKey
     */
    public void setInvoiceErpKey(String value) { this.invoiceErpKey = value; }
    /**
     * This field indicates which Payment was used to provide the funds for this payment application. In this
     * field, identify the original primary key or unique ID of the Payment that was used for this payment
     * application.
     *
     * This information lets you track how an invoice was paid. You can identify what proportion of an payment's
     * balance was paid by which methods by joining this field to the Payment.
     *
     * This value should match the [Payment ErpKey](https://developer.lockstep.io/docs/importing-payments#erpkey)
     * field on the [PaymentSyncModel](https://developer.lockstep.io/docs/importing-payments).
     *
     * @return The field paymentErpKey
     */
    public String getPaymentErpKey() { return this.paymentErpKey; }
    /**
     * This field indicates which Payment was used to provide the funds for this payment application. In this
     * field, identify the original primary key or unique ID of the Payment that was used for this payment
     * application.
     *
     * This information lets you track how an invoice was paid. You can identify what proportion of an payment's
     * balance was paid by which methods by joining this field to the Payment.
     *
     * This value should match the [Payment ErpKey](https://developer.lockstep.io/docs/importing-payments#erpkey)
     * field on the [PaymentSyncModel](https://developer.lockstep.io/docs/importing-payments).
     *
     * @param value The new value for paymentErpKey
     */
    public void setPaymentErpKey(String value) { this.paymentErpKey = value; }
    /**
     * The entry number of this payment application.  This is often a journal entry number, confirmation code,
     * or other identifying field for this payment application.
     *
     * @return The field entryNumber
     */
    public Integer getEntryNumber() { return this.entryNumber; }
    /**
     * The entry number of this payment application.  This is often a journal entry number, confirmation code,
     * or other identifying field for this payment application.
     *
     * @param value The new value for entryNumber
     */
    public void setEntryNumber(Integer value) { this.entryNumber = value; }
    /**
     * The date this payment was applied to this invoice.
     *
     * @return The field applyToInvoiceDate
     */
    public String getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * The date this payment was applied to this invoice.
     *
     * @param value The new value for applyToInvoiceDate
     */
    public void setApplyToInvoiceDate(String value) { this.applyToInvoiceDate = value; }
    /**
     * The total amount that was applied to this Invoice from the Payment.
     *
     * @return The field paymentAppliedAmount
     */
    public Double getPaymentAppliedAmount() { return this.paymentAppliedAmount; }
    /**
     * The total amount that was applied to this Invoice from the Payment.
     *
     * @param value The new value for paymentAppliedAmount
     */
    public void setPaymentAppliedAmount(Double value) { this.paymentAppliedAmount = value; }
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