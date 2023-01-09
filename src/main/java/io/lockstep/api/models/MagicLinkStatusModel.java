
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
 * Contains information about the user's magic link
 */
public class MagicLinkStatusModel
{
    private @NotNull String magicLinkId;
    private @NotNull String applicationId;
    private @NotNull String companyId;
    private @Nullable String accountingProfileId;
    private @NotNull String expires;

    /**
     * The id of the Magic link used to authenticate.
     *
     * @return The field magicLinkId
     */
    public @NotNull String getMagicLinkId() { return this.magicLinkId; }
    /**
     * The id of the Magic link used to authenticate.
     *
     * @param value The new value for magicLinkId
     */
    public void setMagicLinkId(@NotNull String value) { this.magicLinkId = value; }
    /**
     * The id of the application for the Magic Link
     *
     * @return The field applicationId
     */
    public @NotNull String getApplicationId() { return this.applicationId; }
    /**
     * The id of the application for the Magic Link
     *
     * @param value The new value for applicationId
     */
    public void setApplicationId(@NotNull String value) { this.applicationId = value; }
    /**
     * The id of the target company for the Magic Link
     *
     * @return The field companyId
     */
    public @NotNull String getCompanyId() { return this.companyId; }
    /**
     * The id of the target company for the Magic Link
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@NotNull String value) { this.companyId = value; }
    /**
     * The id of the accounting profile for the Magic Link
     *
     * @return The field accountingProfileId
     */
    public @Nullable String getAccountingProfileId() { return this.accountingProfileId; }
    /**
     * The id of the accounting profile for the Magic Link
     *
     * @param value The new value for accountingProfileId
     */
    public void setAccountingProfileId(@Nullable String value) { this.accountingProfileId = value; }
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
};
