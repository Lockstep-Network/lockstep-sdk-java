
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
 * Optional meta data for image view box settings.
 */
public class ViewBoxSettingsModel
{
    private @Nullable Double logoViewBoxMinX;
    private @Nullable Double logoViewBoxMinY;
    private @Nullable Double logoViewBoxWidth;
    private @Nullable Double logoViewBoxHeight;

    /**
     * ViewBox minX setting for this Company's logo.
     *
     * @return The field logoViewBoxMinX
     */
    public @Nullable Double getLogoViewBoxMinX() { return this.logoViewBoxMinX; }
    /**
     * ViewBox minX setting for this Company's logo.
     *
     * @param value The new value for logoViewBoxMinX
     */
    public void setLogoViewBoxMinX(@Nullable Double value) { this.logoViewBoxMinX = value; }
    /**
     * ViewBox minY setting for this Company's logo.
     *
     * @return The field logoViewBoxMinY
     */
    public @Nullable Double getLogoViewBoxMinY() { return this.logoViewBoxMinY; }
    /**
     * ViewBox minY setting for this Company's logo.
     *
     * @param value The new value for logoViewBoxMinY
     */
    public void setLogoViewBoxMinY(@Nullable Double value) { this.logoViewBoxMinY = value; }
    /**
     * ViewBox width setting for this Company's logo.
     *
     * @return The field logoViewBoxWidth
     */
    public @Nullable Double getLogoViewBoxWidth() { return this.logoViewBoxWidth; }
    /**
     * ViewBox width setting for this Company's logo.
     *
     * @param value The new value for logoViewBoxWidth
     */
    public void setLogoViewBoxWidth(@Nullable Double value) { this.logoViewBoxWidth = value; }
    /**
     * ViewBox height setting for this Company's logo.
     *
     * @return The field logoViewBoxHeight
     */
    public @Nullable Double getLogoViewBoxHeight() { return this.logoViewBoxHeight; }
    /**
     * ViewBox height setting for this Company's logo.
     *
     * @param value The new value for logoViewBoxHeight
     */
    public void setLogoViewBoxHeight(@Nullable Double value) { this.logoViewBoxHeight = value; }
};
