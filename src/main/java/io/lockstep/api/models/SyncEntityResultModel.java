
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
 * @version    2022.2
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
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getInsertCount() { return this.insertCount; }
    /**
     * The number of entities inserted
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setInsertCount(Integer value) { this.insertCount = value; }
    /**
     * The number of entities updated
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getUpdateCount() { return this.updateCount; }
    /**
     * The number of entities updated
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setUpdateCount(Integer value) { this.updateCount = value; }
    /**
     * The number of entities skipped
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getSkipCount() { return this.skipCount; }
    /**
     * The number of entities skipped
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setSkipCount(Integer value) { this.skipCount = value; }
    /**
     * The number of errors encountered during sync
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getErrorCount() { return this.errorCount; }
    /**
     * The number of errors encountered during sync
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setErrorCount(Integer value) { this.errorCount = value; }
    /**
     * The errors encountered during sync keyed by ERP key
     *
     * @return a {@link java.lang.Object} object.
     */
    public Object getErrors() { return this.errors; }
    /**
     * The errors encountered during sync keyed by ERP key
     *
     * @param value a {@link java.lang.Object} object.
     */
    public void setErrors(Object value) { this.errors = value; }
};
