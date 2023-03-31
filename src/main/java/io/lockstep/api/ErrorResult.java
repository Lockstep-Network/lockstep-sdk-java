
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

package io.lockstep.api;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a failed API request.
 */
public class ErrorResult {
    private @NotNull String type;
    private @NotNull String title;
    private @NotNull Integer status;
    private @NotNull String detail;
    private @NotNull String instance;
    private @NotNull String content;

    /**
     * A description of the type of error that occurred.
     *
     * @return The field type
     */
    public @NotNull String getType() {
        return this.type;
    }

    /**
     * A description of the type of error that occurred.
     *
     * @param value The new value for type
     */
    public void setType(@NotNull String value) {
        this.type = value;
    }

    /**
     * A short title describing the error.
     *
     * @return The field title
     */
    public @NotNull String getTitle() {
        return this.title;
    }

    /**
     * A short title describing the error.
     *
     * @param value The new value for title
     */
    public void setTitle(@NotNull String value) {
        this.title = value;
    }

    /**
     * If an error code is applicable, this contains an error number.
     *
     * @return The field status
     */
    public @NotNull Integer getStatus() {
        return this.status;
    }

    /**
     * If an error code is applicable, this contains an error number.
     *
     * @param value The new value for status
     */
    public void setStatus(@NotNull Integer value) {
        this.status = value;
    }

    /**
     * If detailed information about this error is available, this value contains
     * more information.
     *
     * @return The field detail
     */
    public @NotNull String getDetail() {
        return this.detail;
    }

    /**
     * If detailed information about this error is available, this value contains
     * more information.
     *
     * @param value The new value for detail
     */
    public void setDetail(@NotNull String value) {
        this.detail = value;
    }

    /**
     * If this error corresponds to a specific instance or object, this field
     * indicates which one.
     *
     * @return The field instance
     */
    public @NotNull String getInstance() {
        return this.instance;
    }

    /**
     * If this error corresponds to a specific instance or object, this field
     * indicates which one.
     *
     * @param value The new value for instance
     */
    public void setInstance(@NotNull String value) {
        this.instance = value;
    }

    /**
     * The full content of the HTTP response.
     *
     * @return The field content
     */
    public @NotNull String getContent() {
        return this.content;
    }

    /**
     * The full content of the HTTP response.
     *
     * @param value The new value for content
     */
    public void setContent(@NotNull String value) {
        this.content = value;
    }
};
