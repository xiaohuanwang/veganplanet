package com.veganplanet.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysFile implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     *
     * @mbggenerated
     */
    private Long id;
    private String fileName;
    private String bucketName;
    private String original;
    private String type;
    /**
     * 文件大小
     *
     * @mbggenerated
     */
    private Long fileSize;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
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
        sb.append(", id=").append(id);
        sb.append(", fileName=").append(fileName);
        sb.append(", bucketName=").append(bucketName);
        sb.append(", original=").append(original);
        sb.append(", type=").append(type);
        sb.append(", fileSize=").append(fileSize);
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