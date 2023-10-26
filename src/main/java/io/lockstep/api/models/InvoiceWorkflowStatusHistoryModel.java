
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
 * A Invoice Workflow Status History represents prior workflow statuses of an E-Invoice.
 */
public class InvoiceWorkflowStatusHistoryModel
{
    private @NotNull String invoiceWorkflowStatusHistoryId;
    private @NotNull String invoiceId;
    private @NotNull String workflowStatusId;
    private @NotNull String groupKey;
    private @Nullable String workflowStatusNotes;
    private @NotNull String created;
    private @NotNull String createdUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Accounting Data Services platform.
     *
     * @return The field invoiceWorkflowStatusHistoryId
     */
    public @NotNull String getInvoiceWorkflowStatusHistoryId() { return this.invoiceWorkflowStatusHistoryId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Accounting Data Services platform.
     *
     * @param value The new value for invoiceWorkflowStatusHistoryId
     */
    public void setInvoiceWorkflowStatusHistoryId(@NotNull String value) { this.invoiceWorkflowStatusHistoryId = value; }
    /**
     * The invoice ID associated with the invoice workflow status history.
     *
     * @return The field invoiceId
     */
    public @NotNull String getInvoiceId() { return this.invoiceId; }
    /**
     * The invoice ID associated with the invoice workflow status history.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@NotNull String value) { this.invoiceId = value; }
    /**
     * The workflow status ID associated with the invoice workflow status history.
     *
     * @return The field workflowStatusId
     */
    public @NotNull String getWorkflowStatusId() { return this.workflowStatusId; }
    /**
     * The workflow status ID associated with the invoice workflow status history.
     *
     * @param value The new value for workflowStatusId
     */
    public void setWorkflowStatusId(@NotNull String value) { this.workflowStatusId = value; }
    /**
     * The GroupKey uniquely identifies a single Accounting Data Services Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Accounting Data Services Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * The notes for the invoice workflow status history.
     *
     * @return The field workflowStatusNotes
     */
    public @Nullable String getWorkflowStatusNotes() { return this.workflowStatusNotes; }
    /**
     * The notes for the invoice workflow status history.
     *
     * @param value The new value for workflowStatusNotes
     */
    public void setWorkflowStatusNotes(@Nullable String value) { this.workflowStatusNotes = value; }
    /**
     * The date that the invoice workflow status history was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date that the invoice workflow status history was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created the invoice workflow status history.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the invoice workflow status history.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
};
