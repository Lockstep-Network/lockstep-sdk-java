
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
    private @NotNull String apiKeyId;
    private @NotNull String groupKey;
    private @NotNull String name;
    private @Nullable String environment;
    private @Nullable String apiKey;
    private @Nullable String keyPrefix;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @Nullable String revoked;
    private @Nullable String revokedUserId;
    private @Nullable String expires;

    /**
     * The unique identifier for the API key.
     *
     * @return The field apiKeyId
     */
    public @NotNull String getApiKeyId() { return this.apiKeyId; }
    /**
     * The unique identifier for the API key.
     *
     * @param value The new value for apiKeyId
     */
    public void setApiKeyId(@NotNull String value) { this.apiKeyId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * The name of the API key.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of the API key.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * For convenience, a call to createApiKey will contain the name of the environment for this API key,
     * typically SBX or PRD. This can help you distinguish between keys created on the Sandbox environment
     * from those created on Production.
     *
     * @return The field environment
     */
    public @Nullable String getEnvironment() { return this.environment; }
    /**
     * For convenience, a call to createApiKey will contain the name of the environment for this API key,
     * typically SBX or PRD. This can help you distinguish between keys created on the Sandbox environment
     * from those created on Production.
     *
     * @param value The new value for environment
     */
    public void setEnvironment(@Nullable String value) { this.environment = value; }
    /**
     * The API key to use for authentication. This will only be returned upon creation of the API key.
     * All other times, this value will be `null`.
     *
     * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @return The field apiKey
     */
    public @Nullable String getApiKey() { return this.apiKey; }
    /**
     * The API key to use for authentication. This will only be returned upon creation of the API key.
     * All other times, this value will be `null`.
     *
     * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @param value The new value for apiKey
     */
    public void setApiKey(@Nullable String value) { this.apiKey = value; }
    /**
     * The first 10 characters of the API key.  This information can be used to ensure that you are
     * looking at the correct API Key, but cannot be used for authentication.
     *
     * @return The field keyPrefix
     */
    public @Nullable String getKeyPrefix() { return this.keyPrefix; }
    /**
     * The first 10 characters of the API key.  This information can be used to ensure that you are
     * looking at the correct API Key, but cannot be used for authentication.
     *
     * @param value The new value for keyPrefix
     */
    public void setKeyPrefix(@Nullable String value) { this.keyPrefix = value; }
    /**
     * The date the API key was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date the API key was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The user that created the API key.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The user that created the API key.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date the API key was revoked.
     *
     * @return The field revoked
     */
    public @Nullable String getRevoked() { return this.revoked; }
    /**
     * The date the API key was revoked.
     *
     * @param value The new value for revoked
     */
    public void setRevoked(@Nullable String value) { this.revoked = value; }
    /**
     * The user who revoked the API key.
     *
     * @return The field revokedUserId
     */
    public @Nullable String getRevokedUserId() { return this.revokedUserId; }
    /**
     * The user who revoked the API key.
     *
     * @param value The new value for revokedUserId
     */
    public void setRevokedUserId(@Nullable String value) { this.revokedUserId = value; }
    /**
     * The UTC datetime when the API key expires.
     *
     * @return The field expires
     */
    public @Nullable String getExpires() { return this.expires; }
    /**
     * The UTC datetime when the API key expires.
     *
     * @param value The new value for expires
     */
    public void setExpires(@Nullable String value) { this.expires = value; }
};
