
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
 * @version    2022.2
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
     *
     * @return The field erpSystemId
     */
    public String getErpSystemId() { return this.erpSystemId; }
    /**
     * Unique ID for this ERP
     *
     * @param value The new value for erpSystemId
     */
    public void setErpSystemId(String value) { this.erpSystemId = value; }
    /**
     * Name of ERP
     *
     * @return The field name
     */
    public String getName() { return this.name; }
    /**
     * Name of ERP
     *
     * @param value The new value for name
     */
    public void setName(String value) { this.name = value; }
    /**
     * Flag to indicate if ERP is supported
     *
     * @return The field isSupported
     */
    public Boolean getIsSupported() { return this.isSupported; }
    /**
     * Flag to indicate if ERP is supported
     *
     * @param value The new value for isSupported
     */
    public void setIsSupported(Boolean value) { this.isSupported = value; }
};
