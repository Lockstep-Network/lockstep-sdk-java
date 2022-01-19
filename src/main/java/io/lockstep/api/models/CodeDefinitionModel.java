
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
 * @version    2022.3
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Represents a Code Definition.  Codes can be used as shortened, human readable strings.
 * Additionally, this table can be used to store lists of system values for Lockstep objects.
 */
public class CodeDefinitionModel
{
    private String codeDefinitionId;
    private String groupKey;
    private String codeType;
    private String code;
    private String codeDescription;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field codeDefinitionId
     */
    public String getCodeDefinitionId() { return this.codeDefinitionId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for codeDefinitionId
     */
    public void setCodeDefinitionId(String value) { this.codeDefinitionId = value; }
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
     * The type of the Code Definition
     *
     * @return The field codeType
     */
    public String getCodeType() { return this.codeType; }
    /**
     * The type of the Code Definition
     *
     * @param value The new value for codeType
     */
    public void setCodeType(String value) { this.codeType = value; }
    /**
     * The Code to be defined.
     *
     * @return The field code
     */
    public String getCode() { return this.code; }
    /**
     * The Code to be defined.
     *
     * @param value The new value for code
     */
    public void setCode(String value) { this.code = value; }
    /**
     * The definition of the Code
     *
     * @return The field codeDescription
     */
    public String getCodeDescription() { return this.codeDescription; }
    /**
     * The definition of the Code
     *
     * @param value The new value for codeDescription
     */
    public void setCodeDescription(String value) { this.codeDescription = value; }
    /**
     * The date that the Code Definition was created
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date that the Code Definition was created
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The ID of the user who created the Code Definition
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the Code Definition
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the Code Definition was last modified
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * The date the Code Definition was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * The ID of the user who last modified the Code Definition
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the Code Definition
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
};
