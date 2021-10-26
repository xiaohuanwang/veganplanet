package com.veganplanet.system.entity;

import java.io.Serializable;

public class SysRoleMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 角色ID
     *
     * @mbggenerated
     */
    private Integer roleId;
    /**
     * 菜单ID
     *
     * @mbggenerated
     */
    private Integer menuId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}