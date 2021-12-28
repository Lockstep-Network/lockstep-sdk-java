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
    public String getcodeDefinitionId() { return this.codeDefinitionId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setcodeDefinitionId(String value) { this.codeDefinitionId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The type of the Code Definition
     */
    public String getcodeType() { return this.codeType; }
    /**
     * The type of the Code Definition
     */
    public void setcodeType(String value) { this.codeType = value; }
    /**
     * The Code to be defined.
     */
    public String getcode() { return this.code; }
    /**
     * The Code to be defined.
     */
    public void setcode(String value) { this.code = value; }
    /**
     * The definition of the Code
     */
    public String getcodeDescription() { return this.codeDescription; }
    /**
     * The definition of the Code
     */
    public void setcodeDescription(String value) { this.codeDescription = value; }
    /**
     * The date that the Code Definition was created
     */
    public Date getcreated() { return this.created; }
    /**
     * The date that the Code Definition was created
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created the Code Definition
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the Code Definition
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the Code Definition was last modified
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date the Code Definition was last modified
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified the Code Definition
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the Code Definition
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
};
