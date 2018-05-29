package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_announcement", schema = "db_financial_window", catalog = "")
public class TbAnnouncementEntity {
    private String id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String announcementPromulgator;
    private String announcementTitle;
    private String announcementBody;
    private Integer announcementClick;
    private String announcementPlatform;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "announcement_promulgator")
    public String getAnnouncementPromulgator() {
        return announcementPromulgator;
    }

    public void setAnnouncementPromulgator(String announcementPromulgator) {
        this.announcementPromulgator = announcementPromulgator;
    }

    @Basic
    @Column(name = "announcement_title")
    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
    }

    @Basic
    @Column(name = "announcement_body")
    public String getAnnouncementBody() {
        return announcementBody;
    }

    public void setAnnouncementBody(String announcementBody) {
        this.announcementBody = announcementBody;
    }

    @Basic
    @Column(name = "announcement_click")
    public Integer getAnnouncementClick() {
        return announcementClick;
    }

    public void setAnnouncementClick(Integer announcementClick) {
        this.announcementClick = announcementClick;
    }

    @Basic
    @Column(name = "announcement_platform")
    public String getAnnouncementPlatform() {
        return announcementPlatform;
    }

    public void setAnnouncementPlatform(String announcementPlatform) {
        this.announcementPlatform = announcementPlatform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbAnnouncementEntity that = (TbAnnouncementEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (announcementPromulgator != null ? !announcementPromulgator.equals(that.announcementPromulgator) : that.announcementPromulgator != null)
            return false;
        if (announcementTitle != null ? !announcementTitle.equals(that.announcementTitle) : that.announcementTitle != null)
            return false;
        if (announcementBody != null ? !announcementBody.equals(that.announcementBody) : that.announcementBody != null)
            return false;
        if (announcementClick != null ? !announcementClick.equals(that.announcementClick) : that.announcementClick != null)
            return false;
        if (announcementPlatform != null ? !announcementPlatform.equals(that.announcementPlatform) : that.announcementPlatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (announcementPromulgator != null ? announcementPromulgator.hashCode() : 0);
        result = 31 * result + (announcementTitle != null ? announcementTitle.hashCode() : 0);
        result = 31 * result + (announcementBody != null ? announcementBody.hashCode() : 0);
        result = 31 * result + (announcementClick != null ? announcementClick.hashCode() : 0);
        result = 31 * result + (announcementPlatform != null ? announcementPlatform.hashCode() : 0);
        return result;
    }
}
