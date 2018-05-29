package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "agent_tb_adver", schema = "db_financial_window", catalog = "")
public class AgentTbAdverEntity {
    private String id;
    private String createName;
    private Timestamp createDate;
    private String updateName;
    private Timestamp updateDate;
    private String bpmStatus;
    private String adverName;
    private String adverLoginname;
    private String agentLoginpwd;
    private String adverNo;
    private String adverQq;
    private String adverEmail;
    private String adverAgent;
    private Double adverTotalmoney;
    private Double adverIdlemoney;
    private Double adverOccupiedmoney;
    private String adverRemark;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "create_name")
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "update_name")
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    @Basic
    @Column(name = "update_date")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "bpm_status")
    public String getBpmStatus() {
        return bpmStatus;
    }

    public void setBpmStatus(String bpmStatus) {
        this.bpmStatus = bpmStatus;
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
    @Column(name = "adver_loginname")
    public String getAdverLoginname() {
        return adverLoginname;
    }

    public void setAdverLoginname(String adverLoginname) {
        this.adverLoginname = adverLoginname;
    }

    @Basic
    @Column(name = "agent_loginpwd")
    public String getAgentLoginpwd() {
        return agentLoginpwd;
    }

    public void setAgentLoginpwd(String agentLoginpwd) {
        this.agentLoginpwd = agentLoginpwd;
    }

    @Basic
    @Column(name = "adver_no")
    public String getAdverNo() {
        return adverNo;
    }

    public void setAdverNo(String adverNo) {
        this.adverNo = adverNo;
    }

    @Basic
    @Column(name = "adver_qq")
    public String getAdverQq() {
        return adverQq;
    }

    public void setAdverQq(String adverQq) {
        this.adverQq = adverQq;
    }

    @Basic
    @Column(name = "adver_email")
    public String getAdverEmail() {
        return adverEmail;
    }

    public void setAdverEmail(String adverEmail) {
        this.adverEmail = adverEmail;
    }

    @Basic
    @Column(name = "adver_agent")
    public String getAdverAgent() {
        return adverAgent;
    }

    public void setAdverAgent(String adverAgent) {
        this.adverAgent = adverAgent;
    }

    @Basic
    @Column(name = "adver_totalmoney")
    public Double getAdverTotalmoney() {
        return adverTotalmoney;
    }

    public void setAdverTotalmoney(Double adverTotalmoney) {
        this.adverTotalmoney = adverTotalmoney;
    }

    @Basic
    @Column(name = "adver_idlemoney")
    public Double getAdverIdlemoney() {
        return adverIdlemoney;
    }

    public void setAdverIdlemoney(Double adverIdlemoney) {
        this.adverIdlemoney = adverIdlemoney;
    }

    @Basic
    @Column(name = "adver_occupiedmoney")
    public Double getAdverOccupiedmoney() {
        return adverOccupiedmoney;
    }

    public void setAdverOccupiedmoney(Double adverOccupiedmoney) {
        this.adverOccupiedmoney = adverOccupiedmoney;
    }

    @Basic
    @Column(name = "adver_remark")
    public String getAdverRemark() {
        return adverRemark;
    }

    public void setAdverRemark(String adverRemark) {
        this.adverRemark = adverRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentTbAdverEntity that = (AgentTbAdverEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createName != null ? !createName.equals(that.createName) : that.createName != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (updateName != null ? !updateName.equals(that.updateName) : that.updateName != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;
        if (bpmStatus != null ? !bpmStatus.equals(that.bpmStatus) : that.bpmStatus != null) return false;
        if (adverName != null ? !adverName.equals(that.adverName) : that.adverName != null) return false;
        if (adverLoginname != null ? !adverLoginname.equals(that.adverLoginname) : that.adverLoginname != null)
            return false;
        if (agentLoginpwd != null ? !agentLoginpwd.equals(that.agentLoginpwd) : that.agentLoginpwd != null)
            return false;
        if (adverNo != null ? !adverNo.equals(that.adverNo) : that.adverNo != null) return false;
        if (adverQq != null ? !adverQq.equals(that.adverQq) : that.adverQq != null) return false;
        if (adverEmail != null ? !adverEmail.equals(that.adverEmail) : that.adverEmail != null) return false;
        if (adverAgent != null ? !adverAgent.equals(that.adverAgent) : that.adverAgent != null) return false;
        if (adverTotalmoney != null ? !adverTotalmoney.equals(that.adverTotalmoney) : that.adverTotalmoney != null)
            return false;
        if (adverIdlemoney != null ? !adverIdlemoney.equals(that.adverIdlemoney) : that.adverIdlemoney != null)
            return false;
        if (adverOccupiedmoney != null ? !adverOccupiedmoney.equals(that.adverOccupiedmoney) : that.adverOccupiedmoney != null)
            return false;
        if (adverRemark != null ? !adverRemark.equals(that.adverRemark) : that.adverRemark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createName != null ? createName.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateName != null ? updateName.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (bpmStatus != null ? bpmStatus.hashCode() : 0);
        result = 31 * result + (adverName != null ? adverName.hashCode() : 0);
        result = 31 * result + (adverLoginname != null ? adverLoginname.hashCode() : 0);
        result = 31 * result + (agentLoginpwd != null ? agentLoginpwd.hashCode() : 0);
        result = 31 * result + (adverNo != null ? adverNo.hashCode() : 0);
        result = 31 * result + (adverQq != null ? adverQq.hashCode() : 0);
        result = 31 * result + (adverEmail != null ? adverEmail.hashCode() : 0);
        result = 31 * result + (adverAgent != null ? adverAgent.hashCode() : 0);
        result = 31 * result + (adverTotalmoney != null ? adverTotalmoney.hashCode() : 0);
        result = 31 * result + (adverIdlemoney != null ? adverIdlemoney.hashCode() : 0);
        result = 31 * result + (adverOccupiedmoney != null ? adverOccupiedmoney.hashCode() : 0);
        result = 31 * result + (adverRemark != null ? adverRemark.hashCode() : 0);
        return result;
    }
}
