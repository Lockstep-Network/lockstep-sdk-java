
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


package io.lockstep.api.models;


/**
 * A SyncSubmitModel represents a task that loads data from a connector to load into the Lockstep Platform.  Data
 * contained in a sync will be merged with your existing data.  Each record will be matched with existing data
 * inside the Lockstep Platform using the [Identity Column](https://developer.lockstep.io/docs/identity-columns)
 * rules.  Any record that represents a new AppEnrollmentId+ErpKey will be inserted.  A record that matches an
 * existing AppEnrollmentId+ErpKey will be updated, but only if the data has changed.
 *
 * A Sync process permits either a complete data file or a partial / delta data file.  Lockstep recommends
 * using a sliding time window to avoid the risk of clock skew errors that might accidentally omit records.
 * Best practice is to run a Sync process daily, and to export all data that has changed in the past 48 hours.
 */
public class SyncSubmitModel
{
    private String appEnrollmentId;

    /**
     * The unique identifier of the app enrollment that is creating this sync request.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The unique identifier of the app enrollment that is creating this sync request.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
};
