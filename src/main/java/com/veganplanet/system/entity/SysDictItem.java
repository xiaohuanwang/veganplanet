package com.veganplanet.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysDictItem implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     *
     * @mbggenerated
     */
    private Integer id;
    /**
     * 字典ID
     *
     * @mbggenerated
     */
    private Integer dictId;
    /**
     * 值
     *
     * @mbggenerated
     */
    private String value;
    /**
     * 标签
     *
     * @mbggenerated
     */
    private String label;
    /**
     * 字典类型
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
     * 排序（升序）
     *
     * @mbggenerated
     */
    private Integer sort;
    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remarks;
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
     * 修改人
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

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        sb.append(", dictId=").append(dictId);
        sb.append(", value=").append(value);
        sb.append(", label=").append(label);
        sb.append(", type=").append(type);
        sb.append(", description=").append(description);
        sb.append(", sort=").append(sort);
        sb.append(", remarks=").append(remarks);
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