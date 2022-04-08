
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
 * Contains information about a sync process for an entity.
 */
public class SyncEntityResultModel
{
    private @NotNull Integer insertCount;
    private @NotNull Integer updateCount;
    private @NotNull Integer skipCount;
    private @NotNull Integer errorCount;
    private @Nullable Object errors;

    /**
     * The number of entities inserted
     *
     * @return The field insertCount
     */
    public @NotNull Integer getInsertCount() { return this.insertCount; }
    /**
     * The number of entities inserted
     *
     * @param value The new value for insertCount
     */
    public void setInsertCount(@NotNull Integer value) { this.insertCount = value; }
    /**
     * The number of entities updated
     *
     * @return The field updateCount
     */
    public @NotNull Integer getUpdateCount() { return this.updateCount; }
    /**
     * The number of entities updated
     *
     * @param value The new value for updateCount
     */
    public void setUpdateCount(@NotNull Integer value) { this.updateCount = value; }
    /**
     * The number of entities skipped
     *
     * @return The field skipCount
     */
    public @NotNull Integer getSkipCount() { return this.skipCount; }
    /**
     * The number of entities skipped
     *
     * @param value The new value for skipCount
     */
    public void setSkipCount(@NotNull Integer value) { this.skipCount = value; }
    /**
     * The number of errors encountered during sync
     *
     * @return The field errorCount
     */
    public @NotNull Integer getErrorCount() { return this.errorCount; }
    /**
     * The number of errors encountered during sync
     *
     * @param value The new value for errorCount
     */
    public void setErrorCount(@NotNull Integer value) { this.errorCount = value; }
    /**
     * The errors encountered during sync keyed by ERP key
     *
     * @return The field errors
     */
    public @Nullable Object getErrors() { return this.errors; }
    /**
     * The errors encountered during sync keyed by ERP key
     *
     * @param value The new value for errors
     */
    public void setErrors(@Nullable Object value) { this.errors = value; }
};
