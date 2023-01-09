
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
 * Response information for Feature Flags
 */
public class FeatureFlagsResponseModel
{
    private @Nullable Object values;

    /**
     * State of the requested Feature Flags
     *
     * @return The field values
     */
    public @Nullable Object getValues() { return this.values; }
    /**
     * State of the requested Feature Flags
     *
     * @param value The new value for values
     */
    public void setValues(@Nullable Object value) { this.values = value; }
};
