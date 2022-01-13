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
 *
 * @author jkirk
 * @version $Id: $Id
 */
public class ErrorResult
{
    private String type;
    private String title;
    private Integer status;
    private String detail;
    private String instance;

    
    /**
     * <p>Getter for the field <code>type</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getType() {
        return this.type;
    }

    /**
     * <p>Setter for the field <code>type</code>.</p>
     *
     * @param type a {@link java.lang.String} object.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>Getter for the field <code>title</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * <p>Setter for the field <code>title</code>.</p>
     *
     * @param title a {@link java.lang.String} object.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>Getter for the field <code>status</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>Setter for the field <code>status</code>.</p>
     *
     * @param status a {@link java.lang.Integer} object.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>Getter for the field <code>detail</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * <p>Setter for the field <code>detail</code>.</p>
     *
     * @param detail a {@link java.lang.String} object.
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>Getter for the field <code>instance</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * <p>Setter for the field <code>instance</code>.</p>
     *
     * @param instance a {@link java.lang.String} object.
     */
    public void setInstance(String instance) {
        this.instance = instance;
    }
}
