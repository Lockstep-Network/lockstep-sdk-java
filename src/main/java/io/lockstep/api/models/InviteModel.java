
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
 * @version    2022.3
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Model from the User invite process
 */
public class InviteModel
{
    private String email;
    private Boolean success;
    private UserAccountModel invitedUser;
    private String errorMessage;

    /**
     * The invited email address
     *
     * @return The field email
     */
    public String getEmail() { return this.email; }
    /**
     * The invited email address
     *
     * @param value The new value for email
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * True if the invite was sent successfully
     *
     * @return The field success
     */
    public Boolean getSuccess() { return this.success; }
    /**
     * True if the invite was sent successfully
     *
     * @param value The new value for success
     */
    public void setSuccess(Boolean value) { this.success = value; }
    /**
     * The invited user, may be null if the user could not be invited
     *
     * @return The field invitedUser
     */
    public UserAccountModel getInvitedUser() { return this.invitedUser; }
    /**
     * The invited user, may be null if the user could not be invited
     *
     * @param value The new value for invitedUser
     */
    public void setInvitedUser(UserAccountModel value) { this.invitedUser = value; }
    /**
     * The error message if the invite was not successful
     *
     * @return The field errorMessage
     */
    public String getErrorMessage() { return this.errorMessage; }
    /**
     * The error message if the invite was not successful
     *
     * @param value The new value for errorMessage
     */
    public void setErrorMessage(String value) { this.errorMessage = value; }
};
