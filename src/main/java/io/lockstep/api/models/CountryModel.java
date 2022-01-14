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


public class CountryModel
{
    private String name;
    private String alpha2;
    private String alpha3;
    private Integer countryCode;
    private String region;
    private String subRegion;
    private String intermediateRegion;
    private Integer regionCode;
    private Integer subRegionCode;
    private Integer intermediateRegionCode;
    private String frenchName;
    private String aliases;

    /**
     * @return Name of the country
     */
    public String getName() { return this.name; }
    /**
     * @param value - Name of the country
     */
    public void setName(String value) { this.name = value; }
    /**
     * @return 2 letter alphabetic code for the given country
     */
    public String getAlpha2() { return this.alpha2; }
    /**
     * @param value - 2 letter alphabetic code for the given country
     */
    public void setAlpha2(String value) { this.alpha2 = value; }
    /**
     * @return 3 letter alphabetic code for the given country
     */
    public String getAlpha3() { return this.alpha3; }
    /**
     * @param value - 3 letter alphabetic code for the given country
     */
    public void setAlpha3(String value) { this.alpha3 = value; }
    /**
     * @return Unique 3 digit number for the given country
     */
    public Integer getCountryCode() { return this.countryCode; }
    /**
     * @param value - Unique 3 digit number for the given country
     */
    public void setCountryCode(Integer value) { this.countryCode = value; }
    /**
     * @return Region of the country
     */
    public String getRegion() { return this.region; }
    /**
     * @param value - Region of the country
     */
    public void setRegion(String value) { this.region = value; }
    /**
     * @return Subregion of the country
     */
    public String getSubRegion() { return this.subRegion; }
    /**
     * @param value - Subregion of the country
     */
    public void setSubRegion(String value) { this.subRegion = value; }
    /**
     * @return Intermediate region of the country
     */
    public String getIntermediateRegion() { return this.intermediateRegion; }
    /**
     * @param value - Intermediate region of the country
     */
    public void setIntermediateRegion(String value) { this.intermediateRegion = value; }
    /**
     * @return Numeric code for a region
     */
    public Integer getRegionCode() { return this.regionCode; }
    /**
     * @param value - Numeric code for a region
     */
    public void setRegionCode(Integer value) { this.regionCode = value; }
    /**
     * @return Numeric code for a subregion
     */
    public Integer getSubRegionCode() { return this.subRegionCode; }
    /**
     * @param value - Numeric code for a subregion
     */
    public void setSubRegionCode(Integer value) { this.subRegionCode = value; }
    /**
     * @return Numeric code for an intermediate region
     */
    public Integer getIntermediateRegionCode() { return this.intermediateRegionCode; }
    /**
     * @param value - Numeric code for an intermediate region
     */
    public void setIntermediateRegionCode(Integer value) { this.intermediateRegionCode = value; }
    /**
     * @return French name of the country
     */
    public String getFrenchName() { return this.frenchName; }
    /**
     * @param value - French name of the country
     */
    public void setFrenchName(String value) { this.frenchName = value; }
    /**
     * @return A different name for a country
     */
    public String getAliases() { return this.aliases; }
    /**
     * @param value - A different name for a country
     */
    public void setAliases(String value) { this.aliases = value; }
};
