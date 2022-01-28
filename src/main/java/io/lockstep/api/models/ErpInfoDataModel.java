
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
 * @version    2022.4
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Represents all the possible data sent as a part of the provisioning post.
 * Only send required fields for the given connector.
 */
public class ErpInfoDataModel
{
    private String authCode;
    private String realmId;
    private String redirectUri;

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
};
