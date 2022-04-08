
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
 * A User represents a person who has the ability to authenticate against the Lockstep Platform and use
 * services such as Lockstep Inbox.  A User is uniquely identified by an Azure identity, and each user must
 * have an email address defined within their account.  All Users must validate their email to make use of
 * Lockstep platform services.  Users may have different privileges and access control rights within the
 * Lockstep Platform.
 */
public class UserAccountModel
{
    private @NotNull String userId;
    private @NotNull String groupKey;
    private @NotNull String userName;
    private @NotNull String email;
    private @Nullable String status;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String modifiedUserName;
    private @Nullable String b2CUserId;
    private @NotNull String userRole;
    private @Nullable String inviteSent;
    private @Nullable String phoneNumber;
    private @Nullable String faxNumber;
    private @Nullable String title;
    private @Nullable String accountingRoleCodeDefId;
    private @Nullable String address1;
    private @Nullable String address2;
    private @Nullable String address3;
    private @Nullable String city;
    private @Nullable String stateRegion;
    private @Nullable String postalCode;
    private @Nullable String country;
    private @Nullable String timeZone;
    private @Nullable String imageURL;
    private @Nullable String description;
    private @Nullable String b2CLastLoggedIn;
    private @Nullable String defaultCurrencyCode;
    private @Nullable NoteModel[] notes;
    private @Nullable AttachmentModel[] attachments;
    private @Nullable CustomFieldValueModel[] customFieldValues;
    private @Nullable CodeDefinitionModel accountingRoleCodeDefinition;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * This record provides a link to the user's Azure AD B2C OID.
     *
     * @return The field userId
     */
    public @NotNull String getUserId() { return this.userId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * This record provides a link to the user's Azure AD B2C OID.
     *
     * @param value The new value for userId
     */
    public void setUserId(@NotNull String value) { this.userId = value; }
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
     * The full name of the user
     *
     * @return The field userName
     */
    public @NotNull String getUserName() { return this.userName; }
    /**
     * The full name of the user
     *
     * @param value The new value for userName
     */
    public void setUserName(@NotNull String value) { this.userName = value; }
    /**
     * The email of the user
     *
     * @return The field email
     */
    public @NotNull String getEmail() { return this.email; }
    /**
     * The email of the user
     *
     * @param value The new value for email
     */
    public void setEmail(@NotNull String value) { this.email = value; }
    /**
     * The status of the user's account
     *
     * @return The field status
     */
    public @Nullable String getStatus() { return this.status; }
    /**
     * The status of the user's account
     *
     * @param value The new value for status
     */
    public void setStatus(@Nullable String value) { this.status = value; }
    /**
     * The date that the user account was created
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date that the user account was created
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created the user account
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the user account
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date the user account was last modified
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date the user account was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified the user account
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the user account
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
    /**
     * The name of the user who last modified the user account
     *
     * @return The field modifiedUserName
     */
    public @Nullable String getModifiedUserName() { return this.modifiedUserName; }
    /**
     * The name of the user who last modified the user account
     *
     * @param value The new value for modifiedUserName
     */
    public void setModifiedUserName(@Nullable String value) { this.modifiedUserName = value; }
    /**
     * The ID of the user in Azure B2C
     *
     * @return The field b2CUserId
     */
    public @Nullable String getB2CUserId() { return this.b2CUserId; }
    /**
     * The ID of the user in Azure B2C
     *
     * @param value The new value for b2CUserId
     */
    public void setB2CUserId(@Nullable String value) { this.b2CUserId = value; }
    /**
     * The id of the Permission Level for the user.
     *
     * @return The field userRole
     */
    public @NotNull String getUserRole() { return this.userRole; }
    /**
     * The id of the Permission Level for the user.
     *
     * @param value The new value for userRole
     */
    public void setUserRole(@NotNull String value) { this.userRole = value; }
    /**
     * The date timestamp when the invite was sent to the user.
     *
     * @return The field inviteSent
     */
    public @Nullable String getInviteSent() { return this.inviteSent; }
    /**
     * The date timestamp when the invite was sent to the user.
     *
     * @param value The new value for inviteSent
     */
    public void setInviteSent(@Nullable String value) { this.inviteSent = value; }
    /**
     * The phone number of the user.
     *
     * @return The field phoneNumber
     */
    public @Nullable String getPhoneNumber() { return this.phoneNumber; }
    /**
     * The phone number of the user.
     *
     * @param value The new value for phoneNumber
     */
    public void setPhoneNumber(@Nullable String value) { this.phoneNumber = value; }
    /**
     * The fax number of the user.
     *
     * @return The field faxNumber
     */
    public @Nullable String getFaxNumber() { return this.faxNumber; }
    /**
     * The fax number of the user.
     *
     * @param value The new value for faxNumber
     */
    public void setFaxNumber(@Nullable String value) { this.faxNumber = value; }
    /**
     * The title of the user; free text field
     *
     * @return The field title
     */
    public @Nullable String getTitle() { return this.title; }
    /**
     * The title of the user; free text field
     *
     * @param value The new value for title
     */
    public void setTitle(@Nullable String value) { this.title = value; }
    /**
     * FK to the CodeDefinition table; CodeType = 'AccountingRole'
     *
     * @return The field accountingRoleCodeDefId
     */
    public @Nullable String getAccountingRoleCodeDefId() { return this.accountingRoleCodeDefId; }
    /**
     * FK to the CodeDefinition table; CodeType = 'AccountingRole'
     *
     * @param value The new value for accountingRoleCodeDefId
     */
    public void setAccountingRoleCodeDefId(@Nullable String value) { this.accountingRoleCodeDefId = value; }
    /**
     * Address Line 1 for this User
     *
     * @return The field address1
     */
    public @Nullable String getAddress1() { return this.address1; }
    /**
     * Address Line 1 for this User
     *
     * @param value The new value for address1
     */
    public void setAddress1(@Nullable String value) { this.address1 = value; }
    /**
     * Address Line 2 for this User
     *
     * @return The field address2
     */
    public @Nullable String getAddress2() { return this.address2; }
    /**
     * Address Line 2 for this User
     *
     * @param value The new value for address2
     */
    public void setAddress2(@Nullable String value) { this.address2 = value; }
    /**
     * Address Line 3 for this User
     *
     * @return The field address3
     */
    public @Nullable String getAddress3() { return this.address3; }
    /**
     * Address Line 3 for this User
     *
     * @param value The new value for address3
     */
    public void setAddress3(@Nullable String value) { this.address3 = value; }
    /**
     * City for this User
     *
     * @return The field city
     */
    public @Nullable String getCity() { return this.city; }
    /**
     * City for this User
     *
     * @param value The new value for city
     */
    public void setCity(@Nullable String value) { this.city = value; }
    /**
     * Region ("state" in the US) for this User
     *
     * @return The field stateRegion
     */
    public @Nullable String getStateRegion() { return this.stateRegion; }
    /**
     * Region ("state" in the US) for this User
     *
     * @param value The new value for stateRegion
     */
    public void setStateRegion(@Nullable String value) { this.stateRegion = value; }
    /**
     * Postal Code this User
     *
     * @return The field postalCode
     */
    public @Nullable String getPostalCode() { return this.postalCode; }
    /**
     * Postal Code this User
     *
     * @param value The new value for postalCode
     */
    public void setPostalCode(@Nullable String value) { this.postalCode = value; }
    /**
     * Country for this User This will be validated by the /api/v1/definitions/countries data set
     *
     * @return The field country
     */
    public @Nullable String getCountry() { return this.country; }
    /**
     * Country for this User This will be validated by the /api/v1/definitions/countries data set
     *
     * @param value The new value for country
     */
    public void setCountry(@Nullable String value) { this.country = value; }
    /**
     * Time zone for this user
     *
     * @return The field timeZone
     */
    public @Nullable String getTimeZone() { return this.timeZone; }
    /**
     * Time zone for this user
     *
     * @param value The new value for timeZone
     */
    public void setTimeZone(@Nullable String value) { this.timeZone = value; }
    /**
     * Image URL for this User
     *
     * @return The field imageURL
     */
    public @Nullable String getImageURL() { return this.imageURL; }
    /**
     * Image URL for this User
     *
     * @param value The new value for imageURL
     */
    public void setImageURL(@Nullable String value) { this.imageURL = value; }
    /**
     * Description for this User.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * Description for this User.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * Last date time user logged into Azure B2C.
     *
     * @return The field b2CLastLoggedIn
     */
    public @Nullable String getB2CLastLoggedIn() { return this.b2CLastLoggedIn; }
    /**
     * Last date time user logged into Azure B2C.
     *
     * @param value The new value for b2CLastLoggedIn
     */
    public void setB2CLastLoggedIn(@Nullable String value) { this.b2CLastLoggedIn = value; }
    /**
     * The default currency code used by this user entity.  This value can be overridden
     * for invoices in a different currency code.
     *
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies) This will be validated by the /api/v1/definitions/currencies data set
     *
     * @return The field defaultCurrencyCode
     */
    public @Nullable String getDefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code used by this user entity.  This value can be overridden
     * for invoices in a different currency code.
     *
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies) This will be validated by the /api/v1/definitions/currencies data set
     *
     * @param value The new value for defaultCurrencyCode
     */
    public void setDefaultCurrencyCode(@Nullable String value) { this.defaultCurrencyCode = value; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `UserAccount` and the `ObjectKey` set to the `UserId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field notes
     */
    public @Nullable NoteModel[] getNotes() { return this.notes; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `UserAccount` and the `ObjectKey` set to the `UserId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable NoteModel[] value) { this.notes = value; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `UserAccount` and the `ObjectKey` set to the `UserId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field attachments
     */
    public @Nullable AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `UserAccount` and the `ObjectKey` set to the `UserId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for attachments
     */
    public void setAttachments(@Nullable AttachmentModel[] value) { this.attachments = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `UserAccount` and the `ObjectKey` set to the `UserId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldValues
     */
    public @Nullable CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `UserAccount` and the `ObjectKey` set to the `UserId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(@Nullable CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Accounting role definition for this User.
     * To retrieve this collection, specify `AccountingRole` in the "Include" parameter for your query.
     *
     * @return The field accountingRoleCodeDefinition
     */
    public @Nullable CodeDefinitionModel getAccountingRoleCodeDefinition() { return this.accountingRoleCodeDefinition; }
    /**
     * Accounting role definition for this User.
     * To retrieve this collection, specify `AccountingRole` in the "Include" parameter for your query.
     *
     * @param value The new value for accountingRoleCodeDefinition
     */
    public void setAccountingRoleCodeDefinition(@Nullable CodeDefinitionModel value) { this.accountingRoleCodeDefinition = value; }
};
