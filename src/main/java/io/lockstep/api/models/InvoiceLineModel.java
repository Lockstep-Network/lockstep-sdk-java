
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
    private NoteModel[] notes;
    private AttachmentModel[] attachments;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceLineId() { return this.invoiceLineId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceLineId(String value) { this.invoiceLineId = value; }
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
     * The ID number of the invoice this line belongs to.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The ID number of the invoice this line belongs to.
     *
     * @param value a {@link java.lang.String} object.
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
     * @return a {@link java.lang.String} object.
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
     * @param value a {@link java.lang.String} object.
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getLineNumber() { return this.lineNumber; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setLineNumber(String value) { this.lineNumber = value; }
    /**
     * A code number identifying the product or service that is specified on this line.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getProductCode() { return this.productCode; }
    /**
     * A code number identifying the product or service that is specified on this line.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setProductCode(String value) { this.productCode = value; }
    /**
     * Description of this invoice line.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDescription() { return this.description; }
    /**
     * Description of this invoice line.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUnitMeasureCode() { return this.unitMeasureCode; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setUnitMeasureCode(String value) { this.unitMeasureCode = value; }
    /**
     * The price of a single unit for this line.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getUnitPrice() { return this.unitPrice; }
    /**
     * The price of a single unit for this line.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setUnitPrice(Double value) { this.unitPrice = value; }
    /**
     * The quantity of items for ths line.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getQuantity() { return this.quantity; }
    /**
     * The quantity of items for ths line.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setQuantity(Double value) { this.quantity = value; }
    /**
     * The number of items that have been shipped.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getQuantityShipped() { return this.quantityShipped; }
    /**
     * The number of items that have been shipped.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setQuantityShipped(Double value) { this.quantityShipped = value; }
    /**
     * The number of items that has been received.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getQuantityReceived() { return this.quantityReceived; }
    /**
     * The number of items that has been received.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setQuantityReceived(Double value) { this.quantityReceived = value; }
    /**
     * The total amount for this line.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalAmount() { return this.totalAmount; }
    /**
     * The total amount for this line.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalAmount(Double value) { this.totalAmount = value; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getExemptionCode() { return this.exemptionCode; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setExemptionCode(String value) { this.exemptionCode = value; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getReportingDate() { return this.reportingDate; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setReportingDate(Date value) { this.reportingDate = value; }
    /**
     * An optional ID number for the line's origin address.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOverrideOriginAddressId() { return this.overrideOriginAddressId; }
    /**
     * An optional ID number for the line's origin address.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setOverrideOriginAddressId(String value) { this.overrideOriginAddressId = value; }
    /**
     * An optional ID number for the line's bill to address.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOverrideBillToAddressId() { return this.overrideBillToAddressId; }
    /**
     * An optional ID number for the line's bill to address.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setOverrideBillToAddressId(String value) { this.overrideBillToAddressId = value; }
    /**
     * An optional ID number for the line's ship to address.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOverrideShipToAddressId() { return this.overrideShipToAddressId; }
    /**
     * An optional ID number for the line's ship to address.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setOverrideShipToAddressId(String value) { this.overrideShipToAddressId = value; }
    /**
     * The date on which this line was created.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * The date on which this line was created.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID number of the user who created this line.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this line.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this line was last modified.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * The date on which this line was last modified.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this line.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this line.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
};
