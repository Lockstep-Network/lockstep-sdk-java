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


package io.lockstep.api.models;

import java.util.Date;

public class BulkCurrencyConversionModel
{
    private Date date;
    private String sourceCurrency;

    /**
     * The date for the currency rate
     */
    public Date getdate() { return this.date; }
    /**
     * The date for the currency rate
     */
    public void setdate(Date value) { this.date = value; }
    /**
     * The currency code This will be validated by the /api/v1/currencies data set
     */
    public String getsourceCurrency() { return this.sourceCurrency; }
    /**
     * The currency code This will be validated by the /api/v1/currencies data set
     */
    public void setsourceCurrency(String value) { this.sourceCurrency = value; }
};
