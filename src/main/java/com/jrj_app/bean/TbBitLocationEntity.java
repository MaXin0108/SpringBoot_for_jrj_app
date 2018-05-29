package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_bit_location", schema = "db_financial_window", catalog = "")
public class TbBitLocationEntity {
    private String guid;
    private Timestamp createtime;
    private Timestamp updatetime;
    private String investmentGuid;
    private String platform;
    private String position;
    private String rank;

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
    @Column(name = "investment_guid")
    public String getInvestmentGuid() {
        return investmentGuid;
    }

    public void setInvestmentGuid(String investmentGuid) {
        this.investmentGuid = investmentGuid;
    }

    @Basic
    @Column(name = "platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "rank")
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbBitLocationEntity that = (TbBitLocationEntity) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (updatetime != null ? !updatetime.equals(that.updatetime) : that.updatetime != null) return false;
        if (investmentGuid != null ? !investmentGuid.equals(that.investmentGuid) : that.investmentGuid != null)
            return false;
        if (platform != null ? !platform.equals(that.platform) : that.platform != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (rank != null ? !rank.equals(that.rank) : that.rank != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        result = 31 * result + (investmentGuid != null ? investmentGuid.hashCode() : 0);
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        return result;
    }
}
