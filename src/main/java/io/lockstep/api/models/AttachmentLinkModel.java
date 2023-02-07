
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
 * An Attachment Link represents a single link between any nestable object and an attachment
 */
public class AttachmentLinkModel
{
    private @NotNull String groupKey;
    private @NotNull String attachmentId;
    private @NotNull String objectKey;
    private @Nullable String tableKey;
    private @NotNull String created;
    private @NotNull String createdUserId;

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
     * The unique ID of an attachment record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field attachmentId
     */
    public @NotNull String getAttachmentId() { return this.attachmentId; }
    /**
     * The unique ID of an attachment record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for attachmentId
     */
    public void setAttachmentId(@NotNull String value) { this.attachmentId = value; }
    /**
     * An Attachment is connected to an existing item within the Lockstep Platform by the fields `TableKey` and
     * `ObjectKey`.  For example, an Attachment connected to Invoice 12345 would have a `TableKey` value of
     * `Invoice` and an `ObjectKey` value of `12345`.
     *
     * The `ObjectKey` value contains the primary key of the record within the Lockstep Platform to which this
     * Attachment is connected.
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field objectKey
     */
    public @NotNull String getObjectKey() { return this.objectKey; }
    /**
     * An Attachment is connected to an existing item within the Lockstep Platform by the fields `TableKey` and
     * `ObjectKey`.  For example, an Attachment connected to Invoice 12345 would have a `TableKey` value of
     * `Invoice` and an `ObjectKey` value of `12345`.
     *
     * The `ObjectKey` value contains the primary key of the record within the Lockstep Platform to which this
     * Attachment is connected.
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for objectKey
     */
    public void setObjectKey(@NotNull String value) { this.objectKey = value; }
    /**
     * An Attachment is connected to an existing item within the Lockstep Platform by the fields `TableKey` and
     * `ObjectKey`.  For example, an Attachment connected to Invoice 12345 would have a `TableKey` value of
     * `Invoice` and an `ObjectKey` value of `12345`.
     *
     * The `TableKey` value contains the name of the table within the Lockstep Platform to which this Attachment
     * is connected.
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field tableKey
     */
    public @Nullable String getTableKey() { return this.tableKey; }
    /**
     * An Attachment is connected to an existing item within the Lockstep Platform by the fields `TableKey` and
     * `ObjectKey`.  For example, an Attachment connected to Invoice 12345 would have a `TableKey` value of
     * `Invoice` and an `ObjectKey` value of `12345`.
     *
     * The `TableKey` value contains the name of the table within the Lockstep Platform to which this Attachment
     * is connected.
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for tableKey
     */
    public void setTableKey(@Nullable String value) { this.tableKey = value; }
    /**
     * The date the Attachment Link was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date the Attachment Link was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The unique ID of the [UserAccount](https://developer.lockstep.io/docs/useraccountmodel) of the user
     * who created this Attachment Link.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The unique ID of the [UserAccount](https://developer.lockstep.io/docs/useraccountmodel) of the user
     * who created this Attachment Link.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
};
