
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2023 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2023 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Contains information for Lockstep to support/assist a user.
 */
public class SupportAccessModel
{
    private @Nullable String code;
    private @Nullable String expiresAt;

    /**
     * The code required to assist the user.
     *
     * @return The field code
     */
    public @Nullable String getCode() { return this.code; }
    /**
     * The code required to assist the user.
     *
     * @param value The new value for code
     */
    public void setCode(@Nullable String value) { this.code = value; }
    /**
     * The UTC date and time when the support access will expire.
     *
     * @return The field expiresAt
     */
    public @Nullable String getExpiresAt() { return this.expiresAt; }
    /**
     * The UTC date and time when the support access will expire.
     *
     * @param value The new value for expiresAt
     */
    public void setExpiresAt(@Nullable String value) { this.expiresAt = value; }
};
