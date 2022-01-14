/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
 */

package io.lockstep.api.models;

/**
 * Represents a failed request.
 *
 * @author jkirk
 * @version $Id: $Id
 */
public class ActionResultModel
{
    private String[] messages;

    /**
     * <p>Getter for the field <code>messages</code>.</p>
     *
     * @return an array of {@link java.lang.String} objects.
     */
    public String[] getMessages() {
        return this.messages;
    }

    /**
     * <p>Setter for the field <code>messages</code>.</p>
     *
     * @param messages an array of {@link java.lang.String} objects.
     */
    public void setMessages(String[] messages) {
        this.messages = messages;
    }
}
