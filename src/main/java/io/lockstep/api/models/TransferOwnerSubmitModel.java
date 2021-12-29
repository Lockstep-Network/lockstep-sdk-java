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


public class TransferOwnerSubmitModel
{
    private String targetUserId;

    /**
     * The ID of the user to transfer ownership to.
     */
    public String getTargetUserId() { return this.targetUserId; }
    /**
     * The ID of the user to transfer ownership to.
     */
    public void setTargetUserId(String value) { this.targetUserId = value; }
};
