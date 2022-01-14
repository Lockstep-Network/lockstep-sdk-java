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


public class InviteModel
{
    private String email;
    private Boolean success;
    private UserAccountModel invitedUser;
    private String errorMessage;

    /**
     * @return The invited email address
     */
    public String getEmail() { return this.email; }
    /**
     * @param value - The invited email address
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * @return True if the invite was sent successfully
     */
    public Boolean getSuccess() { return this.success; }
    /**
     * @param value - True if the invite was sent successfully
     */
    public void setSuccess(Boolean value) { this.success = value; }
    /**
     * @return The invited user, may be null if the user could not be invited
     */
    public UserAccountModel getInvitedUser() { return this.invitedUser; }
    /**
     * @param value - The invited user, may be null if the user could not be invited
     */
    public void setInvitedUser(UserAccountModel value) { this.invitedUser = value; }
    /**
     * @return The error message if the invite was not successful
     */
    public String getErrorMessage() { return this.errorMessage; }
    /**
     * @param value - The error message if the invite was not successful
     */
    public void setErrorMessage(String value) { this.errorMessage = value; }
};
