
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
 * @version    2022.3
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Represents a line in an invoice
 */
public class InvoiceLineModel
{
    private String invoiceLineId;
    private String groupKey;
    private String invoiceId;
    private String erpKey;
    private String lineNumber;
    private String productCode;
    private String description;
    private String unitMeasureCode;
    private Double unitPrice;
    private Double quantity;
    private Double quantityShipped;
    private Double quantityReceived;
    private Double totalAmount;
    private String exemptionCode;
    private String reportingDate;
    private String overrideOriginAddressId;
    private String overrideBillToAddressId;
    private String overrideShipToAddressId;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field invoiceLineId
     */
    public String getInvoiceLineId() { return this.invoiceLineId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for invoiceLineId
     */
    public void setInvoiceLineId(String value) { this.invoiceLineId = value; }
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
     * The ID number of the invoice this line belongs to.
     *
     * @return The field invoiceId
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The ID number of the invoice this line belongs to.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system, if it was
     * different from the original `LineNumber`.
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
     * The unique ID of this record as it was known in its originating financial system, if it was
     * different from the original `LineNumber`.
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
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     *
     * @return The field lineNumber
     */
    public String getLineNumber() { return this.lineNumber; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     *
     * @param value The new value for lineNumber
     */
    public void setLineNumber(String value) { this.lineNumber = value; }
    /**
     * A code number identifying the product or service that is specified on this line.
     *
     * @return The field productCode
     */
    public String getProductCode() { return this.productCode; }
    /**
     * A code number identifying the product or service that is specified on this line.
     *
     * @param value The new value for productCode
     */
    public void setProductCode(String value) { this.productCode = value; }
    /**
     * Description of this invoice line.
     *
     * @return The field description
     */
    public String getDescription() { return this.description; }
    /**
     * Description of this invoice line.
     *
     * @param value The new value for description
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     *
     * @return The field unitMeasureCode
     */
    public String getUnitMeasureCode() { return this.unitMeasureCode; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     *
     * @param value The new value for unitMeasureCode
     */
    public void setUnitMeasureCode(String value) { this.unitMeasureCode = value; }
    /**
     * The price of a single unit for this line.
     *
     * @return The field unitPrice
     */
    public Double getUnitPrice() { return this.unitPrice; }
    /**
     * The price of a single unit for this line.
     *
     * @param value The new value for unitPrice
     */
    public void setUnitPrice(Double value) { this.unitPrice = value; }
    /**
     * The quantity of items for ths line.
     *
     * @return The field quantity
     */
    public Double getQuantity() { return this.quantity; }
    /**
     * The quantity of items for ths line.
     *
     * @param value The new value for quantity
     */
    public void setQuantity(Double value) { this.quantity = value; }
    /**
     * The number of items that have been shipped.
     *
     * @return The field quantityShipped
     */
    public Double getQuantityShipped() { return this.quantityShipped; }
    /**
     * The number of items that have been shipped.
     *
     * @param value The new value for quantityShipped
     */
    public void setQuantityShipped(Double value) { this.quantityShipped = value; }
    /**
     * The number of items that has been received.
     *
     * @return The field quantityReceived
     */
    public Double getQuantityReceived() { return this.quantityReceived; }
    /**
     * The number of items that has been received.
     *
     * @param value The new value for quantityReceived
     */
    public void setQuantityReceived(Double value) { this.quantityReceived = value; }
    /**
     * The total amount for this line.
     *
     * @return The field totalAmount
     */
    public Double getTotalAmount() { return this.totalAmount; }
    /**
     * The total amount for this line.
     *
     * @param value The new value for totalAmount
     */
    public void setTotalAmount(Double value) { this.totalAmount = value; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     *
     * @return The field exemptionCode
     */
    public String getExemptionCode() { return this.exemptionCode; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     *
     * @param value The new value for exemptionCode
     */
    public void setExemptionCode(String value) { this.exemptionCode = value; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     *
     * @return The field reportingDate
     */
    public String getReportingDate() { return this.reportingDate; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     *
     * @param value The new value for reportingDate
     */
    public void setReportingDate(String value) { this.reportingDate = value; }
    /**
     * An optional ID number for the line's origin address.
     *
     * @return The field overrideOriginAddressId
     */
    public String getOverrideOriginAddressId() { return this.overrideOriginAddressId; }
    /**
     * An optional ID number for the line's origin address.
     *
     * @param value The new value for overrideOriginAddressId
     */
    public void setOverrideOriginAddressId(String value) { this.overrideOriginAddressId = value; }
    /**
     * An optional ID number for the line's bill to address.
     *
     * @return The field overrideBillToAddressId
     */
    public String getOverrideBillToAddressId() { return this.overrideBillToAddressId; }
    /**
     * An optional ID number for the line's bill to address.
     *
     * @param value The new value for overrideBillToAddressId
     */
    public void setOverrideBillToAddressId(String value) { this.overrideBillToAddressId = value; }
    /**
     * An optional ID number for the line's ship to address.
     *
     * @return The field overrideShipToAddressId
     */
    public String getOverrideShipToAddressId() { return this.overrideShipToAddressId; }
    /**
     * An optional ID number for the line's ship to address.
     *
     * @param value The new value for overrideShipToAddressId
     */
    public void setOverrideShipToAddressId(String value) { this.overrideShipToAddressId = value; }
    /**
     * The date on which this line was created.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date on which this line was created.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The ID number of the user who created this line.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this line.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this line was last modified.
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * The date on which this line was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this line.
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this line.
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
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return The field notes
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value The new value for notes
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return The field attachments
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value The new value for attachments
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
};
