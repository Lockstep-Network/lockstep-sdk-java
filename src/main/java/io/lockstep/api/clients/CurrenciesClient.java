
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
 * @version    2022.3
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.CurrencyRateModel;

import io.lockstep.api.models.BulkCurrencyConversionModel;

/**
 * Contains all methods related to Currencies
 */
public class CurrenciesClient
{
    private LockstepApi client;

    /**
     * Constructor for method collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public CurrenciesClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieve a currency conversation rate from one currency to another as of the specified date.              Optionally, you can specify which currency data provider to use.
     *
     *              The currency rate model contains all of the information used to make the API call, plus the rate to              use for the conversion.
     *
     * @param sourceCurrency The ISO 4217 currency code of the origin currency. For a list of currency codes, call List Currencies.
     * @param destinationCurrency The ISO 4217 currency code of the target currency. For a list of currency codes, call List Currencies.
     * @param date The date for which we should cto use for this currency conversion.
     * @param dataProvider Optionally, you can specify a data provider.
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<CurrencyRateModel> retrievecurrencyrate(String sourceCurrency, String destinationCurrency, String date, String dataProvider)
    {
        RestRequest<CurrencyRateModel> r = new RestRequest<CurrencyRateModel>(this.client, "GET", "/api/v1/Currencies/{sourceCurrency}/{destinationCurrency}");
        r.AddPath("{sourceCurrency}", sourceCurrency.toString());
        r.AddPath("{destinationCurrency}", destinationCurrency.toString());
        r.AddQuery("date", date.toString());
        r.AddQuery("dataProvider", dataProvider.toString());
        return r.Call(CurrencyRateModel.class);
    }

    /**
     * Receives an array of dates and currencies and a destination currency and returns an array of the corresponding currency rates to the given destination currency (Limit X).
     *
     * @param destinationCurrency The currency to convert to.
     * @param body A list of dates and source currencies.
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<CurrencyRateModel[]> bulkcurrencydata(String destinationCurrency, BulkCurrencyConversionModel[] body)
    {
        RestRequest<CurrencyRateModel[]> r = new RestRequest<CurrencyRateModel[]>(this.client, "POST", "/api/v1/Currencies/bulk");
        r.AddQuery("destinationCurrency", destinationCurrency.toString());
        r.AddBody(body);
        return r.Call(CurrencyRateModel[].class);
    }
}
