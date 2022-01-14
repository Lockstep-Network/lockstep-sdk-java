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
 * @version    2022.2
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
     * @return The unique identifier for the API key.
     */
    public String getApiKeyId() { return this.apiKeyId; }
    /**
     * @param value - The unique identifier for the API key.
     */
    public void setApiKeyId(String value) { this.apiKeyId = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The name of the API key.
     */
    public String getName() { return this.name; }
    /**
     * @param value - The name of the API key.
     */
    public void setName(String value) { this.name = value; }
    /**
     * @return The API key to use for authentication. This will only be returned upon creation of the API key. All other times, this value will be `null`. For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     */
    public String getApiKey() { return this.apiKey; }
    /**
     * @param value - The API key to use for authentication. This will only be returned upon creation of the API key. All other times, this value will be `null`. For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     */
    public void setApiKey(String value) { this.apiKey = value; }
    /**
     * @return The first 10 characters of the API key. This information can be used to ensure that you are looking at the correct API Key, but cannot be used for authentication.
     */
    public String getKeyPrefix() { return this.keyPrefix; }
    /**
     * @param value - The first 10 characters of the API key. This information can be used to ensure that you are looking at the correct API Key, but cannot be used for authentication.
     */
    public void setKeyPrefix(String value) { this.keyPrefix = value; }
    /**
     * @return The date the API key was created.
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - The date the API key was created.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The user that created the API key.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The user that created the API key.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return The date the API key was revoked.
     */
    public Date getRevoked() { return this.revoked; }
    /**
     * @param value - The date the API key was revoked.
     */
    public void setRevoked(Date value) { this.revoked = value; }
    /**
     * @return The user who revoked the API key.
     */
    public String getRevokedUserId() { return this.revokedUserId; }
    /**
     * @param value - The user who revoked the API key.
     */
    public void setRevokedUserId(String value) { this.revokedUserId = value; }
    /**
     * @return The UTC datetime when the API key expires.
     */
    public Date getExpires() { return this.expires; }
    /**
     * @param value - The UTC datetime when the API key expires.
     */
    public void setExpires(Date value) { this.expires = value; }
};
