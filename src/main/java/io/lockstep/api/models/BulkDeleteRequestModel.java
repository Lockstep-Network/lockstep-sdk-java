
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
 * Represents a bulk delete request in the API
 */
public class BulkDeleteRequestModel
{
    private @NotNull String[] idsToDelete;

    /**
     * Represents the IDs to be deleted
     *
     * @return The field idsToDelete
     */
    public @NotNull String[] getIdsToDelete() { return this.idsToDelete; }
    /**
     * Represents the IDs to be deleted
     *
     * @param value The new value for idsToDelete
     */
    public void setIdsToDelete(@NotNull String[] value) { this.idsToDelete = value; }
};
