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

4. Make a ping call to make sure you're connected https://developer.lockstep.io/reference/v1_status_retrievestatus

```Java
LockstepResponse<StatusModel> response = client.getStatusClient().ping();
System.out.println("Ping result: " + response.isSuccess());
```

You now have your API credentials and have successfully created your client.

## How to Use (Basic Usage)

This example will show you how to call the Lockstep API, using the [Query Invoices API](https://developer.lockstep.io/reference/v1_invoices_queryinvoices) to retrieve a collection of invoices.

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

[Collections Report Sample Java Project](https://github.com/Lockstep-Network/lockstep-sdk-examples/blob/main/JavaExample/src/main/java/io/lockstep/CollectionsReport.java)
