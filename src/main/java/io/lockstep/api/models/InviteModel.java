
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
     * The invited email address
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEmail() { return this.email; }
    /**
     * The invited email address
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * True if the invite was sent successfully
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getSuccess() { return this.success; }
    /**
     * True if the invite was sent successfully
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setSuccess(Boolean value) { this.success = value; }
    /**
     * The invited user, may be null if the user could not be invited
     *
     * @return a {@link io.lockstep.api.models.UserAccountModel} object.
     */
    public UserAccountModel getInvitedUser() { return this.invitedUser; }
    /**
     * The invited user, may be null if the user could not be invited
     *
     * @param value a {@link io.lockstep.api.models.UserAccountModel} object.
     */
    public void setInvitedUser(UserAccountModel value) { this.invitedUser = value; }
    /**
     * The error message if the invite was not successful
     *
     * @return a {@link java.lang.String} object.
     */
    public String getErrorMessage() { return this.errorMessage; }
    /**
     * The error message if the invite was not successful
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setErrorMessage(String value) { this.errorMessage = value; }
};
