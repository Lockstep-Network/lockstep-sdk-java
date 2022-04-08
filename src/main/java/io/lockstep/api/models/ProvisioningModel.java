
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents the data sent during the onboarding flow
 */
public class ProvisioningModel
{
    private @Nullable String fullName;
    private @Nullable ErpInfoModel erp;

    /**
     * The full name of the new user
     *
     * @return The field fullName
     */
    public @Nullable String getFullName() { return this.fullName; }
    /**
     * The full name of the new user
     *
     * @param value The new value for fullName
     */
    public void setFullName(@Nullable String value) { this.fullName = value; }
    /**
     * The information necessary to enroll the user in their ERP
     *
     * @return The field erp
     */
    public @Nullable ErpInfoModel getErp() { return this.erp; }
    /**
     * The information necessary to enroll the user in their ERP
     *
     * @param value The new value for erp
     */
    public void setErp(@Nullable ErpInfoModel value) { this.erp = value; }
};
