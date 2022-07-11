
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
 * Represents all possible data required to set up an app enrollment for a connector.
 * Only send required fields for the given connector.
 */
public class ConnectorInfoModel
{
    private @Nullable String authCode;
    private @Nullable String tokenId;
    private @Nullable String tokenSecret;
    private @Nullable String realmId;
    private @Nullable String subsidiaryId;
    private @Nullable String redirectUri;
    private @Nullable String email;
    private @Nullable String username;
    private @Nullable String password;
    private @Nullable String serverName;
    private @Nullable Integer serverPort;

    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     *
     * @return The field authCode
     */
    public @Nullable String getAuthCode() { return this.authCode; }
    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     *
     * @param value The new value for authCode
     */
    public void setAuthCode(@Nullable String value) { this.authCode = value; }
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
     * The realm id of the account being granted permissions to access
     *
     * @return The field realmId
     */
    public @Nullable String getRealmId() { return this.realmId; }
    /**
     * The realm id of the account being granted permissions to access
     *
     * @param value The new value for realmId
     */
    public void setRealmId(@Nullable String value) { this.realmId = value; }
    /**
     * The subsidiary id that corresponds to a legal entity.
     *
     * @return The field subsidiaryId
     */
    public @Nullable String getSubsidiaryId() { return this.subsidiaryId; }
    /**
     * The subsidiary id that corresponds to a legal entity.
     *
     * @param value The new value for subsidiaryId
     */
    public void setSubsidiaryId(@Nullable String value) { this.subsidiaryId = value; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     *
     * @return The field redirectUri
     */
    public @Nullable String getRedirectUri() { return this.redirectUri; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     *
     * @param value The new value for redirectUri
     */
    public void setRedirectUri(@Nullable String value) { this.redirectUri = value; }
    /**
     * The email an email connection is being created for.
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     * The email an email connection is being created for.
     *
     * @param value The new value for email
     */
    public void setEmail(@Nullable String value) { this.email = value; }
    /**
     * The username of the web services account with access permissions.
     *
     * @return The field username
     */
    public @Nullable String getUsername() { return this.username; }
    /**
     * The username of the web services account with access permissions.
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
     * The server name a connection is being created for.
     *
     * @return The field serverName
     */
    public @Nullable String getServerName() { return this.serverName; }
    /**
     * The server name a connection is being created for.
     *
     * @param value The new value for serverName
     */
    public void setServerName(@Nullable String value) { this.serverName = value; }
    /**
     * The port number of the server a connection is being created for.
     *
     * @return The field serverPort
     */
    public @Nullable Integer getServerPort() { return this.serverPort; }
    /**
     * The port number of the server a connection is being created for.
     *
     * @param value The new value for serverPort
     */
    public void setServerPort(@Nullable Integer value) { this.serverPort = value; }
};
