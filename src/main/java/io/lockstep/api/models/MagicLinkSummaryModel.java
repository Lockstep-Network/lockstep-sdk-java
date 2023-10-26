
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
 * A historic summary of all magic links sent in a given group
 */
public class MagicLinkSummaryModel
{
    private @NotNull String groupKey;
    private @NotNull Integer totalCount;
    private @NotNull Integer totalBounced;
    private @NotNull Integer totalVisited;

    /**
     * Group that the summary is for
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * Group that the summary is for
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * Total number of magic links sent
     *
     * @return The field totalCount
     */
    public @NotNull Integer getTotalCount() { return this.totalCount; }
    /**
     * Total number of magic links sent
     *
     * @param value The new value for totalCount
     */
    public void setTotalCount(@NotNull Integer value) { this.totalCount = value; }
    /**
     * Total number of magic links that failed to send
     *
     * @return The field totalBounced
     */
    public @NotNull Integer getTotalBounced() { return this.totalBounced; }
    /**
     * Total number of magic links that failed to send
     *
     * @param value The new value for totalBounced
     */
    public void setTotalBounced(@NotNull Integer value) { this.totalBounced = value; }
    /**
     * Total number of visits across all magic links
     *
     * @return The field totalVisited
     */
    public @NotNull Integer getTotalVisited() { return this.totalVisited; }
    /**
     * Total number of visits across all magic links
     *
     * @param value The new value for totalVisited
     */
    public void setTotalVisited(@NotNull Integer value) { this.totalVisited = value; }
};
