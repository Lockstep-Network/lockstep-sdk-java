
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
 * Information to reconnect an ERP.
 */
public class AppEnrollmentReconnectInfo
{
    private @Nullable String authCode;
    private @Nullable String username;
    private @Nullable String password;
    private @Nullable String realmId;
    private @Nullable String tokenId;
    private @Nullable String tokenSecret;
    private @Nullable String redirectUri;

    /**
     * The OAuth authentication code.
     *
     * @return The field authCode
     */
    public @Nullable String getAuthCode() { return this.authCode; }
    /**
     * The OAuth authentication code.
     *
     * @param value The new value for authCode
     */
    public void setAuthCode(@Nullable String value) { this.authCode = value; }
    /**
     * The username for the web services account with access permissions.
     *
     * @return The field username
     */
    public @Nullable String getUsername() { return this.username; }
    /**
     * The username for the web services account with access permissions.
     *
     * @param value The new value for username
     */
    public void setUsername(@Nullable String value) { this.username = value; }
    /**
     * The password for the web services account with access permissions.
     *
     * @return The field password
     */
    public @Nullable String getPassword() { return this.password; }
    /**
     * The password for the web services account with access permissions.
     *
     * @param value The new value for password
     */
    public void setPassword(@Nullable String value) { this.password = value; }
    /**
     * The Realm Id for the app enrollment to reconnect.
     *
     * @return The field realmId
     */
    public @Nullable String getRealmId() { return this.realmId; }
    /**
     * The Realm Id for the app enrollment to reconnect.
     *
     * @param value The new value for realmId
     */
    public void setRealmId(@Nullable String value) { this.realmId = value; }
    /**
     * The access token id for the connector enrollment.
     *
     * @return The field tokenId
     */
    public @Nullable String getTokenId() { return this.tokenId; }
    /**
     * The access token id for the connector enrollment.
     *
     * @param value The new value for tokenId
     */
    public void setTokenId(@Nullable String value) { this.tokenId = value; }
    /**
     * The access token secret for the connector enrollment.
     *
     * @return The field tokenSecret
     */
    public @Nullable String getTokenSecret() { return this.tokenSecret; }
    /**
     * The access token secret for the connector enrollment.
     *
     * @param value The new value for tokenSecret
     */
    public void setTokenSecret(@Nullable String value) { this.tokenSecret = value; }
    /**
     * The OAuth redirect uri.
     *
     * @return The field redirectUri
     */
    public @Nullable String getRedirectUri() { return this.redirectUri; }
    /**
     * The OAuth redirect uri.
     *
     * @param value The new value for redirectUri
     */
    public void setRedirectUri(@Nullable String value) { this.redirectUri = value; }
};
