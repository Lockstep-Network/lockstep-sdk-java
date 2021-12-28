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


public class TransferOwnerModel
{
    private UserAccountModel previousOwner;
    private UserAccountModel newOwner;

    /**
     * The previous owner of the account.
     */
    public UserAccountModel getpreviousOwner() { return this.previousOwner; }
    /**
     * The previous owner of the account.
     */
    public void setpreviousOwner(UserAccountModel value) { this.previousOwner = value; }
    /**
     * The new owner of the account.
     */
    public UserAccountModel getnewOwner() { return this.newOwner; }
    /**
     * The new owner of the account.
     */
    public void setnewOwner(UserAccountModel value) { this.newOwner = value; }
};
