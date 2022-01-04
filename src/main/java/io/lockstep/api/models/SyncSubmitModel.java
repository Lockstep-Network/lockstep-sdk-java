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


package io.lockstep.api.models;


public class SyncSubmitModel
{
    private String appEnrollmentId;

    /**
     * The identifier of the app enrollment
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The identifier of the app enrollment
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
};
