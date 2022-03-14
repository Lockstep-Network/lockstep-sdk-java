
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
 * Aggregated Attachment status information.
 */
public class AttachmentHeaderInfoModel
{
    private @NotNull String groupKey;
    private @Nullable String companyId;
    private @NotNull Integer totalAttachments;
    private @NotNull Integer totalArchived;
    private @NotNull Integer totalActive;

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
     * The CompanyId associated with the attachment status report. Providing a null value will
     * return an attachment summary for all attachments associated to the provided GroupKey
     *
     * @return The field companyId
     */
    public @Nullable String getCompanyId() { return this.companyId; }
    /**
     * The CompanyId associated with the attachment status report. Providing a null value will
     * return an attachment summary for all attachments associated to the provided GroupKey
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@Nullable String value) { this.companyId = value; }
    /**
     * The total number of attachments associated with the provided GroupKey and CompanyId.
     *
     * @return The field totalAttachments
     */
    public @NotNull Integer getTotalAttachments() { return this.totalAttachments; }
    /**
     * The total number of attachments associated with the provided GroupKey and CompanyId.
     *
     * @param value The new value for totalAttachments
     */
    public void setTotalAttachments(@NotNull Integer value) { this.totalAttachments = value; }
    /**
     * The total number of archived attachments associated with the provided GroupKey and CompanyId.
     *
     * @return The field totalArchived
     */
    public @NotNull Integer getTotalArchived() { return this.totalArchived; }
    /**
     * The total number of archived attachments associated with the provided GroupKey and CompanyId.
     *
     * @param value The new value for totalArchived
     */
    public void setTotalArchived(@NotNull Integer value) { this.totalArchived = value; }
    /**
     * The total number of active attachments associated with the provided GroupKey and CompanyId.
     *
     * @return The field totalActive
     */
    public @NotNull Integer getTotalActive() { return this.totalActive; }
    /**
     * The total number of active attachments associated with the provided GroupKey and CompanyId.
     *
     * @param value The new value for totalActive
     */
    public void setTotalActive(@NotNull Integer value) { this.totalActive = value; }
};
