
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
 * A Financial Year Setting is used to to set the type, beginning, end, and number of periods of a year used to
 * calculate accounting reports. The financial setting can either be for a specific app enrollment id via a sync
 * or, when the financial year setting is manually created, will cover all account data without an app enrollment id.
 */
public class FinancialYearSettingModel
{
    private String financialYearSettingId;
    private String groupKey;
    private String appEnrollmentId;
    private String yearType;
    private Integer totalPeriods;
    private String startDate;
    private String endDate;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field financialYearSettingId
     */
    public String getFinancialYearSettingId() { return this.financialYearSettingId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for financialYearSettingId
     */
    public void setFinancialYearSettingId(String value) { this.financialYearSettingId = value; }
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
     * The type of financial year, either Calendar or Fiscal.
     *
     * @return The field yearType
     */
    public String getYearType() { return this.yearType; }
    /**
     * The type of financial year, either Calendar or Fiscal.
     *
     * @param value The new value for yearType
     */
    public void setYearType(String value) { this.yearType = value; }
    /**
     * Total number of periods in the year. For Calendar year types this should always be 12. For Fiscal year types
     * this can either be 12 or 13 for a 4 week 13 period year.
     *
     * @return The field totalPeriods
     */
    public Integer getTotalPeriods() { return this.totalPeriods; }
    /**
     * Total number of periods in the year. For Calendar year types this should always be 12. For Fiscal year types
     * this can either be 12 or 13 for a 4 week 13 period year.
     *
     * @param value The new value for totalPeriods
     */
    public void setTotalPeriods(Integer value) { this.totalPeriods = value; }
    /**
     * The start date of the financial year. Should be entered in MM-DD format.
     *
     * @return The field startDate
     */
    public String getStartDate() { return this.startDate; }
    /**
     * The start date of the financial year. Should be entered in MM-DD format.
     *
     * @param value The new value for startDate
     */
    public void setStartDate(String value) { this.startDate = value; }
    /**
     * The end date of the financial year. Should be entered in MM-DD format.
     *
     * @return The field endDate
     */
    public String getEndDate() { return this.endDate; }
    /**
     * The end date of the financial year. Should be entered in MM-DD format.
     *
     * @param value The new value for endDate
     */
    public void setEndDate(String value) { this.endDate = value; }
    /**
     * The date on which this financial year setting record was created.
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date on which this financial year setting record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The ID number of the user who created this financial year setting.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this financial year setting.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this financial year setting record was last modified.
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * The date on which this financial year setting record was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this financial year setting.
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this financial year setting.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
};
