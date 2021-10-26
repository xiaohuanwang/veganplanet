package com.veganplanet.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysOauthClientDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 客户端ID
     *
     * @mbggenerated
     */
    private String clientId;
    /**
     * 资源列表
     *
     * @mbggenerated
     */
    private String resourceIds;
    /**
     * 客户端密钥
     *
     * @mbggenerated
     */
    private String clientSecret;
    /**
     * 域
     *
     * @mbggenerated
     */
    private String scope;
    /**
     * 认证类型
     *
     * @mbggenerated
     */
    private String authorizedGrantTypes;
    /**
     * 重定向地址
     *
     * @mbggenerated
     */
    private String webServerRedirectUri;
    /**
     * 角色列表
     *
     * @mbggenerated
     */
    private String authorities;
    /**
     * token 有效期
     *
     * @mbggenerated
     */
    private Integer accessTokenValidity;
    /**
     * 刷新令牌有效期
     *
     * @mbggenerated
     */
    private Integer refreshTokenValidity;
    /**
     * 令牌扩展字段JSON
     *
     * @mbggenerated
     */
    private String additionalInformation;
    /**
     * 是否自动放行
     *
     * @mbggenerated
     */
    private String autoapprove;
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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
    }

    public String getWebServerRedirectUri() {
        return webServerRedirectUri;
    }

    public void setWebServerRedirectUri(String webServerRedirectUri) {
        this.webServerRedirectUri = webServerRedirectUri;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getAutoapprove() {
        return autoapprove;
    }

    public void setAutoapprove(String autoapprove) {
        this.autoapprove = autoapprove;
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
        sb.append(", clientId=").append(clientId);
        sb.append(", resourceIds=").append(resourceIds);
        sb.append(", clientSecret=").append(clientSecret);
        sb.append(", scope=").append(scope);
        sb.append(", authorizedGrantTypes=").append(authorizedGrantTypes);
        sb.append(", webServerRedirectUri=").append(webServerRedirectUri);
        sb.append(", authorities=").append(authorities);
        sb.append(", accessTokenValidity=").append(accessTokenValidity);
        sb.append(", refreshTokenValidity=").append(refreshTokenValidity);
        sb.append(", additionalInformation=").append(additionalInformation);
        sb.append(", autoapprove=").append(autoapprove);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}