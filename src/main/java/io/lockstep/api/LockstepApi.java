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
 * @version    2022.2.93.0
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
 * A client object that can be used to work with the Lockstep Platform API
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
     * @return A collection containing the {@link io.lockstep.api.clients.Activities client} methods in the Lockstep Platform API.
     */
    public ActivitiesClient getActivitiesClient() { return this.activities; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.ApiKeys client} methods in the Lockstep Platform API.
     */
    public ApiKeysClient getApiKeysClient() { return this.apiKeys; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.AppEnrollments client} methods in the Lockstep Platform API.
     */
    public AppEnrollmentsClient getAppEnrollmentsClient() { return this.appEnrollments; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Applications client} methods in the Lockstep Platform API.
     */
    public ApplicationsClient getApplicationsClient() { return this.applications; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Attachments client} methods in the Lockstep Platform API.
     */
    public AttachmentsClient getAttachmentsClient() { return this.attachments; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.CodeDefinitions client} methods in the Lockstep Platform API.
     */
    public CodeDefinitionsClient getCodeDefinitionsClient() { return this.codeDefinitions; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Companies client} methods in the Lockstep Platform API.
     */
    public CompaniesClient getCompaniesClient() { return this.companies; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Contacts client} methods in the Lockstep Platform API.
     */
    public ContactsClient getContactsClient() { return this.contacts; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.CreditMemoApplied client} methods in the Lockstep Platform API.
     */
    public CreditMemoAppliedClient getCreditMemoAppliedClient() { return this.creditMemoApplied; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Currencies client} methods in the Lockstep Platform API.
     */
    public CurrenciesClient getCurrenciesClient() { return this.currencies; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.CustomFieldDefinitions client} methods in the Lockstep Platform API.
     */
    public CustomFieldDefinitionsClient getCustomFieldDefinitionsClient() { return this.customFieldDefinitions; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.CustomFieldValues client} methods in the Lockstep Platform API.
     */
    public CustomFieldValuesClient getCustomFieldValuesClient() { return this.customFieldValues; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Definitions client} methods in the Lockstep Platform API.
     */
    public DefinitionsClient getDefinitionsClient() { return this.definitions; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Emails client} methods in the Lockstep Platform API.
     */
    public EmailsClient getEmailsClient() { return this.emails; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.InvoiceHistory client} methods in the Lockstep Platform API.
     */
    public InvoiceHistoryClient getInvoiceHistoryClient() { return this.invoiceHistory; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Invoices client} methods in the Lockstep Platform API.
     */
    public InvoicesClient getInvoicesClient() { return this.invoices; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Leads client} methods in the Lockstep Platform API.
     */
    public LeadsClient getLeadsClient() { return this.leads; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Notes client} methods in the Lockstep Platform API.
     */
    public NotesClient getNotesClient() { return this.notes; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.PaymentApplications client} methods in the Lockstep Platform API.
     */
    public PaymentApplicationsClient getPaymentApplicationsClient() { return this.paymentApplications; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Payments client} methods in the Lockstep Platform API.
     */
    public PaymentsClient getPaymentsClient() { return this.payments; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Provisioning client} methods in the Lockstep Platform API.
     */
    public ProvisioningClient getProvisioningClient() { return this.provisioning; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Reports client} methods in the Lockstep Platform API.
     */
    public ReportsClient getReportsClient() { return this.reports; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Status client} methods in the Lockstep Platform API.
     */
    public StatusClient getStatusClient() { return this.status; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.Sync client} methods in the Lockstep Platform API.
     */
    public SyncClient getSyncClient() { return this.sync; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.UserAccounts client} methods in the Lockstep Platform API.
     */
    public UserAccountsClient getUserAccountsClient() { return this.userAccounts; }
    /**
     * @return A collection containing the {@link io.lockstep.api.clients.UserRoles client} methods in the Lockstep Platform API.
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
     * @param unsafeUrl The non-Lockstep URL to use for this client
     * @return The Lockstep API client to use
     */
    public static LockstepApi withCustomEnvironment(String unsafeUrl)
    {
        return new LockstepApi(unsafeUrl);
    }

    /**
     * Configure this Lockstep API client to use a JWT bearer token.
     * More documentation is available on [JWT Bearer Tokens](https://developer.lockstep.io/docs/jwt-bearer-tokens). 
     * 
     * @param token The JWT bearer token to use for this API session
     * @return The Lockstep API client to use
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
     * @param apiKey The API key to use for this API session
     * @return The Lockstep API client to use
     */
    public LockstepApi withApiKey(String apiKey)
    {
        this.apiKey = apiKey;
        this.bearerToken = null;
        return this;
    }

    /**
     * Returns the server URI to which this client connects
     */
    public String getServerUri() {
        return this.serverUri;
    }

    /**
     * Returns the currently selected API key
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Returns the currently selected bearer token
     */
    public String getBearerToken() {
        return this.bearerToken;
    }
}