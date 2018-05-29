package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_customerservice", schema = "db_financial_window", catalog = "")
public class TbCustomerserviceEntity {
    private String guid;
    private Timestamp createtime;
    private Timestamp updatetime;
    private String adverName;
    private String telStaff;
    private String guidStaff;
    private String alias;

    @Id
    @Column(name = "guid")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "createtime")
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "updatetime")
    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    @Basic
    @Column(name = "adver_name")
    public String getAdverName() {
        return adverName;
    }

    public void setAdverName(String adverName) {
        this.adverName = adverName;
    }

    @Basic
    @Column(name = "tel_staff")
    public String getTelStaff() {
        return telStaff;
    }

    public void setTelStaff(String telStaff) {
        this.telStaff = telStaff;
    }

    @Basic
    @Column(name = "guid_staff")
    public String getGuidStaff() {
        return guidStaff;
    }

    public void setGuidStaff(String guidStaff) {
        this.guidStaff = guidStaff;
    }

    @Basic
    @Column(name = "alias")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCustomerserviceEntity that = (TbCustomerserviceEntity) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (updatetime != null ? !updatetime.equals(that.updatetime) : that.updatetime != null) return false;
        if (adverName != null ? !adverName.equals(that.adverName) : that.adverName != null) return false;
        if (telStaff != null ? !telStaff.equals(that.telStaff) : that.telStaff != null) return false;
        if (guidStaff != null ? !guidStaff.equals(that.guidStaff) : that.guidStaff != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        result = 31 * result + (adverName != null ? adverName.hashCode() : 0);
        result = 31 * result + (telStaff != null ? telStaff.hashCode() : 0);
        result = 31 * result + (guidStaff != null ? guidStaff.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        return result;
    }
}
