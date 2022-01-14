
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


/**
 * Represents the data sent during the onboarding flow
 */
public class ProvisioningModel
{
    private String fullName;
    private ErpInfoModel erp;

    /**
     * The full name of the new user
     *
     * @return The field fullName
     */
    public String getFullName() { return this.fullName; }
    /**
     * The full name of the new user
     *
     * @param value The new value for fullName
     */
    public void setFullName(String value) { this.fullName = value; }
    /**
     * The information necessary to enroll the user in their ERP
     *
     * @return The field erp
     */
    public ErpInfoModel getErp() { return this.erp; }
    /**
     * The information necessary to enroll the user in their ERP
     *
     * @param value The new value for erp
     */
    public void setErp(ErpInfoModel value) { this.erp = value; }
};
