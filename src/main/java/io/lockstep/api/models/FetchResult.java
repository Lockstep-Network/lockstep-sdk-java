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

/**
 * Represents the results of a query.  The total number of records matching the query are in the `totalCount` parameter.
 * You can use `pageSize` and `pageNumber` to continue fetching data until `totalCount` is reached.
 *
 * @author jkirk
 * @version $Id: $Id
 */
public class FetchResult<T>
{
    private T[] records;
    private Integer totalCount;
    private Integer pageSize;
    private Integer pageNumber;

    /**
     * <p>Getter for the field <code>records</code>.</p>
     *
     * @return an array of T objects.
     */
    public T[] getRecords() {
        return this.records;
    }

    /**
     * <p>Setter for the field <code>records</code>.</p>
     *
     * @param records an array of T objects.
     */
    public void setRecords(T[] records) {
        this.records = records;
    }

    /**
     * <p>Getter for the field <code>totalCount</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>Setter for the field <code>totalCount</code>.</p>
     *
     * @param totalCount a {@link java.lang.Integer} object.
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>Getter for the field <code>pageSize</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>Setter for the field <code>pageSize</code>.</p>
     *
     * @param pageSize a {@link java.lang.Integer} object.
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>Getter for the field <code>pageNumber</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * <p>Setter for the field <code>pageNumber</code>.</p>
     *
     * @param pageNumber a {@link java.lang.Integer} object.
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
}

