
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
 * A Webhook is a subscription to receive notifications automatically to the supplied
 * callback url when changes are made to a supported object.
 *
 * Currently supported objects:
 *  * `SyncRequest` - Receive a notification when a new sync request has completed for the group key.
 */
public class WebhookModel
{
    private @NotNull String webhookId;
    private @NotNull String groupKey;
    private @NotNull String name;
    private @Nullable String statusCode;
    private @Nullable String statusMessage;
    private @Nullable String clientSecret;
    private @NotNull String requestContentType;
    private @NotNull String callbackHttpMethod;
    private @NotNull String callbackUrl;
    private @Nullable String expirationDate;
    private @NotNull Integer retryCount;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String partitionKey;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field webhookId
     */
    public @NotNull String getWebhookId() { return this.webhookId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for webhookId
     */
    public void setWebhookId(@NotNull String value) { this.webhookId = value; }
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
     * A name for the webhook subscription.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * A name for the webhook subscription.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The status of the webhook (Active, Inactive, Errored).
     *
     * @return The field statusCode
     */
    public @Nullable String getStatusCode() { return this.statusCode; }
    /**
     * The status of the webhook (Active, Inactive, Errored).
     *
     * @param value The new value for statusCode
     */
    public void setStatusCode(@Nullable String value) { this.statusCode = value; }
    /**
     * When the StatusCode is set to Errored a message is supplied for why it was errored.
     *
     * @return The field statusMessage
     */
    public @Nullable String getStatusMessage() { return this.statusMessage; }
    /**
     * When the StatusCode is set to Errored a message is supplied for why it was errored.
     *
     * @param value The new value for statusMessage
     */
    public void setStatusMessage(@Nullable String value) { this.statusMessage = value; }
    /**
     * An secret set during webhook creation that can be used to verify that the notification
     * is coming from the Lockstep API.
     *
     * @return The field clientSecret
     */
    public @Nullable String getClientSecret() { return this.clientSecret; }
    /**
     * An secret set during webhook creation that can be used to verify that the notification
     * is coming from the Lockstep API.
     *
     * @param value The new value for clientSecret
     */
    public void setClientSecret(@Nullable String value) { this.clientSecret = value; }
    /**
     * The format of the content to be returned in the webhook notifications. Options TBD.
     *
     * @return The field requestContentType
     */
    public @NotNull String getRequestContentType() { return this.requestContentType; }
    /**
     * The format of the content to be returned in the webhook notifications. Options TBD.
     *
     * @param value The new value for requestContentType
     */
    public void setRequestContentType(@NotNull String value) { this.requestContentType = value; }
    /**
     * The HTTP Method to be used on the callback URL for use in notifications (GET, POST, PATCH, PUT).
     *
     * @return The field callbackHttpMethod
     */
    public @NotNull String getCallbackHttpMethod() { return this.callbackHttpMethod; }
    /**
     * The HTTP Method to be used on the callback URL for use in notifications (GET, POST, PATCH, PUT).
     *
     * @param value The new value for callbackHttpMethod
     */
    public void setCallbackHttpMethod(@NotNull String value) { this.callbackHttpMethod = value; }
    /**
     * The URL where the notification will be sent via the method set in CallbackHttpMethod.
     *
     * When creating a webhook, the Lockstep API will make a call to this url via the method
     * set in the CallbackHttpMethod property with a query parameter of "code" set to an encoded
     * string. To successfully create the webhook, the call must return a successful status code
     * with the query parameter's value as the plain text content.
     *
     * @return The field callbackUrl
     */
    public @NotNull String getCallbackUrl() { return this.callbackUrl; }
    /**
     * The URL where the notification will be sent via the method set in CallbackHttpMethod.
     *
     * When creating a webhook, the Lockstep API will make a call to this url via the method
     * set in the CallbackHttpMethod property with a query parameter of "code" set to an encoded
     * string. To successfully create the webhook, the call must return a successful status code
     * with the query parameter's value as the plain text content.
     *
     * @param value The new value for callbackUrl
     */
    public void setCallbackUrl(@NotNull String value) { this.callbackUrl = value; }
    /**
     * The expiration date for the given webhook subscription. Once the expiration date passes,
     * notifications will no longer be sent to the callback url.
     *
     * @return The field expirationDate
     */
    public @Nullable String getExpirationDate() { return this.expirationDate; }
    /**
     * The expiration date for the given webhook subscription. Once the expiration date passes,
     * notifications will no longer be sent to the callback url.
     *
     * @param value The new value for expirationDate
     */
    public void setExpirationDate(@Nullable String value) { this.expirationDate = value; }
    /**
     * The amount of times a notification should be retried before marking the webhook as errored.
     *
     * @return The field retryCount
     */
    public @NotNull Integer getRetryCount() { return this.retryCount; }
    /**
     * The amount of times a notification should be retried before marking the webhook as errored.
     *
     * @param value The new value for retryCount
     */
    public void setRetryCount(@NotNull Integer value) { this.retryCount = value; }
    /**
     * The date this webhook was created
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date this webhook was created
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created this webhook
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this webhook
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date this webhook was last modified
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date this webhook was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this webhook
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this webhook
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
    /**
     * The partition key used for the webhook callback history
     *
     * @return The field partitionKey
     */
    public @Nullable String getPartitionKey() { return this.partitionKey; }
    /**
     * The partition key used for the webhook callback history
     *
     * @param value The new value for partitionKey
     */
    public void setPartitionKey(@Nullable String value) { this.partitionKey = value; }
};
