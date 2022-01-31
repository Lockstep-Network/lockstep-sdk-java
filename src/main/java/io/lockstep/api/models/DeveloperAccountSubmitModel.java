
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
 * Model containing information to create a new developer account.
 */
public class DeveloperAccountSubmitModel
{
    private String name;
    private String email;
    private String companyName;

    /**
     * The name of the developer.
     *
     * @return The field name
     */
    public String getName() { return this.name; }
    /**
     * The name of the developer.
     *
     * @param value The new value for name
     */
    public void setName(String value) { this.name = value; }
    /**
     * The email address of the developer.
     *
     * @return The field email
     */
    public String getEmail() { return this.email; }
    /**
     * The email address of the developer.
     *
     * @param value The new value for email
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * The company name of the developer.
     *
     * @return The field companyName
     */
    public String getCompanyName() { return this.companyName; }
    /**
     * The company name of the developer.
     *
     * @param value The new value for companyName
     */
    public void setCompanyName(String value) { this.companyName = value; }
};
