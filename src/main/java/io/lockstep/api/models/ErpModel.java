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
     * @return Unique ID for this ERP
     */
    public String getErpSystemId() { return this.erpSystemId; }
    /**
     * @param value - Unique ID for this ERP
     */
    public void setErpSystemId(String value) { this.erpSystemId = value; }
    /**
     * @return Name of ERP
     */
    public String getName() { return this.name; }
    /**
     * @param value - Name of ERP
     */
    public void setName(String value) { this.name = value; }
    /**
     * @return Flag to indicate if ERP is supported
     */
    public Boolean getIsSupported() { return this.isSupported; }
    /**
     * @param value - Flag to indicate if ERP is supported
     */
    public void setIsSupported(Boolean value) { this.isSupported = value; }
};
