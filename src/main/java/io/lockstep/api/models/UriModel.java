
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
 * Represents a Uri for download link
 */
public class UriModel
{
    private @Nullable String downloadLink;

    /**
     * Represents the download link
     *
     * @return The field downloadLink
     */
    public @Nullable String getDownloadLink() { return this.downloadLink; }
    /**
     * Represents the download link
     *
     * @param value The new value for downloadLink
     */
    public void setDownloadLink(@Nullable String value) { this.downloadLink = value; }
};
