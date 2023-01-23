
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
 * Sets support access data for a user.
 */
public class SupportAccessRequest
{
    private @Nullable String expiresAt;

    /**
     * The UTC date and time when support access should expire.
     *
     * @return The field expiresAt
     */
    public @Nullable String getExpiresAt() { return this.expiresAt; }
    /**
     * The UTC date and time when support access should expire.
     *
     * @param value The new value for expiresAt
     */
    public void setExpiresAt(@Nullable String value) { this.expiresAt = value; }
};
