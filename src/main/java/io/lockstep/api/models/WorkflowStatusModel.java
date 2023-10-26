
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
 * A Workflow Status represents the state for a specific workflow for an entity.
 */
public class WorkflowStatusModel
{
    private @NotNull String id;
    private @NotNull String name;
    private @Nullable String description;
    private @Nullable String parentWorkflowStatusId;
    private @Nullable String category;
    private @Nullable String code;
    private @NotNull Boolean isNotesRequired;
    private @NotNull Boolean promoteToErp;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Accounting Data Services platform.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Accounting Data Services platform.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of the workflow status.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of the workflow status.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The description explaining the use of the workflow status.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * The description explaining the use of the workflow status.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * The prior workflow status ID.
     *
     * @return The field parentWorkflowStatusId
     */
    public @Nullable String getParentWorkflowStatusId() { return this.parentWorkflowStatusId; }
    /**
     * The prior workflow status ID.
     *
     * @param value The new value for parentWorkflowStatusId
     */
    public void setParentWorkflowStatusId(@Nullable String value) { this.parentWorkflowStatusId = value; }
    /**
     * The category of the workflow status.
     *
     * @return The field category
     */
    public @Nullable String getCategory() { return this.category; }
    /**
     * The category of the workflow status.
     *
     * @param value The new value for category
     */
    public void setCategory(@Nullable String value) { this.category = value; }
    /**
     * The code of the workflow status.
     *
     * @return The field code
     */
    public @Nullable String getCode() { return this.code; }
    /**
     * The code of the workflow status.
     *
     * @param value The new value for code
     */
    public void setCode(@Nullable String value) { this.code = value; }
    /**
     * Indicates whether notes are required or not.
     *
     * @return The field isNotesRequired
     */
    public @NotNull Boolean getIsNotesRequired() { return this.isNotesRequired; }
    /**
     * Indicates whether notes are required or not.
     *
     * @param value The new value for isNotesRequired
     */
    public void setIsNotesRequired(@NotNull Boolean value) { this.isNotesRequired = value; }
    /**
     * Indicates whether the status change should be reported to the ERP or not.
     *
     * @return The field promoteToErp
     */
    public @NotNull Boolean getPromoteToErp() { return this.promoteToErp; }
    /**
     * Indicates whether the status change should be reported to the ERP or not.
     *
     * @param value The new value for promoteToErp
     */
    public void setPromoteToErp(@NotNull Boolean value) { this.promoteToErp = value; }
    /**
     * The date that the workflow status was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date that the workflow status was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created the workflow status.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the workflow status.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date that the workflow status was last modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date that the workflow status was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified the workflow status.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the workflow status.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
};
