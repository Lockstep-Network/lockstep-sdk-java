
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
 * Model used to submit a transfer ownership request
 */
public class TransferOwnerSubmitModel
{
    private @NotNull String targetUserId;

    /**
     * The ID of the user to transfer ownership to.
     *
     * @return The field targetUserId
     */
    public @NotNull String getTargetUserId() { return this.targetUserId; }
    /**
     * The ID of the user to transfer ownership to.
     *
     * @param value The new value for targetUserId
     */
    public void setTargetUserId(@NotNull String value) { this.targetUserId = value; }
};
