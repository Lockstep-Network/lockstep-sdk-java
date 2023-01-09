
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2023 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2023 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Model containing information about a user for the invite/onboarding process.
 */
public class InviteDataModel
{
    private @Nullable String email;
    private @Nullable String userStatus;

    /**
     * The email address of the invited user.
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     * The email address of the invited user.
     *
     * @param value The new value for email
     */
    public void setEmail(@Nullable String value) { this.email = value; }
    /**
     * The status of the user.
     *
     * @return The field userStatus
     */
    public @Nullable String getUserStatus() { return this.userStatus; }
    /**
     * The status of the user.
     *
     * @param value The new value for userStatus
     */
    public void setUserStatus(@Nullable String value) { this.userStatus = value; }
};
