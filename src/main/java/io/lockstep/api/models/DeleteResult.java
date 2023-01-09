
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
 * Information about result of delete operations
 */
public class DeleteResult
{
    private @Nullable String[] messages;

    /**
     * If the API call produced messages, this element will contain a list of user-visible
     * text strings that contain information about what work occurred in the API.
     *
     * @return The field messages
     */
    public @Nullable String[] getMessages() { return this.messages; }
    /**
     * If the API call produced messages, this element will contain a list of user-visible
     * text strings that contain information about what work occurred in the API.
     *
     * @param value The new value for messages
     */
    public void setMessages(@Nullable String[] value) { this.messages = value; }
};
