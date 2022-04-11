
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
 * Model containing information to create a new developer account.
 */
public class DeveloperAccountSubmitModel
{
    private @NotNull String name;
    private @NotNull String email;
    private @NotNull String companyName;

    /**
     * The name of the developer.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of the developer.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The email address of the developer.
     *
     * @return The field email
     */
    public @NotNull String getEmail() { return this.email; }
    /**
     * The email address of the developer.
     *
     * @param value The new value for email
     */
    public void setEmail(@NotNull String value) { this.email = value; }
    /**
     * The company name of the developer.
     *
     * @return The field companyName
     */
    public @NotNull String getCompanyName() { return this.companyName; }
    /**
     * The company name of the developer.
     *
     * @param value The new value for companyName
     */
    public void setCompanyName(@NotNull String value) { this.companyName = value; }
};
