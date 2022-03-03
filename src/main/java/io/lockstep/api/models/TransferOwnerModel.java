
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Model from the transfer ownership process.
 */
public class TransferOwnerModel
{
    private @Nullable UserAccountModel previousOwner;
    private @Nullable UserAccountModel newOwner;

    /**
     * The previous owner of the account.
     *
     * @return The field previousOwner
     */
    public @Nullable UserAccountModel getPreviousOwner() { return this.previousOwner; }
    /**
     * The previous owner of the account.
     *
     * @param value The new value for previousOwner
     */
    public void setPreviousOwner(@Nullable UserAccountModel value) { this.previousOwner = value; }
    /**
     * The new owner of the account.
     *
     * @return The field newOwner
     */
    public @Nullable UserAccountModel getNewOwner() { return this.newOwner; }
    /**
     * The new owner of the account.
     *
     * @param value The new value for newOwner
     */
    public void setNewOwner(@Nullable UserAccountModel value) { this.newOwner = value; }
};
