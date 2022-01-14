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
    private Date reportingDate;
    private String overrideOriginAddressId;
    private String overrideBillToAddressId;
    private String overrideShipToAddressId;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;

    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform. For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getInvoiceLineId() { return this.invoiceLineId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform. For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setInvoiceLineId(String value) { this.invoiceLineId = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The ID number of the invoice this line belongs to.
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * @param value - The ID number of the invoice this line belongs to.
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * @return The unique ID of this record as it was known in its originating financial system, if it was different from the original `LineNumber`. If this company record was imported from a financial system, it will have the value `ErpKey` set to the original primary key number of the record as it was known in the originating financial system. If this record was not imported, this value will be `null`. For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * @param value - The unique ID of this record as it was known in its originating financial system, if it was different from the original `LineNumber`. If this company record was imported from a financial system, it will have the value `ErpKey` set to the original primary key number of the record as it was known in the originating financial system. If this record was not imported, this value will be `null`. For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * @return The line number of this line, as defined in the originating ERP or accounting system. You can sort on this number to get the original view of lines within the invoice.
     */
    public String getLineNumber() { return this.lineNumber; }
    /**
     * @param value - The line number of this line, as defined in the originating ERP or accounting system. You can sort on this number to get the original view of lines within the invoice.
     */
    public void setLineNumber(String value) { this.lineNumber = value; }
    /**
     * @return A code number identifying the product or service that is specified on this line.
     */
    public String getProductCode() { return this.productCode; }
    /**
     * @param value - A code number identifying the product or service that is specified on this line.
     */
    public void setProductCode(String value) { this.productCode = value; }
    /**
     * @return Description of this invoice line.
     */
    public String getDescription() { return this.description; }
    /**
     * @param value - Description of this invoice line.
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * @return For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field. If the line is measured in quantity, this field is null.
     */
    public String getUnitMeasureCode() { return this.unitMeasureCode; }
    /**
     * @param value - For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field. If the line is measured in quantity, this field is null.
     */
    public void setUnitMeasureCode(String value) { this.unitMeasureCode = value; }
    /**
     * @return The price of a single unit for this line.
     */
    public Double getUnitPrice() { return this.unitPrice; }
    /**
     * @param value - The price of a single unit for this line.
     */
    public void setUnitPrice(Double value) { this.unitPrice = value; }
    /**
     * @return The quantity of items for ths line.
     */
    public Double getQuantity() { return this.quantity; }
    /**
     * @param value - The quantity of items for ths line.
     */
    public void setQuantity(Double value) { this.quantity = value; }
    /**
     * @return The number of items that have been shipped.
     */
    public Double getQuantityShipped() { return this.quantityShipped; }
    /**
     * @param value - The number of items that have been shipped.
     */
    public void setQuantityShipped(Double value) { this.quantityShipped = value; }
    /**
     * @return The number of items that has been received.
     */
    public Double getQuantityReceived() { return this.quantityReceived; }
    /**
     * @param value - The number of items that has been received.
     */
    public void setQuantityReceived(Double value) { this.quantityReceived = value; }
    /**
     * @return The total amount for this line.
     */
    public Double getTotalAmount() { return this.totalAmount; }
    /**
     * @param value - The total amount for this line.
     */
    public void setTotalAmount(Double value) { this.totalAmount = value; }
    /**
     * @return If this line is tax exempt, this code indicates the reason for the exemption.
     */
    public String getExemptionCode() { return this.exemptionCode; }
    /**
     * @param value - If this line is tax exempt, this code indicates the reason for the exemption.
     */
    public void setExemptionCode(String value) { this.exemptionCode = value; }
    /**
     * @return If null, the products specified on this line were delivered on the same date as all other lines. If not null, this line was delivered or finalized on a different date than the overall invoice.
     */
    public Date getReportingDate() { return this.reportingDate; }
    /**
     * @param value - If null, the products specified on this line were delivered on the same date as all other lines. If not null, this line was delivered or finalized on a different date than the overall invoice.
     */
    public void setReportingDate(Date value) { this.reportingDate = value; }
    /**
     * @return An optional ID number for the line's origin address.
     */
    public String getOverrideOriginAddressId() { return this.overrideOriginAddressId; }
    /**
     * @param value - An optional ID number for the line's origin address.
     */
    public void setOverrideOriginAddressId(String value) { this.overrideOriginAddressId = value; }
    /**
     * @return An optional ID number for the line's bill to address.
     */
    public String getOverrideBillToAddressId() { return this.overrideBillToAddressId; }
    /**
     * @param value - An optional ID number for the line's bill to address.
     */
    public void setOverrideBillToAddressId(String value) { this.overrideBillToAddressId = value; }
    /**
     * @return An optional ID number for the line's ship to address.
     */
    public String getOverrideShipToAddressId() { return this.overrideShipToAddressId; }
    /**
     * @param value - An optional ID number for the line's ship to address.
     */
    public void setOverrideShipToAddressId(String value) { this.overrideShipToAddressId = value; }
    /**
     * @return The date on which this line was created.
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - The date on which this line was created.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The ID number of the user who created this line.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The ID number of the user who created this line.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return The date on which this line was last modified.
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - The date on which this line was last modified.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return The ID number of the user who most recently modified this line.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - The ID number of the user who most recently modified this line.
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
     * @return All notes attached to this company. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * @param value - All notes attached to this company. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * @return All attachments attached to this company. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * @param value - All attachments attached to this company. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
};
