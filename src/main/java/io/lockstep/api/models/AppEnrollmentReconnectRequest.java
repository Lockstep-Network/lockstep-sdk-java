
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
 * Information to reconnect an ERP.
 */
public class AppEnrollmentReconnectRequest
{
    private @NotNull String authCode;

    /**
     * The OAuth authentication code.
     *
     * @return The field authCode
     */
    public @NotNull String getAuthCode() { return this.authCode; }
    /**
     * The OAuth authentication code.
     *
     * @param value The new value for authCode
     */
    public void setAuthCode(@NotNull String value) { this.authCode = value; }
};
