
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.FinancialYearSettingModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to FinancialYearSettings
 */
public class FinancialYearSettingsClient
{
    private LockstepApi client;

    /**
     * Constructor for the FinancialYearSettings API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public FinancialYearSettingsClient(LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Financial Year Setting specified by this unique identifier.
     *
     * A Financial Year Setting is used to to set the type, beginning, end, and number of periods of a year used to calculate accounting reports. The financial setting can either be for a specific app enrollment id via a sync or, when the financial year setting is manually created, will cover all account data without an app enrollment id.
     *
     * @param id The unique Lockstep Platform ID number of this Financial Year Setting
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FinancialYearSettingModel> retrieveFinancialYearSetting(String id)
    {
        RestRequest<FinancialYearSettingModel> r = new RestRequest<FinancialYearSettingModel>(this.client, "GET", "/api/v1/FinancialYearSettings/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(FinancialYearSettingModel.class);
    }

    /**
     * Updates a financial year setting that matches the specified id with the requested information.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * A Financial Year Setting is used to to set the type, beginning, end, and number of periods of a year used to calculate accounting reports. The financial setting can either be for a specific app enrollment id via a sync or, when the financial year setting is manually created, will cover all account data without an app enrollment id.
     *
     * @param id The unique Lockstep Platform ID number of the Financial Year Setting to update
     * @param body A list of changes to apply to this Financial Year Setting
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FinancialYearSettingModel> updateFinancialYearSetting(String id, Object body)
    {
        RestRequest<FinancialYearSettingModel> r = new RestRequest<FinancialYearSettingModel>(this.client, "PATCH", "/api/v1/FinancialYearSettings/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(FinancialYearSettingModel.class);
    }

    /**
     * Delete the Financial Year Setting referred to by this unique identifier.
     *
     * A Financial Year Setting is used to to set the type, beginning, end, and number of periods of a year used to calculate accounting reports. The financial setting can either be for a specific app enrollment id via a sync or, when the financial year setting is manually created, will cover all account data without an app enrollment id.
     *
     * @param id The unique Lockstep Platform ID number of the Financial Year Setting to disable
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<ActionResultModel> deleteFinancialYearSetting(String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/FinancialYearSettings/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates a financial year setting from a given model.
     *
     * A Financial Year Setting is used to to set the type, beginning, end, and number of periods of a year used to calculate accounting reports. The financial setting can either be for a specific app enrollment id via a sync or, when the financial year setting is manually created, will cover all account data without an app enrollment id.
     *
     * @param body The Financial Year Setting to create
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FinancialYearSettingModel> createFinancialYearSetting(FinancialYearSettingModel body)
    {
        RestRequest<FinancialYearSettingModel> r = new RestRequest<FinancialYearSettingModel>(this.client, "POST", "/api/v1/FinancialYearSettings");
        r.AddBody(body);
        return r.Call(FinancialYearSettingModel.class);
    }

    /**
     * Queries Financial Year Settings for this account using the specified filtering, sorting, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A Financial Year Setting is used to to set the type, beginning, end, and number of periods of a year used to calculate accounting reports. The financial setting can either be for a specific app enrollment id via a sync or, when the financial year setting is manually created, will cover all account data without an app enrollment id.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<FinancialYearSettingModel>> queryFinancialYearSettings(String filter, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<FinancialYearSettingModel>> r = new RestRequest<FetchResult<FinancialYearSettingModel>>(this.client, "GET", "/api/v1/FinancialYearSettings/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<FinancialYearSettingModel>>() {}.getType());
    }
}
