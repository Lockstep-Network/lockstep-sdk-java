
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Model from the User invite process
 */
public class InviteModel
{
    private @Nullable String email;
    private @NotNull Boolean success;
    private @Nullable UserAccountModel invitedUser;
    private @Nullable String errorMessage;

    /**
     * The invited email address
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     * The invited email address
     *
     * @param value The new value for email
     */
    public void setEmail(@Nullable String value) { this.email = value; }
    /**
     * True if the invite was sent successfully
     *
     * @return The field success
     */
    public @NotNull Boolean getSuccess() { return this.success; }
    /**
     * True if the invite was sent successfully
     *
     * @param value The new value for success
     */
    public void setSuccess(@NotNull Boolean value) { this.success = value; }
    /**
     * The invited user, may be null if the user could not be invited
     *
     * @return The field invitedUser
     */
    public @Nullable UserAccountModel getInvitedUser() { return this.invitedUser; }
    /**
     * The invited user, may be null if the user could not be invited
     *
     * @param value The new value for invitedUser
     */
    public void setInvitedUser(@Nullable UserAccountModel value) { this.invitedUser = value; }
    /**
     * The error message if the invite was not successful
     *
     * @return The field errorMessage
     */
    public @Nullable String getErrorMessage() { return this.errorMessage; }
    /**
     * The error message if the invite was not successful
     *
     * @param value The new value for errorMessage
     */
    public void setErrorMessage(@Nullable String value) { this.errorMessage = value; }
};
