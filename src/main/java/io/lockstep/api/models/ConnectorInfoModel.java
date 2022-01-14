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


public class ConnectorInfoModel
{
    private String authCode;
    private String realmId;
    private String redirectUri;
    private String email;

    /**
     * @return The authorization code returned from the first step of the OAuth2 flow https://oauth.net/2/grant-types/authorization-code/
     */
    public String getAuthCode() { return this.authCode; }
    /**
     * @param value - The authorization code returned from the first step of the OAuth2 flow https://oauth.net/2/grant-types/authorization-code/
     */
    public void setAuthCode(String value) { this.authCode = value; }
    /**
     * @return The realm id of the account being granted permissions to access
     */
    public String getRealmId() { return this.realmId; }
    /**
     * @param value - The realm id of the account being granted permissions to access
     */
    public void setRealmId(String value) { this.realmId = value; }
    /**
     * @return The redirect uri used for step one of the OAuth2.0 flow.
     */
    public String getRedirectUri() { return this.redirectUri; }
    /**
     * @param value - The redirect uri used for step one of the OAuth2.0 flow.
     */
    public void setRedirectUri(String value) { this.redirectUri = value; }
    /**
     * @return The email an email connection is being created for.
     */
    public String getEmail() { return this.email; }
    /**
     * @param value - The email an email connection is being created for.
     */
    public void setEmail(String value) { this.email = value; }
};
