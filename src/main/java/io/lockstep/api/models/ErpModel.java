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


public class ErpModel
{
    private String erpSystemId;
    private String name;
    private Boolean isSupported;

    /**
     * Unique ID for this ERP
     */
    public String getErpSystemId() { return this.erpSystemId; }
    /**
     * Unique ID for this ERP
     */
    public void setErpSystemId(String value) { this.erpSystemId = value; }
    /**
     * Name of ERP
     */
    public String getName() { return this.name; }
    /**
     * Name of ERP
     */
    public void setName(String value) { this.name = value; }
    /**
     * Flag to indicate if ERP is supported
     */
    public Boolean getIsSupported() { return this.isSupported; }
    /**
     * Flag to indicate if ERP is supported
     */
    public void setIsSupported(Boolean value) { this.isSupported = value; }
};
