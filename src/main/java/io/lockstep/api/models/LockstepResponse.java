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
 * Results of a Lockstep API request
 *
 * @author jkirk
 * @version $Id: $Id
 */
public class LockstepResponse<T>
{
    private Boolean success;
    private T value;
    private ErrorResult error;
    private Exception exception;

    /**
     * <p>isSuccess.</p>
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean isSuccess() {
        return this.success;
    }

    /**
     * <p>Getter for the field <code>success</code>.</p>
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * <p>Setter for the field <code>success</code>.</p>
     *
     * @param success a {@link java.lang.Boolean} object.
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * <p>Getter for the field <code>value</code>.</p>
     *
     * @return a T object.
     */
    public T getValue() {
        return this.value;
    }

    /**
     * <p>Setter for the field <code>value</code>.</p>
     *
     * @param value a T object.
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * <p>Getter for the field <code>error</code>.</p>
     *
     * @return a {@link io.lockstep.api.models.ErrorResult} object.
     */
    public ErrorResult getError() {
        return this.error;
    }

    /**
     * <p>Setter for the field <code>error</code>.</p>
     *
     * @param error a {@link io.lockstep.api.models.ErrorResult} object.
     */
    public void setError(ErrorResult error) {
        this.error = error;
    }

    /**
     * <p>Setter for the field <code>exception</code>.</p>
     *
     * @param e a {@link java.lang.Exception} object.
     */
    public void setException(Exception e) {
        this.exception = e;
    }

    /**
     * <p>Getter for the field <code>exception</code>.</p>
     *
     * @return a {@link java.lang.Exception} object.
     */
    public Exception getException() {
        return this.exception;
    }
}
