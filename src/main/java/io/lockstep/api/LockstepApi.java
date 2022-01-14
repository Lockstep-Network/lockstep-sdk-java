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
 * Represents a failed request.
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

    public ActivitiesClient getActivitiesClient() { return this.activities; }
    public ApiKeysClient getApiKeysClient() { return this.apiKeys; }
    public AppEnrollmentsClient getAppEnrollmentsClient() { return this.appEnrollments; }
    public ApplicationsClient getApplicationsClient() { return this.applications; }
    public AttachmentsClient getAttachmentsClient() { return this.attachments; }
    public CodeDefinitionsClient getCodeDefinitionsClient() { return this.codeDefinitions; }
    public CompaniesClient getCompaniesClient() { return this.companies; }
    public ContactsClient getContactsClient() { return this.contacts; }
    public CreditMemoAppliedClient getCreditMemoAppliedClient() { return this.creditMemoApplied; }
    public CurrenciesClient getCurrenciesClient() { return this.currencies; }
    public CustomFieldDefinitionsClient getCustomFieldDefinitionsClient() { return this.customFieldDefinitions; }
    public CustomFieldValuesClient getCustomFieldValuesClient() { return this.customFieldValues; }
    public DefinitionsClient getDefinitionsClient() { return this.definitions; }
    public EmailsClient getEmailsClient() { return this.emails; }
    public InvoiceHistoryClient getInvoiceHistoryClient() { return this.invoiceHistory; }
    public InvoicesClient getInvoicesClient() { return this.invoices; }
    public LeadsClient getLeadsClient() { return this.leads; }
    public NotesClient getNotesClient() { return this.notes; }
    public PaymentApplicationsClient getPaymentApplicationsClient() { return this.paymentApplications; }
    public PaymentsClient getPaymentsClient() { return this.payments; }
    public ProvisioningClient getProvisioningClient() { return this.provisioning; }
    public ReportsClient getReportsClient() { return this.reports; }
    public StatusClient getStatusClient() { return this.status; }
    public SyncClient getSyncClient() { return this.sync; }
    public UserAccountsClient getUserAccountsClient() { return this.userAccounts; }
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
     * @param env The non-Lockstep URL to use for this client
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
     * @param env The JWT bearer token to use for this API session
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
     * @param env The API key to use for this API session
     * @return The Lockstep API client to use
     */
    public LockstepApi withApiKey(String apiKey)
    {
        this.apiKey = apiKey;
        this.bearerToken = null;
        return this;
    }


    /**
     * Getters and setters
     */
    public String getServerUri() {
        return this.serverUri;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getBearerToken() {
        return this.bearerToken;
    }
}