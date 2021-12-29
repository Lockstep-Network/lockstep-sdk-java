/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;

public class CodeDefinitionModel
{
    private String codeDefinitionId;
    private String groupKey;
    private String codeType;
    private String code;
    private String codeDescription;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getCodeDefinitionId() { return this.codeDefinitionId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setCodeDefinitionId(String value) { this.codeDefinitionId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The type of the Code Definition
     */
    public String getCodeType() { return this.codeType; }
    /**
     * The type of the Code Definition
     */
    public void setCodeType(String value) { this.codeType = value; }
    /**
     * The Code to be defined.
     */
    public String getCode() { return this.code; }
    /**
     * The Code to be defined.
     */
    public void setCode(String value) { this.code = value; }
    /**
     * The definition of the Code
     */
    public String getCodeDescription() { return this.codeDescription; }
    /**
     * The definition of the Code
     */
    public void setCodeDescription(String value) { this.codeDescription = value; }
    /**
     * The date that the Code Definition was created
     */
    public Date getCreated() { return this.created; }
    /**
     * The date that the Code Definition was created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created the Code Definition
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the Code Definition
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the Code Definition was last modified
     */
    public Date getModified() { return this.modified; }
    /**
     * The date the Code Definition was last modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified the Code Definition
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the Code Definition
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
};
