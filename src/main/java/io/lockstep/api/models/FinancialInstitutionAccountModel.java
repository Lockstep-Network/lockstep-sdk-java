
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
 * An Financial Institution Account represents an account used for monetary transactions. E.g. - checking, savings,  or credit card accounts.
 */
public class FinancialInstitutionAccountModel
{
    private @NotNull String financialInstitutionAccountId;
    private @NotNull String groupKey;
    private @Nullable String bankAccountId;
    private @Nullable String erpKey;
    private @Nullable String appEnrollmentId;
    private @Nullable String name;
    private @Nullable String status;
    private @Nullable String description;
    private @Nullable String accountType;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;

    /**
     * The unique identifier for the Financial Institution Account.
     *
     * @return The field financialInstitutionAccountId
     */
    public @NotNull String getFinancialInstitutionAccountId() { return this.financialInstitutionAccountId; }
    /**
     * The unique identifier for the Financial Institution Account.
     *
     * @param value The new value for financialInstitutionAccountId
     */
    public void setFinancialInstitutionAccountId(@NotNull String value) { this.financialInstitutionAccountId = value; }
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
     * An alternate account id for the Financial Institution Account.
     *
     * @return The field bankAccountId
     */
    public @Nullable String getBankAccountId() { return this.bankAccountId; }
    /**
     * An alternate account id for the Financial Institution Account.
     *
     * @param value The new value for bankAccountId
     */
    public void setBankAccountId(@Nullable String value) { this.bankAccountId = value; }
    /**
     * The External Id for the Financial Institution Account.
     *
     * @return The field erpKey
     */
    public @Nullable String getErpKey() { return this.erpKey; }
    /**
     * The External Id for the Financial Institution Account.
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@Nullable String value) { this.erpKey = value; }
    /**
     * The App Enrollment Id this Financial Institution is associated with.
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The App Enrollment Id this Financial Institution is associated with.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * The name of the Financial Institution Account.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of the Financial Institution Account.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * The status of the Financial Institution Account. Possible values are active,
     * inactive, deleted or archived.
     *
     * @return The field status
     */
    public @Nullable String getStatus() { return this.status; }
    /**
     * The status of the Financial Institution Account. Possible values are active,
     * inactive, deleted or archived.
     *
     * @param value The new value for status
     */
    public void setStatus(@Nullable String value) { this.status = value; }
    /**
     * The description for the Financial Institution Account.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * The description for the Financial Institution Account.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * The classification for the Financial Institution Account. Possible values are Asset, Equity,
     * Expense, Liability or Income.
     *
     * @return The field accountType
     */
    public @Nullable String getAccountType() { return this.accountType; }
    /**
     * The classification for the Financial Institution Account. Possible values are Asset, Equity,
     * Expense, Liability or Income.
     *
     * @param value The new value for accountType
     */
    public void setAccountType(@Nullable String value) { this.accountType = value; }
    /**
     * The date the Financial Institution Account was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date the Financial Institution Account was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The user that has created the Financial Institution Account.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The user that has created the Financial Institution Account.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date the Financial Institution Account was modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date the Financial Institution Account was modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The user that has modified the Financial Institution Account.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The user that has modified the Financial Institution Account.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
};
