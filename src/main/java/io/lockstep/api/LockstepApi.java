/***
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 *             
 * @copyright  2021-2022 Lockstep, Inc.
 * @version    2022.35.5
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
import io.lockstep.api.clients.FinancialAccountClient;
import io.lockstep.api.clients.FinancialAccountBalanceHistoryClient;
import io.lockstep.api.clients.FinancialYearSettingsClient;
import io.lockstep.api.clients.GroupAccountsClient;
import io.lockstep.api.clients.InvoiceHistoryClient;
import io.lockstep.api.clients.InvoicesClient;
import io.lockstep.api.clients.LeadsClient;
import io.lockstep.api.clients.NotesClient;
import io.lockstep.api.clients.PaymentApplicationsClient;
import io.lockstep.api.clients.PaymentsClient;
import io.lockstep.api.clients.ProfilesClient;
import io.lockstep.api.clients.ProvisioningClient;
import io.lockstep.api.clients.ReportsClient;
import io.lockstep.api.clients.StatusClient;
import io.lockstep.api.clients.SyncClient;
import io.lockstep.api.clients.UserAccountsClient;
import io.lockstep.api.clients.UserRolesClient;
import io.lockstep.api.clients.WebhookRulesClient;
import io.lockstep.api.clients.WebhooksClient;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A client object that can be used to work with the API
 */
public class LockstepApi {
    private String serverUri;
    private String apiKey;
    private String bearerToken;
    private String appName;

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
    private FinancialAccountClient financialAccount;
    private FinancialAccountBalanceHistoryClient financialAccountBalanceHistory;
    private FinancialYearSettingsClient financialYearSettings;
    private GroupAccountsClient groupAccounts;
    private InvoiceHistoryClient invoiceHistory;
    private InvoicesClient invoices;
    private LeadsClient leads;
    private NotesClient notes;
    private PaymentApplicationsClient paymentApplications;
    private PaymentsClient payments;
    private ProfilesClient profiles;
    private ProvisioningClient provisioning;
    private ReportsClient reports;
    private StatusClient status;
    private SyncClient sync;
    private UserAccountsClient userAccounts;
    private UserRolesClient userRoles;
    private WebhookRulesClient webhookRules;
    private WebhooksClient webhooks;

    private LockstepApi(@NotNull String serverUri)
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
        this.financialAccount = new FinancialAccountClient(this);
        this.financialAccountBalanceHistory = new FinancialAccountBalanceHistoryClient(this);
        this.financialYearSettings = new FinancialYearSettingsClient(this);
        this.groupAccounts = new GroupAccountsClient(this);
        this.invoiceHistory = new InvoiceHistoryClient(this);
        this.invoices = new InvoicesClient(this);
        this.leads = new LeadsClient(this);
        this.notes = new NotesClient(this);
        this.paymentApplications = new PaymentApplicationsClient(this);
        this.payments = new PaymentsClient(this);
        this.profiles = new ProfilesClient(this);
        this.provisioning = new ProvisioningClient(this);
        this.reports = new ReportsClient(this);
        this.status = new StatusClient(this);
        this.sync = new SyncClient(this);
        this.userAccounts = new UserAccountsClient(this);
        this.userRoles = new UserRolesClient(this);
        this.webhookRules = new WebhookRulesClient(this);
        this.webhooks = new WebhooksClient(this);
    }

    /**
     * A collection of API methods relating to Activities
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ActivitiesClient client} methods in the API.
     */
    public @NotNull ActivitiesClient getActivitiesClient() { return this.activities; }
    /**
     * A collection of API methods relating to ApiKeys
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ApiKeysClient client} methods in the API.
     */
    public @NotNull ApiKeysClient getApiKeysClient() { return this.apiKeys; }
    /**
     * A collection of API methods relating to AppEnrollments
     *
     * @return A collection containing the {@link io.lockstep.api.clients.AppEnrollmentsClient client} methods in the API.
     */
    public @NotNull AppEnrollmentsClient getAppEnrollmentsClient() { return this.appEnrollments; }
    /**
     * A collection of API methods relating to Applications
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ApplicationsClient client} methods in the API.
     */
    public @NotNull ApplicationsClient getApplicationsClient() { return this.applications; }
    /**
     * A collection of API methods relating to Attachments
     *
     * @return A collection containing the {@link io.lockstep.api.clients.AttachmentsClient client} methods in the API.
     */
    public @NotNull AttachmentsClient getAttachmentsClient() { return this.attachments; }
    /**
     * A collection of API methods relating to CodeDefinitions
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CodeDefinitionsClient client} methods in the API.
     */
    public @NotNull CodeDefinitionsClient getCodeDefinitionsClient() { return this.codeDefinitions; }
    /**
     * A collection of API methods relating to Companies
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CompaniesClient client} methods in the API.
     */
    public @NotNull CompaniesClient getCompaniesClient() { return this.companies; }
    /**
     * A collection of API methods relating to Contacts
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ContactsClient client} methods in the API.
     */
    public @NotNull ContactsClient getContactsClient() { return this.contacts; }
    /**
     * A collection of API methods relating to CreditMemoApplied
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CreditMemoAppliedClient client} methods in the API.
     */
    public @NotNull CreditMemoAppliedClient getCreditMemoAppliedClient() { return this.creditMemoApplied; }
    /**
     * A collection of API methods relating to Currencies
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CurrenciesClient client} methods in the API.
     */
    public @NotNull CurrenciesClient getCurrenciesClient() { return this.currencies; }
    /**
     * A collection of API methods relating to CustomFieldDefinitions
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CustomFieldDefinitionsClient client} methods in the API.
     */
    public @NotNull CustomFieldDefinitionsClient getCustomFieldDefinitionsClient() { return this.customFieldDefinitions; }
    /**
     * A collection of API methods relating to CustomFieldValues
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CustomFieldValuesClient client} methods in the API.
     */
    public @NotNull CustomFieldValuesClient getCustomFieldValuesClient() { return this.customFieldValues; }
    /**
     * A collection of API methods relating to Definitions
     *
     * @return A collection containing the {@link io.lockstep.api.clients.DefinitionsClient client} methods in the API.
     */
    public @NotNull DefinitionsClient getDefinitionsClient() { return this.definitions; }
    /**
     * A collection of API methods relating to Emails
     *
     * @return A collection containing the {@link io.lockstep.api.clients.EmailsClient client} methods in the API.
     */
    public @NotNull EmailsClient getEmailsClient() { return this.emails; }
    /**
     * A collection of API methods relating to FinancialAccount
     *
     * @return A collection containing the {@link io.lockstep.api.clients.FinancialAccountClient client} methods in the API.
     */
    public @NotNull FinancialAccountClient getFinancialAccountClient() { return this.financialAccount; }
    /**
     * A collection of API methods relating to FinancialAccountBalanceHistory
     *
     * @return A collection containing the {@link io.lockstep.api.clients.FinancialAccountBalanceHistoryClient client} methods in the API.
     */
    public @NotNull FinancialAccountBalanceHistoryClient getFinancialAccountBalanceHistoryClient() { return this.financialAccountBalanceHistory; }
    /**
     * A collection of API methods relating to FinancialYearSettings
     *
     * @return A collection containing the {@link io.lockstep.api.clients.FinancialYearSettingsClient client} methods in the API.
     */
    public @NotNull FinancialYearSettingsClient getFinancialYearSettingsClient() { return this.financialYearSettings; }
    /**
     * A collection of API methods relating to GroupAccounts
     *
     * @return A collection containing the {@link io.lockstep.api.clients.GroupAccountsClient client} methods in the API.
     */
    public @NotNull GroupAccountsClient getGroupAccountsClient() { return this.groupAccounts; }
    /**
     * A collection of API methods relating to InvoiceHistory
     *
     * @return A collection containing the {@link io.lockstep.api.clients.InvoiceHistoryClient client} methods in the API.
     */
    public @NotNull InvoiceHistoryClient getInvoiceHistoryClient() { return this.invoiceHistory; }
    /**
     * A collection of API methods relating to Invoices
     *
     * @return A collection containing the {@link io.lockstep.api.clients.InvoicesClient client} methods in the API.
     */
    public @NotNull InvoicesClient getInvoicesClient() { return this.invoices; }
    /**
     * A collection of API methods relating to Leads
     *
     * @return A collection containing the {@link io.lockstep.api.clients.LeadsClient client} methods in the API.
     */
    public @NotNull LeadsClient getLeadsClient() { return this.leads; }
    /**
     * A collection of API methods relating to Notes
     *
     * @return A collection containing the {@link io.lockstep.api.clients.NotesClient client} methods in the API.
     */
    public @NotNull NotesClient getNotesClient() { return this.notes; }
    /**
     * A collection of API methods relating to PaymentApplications
     *
     * @return A collection containing the {@link io.lockstep.api.clients.PaymentApplicationsClient client} methods in the API.
     */
    public @NotNull PaymentApplicationsClient getPaymentApplicationsClient() { return this.paymentApplications; }
    /**
     * A collection of API methods relating to Payments
     *
     * @return A collection containing the {@link io.lockstep.api.clients.PaymentsClient client} methods in the API.
     */
    public @NotNull PaymentsClient getPaymentsClient() { return this.payments; }
    /**
     * A collection of API methods relating to Profiles
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ProfilesClient client} methods in the API.
     */
    public @NotNull ProfilesClient getProfilesClient() { return this.profiles; }
    /**
     * A collection of API methods relating to Provisioning
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ProvisioningClient client} methods in the API.
     */
    public @NotNull ProvisioningClient getProvisioningClient() { return this.provisioning; }
    /**
     * A collection of API methods relating to Reports
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ReportsClient client} methods in the API.
     */
    public @NotNull ReportsClient getReportsClient() { return this.reports; }
    /**
     * A collection of API methods relating to Status
     *
     * @return A collection containing the {@link io.lockstep.api.clients.StatusClient client} methods in the API.
     */
    public @NotNull StatusClient getStatusClient() { return this.status; }
    /**
     * A collection of API methods relating to Sync
     *
     * @return A collection containing the {@link io.lockstep.api.clients.SyncClient client} methods in the API.
     */
    public @NotNull SyncClient getSyncClient() { return this.sync; }
    /**
     * A collection of API methods relating to UserAccounts
     *
     * @return A collection containing the {@link io.lockstep.api.clients.UserAccountsClient client} methods in the API.
     */
    public @NotNull UserAccountsClient getUserAccountsClient() { return this.userAccounts; }
    /**
     * A collection of API methods relating to UserRoles
     *
     * @return A collection containing the {@link io.lockstep.api.clients.UserRolesClient client} methods in the API.
     */
    public @NotNull UserRolesClient getUserRolesClient() { return this.userRoles; }
    /**
     * A collection of API methods relating to WebhookRules
     *
     * @return A collection containing the {@link io.lockstep.api.clients.WebhookRulesClient client} methods in the API.
     */
    public @NotNull WebhookRulesClient getWebhookRulesClient() { return this.webhookRules; }
    /**
     * A collection of API methods relating to Webhooks
     *
     * @return A collection containing the {@link io.lockstep.api.clients.WebhooksClient client} methods in the API.
     */
    public @NotNull WebhooksClient getWebhooksClient() { return this.webhooks; }
  
    /**
     * Construct a new API client to target the specific environment.
     *
     * @param env The environment to use, either "prd" for production or "sbx" for sandbox.
     * @return The API client to use
     */
    public static @NotNull LockstepApi withEnvironment(@NotNull String env)
    {
        String url = "https://api.lockstep.io/";
        switch (env)
        {
            case "sbx":
                url = "https://api.sbx.lockstep.io/";
                break;
            case "prd":
                url = "https://api.lockstep.io/";
                break;
        }
        return new LockstepApi(url);
    }

    /**
     * Construct an unsafe client that uses a non-standard server; this can be necessary
     * when using proxy servers or an API gateway.  Please be careful when using this
     * mode.  You should prefer to use `withEnvironment()` instead wherever possible.
     *
     * @param unsafeUrl The custom environment URL to use for this client
     * @return The API client to use
     */
    public static @NotNull LockstepApi withCustomEnvironment(@NotNull String unsafeUrl)
    {
        return new LockstepApi(unsafeUrl);
    }

    /**
     * Configure this API client to use a JWT bearer token.
     *
     * Authentication is either via [Lockstep Platform API key](https://developer.lockstep.io/docs/api-keys) or [JWT Bearer Token](https://developer.lockstep.io/docs/jwt-bearer-tokens)
     *
     * @param token The JWT bearer token to use for this API session
     * @return The API client to use
     */
    public @NotNull LockstepApi withBearerToken(@NotNull String token)
    {
        this.bearerToken = token;
        this.apiKey = null;
        return this;
    }

    /**
     * Configures this API client to use an API Key.
     *
     * Authentication is either via [Lockstep Platform API key](https://developer.lockstep.io/docs/api-keys) or [JWT Bearer Token](https://developer.lockstep.io/docs/jwt-bearer-tokens)
     *
     * @param apiKey The API key to use for this API session
     * @return The API client to use
     */
    public @NotNull LockstepApi withApiKey(@NotNull String apiKey)
    {
        this.apiKey = apiKey;
        this.bearerToken = null;
        return this;
    }

    /**
     * Configures this API client to use an application name.
     * 
     * @param appName The Application name to use for this API session
     * @return The API client to use
     */
    public @NotNull LockstepApi withApplicationName(@NotNull String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * The server URI to which this client connects
     *
     * @return The server URI
     */
    public @NotNull String getServerUri() {
        return this.serverUri;
    }

    /**
     * Returns the currently selected API key
     *
     * @return The API Key
     */
    public @Nullable String getApiKey() {
        return this.apiKey;
    }

    /**
     * Returns the currently selected bearer token
     *
     * @return The bearer token
     */
    public @Nullable String getBearerToken() {
        return this.bearerToken;
    }

    /**
     * Returns the currently selected application name
     * 
     * @return The application name
     */
    public @Nullable String getAppName() {
        return this.appName;
    }
}
