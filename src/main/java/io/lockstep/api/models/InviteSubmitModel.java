
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Model to invite a new user to your accounting group
 */
public class InviteSubmitModel
{
    private @NotNull String email;

    /**
     * The email address of the user to invite
     *
     * @return The field email
     */
    public @NotNull String getEmail() { return this.email; }
    /**
     * The email address of the user to invite
     *
     * @param value The new value for email
     */
    public void setEmail(@NotNull String value) { this.email = value; }
};
