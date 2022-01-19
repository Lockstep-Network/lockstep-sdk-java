
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
 * @version    2022.3
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * An API Key is an authentication token that you may use with the Lockstep API.  Because API Keys
 * do not have an expiration date, they are well suited for unattended processes.  Each API Key
 * is associated with a user, and may be revoked to prevent it from accessing the Lockstep API.
 * When you create an API Key, make sure to save the value in a secure location.  Lockstep cannot
 * retrieve an API Key once it is created.
 *
 * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
 */
public class ApiKeyModel
{
    private String apiKeyId;
    private String groupKey;
    private String name;
    private String apiKey;
    private String keyPrefix;
    private String created;
    private String createdUserId;
    private String revoked;
    private String revokedUserId;
    private String expires;

    /**
     * The unique identifier for the API key.
     *
     * @return The field apiKeyId
     */
    public String getApiKeyId() { return this.apiKeyId; }
    /**
     * The unique identifier for the API key.
     *
     * @param value The new value for apiKeyId
     */
    public void setApiKeyId(String value) { this.apiKeyId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The name of the API key.
     *
     * @return The field name
     */
    public String getName() { return this.name; }
    /**
     * The name of the API key.
     *
     * @param value The new value for name
     */
    public void setName(String value) { this.name = value; }
    /**
     * The API key to use for authentication. This will only be returned upon creation of the API key.
     * All other times, this value will be `null`.
     *
     * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @return The field apiKey
     */
    public String getApiKey() { return this.apiKey; }
    /**
     * The API key to use for authentication. This will only be returned upon creation of the API key.
     * All other times, this value will be `null`.
     *
     * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @param value The new value for apiKey
     */
    public void setApiKey(String value) { this.apiKey = value; }
    /**
     * The first 10 characters of the API key.  This information can be used to ensure that you are
     * looking at the correct API Key, but cannot be used for authentication.
     *
     * @return The field keyPrefix
     */
    public String getKeyPrefix() { return this.keyPrefix; }
    /**
     * The first 10 characters of the API key.  This information can be used to ensure that you are
     * looking at the correct API Key, but cannot be used for authentication.
     *
     * @param value The new value for keyPrefix
     */
    public void setKeyPrefix(String value) { this.keyPrefix = value; }
    /**
     * The date the API key was created.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date the API key was created.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The user that created the API key.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The user that created the API key.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the API key was revoked.
     *
     * @return The field revoked
     */
    public String getRevoked() { return this.revoked; }
    /**
     * The date the API key was revoked.
     *
     * @param value The new value for revoked
     */
    public void setRevoked(String value) { this.revoked = value; }
    /**
     * The user who revoked the API key.
     *
     * @return The field revokedUserId
     */
    public String getRevokedUserId() { return this.revokedUserId; }
    /**
     * The user who revoked the API key.
     *
     * @param value The new value for revokedUserId
     */
    public void setRevokedUserId(String value) { this.revokedUserId = value; }
    /**
     * The UTC datetime when the API key expires.
     *
     * @return The field expires
     */
    public String getExpires() { return this.expires; }
    /**
     * The UTC datetime when the API key expires.
     *
     * @param value The new value for expires
     */
    public void setExpires(String value) { this.expires = value; }
};
