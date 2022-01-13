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
 * @version    2021.39
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


public class SyncEntityResultModel
{
    private Integer insertCount;
    private Integer updateCount;
    private Integer skipCount;
    private Integer errorCount;
    private Object errors;

    /**
     * The number of entities inserted
     */
    public Integer getInsertCount() { return this.insertCount; }
    /**
     * The number of entities inserted
     */
    public void setInsertCount(Integer value) { this.insertCount = value; }
    /**
     * The number of entities updated
     */
    public Integer getUpdateCount() { return this.updateCount; }
    /**
     * The number of entities updated
     */
    public void setUpdateCount(Integer value) { this.updateCount = value; }
    /**
     * The number of entities skipped
     */
    public Integer getSkipCount() { return this.skipCount; }
    /**
     * The number of entities skipped
     */
    public void setSkipCount(Integer value) { this.skipCount = value; }
    /**
     * The number of errors encountered during sync
     */
    public Integer getErrorCount() { return this.errorCount; }
    /**
     * The number of errors encountered during sync
     */
    public void setErrorCount(Integer value) { this.errorCount = value; }
    /**
     * The errors encountered during sync keyed by ERP key
     */
    public Object getErrors() { return this.errors; }
    /**
     * The errors encountered during sync keyed by ERP key
     */
    public void setErrors(Object value) { this.errors = value; }
};
