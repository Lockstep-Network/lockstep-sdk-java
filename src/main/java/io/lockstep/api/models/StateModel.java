/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
 */


package io.lockstep.api.models;


public class StateModel
{
    private String name;
    private String alpha2;
    private String aliases;

    /**
     * Name of the state
     */
    public String getname() { return this.name; }
    /**
     * Name of the state
     */
    public void setname(String value) { this.name = value; }
    /**
     * 2 letter alphabetic code for the given state
     */
    public String getalpha2() { return this.alpha2; }
    /**
     * 2 letter alphabetic code for the given state
     */
    public void setalpha2(String value) { this.alpha2 = value; }
    /**
     * A different name for a state
     */
    public String getaliases() { return this.aliases; }
    /**
     * A different name for a state
     */
    public void setaliases(String value) { this.aliases = value; }
};
