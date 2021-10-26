package com.veganplanet.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 菜单ID
     *
     * @mbggenerated
     */
    private Integer menuId;
    /**
     * 菜单名称
     *
     * @mbggenerated
     */
    private String name;
    /**
     * 菜单权限标识
     *
     * @mbggenerated
     */
    private String permission;
    /**
     * 前端URL
     *
     * @mbggenerated
     */
    private String path;
    /**
     * 父菜单ID
     *
     * @mbggenerated
     */
    private Integer parentId;
    /**
     * 图标
     *
     * @mbggenerated
     */
    private String icon;
    /**
     * VUE页面
     *
     * @mbggenerated
     */
    private String component;
    /**
     * 排序值
     *
     * @mbggenerated
     */
    private Integer sort;
    /**
     * 0-开启，1- 关闭
     *
     * @mbggenerated
     */
    private String keepAlive;
    /**
     * 菜单类型 （0菜单 1按钮）
     *
     * @mbggenerated
     */
    private String type;
    /**
     * 逻辑删除标记(0--正常 1--删除)
     *
     * @mbggenerated
     */
    private String delFlag;
    /**
     * 创建人
     *
     * @mbggenerated
     */
    private String createBy;
    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;
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

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append(", menuId=").append(menuId);
        sb.append(", name=").append(name);
        sb.append(", permission=").append(permission);
        sb.append(", path=").append(path);
        sb.append(", parentId=").append(parentId);
        sb.append(", icon=").append(icon);
        sb.append(", component=").append(component);
        sb.append(", sort=").append(sort);
        sb.append(", keepAlive=").append(keepAlive);
        sb.append(", type=").append(type);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}