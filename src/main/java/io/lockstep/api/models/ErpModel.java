
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
 * Represents unsupported ERP systems
 */
public class ErpModel
{
    private @NotNull String erpSystemId;
    private @Nullable String name;
    private @NotNull Boolean isSupported;

    /**
     * Unique ID for this ERP
     *
     * @return The field erpSystemId
     */
    public @NotNull String getErpSystemId() { return this.erpSystemId; }
    /**
     * Unique ID for this ERP
     *
     * @param value The new value for erpSystemId
     */
    public void setErpSystemId(@NotNull String value) { this.erpSystemId = value; }
    /**
     * Name of ERP
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * Name of ERP
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Flag to indicate if ERP is supported
     *
     * @return The field isSupported
     */
    public @NotNull Boolean getIsSupported() { return this.isSupported; }
    /**
     * Flag to indicate if ERP is supported
     *
     * @param value The new value for isSupported
     */
    public void setIsSupported(@NotNull Boolean value) { this.isSupported = value; }
};
