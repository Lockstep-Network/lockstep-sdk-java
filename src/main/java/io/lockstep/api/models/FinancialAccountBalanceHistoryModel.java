
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
 * Represents a balance for a financial account for a given period of time.
 */
public class FinancialAccountBalanceHistoryModel
{
    private String financialAccountBalanceHistoryId;
    private String groupKey;
    private String financialAccountId;
    private String appEnrollmentId;
    private Integer financialYear;
    private Integer periodNumber;
    private String periodStartDate;
    private String periodEndDate;
    private String status;
    private Double balance;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field financialAccountBalanceHistoryId
     */
    public String getFinancialAccountBalanceHistoryId() { return this.financialAccountBalanceHistoryId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for financialAccountBalanceHistoryId
     */
    public void setFinancialAccountBalanceHistoryId(String value) { this.financialAccountBalanceHistoryId = value; }
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
     * The id of the Financial Account that this balance history is for.
     *
     * @return The field financialAccountId
     */
    public String getFinancialAccountId() { return this.financialAccountId; }
    /**
     * The id of the Financial Account that this balance history is for.
     *
     * @param value The new value for financialAccountId
     */
    public void setFinancialAccountId(String value) { this.financialAccountId = value; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The financial year that this period falls under
     *
     * @return The field financialYear
     */
    public Integer getFinancialYear() { return this.financialYear; }
    /**
     * The financial year that this period falls under
     *
     * @param value The new value for financialYear
     */
    public void setFinancialYear(Integer value) { this.financialYear = value; }
    /**
     * The period number (1-12 or 1-13) that this balance history is for
     *
     * @return The field periodNumber
     */
    public Integer getPeriodNumber() { return this.periodNumber; }
    /**
     * The period number (1-12 or 1-13) that this balance history is for
     *
     * @param value The new value for periodNumber
     */
    public void setPeriodNumber(Integer value) { this.periodNumber = value; }
    /**
     * The start date of this period.
     *
     * @return The field periodStartDate
     */
    public String getPeriodStartDate() { return this.periodStartDate; }
    /**
     * The start date of this period.
     *
     * @param value The new value for periodStartDate
     */
    public void setPeriodStartDate(String value) { this.periodStartDate = value; }
    /**
     * The end date of this period.
     *
     * @return The field periodEndDate
     */
    public String getPeriodEndDate() { return this.periodEndDate; }
    /**
     * The end date of this period.
     *
     * @param value The new value for periodEndDate
     */
    public void setPeriodEndDate(String value) { this.periodEndDate = value; }
    /**
     * The status of this period. The status should be Closed if the books for this period have been closed,
     * if not the status should be Open. The status can also be Deleted if there was a recalculation that needed
     * to occur, for example due to a change in financial year settings.
     *
     * @return The field status
     */
    public String getStatus() { return this.status; }
    /**
     * The status of this period. The status should be Closed if the books for this period have been closed,
     * if not the status should be Open. The status can also be Deleted if there was a recalculation that needed
     * to occur, for example due to a change in financial year settings.
     *
     * @param value The new value for status
     */
    public void setStatus(String value) { this.status = value; }
    /**
     * The current or end balance of this period.
     *
     * @return The field balance
     */
    public Double getBalance() { return this.balance; }
    /**
     * The current or end balance of this period.
     *
     * @param value The new value for balance
     */
    public void setBalance(Double value) { this.balance = value; }
    /**
     * The date on which this financial account balance history record was created.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date on which this financial account balance history record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The ID number of the user who created this financial account balance history.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this financial account balance history.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this financial account balance history record was modified.
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * The date on which this financial account balance history record was modified.
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this financial account balance history.
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this financial account balance history.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
};
