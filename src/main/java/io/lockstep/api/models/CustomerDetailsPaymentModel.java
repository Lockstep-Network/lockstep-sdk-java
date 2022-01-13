
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
public class CustomerDetailsPaymentModel
{
    private String groupKey;
    private String paymentId;
    private String paymentAppliedId;
    private String paymentType;
    private String invoiceId;
    private String invoiceTypeCode;
    private String invoiceReferenceCode;
    private Double invoiceTotalAmount;
    private Date paymentDate;
    private Double paymentAmount;

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
     * Unique identifier for payment
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPaymentId() { return this.paymentId; }
    /**
     * Unique identifier for payment
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPaymentId(String value) { this.paymentId = value; }
    /**
     * Unique identifier for payment applied
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * Unique identifier for payment applied
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPaymentAppliedId(String value) { this.paymentAppliedId = value; }
    /**
     * Payment type
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPaymentType() { return this.paymentType; }
    /**
     * Payment type
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPaymentType(String value) { this.paymentType = value; }
    /**
     * Unique identifier for invoice payment is associated with
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * Unique identifier for invoice payment is associated with
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * Invoice type payment is associated with
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * Invoice type payment is associated with
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * Invoice reference code payment is associated with
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceReferenceCode() { return this.invoiceReferenceCode; }
    /**
     * Invoice reference code payment is associated with
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceReferenceCode(String value) { this.invoiceReferenceCode = value; }
    /**
     * Invoice total amount payment is associated with
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getInvoiceTotalAmount() { return this.invoiceTotalAmount; }
    /**
     * Invoice total amount payment is associated with
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setInvoiceTotalAmount(Double value) { this.invoiceTotalAmount = value; }
    /**
     * Date payment placed
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getPaymentDate() { return this.paymentDate; }
    /**
     * Date payment placed
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setPaymentDate(Date value) { this.paymentDate = value; }
    /**
     * Amount payment was made for
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * Amount payment was made for
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setPaymentAmount(Double value) { this.paymentAmount = value; }
};
