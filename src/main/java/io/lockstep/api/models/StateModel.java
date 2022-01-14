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


public class StateModel
{
    private String name;
    private String alpha2;
    private String aliases;

    /**
     * @return Name of the state
     */
    public String getName() { return this.name; }
    /**
     * @param value - Name of the state
     */
    public void setName(String value) { this.name = value; }
    /**
     * @return 2 letter alphabetic code for the given state
     */
    public String getAlpha2() { return this.alpha2; }
    /**
     * @param value - 2 letter alphabetic code for the given state
     */
    public void setAlpha2(String value) { this.alpha2 = value; }
    /**
     * @return A different name for a state
     */
    public String getAliases() { return this.aliases; }
    /**
     * @param value - A different name for a state
     */
    public void setAliases(String value) { this.aliases = value; }
};
