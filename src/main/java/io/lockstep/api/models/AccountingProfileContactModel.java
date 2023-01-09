
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


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An Accounting Profile Contact has a link to a Contact that is associated with your company's
 * Accounting Profile. These Contacts are secondary contacts to the primary that is on the profile.
 */
public class AccountingProfileContactModel
{
    private @NotNull String accountingProfileContactId;
    private @NotNull String accountingProfileId;
    private @NotNull String contactId;
    private @NotNull String groupKey;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field accountingProfileContactId
     */
    public @NotNull String getAccountingProfileContactId() { return this.accountingProfileContactId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for accountingProfileContactId
     */
    public void setAccountingProfileContactId(@NotNull String value) { this.accountingProfileContactId = value; }
    /**
     * The ID of the profile this contact is belongs to.
     *
     * @return The field accountingProfileId
     */
    public @NotNull String getAccountingProfileId() { return this.accountingProfileId; }
    /**
     * The ID of the profile this contact is belongs to.
     *
     * @param value The new value for accountingProfileId
     */
    public void setAccountingProfileId(@NotNull String value) { this.accountingProfileId = value; }
    /**
     * The ID of the contact that is linked to this profile.
     *
     * @return The field contactId
     */
    public @NotNull String getContactId() { return this.contactId; }
    /**
     * The ID of the contact that is linked to this profile.
     *
     * @param value The new value for contactId
     */
    public void setContactId(@NotNull String value) { this.contactId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * The date on which this record was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date on which this record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created this contact.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this contact.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date on which this record was last modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date on which this record was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this contact.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this contact.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
};
