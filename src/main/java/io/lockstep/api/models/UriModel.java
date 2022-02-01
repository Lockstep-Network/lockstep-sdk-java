
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


/**
 * Represents a Uri for download link
 */
public class UriModel
{
    private String downloadLink;

    /**
     * Represents the download link
     *
     * @return The field downloadLink
     */
    public String getDownloadLink() { return this.downloadLink; }
    /**
     * Represents the download link
     *
     * @param value The new value for downloadLink
     */
    public void setDownloadLink(String value) { this.downloadLink = value; }
};
