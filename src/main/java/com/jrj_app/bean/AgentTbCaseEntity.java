package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "agent_tb_case", schema = "db_financial_window", catalog = "")
public class AgentTbCaseEntity {
    private String id;
    private String snCase;
    private Timestamp createDate;
    private String chargeStaffAdd;
    private String chargeStaffCur;
    private Integer moneyCase;
    private String statusCase;
    private String curPlatform;
    private String curCompany;
    private String curAgreement;
    private String qqCustomer;
    private String guidCustomer;
    private String caseStatus;
    private Integer caseSpending;
    private String guidAgreement;
    private String caseLock;
    private String businessType;
    private Timestamp updateDate;
    private String createName;
    private String updateName;
    private String agentGuid;
    private Double balance;
    private String progressBar;
    private Timestamp changeTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sn_case")
    public String getSnCase() {
        return snCase;
    }

    public void setSnCase(String snCase) {
        this.snCase = snCase;
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
    @Column(name = "charge_staff_add")
    public String getChargeStaffAdd() {
        return chargeStaffAdd;
    }

    public void setChargeStaffAdd(String chargeStaffAdd) {
        this.chargeStaffAdd = chargeStaffAdd;
    }

    @Basic
    @Column(name = "charge_staff_cur")
    public String getChargeStaffCur() {
        return chargeStaffCur;
    }

    public void setChargeStaffCur(String chargeStaffCur) {
        this.chargeStaffCur = chargeStaffCur;
    }

    @Basic
    @Column(name = "money_case")
    public Integer getMoneyCase() {
        return moneyCase;
    }

    public void setMoneyCase(Integer moneyCase) {
        this.moneyCase = moneyCase;
    }

    @Basic
    @Column(name = "status_case")
    public String getStatusCase() {
        return statusCase;
    }

    public void setStatusCase(String statusCase) {
        this.statusCase = statusCase;
    }

    @Basic
    @Column(name = "cur_platform")
    public String getCurPlatform() {
        return curPlatform;
    }

    public void setCurPlatform(String curPlatform) {
        this.curPlatform = curPlatform;
    }

    @Basic
    @Column(name = "cur_company")
    public String getCurCompany() {
        return curCompany;
    }

    public void setCurCompany(String curCompany) {
        this.curCompany = curCompany;
    }

    @Basic
    @Column(name = "cur_agreement")
    public String getCurAgreement() {
        return curAgreement;
    }

    public void setCurAgreement(String curAgreement) {
        this.curAgreement = curAgreement;
    }

    @Basic
    @Column(name = "qq_customer")
    public String getQqCustomer() {
        return qqCustomer;
    }

    public void setQqCustomer(String qqCustomer) {
        this.qqCustomer = qqCustomer;
    }

    @Basic
    @Column(name = "guid_customer")
    public String getGuidCustomer() {
        return guidCustomer;
    }

    public void setGuidCustomer(String guidCustomer) {
        this.guidCustomer = guidCustomer;
    }

    @Basic
    @Column(name = "case_status")
    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    @Basic
    @Column(name = "case_spending")
    public Integer getCaseSpending() {
        return caseSpending;
    }

    public void setCaseSpending(Integer caseSpending) {
        this.caseSpending = caseSpending;
    }

    @Basic
    @Column(name = "guid_agreement")
    public String getGuidAgreement() {
        return guidAgreement;
    }

    public void setGuidAgreement(String guidAgreement) {
        this.guidAgreement = guidAgreement;
    }

    @Basic
    @Column(name = "case_lock")
    public String getCaseLock() {
        return caseLock;
    }

    public void setCaseLock(String caseLock) {
        this.caseLock = caseLock;
    }

    @Basic
    @Column(name = "business_type")
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
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
    @Column(name = "create_name")
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
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
    @Column(name = "agent_guid")
    public String getAgentGuid() {
        return agentGuid;
    }

    public void setAgentGuid(String agentGuid) {
        this.agentGuid = agentGuid;
    }

    @Basic
    @Column(name = "balance")
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "progress_bar")
    public String getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(String progressBar) {
        this.progressBar = progressBar;
    }

    @Basic
    @Column(name = "change_time")
    public Timestamp getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Timestamp changeTime) {
        this.changeTime = changeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentTbCaseEntity that = (AgentTbCaseEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (snCase != null ? !snCase.equals(that.snCase) : that.snCase != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (chargeStaffAdd != null ? !chargeStaffAdd.equals(that.chargeStaffAdd) : that.chargeStaffAdd != null)
            return false;
        if (chargeStaffCur != null ? !chargeStaffCur.equals(that.chargeStaffCur) : that.chargeStaffCur != null)
            return false;
        if (moneyCase != null ? !moneyCase.equals(that.moneyCase) : that.moneyCase != null) return false;
        if (statusCase != null ? !statusCase.equals(that.statusCase) : that.statusCase != null) return false;
        if (curPlatform != null ? !curPlatform.equals(that.curPlatform) : that.curPlatform != null) return false;
        if (curCompany != null ? !curCompany.equals(that.curCompany) : that.curCompany != null) return false;
        if (curAgreement != null ? !curAgreement.equals(that.curAgreement) : that.curAgreement != null) return false;
        if (qqCustomer != null ? !qqCustomer.equals(that.qqCustomer) : that.qqCustomer != null) return false;
        if (guidCustomer != null ? !guidCustomer.equals(that.guidCustomer) : that.guidCustomer != null) return false;
        if (caseStatus != null ? !caseStatus.equals(that.caseStatus) : that.caseStatus != null) return false;
        if (caseSpending != null ? !caseSpending.equals(that.caseSpending) : that.caseSpending != null) return false;
        if (guidAgreement != null ? !guidAgreement.equals(that.guidAgreement) : that.guidAgreement != null)
            return false;
        if (caseLock != null ? !caseLock.equals(that.caseLock) : that.caseLock != null) return false;
        if (businessType != null ? !businessType.equals(that.businessType) : that.businessType != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;
        if (createName != null ? !createName.equals(that.createName) : that.createName != null) return false;
        if (updateName != null ? !updateName.equals(that.updateName) : that.updateName != null) return false;
        if (agentGuid != null ? !agentGuid.equals(that.agentGuid) : that.agentGuid != null) return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (progressBar != null ? !progressBar.equals(that.progressBar) : that.progressBar != null) return false;
        if (changeTime != null ? !changeTime.equals(that.changeTime) : that.changeTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (snCase != null ? snCase.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (chargeStaffAdd != null ? chargeStaffAdd.hashCode() : 0);
        result = 31 * result + (chargeStaffCur != null ? chargeStaffCur.hashCode() : 0);
        result = 31 * result + (moneyCase != null ? moneyCase.hashCode() : 0);
        result = 31 * result + (statusCase != null ? statusCase.hashCode() : 0);
        result = 31 * result + (curPlatform != null ? curPlatform.hashCode() : 0);
        result = 31 * result + (curCompany != null ? curCompany.hashCode() : 0);
        result = 31 * result + (curAgreement != null ? curAgreement.hashCode() : 0);
        result = 31 * result + (qqCustomer != null ? qqCustomer.hashCode() : 0);
        result = 31 * result + (guidCustomer != null ? guidCustomer.hashCode() : 0);
        result = 31 * result + (caseStatus != null ? caseStatus.hashCode() : 0);
        result = 31 * result + (caseSpending != null ? caseSpending.hashCode() : 0);
        result = 31 * result + (guidAgreement != null ? guidAgreement.hashCode() : 0);
        result = 31 * result + (caseLock != null ? caseLock.hashCode() : 0);
        result = 31 * result + (businessType != null ? businessType.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (createName != null ? createName.hashCode() : 0);
        result = 31 * result + (updateName != null ? updateName.hashCode() : 0);
        result = 31 * result + (agentGuid != null ? agentGuid.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (progressBar != null ? progressBar.hashCode() : 0);
        result = 31 * result + (changeTime != null ? changeTime.hashCode() : 0);
        return result;
    }
}
