
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
 * Represents a magic link that can be used to log in to a Lockstep application.
 */
public class MagicLinkModel
{
    private @NotNull String magicLinkId;
    private @NotNull String groupKey;
    private @NotNull String userId;
    private @NotNull String userRole;
    private @NotNull String applicationId;
    private @NotNull String expires;
    private @Nullable String revoked;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String companyId;
    private @Nullable String accountingProfileId;
    private @Nullable String magicLinkUrl;
    private @Nullable UserAccountModel user;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field magicLinkId
     */
    public @NotNull String getMagicLinkId() { return this.magicLinkId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for magicLinkId
     */
    public void setMagicLinkId(@NotNull String value) { this.magicLinkId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * The unique ID of the user that this magic link is associated with.
     *
     * @return The field userId
     */
    public @NotNull String getUserId() { return this.userId; }
    /**
     * The unique ID of the user that this magic link is associated with.
     *
     * @param value The new value for userId
     */
    public void setUserId(@NotNull String value) { this.userId = value; }
    /**
     * The ID of the user role for the magic link.
     *
     * @return The field userRole
     */
    public @NotNull String getUserRole() { return this.userRole; }
    /**
     * The ID of the user role for the magic link.
     *
     * @param value The new value for userRole
     */
    public void setUserRole(@NotNull String value) { this.userRole = value; }
    /**
     * The ID of the application for this magic link.
     *
     * @return The field applicationId
     */
    public @NotNull String getApplicationId() { return this.applicationId; }
    /**
     * The ID of the application for this magic link.
     *
     * @param value The new value for applicationId
     */
    public void setApplicationId(@NotNull String value) { this.applicationId = value; }
    /**
     * The UTC date and time when this magic link expires.
     *
     * @return The field expires
     */
    public @NotNull String getExpires() { return this.expires; }
    /**
     * The UTC date and time when this magic link expires.
     *
     * @param value The new value for expires
     */
    public void setExpires(@NotNull String value) { this.expires = value; }
    /**
     * The UTC date and time when this magic link was revoked.
     *
     * @return The field revoked
     */
    public @Nullable String getRevoked() { return this.revoked; }
    /**
     * The UTC date and time when this magic link was revoked.
     *
     * @param value The new value for revoked
     */
    public void setRevoked(@Nullable String value) { this.revoked = value; }
    /**
     * The date that the magic link was created
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date that the magic link was created
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created the magic link
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the magic link
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date that the magic link was last modified
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date that the magic link was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified the magic link
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the magic link
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
    /**
     * The ID of the company associated to this magic link
     *
     * @return The field companyId
     */
    public @Nullable String getCompanyId() { return this.companyId; }
    /**
     * The ID of the company associated to this magic link
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@Nullable String value) { this.companyId = value; }
    /**
     * The ID of the accounting profile associated to this magic link
     *
     * @return The field accountingProfileId
     */
    public @Nullable String getAccountingProfileId() { return this.accountingProfileId; }
    /**
     * The ID of the accounting profile associated to this magic link
     *
     * @param value The new value for accountingProfileId
     */
    public void setAccountingProfileId(@Nullable String value) { this.accountingProfileId = value; }
    /**
     * The created magic link URL. This will only be returned upon creation of the magic link.
     * All other times, this value will be `null`.
     *
     * @return The field magicLinkUrl
     */
    public @Nullable String getMagicLinkUrl() { return this.magicLinkUrl; }
    /**
     * The created magic link URL. This will only be returned upon creation of the magic link.
     * All other times, this value will be `null`.
     *
     * @param value The new value for magicLinkUrl
     */
    public void setMagicLinkUrl(@Nullable String value) { this.magicLinkUrl = value; }
    /**
     * The user associated with this magic link.
     * To retrieve this item, specify `User` in the "Include" parameter for your query.
     *
     * @return The field user
     */
    public @Nullable UserAccountModel getUser() { return this.user; }
    /**
     * The user associated with this magic link.
     * To retrieve this item, specify `User` in the "Include" parameter for your query.
     *
     * @param value The new value for user
     */
    public void setUser(@Nullable UserAccountModel value) { this.user = value; }
};
