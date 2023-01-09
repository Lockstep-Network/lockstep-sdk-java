
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
 * Contains data about the current user.
 */
public class UserDataResponseModel
{
    private @Nullable Object data;
    private @NotNull String userId;

    /**
     * Data about the user, the properties returned will depend on the requested information.
     *
     * @return The field data
     */
    public @Nullable Object getData() { return this.data; }
    /**
     * Data about the user, the properties returned will depend on the requested information.
     *
     * @param value The new value for data
     */
    public void setData(@Nullable Object value) { this.data = value; }
    /**
     * The Lockstep Platform ID of the user
     *
     * @return The field userId
     */
    public @NotNull String getUserId() { return this.userId; }
    /**
     * The Lockstep Platform ID of the user
     *
     * @param value The new value for userId
     */
    public void setUserId(@NotNull String value) { this.userId = value; }
};
