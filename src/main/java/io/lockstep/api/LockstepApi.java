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

package io.lockstep.api;

import io.lockstep.api.clients.ActivitiesClient;
import io.lockstep.api.clients.ApiKeysClient;
import io.lockstep.api.clients.AppEnrollmentsClient;
import io.lockstep.api.clients.ApplicationsClient;
import io.lockstep.api.clients.AttachmentsClient;
import io.lockstep.api.clients.CodeDefinitionsClient;
import io.lockstep.api.clients.CompaniesClient;
import io.lockstep.api.clients.ContactsClient;
import io.lockstep.api.clients.CreditMemoAppliedClient;
import io.lockstep.api.clients.CurrenciesClient;
import io.lockstep.api.clients.CustomFieldDefinitionsClient;
import io.lockstep.api.clients.CustomFieldValuesClient;
import io.lockstep.api.clients.DefinitionsClient;
import io.lockstep.api.clients.EmailsClient;
import io.lockstep.api.clients.InvoiceHistoryClient;
import io.lockstep.api.clients.InvoicesClient;
import io.lockstep.api.clients.LeadsClient;
import io.lockstep.api.clients.MigrationClient;
import io.lockstep.api.clients.NotesClient;
import io.lockstep.api.clients.PaymentApplicationsClient;
import io.lockstep.api.clients.PaymentsClient;
import io.lockstep.api.clients.ProvisioningClient;
import io.lockstep.api.clients.ReportsClient;
import io.lockstep.api.clients.StatusClient;
import io.lockstep.api.clients.SyncClient;
import io.lockstep.api.clients.UserAccountsClient;
import io.lockstep.api.clients.UserRolesClient;

/**
 * Represents a failed request.
 *
 * @author jkirk
 * @version $Id: $Id
 */
public class LockstepApi {
    private String serverUri;
    private String apiKey;
    private String bearerToken;

    private ActivitiesClient activities;
    private ApiKeysClient apiKeys;
    private AppEnrollmentsClient appEnrollments;
    private ApplicationsClient applications;
    private AttachmentsClient attachments;
    private CodeDefinitionsClient codeDefinitions;
    private CompaniesClient companies;
    private ContactsClient contacts;
    private CreditMemoAppliedClient creditMemoApplied;
    private CurrenciesClient currencies;
    private CustomFieldDefinitionsClient customFieldDefinitions;
    private CustomFieldValuesClient customFieldValues;
    private DefinitionsClient definitions;
    private EmailsClient emails;
    private InvoiceHistoryClient invoiceHistory;
    private InvoicesClient invoices;
    private LeadsClient leads;
    private MigrationClient migration;
    private NotesClient notes;
    private PaymentApplicationsClient paymentApplications;
    private PaymentsClient payments;
    private ProvisioningClient provisioning;
    private ReportsClient reports;
    private StatusClient status;
    private SyncClient sync;
    private UserAccountsClient userAccounts;
    private UserRolesClient userRoles;

    private LockstepApi(String serverUri)
    {
        this.serverUri = serverUri;

        this.activities = new ActivitiesClient(this);
        this.apiKeys = new ApiKeysClient(this);
        this.appEnrollments = new AppEnrollmentsClient(this);
        this.applications = new ApplicationsClient(this);
        this.attachments = new AttachmentsClient(this);
        this.codeDefinitions = new CodeDefinitionsClient(this);
        this.companies = new CompaniesClient(this);
        this.contacts = new ContactsClient(this);
        this.creditMemoApplied = new CreditMemoAppliedClient(this);
        this.currencies = new CurrenciesClient(this);
        this.customFieldDefinitions = new CustomFieldDefinitionsClient(this);
        this.customFieldValues = new CustomFieldValuesClient(this);
        this.definitions = new DefinitionsClient(this);
        this.emails = new EmailsClient(this);
        this.invoiceHistory = new InvoiceHistoryClient(this);
        this.invoices = new InvoicesClient(this);
        this.leads = new LeadsClient(this);
        this.migration = new MigrationClient(this);
        this.notes = new NotesClient(this);
        this.paymentApplications = new PaymentApplicationsClient(this);
        this.payments = new PaymentsClient(this);
        this.provisioning = new ProvisioningClient(this);
        this.reports = new ReportsClient(this);
        this.status = new StatusClient(this);
        this.sync = new SyncClient(this);
        this.userAccounts = new UserAccountsClient(this);
        this.userRoles = new UserRolesClient(this);
    }

    /**
     * <p>getActivitiesClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.ActivitiesClient} object.
     */
    public ActivitiesClient getActivitiesClient() { return this.activities; }
    /**
     * <p>getApiKeysClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.ApiKeysClient} object.
     */
    public ApiKeysClient getApiKeysClient() { return this.apiKeys; }
    /**
     * <p>getAppEnrollmentsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.AppEnrollmentsClient} object.
     */
    public AppEnrollmentsClient getAppEnrollmentsClient() { return this.appEnrollments; }
    /**
     * <p>getApplicationsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.ApplicationsClient} object.
     */
    public ApplicationsClient getApplicationsClient() { return this.applications; }
    /**
     * <p>getAttachmentsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.AttachmentsClient} object.
     */
    public AttachmentsClient getAttachmentsClient() { return this.attachments; }
    /**
     * <p>getCodeDefinitionsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.CodeDefinitionsClient} object.
     */
    public CodeDefinitionsClient getCodeDefinitionsClient() { return this.codeDefinitions; }
    /**
     * <p>getCompaniesClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.CompaniesClient} object.
     */
    public CompaniesClient getCompaniesClient() { return this.companies; }
    /**
     * <p>getContactsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.ContactsClient} object.
     */
    public ContactsClient getContactsClient() { return this.contacts; }
    /**
     * <p>getCreditMemoAppliedClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.CreditMemoAppliedClient} object.
     */
    public CreditMemoAppliedClient getCreditMemoAppliedClient() { return this.creditMemoApplied; }
    /**
     * <p>getCurrenciesClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.CurrenciesClient} object.
     */
    public CurrenciesClient getCurrenciesClient() { return this.currencies; }
    /**
     * <p>getCustomFieldDefinitionsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.CustomFieldDefinitionsClient} object.
     */
    public CustomFieldDefinitionsClient getCustomFieldDefinitionsClient() { return this.customFieldDefinitions; }
    /**
     * <p>getCustomFieldValuesClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.CustomFieldValuesClient} object.
     */
    public CustomFieldValuesClient getCustomFieldValuesClient() { return this.customFieldValues; }
    /**
     * <p>getDefinitionsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.DefinitionsClient} object.
     */
    public DefinitionsClient getDefinitionsClient() { return this.definitions; }
    /**
     * <p>getEmailsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.EmailsClient} object.
     */
    public EmailsClient getEmailsClient() { return this.emails; }
    /**
     * <p>getInvoiceHistoryClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.InvoiceHistoryClient} object.
     */
    public InvoiceHistoryClient getInvoiceHistoryClient() { return this.invoiceHistory; }
    /**
     * <p>getInvoicesClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.InvoicesClient} object.
     */
    public InvoicesClient getInvoicesClient() { return this.invoices; }
    /**
     * <p>getLeadsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.LeadsClient} object.
     */
    public LeadsClient getLeadsClient() { return this.leads; }
    /**
     * <p>getMigrationClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.MigrationClient} object.
     */
    public MigrationClient getMigrationClient() { return this.migration; }
    /**
     * <p>getNotesClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.NotesClient} object.
     */
    public NotesClient getNotesClient() { return this.notes; }
    /**
     * <p>getPaymentApplicationsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.PaymentApplicationsClient} object.
     */
    public PaymentApplicationsClient getPaymentApplicationsClient() { return this.paymentApplications; }
    /**
     * <p>getPaymentsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.PaymentsClient} object.
     */
    public PaymentsClient getPaymentsClient() { return this.payments; }
    /**
     * <p>getProvisioningClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.ProvisioningClient} object.
     */
    public ProvisioningClient getProvisioningClient() { return this.provisioning; }
    /**
     * <p>getReportsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.ReportsClient} object.
     */
    public ReportsClient getReportsClient() { return this.reports; }
    /**
     * <p>getStatusClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.StatusClient} object.
     */
    public StatusClient getStatusClient() { return this.status; }
    /**
     * <p>getSyncClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.SyncClient} object.
     */
    public SyncClient getSyncClient() { return this.sync; }
    /**
     * <p>getUserAccountsClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.UserAccountsClient} object.
     */
    public UserAccountsClient getUserAccountsClient() { return this.userAccounts; }
    /**
     * <p>getUserRolesClient.</p>
     *
     * @return a {@link io.lockstep.api.clients.UserRolesClient} object.
     */
    public UserRolesClient getUserRolesClient() { return this.userRoles; }
  
    /**
     * Construct a new Lockstep API client to target the specific environment.
     *
     * @param env The environment to use, either "prd" for production or "sbx" for sandbox.
     * @return The Lockstep API client to use
     */
    public static LockstepApi withEnvironment(String env)
    {
        String url = "https://api.lockstep.io";
        switch (env)
        {
            case "prd":
                url = "https://api.lockstep.io";
                break;
            case "sbx":
                url = "https://api.sbx.lockstep.io";
                break;
        }
        return new LockstepApi(url);
    }

    /**
     * Construct an unsafe client that uses a non-standard server; this can be necessary
     * when using proxy servers or an API gateway.  Please be careful when using this
     * mode.  You should prefer to use `withEnvironment()` instead wherever possible.
     *
     * @return The Lockstep API client to use
     * @param unsafeUrl a {@link java.lang.String} object.
     */
    public static LockstepApi withCustomEnvironment(String unsafeUrl)
    {
        return new LockstepApi(unsafeUrl);
    }

    /**
     * Configure this Lockstep API client to use a JWT bearer token.
     * More documentation is available on [JWT Bearer Tokens](https://developer.lockstep.io/docs/jwt-bearer-tokens).
     *
     * @return The Lockstep API client to use
     * @param token a {@link java.lang.String} object.
     */
    public LockstepApi withBearerToken(String token)
    {
        this.bearerToken = token;
        this.apiKey = null;
        return this;
    }

    /**
     * Configures this Lockstep API client to use an API Key.
     * More documentation is available on [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @return The Lockstep API client to use
     * @param apiKey a {@link java.lang.String} object.
     */
    public LockstepApi withApiKey(String apiKey)
    {
        this.apiKey = apiKey;
        this.bearerToken = null;
        return this;
    }


    /**
     * Getters and setters
     *
     * @return a {@link java.lang.String} object.
     */
    public String getServerUri() {
        return this.serverUri;
    }

    /**
     * <p>Getter for the field <code>apiKey</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * <p>Getter for the field <code>bearerToken</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBearerToken() {
        return this.bearerToken;
    }
}
