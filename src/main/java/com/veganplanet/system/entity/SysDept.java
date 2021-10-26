package com.veganplanet.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysDept implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer deptId;
    /**
     * 部门名称
     *
     * @mbggenerated
     */
    private String name;
    /**
     * 排序
     *
     * @mbggenerated
     */
    private Integer sort;
    /**
     * 是否删除  -1：已删除  0：正常
     *
     * @mbggenerated
     */
    private String delFlag;
    /**
     * 父节点
     *
     * @mbggenerated
     */
    private Integer parentId;
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
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;
    /**
     * 更新人
     *
     * @mbggenerated
     */
    private String updateBy;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptId=").append(deptId);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", parentId=").append(parentId);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}