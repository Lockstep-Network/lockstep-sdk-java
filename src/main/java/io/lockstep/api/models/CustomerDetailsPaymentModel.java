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
     * Unique identifier for payment
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * Unique identifier for payment
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * Unique identifier for payment applied
     */
    public String getpaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * Unique identifier for payment applied
     */
    public void setpaymentAppliedId(String value) { this.paymentAppliedId = value; }
    /**
     * Payment type
     */
    public String getpaymentType() { return this.paymentType; }
    /**
     * Payment type
     */
    public void setpaymentType(String value) { this.paymentType = value; }
    /**
     * Unique identifier for invoice payment is associated with
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * Unique identifier for invoice payment is associated with
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * Invoice type payment is associated with
     */
    public String getinvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * Invoice type payment is associated with
     */
    public void setinvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * Invoice reference code payment is associated with
     */
    public String getinvoiceReferenceCode() { return this.invoiceReferenceCode; }
    /**
     * Invoice reference code payment is associated with
     */
    public void setinvoiceReferenceCode(String value) { this.invoiceReferenceCode = value; }
    /**
     * Invoice total amount payment is associated with
     */
    public Double getinvoiceTotalAmount() { return this.invoiceTotalAmount; }
    /**
     * Invoice total amount payment is associated with
     */
    public void setinvoiceTotalAmount(Double value) { this.invoiceTotalAmount = value; }
    /**
     * Date payment placed
     */
    public Date getpaymentDate() { return this.paymentDate; }
    /**
     * Date payment placed
     */
    public void setpaymentDate(Date value) { this.paymentDate = value; }
    /**
     * Amount payment was made for
     */
    public Double getpaymentAmount() { return this.paymentAmount; }
    /**
     * Amount payment was made for
     */
    public void setpaymentAmount(Double value) { this.paymentAmount = value; }
};
