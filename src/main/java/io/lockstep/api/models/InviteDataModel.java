
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


/**
 * Model containing information about a user for the invite/onboarding process.
 */
public class InviteDataModel
{
    private String email;
    private String userStatus;

    /**
     * The email address of the invited user.
     *
     * @return The field email
     */
    public String getEmail() { return this.email; }
    /**
     * The email address of the invited user.
     *
     * @param value The new value for email
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * The status of the user.
     *
     * @return The field userStatus
     */
    public String getUserStatus() { return this.userStatus; }
    /**
     * The status of the user.
     *
     * @param value The new value for userStatus
     */
    public void setUserStatus(String value) { this.userStatus = value; }
};
