
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
public class AvailableGroup
{
    private String groupKey;
    private Integer invoiceCount;
    private Integer lineCount;
    private Integer companyCount;
    private Integer contactCount;
    private Integer paymentCount;
    private Integer paymentAppliedCount;

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
     * The number of invoices.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getInvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setInvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * The number of invoice lines.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getLineCount() { return this.lineCount; }
    /**
     * The number of invoice lines.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setLineCount(Integer value) { this.lineCount = value; }
    /**
     * The number of companies.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getCompanyCount() { return this.companyCount; }
    /**
     * The number of companies.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setCompanyCount(Integer value) { this.companyCount = value; }
    /**
     * The number of contacts.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getContactCount() { return this.contactCount; }
    /**
     * The number of contacts.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setContactCount(Integer value) { this.contactCount = value; }
    /**
     * The number of payments.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getPaymentCount() { return this.paymentCount; }
    /**
     * The number of payments.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setPaymentCount(Integer value) { this.paymentCount = value; }
    /**
     * The number of payments applied.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getPaymentAppliedCount() { return this.paymentAppliedCount; }
    /**
     * The number of payments applied.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setPaymentAppliedCount(Integer value) { this.paymentAppliedCount = value; }
};
