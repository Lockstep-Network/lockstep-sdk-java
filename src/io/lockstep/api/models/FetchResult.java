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

package io.lockstep.api;

/**
 * Represents the results of a query.  The total number of records matching the query are in the `totalCount` parameter.
 * You can use `pageSize` and `pageNumber` to continue fetching data until `totalCount` is reached.
 */
public class FetchResult<T>
{
    private T[] records;
    private Integer totalCount;
    private Integer pageSize;
    private Integer pageNumber;

    public T[] getRecords() {
        return this.records;
    }

    public void setRecords(T[] records) {
        this.records = records;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
}

