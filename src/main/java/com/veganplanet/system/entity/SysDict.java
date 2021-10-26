package com.veganplanet.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysDict implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     *
     * @mbggenerated
     */
    private Integer id;
    /**
     * 类型
     *
     * @mbggenerated
     */
    private String type;
    /**
     * 描述
     *
     * @mbggenerated
     */
    private String description;
    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remarks;
    /**
     * 是否是系统内置
     *
     * @mbggenerated
     */
    private String system;
    /**
     * 删除标记
     *
     * @mbggenerated
     */
    private String delFlag;
    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;
    /**
     * 创建人
     *
     * @mbggenerated
     */
    private String createBy;
    /**
     * 更新人
     *
     * @mbggenerated
     */
    private String updateBy;
    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", description=").append(description);
        sb.append(", remarks=").append(remarks);
        sb.append(", system=").append(system);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}