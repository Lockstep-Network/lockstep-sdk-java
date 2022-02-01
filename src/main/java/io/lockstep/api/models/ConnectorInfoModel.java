
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Represents all possible data required to set up an app enrollment for a connector.
 * Only send required fields for the given connector.
 */
public class ConnectorInfoModel
{
    private String authCode;
    private String realmId;
    private String redirectUri;
    private String email;

    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     *
     * @return The field authCode
     */
    public String getAuthCode() { return this.authCode; }
    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     *
     * @param value The new value for authCode
     */
    public void setAuthCode(String value) { this.authCode = value; }
    /**
     * The realm id of the account being granted permissions to access
     *
     * @return The field realmId
     */
    public String getRealmId() { return this.realmId; }
    /**
     * The realm id of the account being granted permissions to access
     *
     * @param value The new value for realmId
     */
    public void setRealmId(String value) { this.realmId = value; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     *
     * @return The field redirectUri
     */
    public String getRedirectUri() { return this.redirectUri; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     *
     * @param value The new value for redirectUri
     */
    public void setRedirectUri(String value) { this.redirectUri = value; }
    /**
     * The email an email connection is being created for.
     *
     * @return The field email
     */
    public String getEmail() { return this.email; }
    /**
     * The email an email connection is being created for.
     *
     * @param value The new value for email
     */
    public void setEmail(String value) { this.email = value; }
};
