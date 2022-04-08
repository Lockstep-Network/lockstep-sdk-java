
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
 * Represents a row of a financial Report report
 */
public class FinancialReportRowModel
{
    private @Nullable String rowType;
    private @Nullable String label;
    private @Nullable FinancialReportRowModel[] rows;
    private @Nullable FinancialReportCellModel[] cells;

    /**
     * Describes what type of row this row is (Header, Summary, Classification, Category, Subcategory, Data)
     *
     * @return The field rowType
     */
    public @Nullable String getRowType() { return this.rowType; }
    /**
     * Describes what type of row this row is (Header, Summary, Classification, Category, Subcategory, Data)
     *
     * @param value The new value for rowType
     */
    public void setRowType(@Nullable String value) { this.rowType = value; }
    /**
     * The label for the row if it is a Classification, Category, or Subcategory.
     *
     * @return The field label
     */
    public @Nullable String getLabel() { return this.label; }
    /**
     * The label for the row if it is a Classification, Category, or Subcategory.
     *
     * @param value The new value for label
     */
    public void setLabel(@Nullable String value) { this.label = value; }
    /**
     * The sub rows of this row if it is a Classification, Category, or Subcategory.
     *
     * @return The field rows
     */
    public @Nullable FinancialReportRowModel[] getRows() { return this.rows; }
    /**
     * The sub rows of this row if it is a Classification, Category, or Subcategory.
     *
     * @param value The new value for rows
     */
    public void setRows(@Nullable FinancialReportRowModel[] value) { this.rows = value; }
    /**
     * The cells of the row
     *
     * @return The field cells
     */
    public @Nullable FinancialReportCellModel[] getCells() { return this.cells; }
    /**
     * The cells of the row
     *
     * @param value The new value for cells
     */
    public void setCells(@Nullable FinancialReportCellModel[] value) { this.cells = value; }
};
