
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
 * Model containing information to create a new developer account.
 */
public class DeveloperAccountSubmitModel
{
    private @Nullable String firstName;
    private @Nullable String lastName;
    private @NotNull String email;
    private @NotNull String companyName;

    /**
     * The first name of the person requesting the developer account.
     *
     * @return The field firstName
     */
    public @Nullable String getFirstName() { return this.firstName; }
    /**
     * The first name of the person requesting the developer account.
     *
     * @param value The new value for firstName
     */
    public void setFirstName(@Nullable String value) { this.firstName = value; }
    /**
     * The last name of the person requesting the developer account.
     *
     * @return The field lastName
     */
    public @Nullable String getLastName() { return this.lastName; }
    /**
     * The last name of the person requesting the developer account.
     *
     * @param value The new value for lastName
     */
    public void setLastName(@Nullable String value) { this.lastName = value; }
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
