
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


/**
 * Model used to submit a transfer ownership request
 */
public class TransferOwnerSubmitModel
{
    private String targetUserId;

    /**
     * The ID of the user to transfer ownership to.
     *
     * @return The field targetUserId
     */
    public String getTargetUserId() { return this.targetUserId; }
    /**
     * The ID of the user to transfer ownership to.
     *
     * @param value The new value for targetUserId
     */
    public void setTargetUserId(String value) { this.targetUserId = value; }
};
