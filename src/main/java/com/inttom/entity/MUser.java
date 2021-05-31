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
public class MUser extends Model<MUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String username;

    private String avatar;

    private String email;

    private String password;

    private Integer status;

    private LocalDateTime lastLogin;

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

    public MUser setId(Long id) {
        this.id = id;
        return this;
    }
    public String getUsername() {
        return username;
    }

    public MUser setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getAvatar() {
        return avatar;
    }

    public MUser setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getEmail() {
        return email;
    }

    public MUser setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getPassword() {
        return password;
    }

    public MUser setPassword(String password) {
        this.password = password;
        return this;
    }
    public Integer getStatus() {
        return status;
    }

    public MUser setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public MUser setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
        return this;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public MUser setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public MUser setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getVersion() {
        return version;
    }

    public MUser setVersion(String version) {
        this.version = version;
        return this;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public MUser setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "MUser{" +
            "id=" + id +
            ", username=" + username +
            ", avatar=" + avatar +
            ", email=" + email +
            ", password=" + password +
            ", status=" + status +
            ", lastLogin=" + lastLogin +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", version=" + version +
            ", deleted=" + deleted +
        "}";
    }
}
