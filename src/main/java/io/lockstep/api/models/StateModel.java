
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
 * @version    2022.4
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * State model for ISO-3166-2
 */
public class StateModel
{
    private String name;
    private String alpha2;
    private String aliases;

    /**
     * Name of the state
     *
     * @return The field name
     */
    public String getName() { return this.name; }
    /**
     * Name of the state
     *
     * @param value The new value for name
     */
    public void setName(String value) { this.name = value; }
    /**
     * 2 letter alphabetic code for the given state
     *
     * @return The field alpha2
     */
    public String getAlpha2() { return this.alpha2; }
    /**
     * 2 letter alphabetic code for the given state
     *
     * @param value The new value for alpha2
     */
    public void setAlpha2(String value) { this.alpha2 = value; }
    /**
     * A different name for a state
     *
     * @return The field aliases
     */
    public String getAliases() { return this.aliases; }
    /**
     * A different name for a state
     *
     * @param value The new value for aliases
     */
    public void setAliases(String value) { this.aliases = value; }
};
