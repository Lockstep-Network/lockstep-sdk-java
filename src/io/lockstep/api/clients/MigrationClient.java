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

package io.lockstep.api;



public class MigrationClient
{
    private LockstepApi client;

    public MigrationClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Migrates all customer data from the Lockstep Collect system to the API, including all stored data for contacts, companies, payments, and invoices.
     * 
     */
    public LockstepResponse<MigrationResultModel> MigrateData()
    {
        RestRequest r = new RestRequest("POST", "/api/v1/Migration");
        return this.client.Request<MigrationResultModel>(r);
    }

    /**
     * Lists all of the customer, contact, payment, and invoice data currently available for Migration.
     * 
     */
    public LockstepResponse<AvailableMigrationsModel> ListMigrations()
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Migration/list");
        return this.client.Request<AvailableMigrationsModel>(r);
    }
}
