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


public class ErpInfoModel
{
    private String appId;
    private ConnectorInfoModel data;

    /**
     * The id of the ERP's App
     */
    public String getAppId() { return this.appId; }
    /**
     * The id of the ERP's App
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * The data required to store for connector access
     */
    public ConnectorInfoModel getData() { return this.data; }
    /**
     * The data required to store for connector access
     */
    public void setData(ConnectorInfoModel value) { this.data = value; }
};
