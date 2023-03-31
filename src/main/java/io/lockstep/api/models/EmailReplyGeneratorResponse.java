
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
 * Represents the response from SAGE GMS API
 */
public class EmailReplyGeneratorResponse
{
    private @Nullable String message_id;
    private @Nullable EmailReplyGeneratorSuggestions[] suggestions;

    /**
     * The id for this request in the GMS system
     *
     * @return The field message_id
     */
    public @Nullable String getMessage_id() { return this.message_id; }
    /**
     * The id for this request in the GMS system
     *
     * @param value The new value for message_id
     */
    public void setMessage_id(@Nullable String value) { this.message_id = value; }
    /**
     * A list of suggested email reply responses
     *
     * @return The field suggestions
     */
    public @Nullable EmailReplyGeneratorSuggestions[] getSuggestions() { return this.suggestions; }
    /**
     * A list of suggested email reply responses
     *
     * @param value The new value for suggestions
     */
    public void setSuggestions(@Nullable EmailReplyGeneratorSuggestions[] value) { this.suggestions = value; }
};
