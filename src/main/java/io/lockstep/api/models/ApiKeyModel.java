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
     */
    public String getapiKeyId() { return this.apiKeyId; }
    /**
     * The unique identifier for the API key.
     */
    public void setapiKeyId(String value) { this.apiKeyId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The name of the API key.
     */
    public String getname() { return this.name; }
    /**
     * The name of the API key.
     */
    public void setname(String value) { this.name = value; }
    /**
     * The API key to use for authentication. This will only be returned upon creation of the API key.
     * All other times, this value will be `null`.
     * 
     * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     */
    public String getapiKey() { return this.apiKey; }
    /**
     * The API key to use for authentication. This will only be returned upon creation of the API key.
     * All other times, this value will be `null`.
     * 
     * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     */
    public void setapiKey(String value) { this.apiKey = value; }
    /**
     * The first 10 characters of the API key.  This information can be used to ensure that you are
     * looking at the correct API Key, but cannot be used for authentication.
     */
    public String getkeyPrefix() { return this.keyPrefix; }
    /**
     * The first 10 characters of the API key.  This information can be used to ensure that you are
     * looking at the correct API Key, but cannot be used for authentication.
     */
    public void setkeyPrefix(String value) { this.keyPrefix = value; }
    /**
     * The date the API key was created.
     */
    public Date getcreated() { return this.created; }
    /**
     * The date the API key was created.
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The user that created the API key.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The user that created the API key.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the API key was revoked.
     */
    public Date getrevoked() { return this.revoked; }
    /**
     * The date the API key was revoked.
     */
    public void setrevoked(Date value) { this.revoked = value; }
    /**
     * The user who revoked the API key.
     */
    public String getrevokedUserId() { return this.revokedUserId; }
    /**
     * The user who revoked the API key.
     */
    public void setrevokedUserId(String value) { this.revokedUserId = value; }
    /**
     * The UTC datetime when the API key expires.
     */
    public Date getexpires() { return this.expires; }
    /**
     * The UTC datetime when the API key expires.
     */
    public void setexpires(Date value) { this.expires = value; }
};
