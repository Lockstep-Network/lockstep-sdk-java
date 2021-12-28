/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
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
    public Integer getinsertCount() { return this.insertCount; }
    /**
     * The number of entities inserted
     */
    public void setinsertCount(Integer value) { this.insertCount = value; }
    /**
     * The number of entities updated
     */
    public Integer getupdateCount() { return this.updateCount; }
    /**
     * The number of entities updated
     */
    public void setupdateCount(Integer value) { this.updateCount = value; }
    /**
     * The number of entities skipped
     */
    public Integer getskipCount() { return this.skipCount; }
    /**
     * The number of entities skipped
     */
    public void setskipCount(Integer value) { this.skipCount = value; }
    /**
     * The number of errors encountered during sync
     */
    public Integer geterrorCount() { return this.errorCount; }
    /**
     * The number of errors encountered during sync
     */
    public void seterrorCount(Integer value) { this.errorCount = value; }
    /**
     * The errors encountered during sync keyed by ERP key
     */
    public Object geterrors() { return this.errors; }
    /**
     * The errors encountered during sync keyed by ERP key
     */
    public void seterrors(Object value) { this.errors = value; }
};
