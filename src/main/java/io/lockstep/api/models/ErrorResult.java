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
 * Represents a failed request.
 */
public class ErrorResult
{
    private String type;
    private String title;
    private Integer status;
    private String detail;
    private String instance;

    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getInstance() {
        return this.instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }
}
