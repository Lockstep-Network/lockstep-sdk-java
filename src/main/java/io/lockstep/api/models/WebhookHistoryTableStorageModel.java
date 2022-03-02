
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
 * Represents the Webhook Trigger History
 */
public class WebhookHistoryTableStorageModel
{
    private String groupKey;
    private String webhookId;
    private String webhookHistoryId;
    private String eventType;
    private Boolean requestSent;
    private Boolean isSuccessful;
    private String responseStatusCode;
    private String processResultMessage;
    private Integer failureCount;
    private String timestamp;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The WebhookId uniquely identifies the webhook used to send notification that an event action has taken place.
     *
     * @return The field webhookId
     */
    public String getWebhookId() { return this.webhookId; }
    /**
     * The WebhookId uniquely identifies the webhook used to send notification that an event action has taken place.
     *
     * @param value The new value for webhookId
     */
    public void setWebhookId(String value) { this.webhookId = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field webhookHistoryId
     */
    public String getWebhookHistoryId() { return this.webhookHistoryId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for webhookHistoryId
     */
    public void setWebhookHistoryId(String value) { this.webhookHistoryId = value; }
    /**
     * Event type which fired webhook
     *
     * [entity].[action]
     *
     * @return The field eventType
     */
    public String getEventType() { return this.eventType; }
    /**
     * Event type which fired webhook
     *
     * [entity].[action]
     *
     * @param value The new value for eventType
     */
    public void setEventType(String value) { this.eventType = value; }
    /**
     * Flag whether request was sent to callback url successfully or blocked by failing or because it was disabled.
     *
     * @return The field requestSent
     */
    public Boolean getRequestSent() { return this.requestSent; }
    /**
     * Flag whether request was sent to callback url successfully or blocked by failing or because it was disabled.
     *
     * @param value The new value for requestSent
     */
    public void setRequestSent(Boolean value) { this.requestSent = value; }
    /**
     * Flag whether webhook notification was successful overall (if webhook disabled should always return true otherwise
     * depends on the response from the callback url)
     *
     * @return The field isSuccessful
     */
    public Boolean getIsSuccessful() { return this.isSuccessful; }
    /**
     * Flag whether webhook notification was successful overall (if webhook disabled should always return true otherwise
     * depends on the response from the callback url)
     *
     * @param value The new value for isSuccessful
     */
    public void setIsSuccessful(Boolean value) { this.isSuccessful = value; }
    /**
     * Response status code that is returned when calling a callback url.
     *
     * @return The field responseStatusCode
     */
    public String getResponseStatusCode() { return this.responseStatusCode; }
    /**
     * Response status code that is returned when calling a callback url.
     *
     * @param value The new value for responseStatusCode
     */
    public void setResponseStatusCode(String value) { this.responseStatusCode = value; }
    /**
     * Message containing information about the webhook callback results
     *
     * @return The field processResultMessage
     */
    public String getProcessResultMessage() { return this.processResultMessage; }
    /**
     * Message containing information about the webhook callback results
     *
     * @param value The new value for processResultMessage
     */
    public void setProcessResultMessage(String value) { this.processResultMessage = value; }
    /**
     * Number of times message failed to be sent over to callback url before succeeding or failing out.
     * The maximum value should is based on webhook.
     *
     * @return The field failureCount
     */
    public Integer getFailureCount() { return this.failureCount; }
    /**
     * Number of times message failed to be sent over to callback url before succeeding or failing out.
     * The maximum value should is based on webhook.
     *
     * @param value The new value for failureCount
     */
    public void setFailureCount(Integer value) { this.failureCount = value; }
    /**
     * Timestamp of when a request is sent to a webhook callback.
     * Contains the last time message is sent if failures occur.
     *
     * @return The field timestamp
     */
    public String getTimestamp() { return this.timestamp; }
    /**
     * Timestamp of when a request is sent to a webhook callback.
     * Contains the last time message is sent if failures occur.
     *
     * @param value The new value for timestamp
     */
    public void setTimestamp(String value) { this.timestamp = value; }
};
