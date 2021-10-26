package com.veganplanet.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysLog implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     *
     * @mbggenerated
     */
    private Long id;
    /**
     * 日志类型
     *
     * @mbggenerated
     */
    private String type;
    /**
     * 日志标题
     *
     * @mbggenerated
     */
    private String title;
    /**
     * 服务ID
     *
     * @mbggenerated
     */
    private String serviceId;
    /**
     * 操作IP地址
     *
     * @mbggenerated
     */
    private String remoteAddr;
    /**
     * 用户代理
     *
     * @mbggenerated
     */
    private String userAgent;
    /**
     * 请求URI
     *
     * @mbggenerated
     */
    private String requestUri;
    /**
     * 操作方式
     *
     * @mbggenerated
     */
    private String method;
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
     * 更新时间
     *
     * @mbggenerated
     */
    private Date updateTime;
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
     * 操作提交的数据
     *
     * @mbggenerated
     */
    private String params;
    /**
     * 执行时间
     *
     * @mbggenerated
     */
    private String time;
    /**
     * 异常信息
     *
     * @mbggenerated
     */
    private String exception;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
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

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", title=").append(title);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", remoteAddr=").append(remoteAddr);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", requestUri=").append(requestUri);
        sb.append(", method=").append(method);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", params=").append(params);
        sb.append(", time=").append(time);
        sb.append(", exception=").append(exception);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}