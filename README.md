# Lockstep SDK For Java 
![maven-central](https://img.shields.io/maven-central/v/io.lockstep/lockstepsdk)

A financial service SDK for Java for innovative accounting solutions providers.

### Who are we? 
Lockstep automates accounting workflows to improve your operational efficiency and cash flow. Accelerate payments through automated customer communications, enhanced collections activity management, and innovative forecasting and reporting.


# Getting Started
Here's how to add the Lockstep Java SDK to your project. 

1. Download the JAR file from the [Lockstep documentation](https://developer.lockstep.io/docs/lockstep-sdk) and import it into your Java Project;

2. Obtain an API key for the Lockstep Platform API by visiting: [API Key](https://developer.lockstep.io/docs/api-keys)

3. Create a LockstepAPI Client in your .java file
```Java
Map<String, String> environment = System.getenv();
String key = environment.getOrDefault("PASS_ENVIRONMENT_HERE", null);
//You can use either "sbx" or "dev"
LockstepApi client = LockstepApi.withEnvironment("sbx");
client.withApiKey(INSERT_API_KEY);
```
4. Make a ping call to make sure you're connected https://developer.lockstep.io/reference/get_api-v1-status

```Java
LockstepResponse<StatusModel> response = client.getStatusClient().ping();
System.out.println("Ping result: " + response.isSuccess());
```

You now have your API credentials and have successfully created your client. 

## Features
- [Activities](https://developer.lockstep.io/reference/get_api-v1-activities-id)
- [ApiKeys](https://developer.lockstep.io/reference/get_api-v1-apikeys-id)
- [AppEnrollments](https://developer.lockstep.io/reference/get_api-v1-appenrollments-id)
- [Applications](https://developer.lockstep.io/reference/get_api-v1-applications-id)
- [Attachments](https://developer.lockstep.io/reference/get_api-v1-attachments-id)
- [Code Definitions](https://developer.lockstep.io/reference/get_api-v1-codedefinitions-id)
- [Companies](https://developer.lockstep.io/reference/get_api-v1-companies-id)
- [Contacts](https://developer.lockstep.io/reference/get_api-v1-contacts-id)
- [Countries](https://developer.lockstep.io/reference/get_api-v1-countries)
- [Credit Memo Applied](https://developer.lockstep.io/reference/get_api-v1-creditmemoapplied-id)
- [Currencies](https://developer.lockstep.io/reference/get_api-v1-currencies)
- [CustomFieldDefinitions](https://developer.lockstep.io/reference/get_api-v1-customfielddefinitions-id)
- [CustomFieldValues](https://developer.lockstep.io/reference/get_api-v1-customfieldvalues-definitionid-recordkey)
- [Definitions](https://developer.lockstep.io/reference/get_api-v1-definitions-countries)
- [Emails](https://developer.lockstep.io/reference/get_api-v1-emails-id)
- [Erps](https://developer.lockstep.io/reference/get_api-v1-erps)
- [InvoiceHistory](https://developer.lockstep.io/reference/get_api-v1-invoicehistory-id)
- [Invoices](https://developer.lockstep.io/reference/get_api-v1-invoices-id)
- [Leads](https://developer.lockstep.io/reference/post_api-v1-leads)
- [Migration](https://developer.lockstep.io/reference/post_api-v1-migration)
- [Notes](https://developer.lockstep.io/reference/get_api-v1-notes-id)
- [PaymentApplications](https://developer.lockstep.io/reference/get_api-v1-paymentapplications-id)
- [Payments](https://developer.lockstep.io/reference/get_api-v1-payments-id)
- [Provisioning](https://developer.lockstep.io/reference/post_api-v1-provisioning)
- [Reports](https://developer.lockstep.io/reference/get_api-v1-reports-cashflow)
- [States](https://developer.lockstep.io/reference/get_api-v1-states)
- [Status](https://developer.lockstep.io/reference/get_api-v1-status)
- [Sync](https://developer.lockstep.io/reference/post_api-v1-sync)
- [UserAccounts](https://developer.lockstep.io/reference/get_api-v1-useraccounts-id)
- [UserRoles](https://developer.lockstep.io/reference/get_api-v1-userroles-id)

## How to Use (Basic Usage)
This example will show you how to call the Lockstep API, using the [Query Invoices API](https://developer.lockstep.io/reference/get_api-v1-invoices-query) to retrieve a collection of invoices. 

```Java
# Connect to Client
# Lockstep provides sandbox and production environments

LockstepApi client = LockstepApi.withEnvironment("sbx");
        
client.withApiKey(INSERT_API_KEY);

InvoicesClient invoiceClient = client.getInvoicesClient();   
LockstepResponse<FetchResult<InvoiceModel>> invoices = invoiceClient.queryInvoices("invoiceDate", "Company", "invoiceDate asc", 10, 0);
InvoiceModel[] invoiceModelList = invoices.getValue().getRecords();

for (InvoiceModel currentInvoice : InvoiceModel) {
    System.out.println("Invoice " + count + ":" + currentInvoice.getInvoiceId());
}
```

# Sample Project 
Fetch Invoice Sample Java Project {INSERT REFERENCE TO READ ME}
