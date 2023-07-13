
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
 * The FinancialAccountSyncModel represents information coming into Lockstep from an external financial system or other
 * enterprise resource planning system.  To import data from an external system, convert your original data into
 * the FinancialAccountSyncModel format and call the [Upload Sync File API](https://developer.lockstep.io/reference/post_api-v1-sync-zip).
 * This API retrieves all of the data you uploaded in a compressed ZIP file and imports it into the Lockstep
 * platform.
 *
 * Once imported, this record will be available in the Lockstep API as a [FinancialAccountModel](https://developer.lockstep.io/docs/financialaccountmodel).
 *
 * For more information on writing your own connector, see [Connector Data](https://developer.lockstep.io/docs/connector-data).
 */
public class FinancialAccountSyncModel
{
    private @NotNull Integer onMatchAction;
    private @NotNull String code;
    private @NotNull String erpKey;
    private @NotNull String name;
    private @NotNull String status;
    private @NotNull String cashflowType;
    private @NotNull String description;
    private @NotNull String classification;
    private @Nullable String category;
    private @Nullable String subcategory;

    /**
     * Indicates what action to take when an existing object has been found during the sync process.
     *
     * @return The field onMatchAction
     */
    public @NotNull Integer getOnMatchAction() { return this.onMatchAction; }
    /**
     * Indicates what action to take when an existing object has been found during the sync process.
     *
     * @param value The new value for onMatchAction
     */
    public void setOnMatchAction(@NotNull Integer value) { this.onMatchAction = value; }
    /**
     * The code for the Financial Account. Can either be a general ledger or
     * an account code.
     *
     * @return The field code
     */
    public @NotNull String getCode() { return this.code; }
    /**
     * The code for the Financial Account. Can either be a general ledger or
     * an account code.
     *
     * @param value The new value for code
     */
    public void setCode(@NotNull String value) { this.code = value; }
    /**
     * The External Id for the Financial Account.
     *
     * @return The field erpKey
     */
    public @NotNull String getErpKey() { return this.erpKey; }
    /**
     * The External Id for the Financial Account.
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@NotNull String value) { this.erpKey = value; }
    /**
     * The name of the Financial Account.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of the Financial Account.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The status of the Financial Account. Possible values are active,
     * inactive, deleted or archived.
     *
     * @return The field status
     */
    public @NotNull String getStatus() { return this.status; }
    /**
     * The status of the Financial Account. Possible values are active,
     * inactive, deleted or archived.
     *
     * @param value The new value for status
     */
    public void setStatus(@NotNull String value) { this.status = value; }
    /**
     * The cashflow type for the Financial Account. Examples include cash, financing, investment
     * or operation.
     *
     * @return The field cashflowType
     */
    public @NotNull String getCashflowType() { return this.cashflowType; }
    /**
     * The cashflow type for the Financial Account. Examples include cash, financing, investment
     * or operation.
     *
     * @param value The new value for cashflowType
     */
    public void setCashflowType(@NotNull String value) { this.cashflowType = value; }
    /**
     * The description for the Financial Account.
     *
     * @return The field description
     */
    public @NotNull String getDescription() { return this.description; }
    /**
     * The description for the Financial Account.
     *
     * @param value The new value for description
     */
    public void setDescription(@NotNull String value) { this.description = value; }
    /**
     * The classification for the Financial Account. Possible values are Asset, Equity,
     * Expense, Liability, Income, CreditCard, Checking, or Savings.
     *
     * @return The field classification
     */
    public @NotNull String getClassification() { return this.classification; }
    /**
     * The classification for the Financial Account. Possible values are Asset, Equity,
     * Expense, Liability, Income, CreditCard, Checking, or Savings.
     *
     * @param value The new value for classification
     */
    public void setClassification(@NotNull String value) { this.classification = value; }
    /**
     * The category for the Financial Account. Examples include Current Asset, Current Liability, Common Stock
     *
     * @return The field category
     */
    public @Nullable String getCategory() { return this.category; }
    /**
     * The category for the Financial Account. Examples include Current Asset, Current Liability, Common Stock
     *
     * @param value The new value for category
     */
    public void setCategory(@Nullable String value) { this.category = value; }
    /**
     * The subcategory for the Financial Account. Examples include Cash, Property, Bank Loan, etc.
     *
     * @return The field subcategory
     */
    public @Nullable String getSubcategory() { return this.subcategory; }
    /**
     * The subcategory for the Financial Account. Examples include Cash, Property, Bank Loan, etc.
     *
     * @param value The new value for subcategory
     */
    public void setSubcategory(@Nullable String value) { this.subcategory = value; }
};
