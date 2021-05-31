package com.inttom.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author inttom
 * @since 2021-05-31
 */
public class MBlog extends Model<MBlog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    private String title;

    private String description;

    private String content;

    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 乐观锁
     */
    private String version;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Long getId() {
        return id;
    }

    public MBlog setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getUserId() {
        return userId;
    }

    public MBlog setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public String getTitle() {
        return title;
    }

    public MBlog setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getDescription() {
        return description;
    }

    public MBlog setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getContent() {
        return content;
    }

    public MBlog setContent(String content) {
        this.content = content;
        return this;
    }
    public Integer getStatus() {
        return status;
    }

    public MBlog setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public MBlog setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public MBlog setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getVersion() {
        return version;
    }

    public MBlog setVersion(String version) {
        this.version = version;
        return this;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public MBlog setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "MBlog{" +
            "id=" + id +
            ", userId=" + userId +
            ", title=" + title +
            ", description=" + description +
            ", content=" + content +
            ", status=" + status +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", version=" + version +
            ", deleted=" + deleted +
        "}";
    }
}
