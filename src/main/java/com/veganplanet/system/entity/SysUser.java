package com.veganplanet.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     *
     * @mbggenerated
     */
    private Integer userId;
    /**
     * 用户名
     *
     * @mbggenerated
     */
    private String username;
    /**
     * 密码
     *
     * @mbggenerated
     */
    private String password;
    /**
     * 随机盐
     *
     * @mbggenerated
     */
    private String salt;
    /**
     * 简介
     *
     * @mbggenerated
     */
    private String phone;
    /**
     * 头像
     *
     * @mbggenerated
     */
    private String avatar;
    /**
     * 部门ID
     *
     * @mbggenerated
     */
    private Integer deptId;
    /**
     * 0-正常，9-锁定
     *
     * @mbggenerated
     */
    private String lockFlag;
    /**
     * 0-正常，1-删除
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
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;
    /**
     * 创建者
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(String lockFlag) {
        this.lockFlag = lockFlag;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", phone=").append(phone);
        sb.append(", avatar=").append(avatar);
        sb.append(", deptId=").append(deptId);
        sb.append(", lockFlag=").append(lockFlag);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}