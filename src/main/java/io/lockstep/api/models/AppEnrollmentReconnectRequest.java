
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
 * Information to reconnect an ERP.
 */
public class AppEnrollmentReconnectRequest
{
    private @Nullable String authCode;
    private @Nullable String username;
    private @Nullable String password;
    private @Nullable String tokenId;
    private @Nullable String tokenSecret;

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
     * The OAuth authentication code.
     *
     * @return The field username
     */
    public @Nullable String getUsername() { return this.username; }
    /**
     * The OAuth authentication code.
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
};
