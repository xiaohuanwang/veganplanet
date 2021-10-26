package com.veganplanet.system.entity;

import java.io.Serializable;

public class SysUserRole implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户ID
     *
     * @mbggenerated
     */
    private Integer userId;
    /**
     * 角色ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}