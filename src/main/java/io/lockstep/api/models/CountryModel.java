
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
 * Country model for ISO-3166
 */
public class CountryModel
{
    private @Nullable String name;
    private @Nullable String alpha2;
    private @Nullable String alpha3;
    private @NotNull Integer countryCode;
    private @Nullable String region;
    private @Nullable String subRegion;
    private @Nullable String intermediateRegion;
    private @NotNull Integer regionCode;
    private @NotNull Integer subRegionCode;
    private @NotNull Integer intermediateRegionCode;
    private @Nullable String frenchName;
    private @Nullable String aliases;

    /**
     * Name of the country
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * Name of the country
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * 2 letter alphabetic code for the given country
     *
     * @return The field alpha2
     */
    public @Nullable String getAlpha2() { return this.alpha2; }
    /**
     * 2 letter alphabetic code for the given country
     *
     * @param value The new value for alpha2
     */
    public void setAlpha2(@Nullable String value) { this.alpha2 = value; }
    /**
     * 3 letter alphabetic code for the given country
     *
     * @return The field alpha3
     */
    public @Nullable String getAlpha3() { return this.alpha3; }
    /**
     * 3 letter alphabetic code for the given country
     *
     * @param value The new value for alpha3
     */
    public void setAlpha3(@Nullable String value) { this.alpha3 = value; }
    /**
     * Unique 3 digit number for the given country
     *
     * @return The field countryCode
     */
    public @NotNull Integer getCountryCode() { return this.countryCode; }
    /**
     * Unique 3 digit number for the given country
     *
     * @param value The new value for countryCode
     */
    public void setCountryCode(@NotNull Integer value) { this.countryCode = value; }
    /**
     * Region of the country
     *
     * @return The field region
     */
    public @Nullable String getRegion() { return this.region; }
    /**
     * Region of the country
     *
     * @param value The new value for region
     */
    public void setRegion(@Nullable String value) { this.region = value; }
    /**
     * Subregion of the country
     *
     * @return The field subRegion
     */
    public @Nullable String getSubRegion() { return this.subRegion; }
    /**
     * Subregion of the country
     *
     * @param value The new value for subRegion
     */
    public void setSubRegion(@Nullable String value) { this.subRegion = value; }
    /**
     * Intermediate region of the country
     *
     * @return The field intermediateRegion
     */
    public @Nullable String getIntermediateRegion() { return this.intermediateRegion; }
    /**
     * Intermediate region of the country
     *
     * @param value The new value for intermediateRegion
     */
    public void setIntermediateRegion(@Nullable String value) { this.intermediateRegion = value; }
    /**
     * Numeric code for a region
     *
     * @return The field regionCode
     */
    public @NotNull Integer getRegionCode() { return this.regionCode; }
    /**
     * Numeric code for a region
     *
     * @param value The new value for regionCode
     */
    public void setRegionCode(@NotNull Integer value) { this.regionCode = value; }
    /**
     * Numeric code for a subregion
     *
     * @return The field subRegionCode
     */
    public @NotNull Integer getSubRegionCode() { return this.subRegionCode; }
    /**
     * Numeric code for a subregion
     *
     * @param value The new value for subRegionCode
     */
    public void setSubRegionCode(@NotNull Integer value) { this.subRegionCode = value; }
    /**
     * Numeric code for an intermediate region
     *
     * @return The field intermediateRegionCode
     */
    public @NotNull Integer getIntermediateRegionCode() { return this.intermediateRegionCode; }
    /**
     * Numeric code for an intermediate region
     *
     * @param value The new value for intermediateRegionCode
     */
    public void setIntermediateRegionCode(@NotNull Integer value) { this.intermediateRegionCode = value; }
    /**
     * French name of the country
     *
     * @return The field frenchName
     */
    public @Nullable String getFrenchName() { return this.frenchName; }
    /**
     * French name of the country
     *
     * @param value The new value for frenchName
     */
    public void setFrenchName(@Nullable String value) { this.frenchName = value; }
    /**
     * A different name for a country
     *
     * @return The field aliases
     */
    public @Nullable String getAliases() { return this.aliases; }
    /**
     * A different name for a country
     *
     * @param value The new value for aliases
     */
    public void setAliases(@Nullable String value) { this.aliases = value; }
};
