
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
 * State model for ISO-3166-2
 */
public class StateModel
{
    private @Nullable String name;
    private @Nullable String alpha2;
    private @Nullable String aliases;

    /**
     * Name of the state
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * Name of the state
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * 2 letter alphabetic code for the given state
     *
     * @return The field alpha2
     */
    public @Nullable String getAlpha2() { return this.alpha2; }
    /**
     * 2 letter alphabetic code for the given state
     *
     * @param value The new value for alpha2
     */
    public void setAlpha2(@Nullable String value) { this.alpha2 = value; }
    /**
     * A different name for a state
     *
     * @return The field aliases
     */
    public @Nullable String getAliases() { return this.aliases; }
    /**
     * A different name for a state
     *
     * @param value The new value for aliases
     */
    public void setAliases(@Nullable String value) { this.aliases = value; }
};
