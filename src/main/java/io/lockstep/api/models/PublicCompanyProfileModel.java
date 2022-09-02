
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Contains Public Company Profile data.
 */
public class PublicCompanyProfileModel
{
    private @NotNull String companyId;
    private @Nullable String companyName;
    private @Nullable String companyLogoUrl;
    private @Nullable String website;
    private @Nullable String description;
    private @Nullable String publicUrlSlug;

    /**
     * The unique ID of the company associated with this profile.
     *
     * @return The field companyId
     */
    public @NotNull String getCompanyId() { return this.companyId; }
    /**
     * The unique ID of the company associated with this profile.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@NotNull String value) { this.companyId = value; }
    /**
     * The short name of the company associated with this profile.
     *
     * @return The field companyName
     */
    public @Nullable String getCompanyName() { return this.companyName; }
    /**
     * The short name of the company associated with this profile.
     *
     * @param value The new value for companyName
     */
    public void setCompanyName(@Nullable String value) { this.companyName = value; }
    /**
     * The URL of this company's logo, if known.
     *
     * @return The field companyLogoUrl
     */
    public @Nullable String getCompanyLogoUrl() { return this.companyLogoUrl; }
    /**
     * The URL of this company's logo, if known.
     *
     * @param value The new value for companyLogoUrl
     */
    public void setCompanyLogoUrl(@Nullable String value) { this.companyLogoUrl = value; }
    /**
     * Website URL for the company associated with this profile.
     *
     * @return The field website
     */
    public @Nullable String getWebsite() { return this.website; }
    /**
     * Website URL for the company associated with this profile.
     *
     * @param value The new value for website
     */
    public void setWebsite(@Nullable String value) { this.website = value; }
    /**
     * Description of the company associated with this profile.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * Description of the company associated with this profile.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * The public url slug for this Public Company Profile.
     *
     * @return The field publicUrlSlug
     */
    public @Nullable String getPublicUrlSlug() { return this.publicUrlSlug; }
    /**
     * The public url slug for this Public Company Profile.
     *
     * @param value The new value for publicUrlSlug
     */
    public void setPublicUrlSlug(@Nullable String value) { this.publicUrlSlug = value; }
};
