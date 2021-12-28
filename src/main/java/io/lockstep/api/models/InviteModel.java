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


public class InviteModel
{
    private String email;
    private Boolean success;
    private UserAccountModel invitedUser;
    private String errorMessage;

    /**
     * The invited email address
     */
    public String getemail() { return this.email; }
    /**
     * The invited email address
     */
    public void setemail(String value) { this.email = value; }
    /**
     * True if the invite was sent successfully
     */
    public Boolean getsuccess() { return this.success; }
    /**
     * True if the invite was sent successfully
     */
    public void setsuccess(Boolean value) { this.success = value; }
    /**
     * The invited user, may be null if the user could not be invited
     */
    public UserAccountModel getinvitedUser() { return this.invitedUser; }
    /**
     * The invited user, may be null if the user could not be invited
     */
    public void setinvitedUser(UserAccountModel value) { this.invitedUser = value; }
    /**
     * The error message if the invite was not successful
     */
    public String geterrorMessage() { return this.errorMessage; }
    /**
     * The error message if the invite was not successful
     */
    public void seterrorMessage(String value) { this.errorMessage = value; }
};
