
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
 * @version    2021.39
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;
public class ApiKeyModel
{
    private String apiKeyId;
    private String groupKey;
    private String name;
    private String apiKey;
    private String keyPrefix;
    private Date created;
    private String createdUserId;
    private Date revoked;
    private String revokedUserId;
    private Date expires;

    /**
     * The unique identifier for the API key.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getApiKeyId() { return this.apiKeyId; }
    /**
     * The unique identifier for the API key.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setApiKeyId(String value) { this.apiKeyId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The name of the API key.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName() { return this.name; }
    /**
     * The name of the API key.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setName(String value) { this.name = value; }
    /**
     * The API key to use for authentication. This will only be returned upon creation of the API key.
     * All other times, this value will be `null`.
     *
     * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getApiKey() { return this.apiKey; }
    /**
     * The API key to use for authentication. This will only be returned upon creation of the API key.
     * All other times, this value will be `null`.
     *
     * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setApiKey(String value) { this.apiKey = value; }
    /**
     * The first 10 characters of the API key.  This information can be used to ensure that you are
     * looking at the correct API Key, but cannot be used for authentication.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getKeyPrefix() { return this.keyPrefix; }
    /**
     * The first 10 characters of the API key.  This information can be used to ensure that you are
     * looking at the correct API Key, but cannot be used for authentication.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setKeyPrefix(String value) { this.keyPrefix = value; }
    /**
     * The date the API key was created.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * The date the API key was created.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The user that created the API key.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The user that created the API key.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the API key was revoked.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getRevoked() { return this.revoked; }
    /**
     * The date the API key was revoked.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setRevoked(Date value) { this.revoked = value; }
    /**
     * The user who revoked the API key.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRevokedUserId() { return this.revokedUserId; }
    /**
     * The user who revoked the API key.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setRevokedUserId(String value) { this.revokedUserId = value; }
    /**
     * The UTC datetime when the API key expires.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getExpires() { return this.expires; }
    /**
     * The UTC datetime when the API key expires.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setExpires(Date value) { this.expires = value; }
};
