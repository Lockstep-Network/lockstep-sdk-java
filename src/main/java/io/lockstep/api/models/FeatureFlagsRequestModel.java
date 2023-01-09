
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
 * Request information for Feature Flags
 */
public class FeatureFlagsRequestModel
{
    private @Nullable String[] names;

    /**
     * The names of Feature Flags
     *
     * @return The field names
     */
    public @Nullable String[] getNames() { return this.names; }
    /**
     * The names of Feature Flags
     *
     * @param value The new value for names
     */
    public void setNames(@Nullable String[] value) { this.names = value; }
};
