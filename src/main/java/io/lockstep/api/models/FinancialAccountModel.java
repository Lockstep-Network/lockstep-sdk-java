
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
 * An Financial account refers to records of assets, liabilities, income, expenses, and equity.
 */
public class FinancialAccountModel
{
    private String financialAccountId;
    private String groupKey;
    private String code;
    private String erpKey;
    private String appEnrollmentId;
    private String name;
    private String status;
    private String cashflowType;
    private String description;
    private String classification;
    private String category;
    private String subcategory;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;

    /**
     * The unique identifier for the Financial Account.
     *
     * @return The field financialAccountId
     */
    public String getFinancialAccountId() { return this.financialAccountId; }
    /**
     * The unique identifier for the Financial Account.
     *
     * @param value The new value for financialAccountId
     */
    public void setFinancialAccountId(String value) { this.financialAccountId = value; }
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
     * The code for the Financial Account. Can either be a general ledger or
     * an account code.
     *
     * @return The field code
     */
    public String getCode() { return this.code; }
    /**
     * The code for the Financial Account. Can either be a general ledger or
     * an account code.
     *
     * @param value The new value for code
     */
    public void setCode(String value) { this.code = value; }
    /**
     * The External Id for the Financial Account.
     *
     * @return The field erpKey
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * The External Id for the Financial Account.
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The App Enrollment Id for the Financial Account.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The App Enrollment Id for the Financial Account.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The name of the Financial Account.
     *
     * @return The field name
     */
    public String getName() { return this.name; }
    /**
     * The name of the Financial Account.
     *
     * @param value The new value for name
     */
    public void setName(String value) { this.name = value; }
    /**
     * The status of the Financial Account. Possible values are active,
     * inactive, deleted or archived.
     *
     * @return The field status
     */
    public String getStatus() { return this.status; }
    /**
     * The status of the Financial Account. Possible values are active,
     * inactive, deleted or archived.
     *
     * @param value The new value for status
     */
    public void setStatus(String value) { this.status = value; }
    /**
     * The cashflow type for the Financial Account. Examples include cash, financing, investment
     * or operation.
     *
     * @return The field cashflowType
     */
    public String getCashflowType() { return this.cashflowType; }
    /**
     * The cashflow type for the Financial Account. Examples include cash, financing, investment
     * or operation.
     *
     * @param value The new value for cashflowType
     */
    public void setCashflowType(String value) { this.cashflowType = value; }
    /**
     * The description for the Financial Account.
     *
     * @return The field description
     */
    public String getDescription() { return this.description; }
    /**
     * The description for the Financial Account.
     *
     * @param value The new value for description
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * The classification for the Financial Account. Possible values are Asset, Equity,
     * Expense, Liability or Revenue.
     *
     * @return The field classification
     */
    public String getClassification() { return this.classification; }
    /**
     * The classification for the Financial Account. Possible values are Asset, Equity,
     * Expense, Liability or Revenue.
     *
     * @param value The new value for classification
     */
    public void setClassification(String value) { this.classification = value; }
    /**
     * The category for the Financial Account. Examples include Current Asset, Current Liability, Common Stock
     *
     * @return The field category
     */
    public String getCategory() { return this.category; }
    /**
     * The category for the Financial Account. Examples include Current Asset, Current Liability, Common Stock
     *
     * @param value The new value for category
     */
    public void setCategory(String value) { this.category = value; }
    /**
     * The subcategory for the Financial Account. Examples include Cash, Property, Bank Loan, etc.
     *
     * @return The field subcategory
     */
    public String getSubcategory() { return this.subcategory; }
    /**
     * The subcategory for the Financial Account. Examples include Cash, Property, Bank Loan, etc.
     *
     * @param value The new value for subcategory
     */
    public void setSubcategory(String value) { this.subcategory = value; }
    /**
     * The date the FinancialAccount was created.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date the FinancialAccount was created.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The user that has created the Financial Account.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The user that has created the Financial Account.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the Financial Account was modified.
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * The date the Financial Account was modified.
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * The user that has modified the Financial Account.
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The user that has modified the Financial Account.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
};
