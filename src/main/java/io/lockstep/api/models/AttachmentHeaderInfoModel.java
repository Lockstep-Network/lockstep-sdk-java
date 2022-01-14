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
 * @version    2022.2
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


public class AttachmentHeaderInfoModel
{
    private String groupKey;
    private String companyId;
    private Integer totalAttachments;
    private Integer totalArchived;
    private Integer totalActive;

    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The CompanyId associated with the attachment status report. Providing a null value will return an attachment summary for all attachments associated to the provided GroupKey
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * @param value - The CompanyId associated with the attachment status report. Providing a null value will return an attachment summary for all attachments associated to the provided GroupKey
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * @return The total number of attachments associated with the provided GroupKey and CompanyId.
     */
    public Integer getTotalAttachments() { return this.totalAttachments; }
    /**
     * @param value - The total number of attachments associated with the provided GroupKey and CompanyId.
     */
    public void setTotalAttachments(Integer value) { this.totalAttachments = value; }
    /**
     * @return The total number of archived attachments associated with the provided GroupKey and CompanyId.
     */
    public Integer getTotalArchived() { return this.totalArchived; }
    /**
     * @param value - The total number of archived attachments associated with the provided GroupKey and CompanyId.
     */
    public void setTotalArchived(Integer value) { this.totalArchived = value; }
    /**
     * @return The total number of active attachments associated with the provided GroupKey and CompanyId.
     */
    public Integer getTotalActive() { return this.totalActive; }
    /**
     * @param value - The total number of active attachments associated with the provided GroupKey and CompanyId.
     */
    public void setTotalActive(Integer value) { this.totalActive = value; }
};
