
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
 * Represents the request to the SAGE GMS API
 */
public class EmailReplyGeneratorRequest
{
    private @NotNull String date;
    private @NotNull String body;
    private @NotNull String subject;

    /**
     * The date associated with the email
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * The date associated with the email
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
    /**
     * The body associated with the email
     *
     * @return The field body
     */
    public @NotNull String getBody() { return this.body; }
    /**
     * The body associated with the email
     *
     * @param value The new value for body
     */
    public void setBody(@NotNull String value) { this.body = value; }
    /**
     * The subject associated with the email
     *
     * @return The field subject
     */
    public @NotNull String getSubject() { return this.subject; }
    /**
     * The subject associated with the email
     *
     * @param value The new value for subject
     */
    public void setSubject(@NotNull String value) { this.subject = value; }
};
