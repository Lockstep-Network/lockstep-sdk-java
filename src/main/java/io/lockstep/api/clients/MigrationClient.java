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


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.MigrationResultModel;
import io.lockstep.api.models.AvailableMigrationsModel;

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
    public LockstepResponse<MigrationResultModel> migrateData()
    {
        RestRequest<MigrationResultModel> r = new RestRequest<MigrationResultModel>(this.client, "POST", "/api/v1/Migration");
        return r.Call(MigrationResultModel.class);
    }

    /**
     * Lists all of the customer, contact, payment, and invoice data currently available for Migration.
     * 
     */
    public LockstepResponse<AvailableMigrationsModel> listMigrations()
    {
        RestRequest<AvailableMigrationsModel> r = new RestRequest<AvailableMigrationsModel>(this.client, "GET", "/api/v1/Migration/list");
        return r.Call(AvailableMigrationsModel.class);
    }
}
