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


public class ErpModel
{
    private String erpSystemId;
    private String name;
    private Boolean isSupported;

    /**
     * Unique ID for this ERP
     */
    public String geterpSystemId() { return this.erpSystemId; }
    /**
     * Unique ID for this ERP
     */
    public void seterpSystemId(String value) { this.erpSystemId = value; }
    /**
     * Name of ERP
     */
    public String getname() { return this.name; }
    /**
     * Name of ERP
     */
    public void setname(String value) { this.name = value; }
    /**
     * Flag to indicate if ERP is supported
     */
    public Boolean getisSupported() { return this.isSupported; }
    /**
     * Flag to indicate if ERP is supported
     */
    public void setisSupported(Boolean value) { this.isSupported = value; }
};
