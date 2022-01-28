
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
 * @version    2022.4
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Contains information about a sync process for an entity.
 */
public class SyncEntityResultModel
{
    private Integer insertCount;
    private Integer updateCount;
    private Integer skipCount;
    private Integer errorCount;
    private Object errors;

    /**
     * The number of entities inserted
     *
     * @return The field insertCount
     */
    public Integer getInsertCount() { return this.insertCount; }
    /**
     * The number of entities inserted
     *
     * @param value The new value for insertCount
     */
    public void setInsertCount(Integer value) { this.insertCount = value; }
    /**
     * The number of entities updated
     *
     * @return The field updateCount
     */
    public Integer getUpdateCount() { return this.updateCount; }
    /**
     * The number of entities updated
     *
     * @param value The new value for updateCount
     */
    public void setUpdateCount(Integer value) { this.updateCount = value; }
    /**
     * The number of entities skipped
     *
     * @return The field skipCount
     */
    public Integer getSkipCount() { return this.skipCount; }
    /**
     * The number of entities skipped
     *
     * @param value The new value for skipCount
     */
    public void setSkipCount(Integer value) { this.skipCount = value; }
    /**
     * The number of errors encountered during sync
     *
     * @return The field errorCount
     */
    public Integer getErrorCount() { return this.errorCount; }
    /**
     * The number of errors encountered during sync
     *
     * @param value The new value for errorCount
     */
    public void setErrorCount(Integer value) { this.errorCount = value; }
    /**
     * The errors encountered during sync keyed by ERP key
     *
     * @return The field errors
     */
    public Object getErrors() { return this.errors; }
    /**
     * The errors encountered during sync keyed by ERP key
     *
     * @param value The new value for errors
     */
    public void setErrors(Object value) { this.errors = value; }
};
