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
 */
public class LockstepResponse<T>
{
    private Boolean success;
    private T value;
    private ErrorResult error;
    private Exception exception;

    public Boolean isSuccess() {
        return this.success;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ErrorResult getError() {
        return this.error;
    }

    public void setError(ErrorResult error) {
        this.error = error;
    }

    public void setException(Exception e) {
        this.exception = e;
    }

    public Exception getException() {
        return this.exception;
    }
}