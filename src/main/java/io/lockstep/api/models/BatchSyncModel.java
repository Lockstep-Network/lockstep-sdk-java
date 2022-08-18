
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A BatchSyncModel contains a collection of records to load into the Lockstep Platform.  Data contained
 * in this batch will be merged with your existing data.  Each record will be matched with existing data inside
 * the Lockstep Platform using the [Identity Column](https://developer.lockstep.io/docs/identity-columns) rules.
 * Any record that represents a new AppEnrollmentId+ErpKey will be inserted.  A record that matches an existing
 * AppEnrollmentId+ErpKey will be updated, but only if the data has changed.
 *
 * A Sync process permits either a complete data file or a partial / delta data file.  Lockstep recommends
 * using a sliding time window to avoid the risk of clock skew errors that might accidentally omit records.
 * Best practice is to run a Sync process daily, and to export all data that has changed in the past 48 hours.
 */
public class BatchSyncModel
{
    private @Nullable CompanySyncModel[] companies;
    private @Nullable ContactSyncModel[] contacts;
    private @Nullable CreditMemoAppliedSyncModel[] creditMemoApplications;
    private @Nullable InvoiceSyncModel[] invoices;
    private @Nullable InvoiceLineSyncModel[] invoiceLines;
    private @Nullable CustomFieldSyncModel[] customFields;
    private @Nullable PaymentSyncModel[] payments;
    private @Nullable PaymentAppliedSyncModel[] paymentApplications;
    private @Nullable FinancialYearSettingSyncModel[] financialYearSettings;
    private @Nullable FinancialAccountSyncModel[] financialAccounts;
    private @Nullable FinancialAccountBalanceHistorySyncModel[] financialAccountBalanceHistories;

    /**
     * A list of Company records to merge with your Lockstep Platform data
     *
     * @return The field companies
     */
    public @Nullable CompanySyncModel[] getCompanies() { return this.companies; }
    /**
     * A list of Company records to merge with your Lockstep Platform data
     *
     * @param value The new value for companies
     */
    public void setCompanies(@Nullable CompanySyncModel[] value) { this.companies = value; }
    /**
     * A list of Contact records to merge with your Lockstep Platform data
     *
     * @return The field contacts
     */
    public @Nullable ContactSyncModel[] getContacts() { return this.contacts; }
    /**
     * A list of Contact records to merge with your Lockstep Platform data
     *
     * @param value The new value for contacts
     */
    public void setContacts(@Nullable ContactSyncModel[] value) { this.contacts = value; }
    /**
     * A list of CreditMemoApplied records to merge with your Lockstep Platform data
     *
     * @return The field creditMemoApplications
     */
    public @Nullable CreditMemoAppliedSyncModel[] getCreditMemoApplications() { return this.creditMemoApplications; }
    /**
     * A list of CreditMemoApplied records to merge with your Lockstep Platform data
     *
     * @param value The new value for creditMemoApplications
     */
    public void setCreditMemoApplications(@Nullable CreditMemoAppliedSyncModel[] value) { this.creditMemoApplications = value; }
    /**
     * A list of Invoice records to merge with your Lockstep Platform data
     *
     * @return The field invoices
     */
    public @Nullable InvoiceSyncModel[] getInvoices() { return this.invoices; }
    /**
     * A list of Invoice records to merge with your Lockstep Platform data
     *
     * @param value The new value for invoices
     */
    public void setInvoices(@Nullable InvoiceSyncModel[] value) { this.invoices = value; }
    /**
     * A list of InvoiceLine records to merge with your Lockstep Platform data
     *
     * @return The field invoiceLines
     */
    public @Nullable InvoiceLineSyncModel[] getInvoiceLines() { return this.invoiceLines; }
    /**
     * A list of InvoiceLine records to merge with your Lockstep Platform data
     *
     * @param value The new value for invoiceLines
     */
    public void setInvoiceLines(@Nullable InvoiceLineSyncModel[] value) { this.invoiceLines = value; }
    /**
     * A list of CustomField records to merge with your Lockstep Platform data
     *
     * @return The field customFields
     */
    public @Nullable CustomFieldSyncModel[] getCustomFields() { return this.customFields; }
    /**
     * A list of CustomField records to merge with your Lockstep Platform data
     *
     * @param value The new value for customFields
     */
    public void setCustomFields(@Nullable CustomFieldSyncModel[] value) { this.customFields = value; }
    /**
     * A list of Payment records to merge with your Lockstep Platform data
     *
     * @return The field payments
     */
    public @Nullable PaymentSyncModel[] getPayments() { return this.payments; }
    /**
     * A list of Payment records to merge with your Lockstep Platform data
     *
     * @param value The new value for payments
     */
    public void setPayments(@Nullable PaymentSyncModel[] value) { this.payments = value; }
    /**
     * A list of PaymentApplied records to merge with your Lockstep Platform data
     *
     * @return The field paymentApplications
     */
    public @Nullable PaymentAppliedSyncModel[] getPaymentApplications() { return this.paymentApplications; }
    /**
     * A list of PaymentApplied records to merge with your Lockstep Platform data
     *
     * @param value The new value for paymentApplications
     */
    public void setPaymentApplications(@Nullable PaymentAppliedSyncModel[] value) { this.paymentApplications = value; }
    /**
     * A list of FinancialYearSetting records to merge with your Lockstep Platform data
     *
     * @return The field financialYearSettings
     */
    public @Nullable FinancialYearSettingSyncModel[] getFinancialYearSettings() { return this.financialYearSettings; }
    /**
     * A list of FinancialYearSetting records to merge with your Lockstep Platform data
     *
     * @param value The new value for financialYearSettings
     */
    public void setFinancialYearSettings(@Nullable FinancialYearSettingSyncModel[] value) { this.financialYearSettings = value; }
    /**
     * A list of FinancialAccount records to merge with your Lockstep Platform data
     *
     * @return The field financialAccounts
     */
    public @Nullable FinancialAccountSyncModel[] getFinancialAccounts() { return this.financialAccounts; }
    /**
     * A list of FinancialAccount records to merge with your Lockstep Platform data
     *
     * @param value The new value for financialAccounts
     */
    public void setFinancialAccounts(@Nullable FinancialAccountSyncModel[] value) { this.financialAccounts = value; }
    /**
     * A list of FinancialAccountBalanceHistory records to merge with your Lockstep Platform data
     *
     * @return The field financialAccountBalanceHistories
     */
    public @Nullable FinancialAccountBalanceHistorySyncModel[] getFinancialAccountBalanceHistories() { return this.financialAccountBalanceHistories; }
    /**
     * A list of FinancialAccountBalanceHistory records to merge with your Lockstep Platform data
     *
     * @param value The new value for financialAccountBalanceHistories
     */
    public void setFinancialAccountBalanceHistories(@Nullable FinancialAccountBalanceHistorySyncModel[] value) { this.financialAccountBalanceHistories = value; }
};
