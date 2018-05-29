package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "agent_tb_loan", schema = "db_financial_window", catalog = "")
public class AgentTbLoanEntity {
    private String guid;
    private Timestamp createtime;
    private Timestamp updatetime;
    private String username;
    private Integer status;
    private String address;
    private String logoname;
    private String logoAddress;
    private Timestamp startingTime;
    private Timestamp repaymentTime;
    private Double amountLimit;
    private String identityRequirements;
    private String creditRecord;
    private String realEstateRecord;
    private String typeOfLoan;
    private String productAdvantages;
    private String facingTheCrowd;
    private Double incomeRequirements;
    private String otherRequirements;
    private Integer review;
    private String projectName;
    private String caseId;
    private Double balances;
    private Double roi;
    private Double interest;

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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "logoname")
    public String getLogoname() {
        return logoname;
    }

    public void setLogoname(String logoname) {
        this.logoname = logoname;
    }

    @Basic
    @Column(name = "logo_address")
    public String getLogoAddress() {
        return logoAddress;
    }

    public void setLogoAddress(String logoAddress) {
        this.logoAddress = logoAddress;
    }

    @Basic
    @Column(name = "starting_time")
    public Timestamp getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Timestamp startingTime) {
        this.startingTime = startingTime;
    }

    @Basic
    @Column(name = "repayment_time")
    public Timestamp getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(Timestamp repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    @Basic
    @Column(name = "amount_limit")
    public Double getAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(Double amountLimit) {
        this.amountLimit = amountLimit;
    }

    @Basic
    @Column(name = "identity_requirements")
    public String getIdentityRequirements() {
        return identityRequirements;
    }

    public void setIdentityRequirements(String identityRequirements) {
        this.identityRequirements = identityRequirements;
    }

    @Basic
    @Column(name = "credit_record")
    public String getCreditRecord() {
        return creditRecord;
    }

    public void setCreditRecord(String creditRecord) {
        this.creditRecord = creditRecord;
    }

    @Basic
    @Column(name = "real_estate_record")
    public String getRealEstateRecord() {
        return realEstateRecord;
    }

    public void setRealEstateRecord(String realEstateRecord) {
        this.realEstateRecord = realEstateRecord;
    }

    @Basic
    @Column(name = "type_of_loan")
    public String getTypeOfLoan() {
        return typeOfLoan;
    }

    public void setTypeOfLoan(String typeOfLoan) {
        this.typeOfLoan = typeOfLoan;
    }

    @Basic
    @Column(name = "product_advantages")
    public String getProductAdvantages() {
        return productAdvantages;
    }

    public void setProductAdvantages(String productAdvantages) {
        this.productAdvantages = productAdvantages;
    }

    @Basic
    @Column(name = "facing_the_crowd")
    public String getFacingTheCrowd() {
        return facingTheCrowd;
    }

    public void setFacingTheCrowd(String facingTheCrowd) {
        this.facingTheCrowd = facingTheCrowd;
    }

    @Basic
    @Column(name = "income_requirements")
    public Double getIncomeRequirements() {
        return incomeRequirements;
    }

    public void setIncomeRequirements(Double incomeRequirements) {
        this.incomeRequirements = incomeRequirements;
    }

    @Basic
    @Column(name = "other_requirements")
    public String getOtherRequirements() {
        return otherRequirements;
    }

    public void setOtherRequirements(String otherRequirements) {
        this.otherRequirements = otherRequirements;
    }

    @Basic
    @Column(name = "review")
    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    @Basic
    @Column(name = "projectname")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "case_id")
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    @Basic
    @Column(name = "balances")
    public Double getBalances() {
        return balances;
    }

    public void setBalances(Double balances) {
        this.balances = balances;
    }

    @Basic
    @Column(name = "roi")
    public Double getRoi() {
        return roi;
    }

    public void setRoi(Double roi) {
        this.roi = roi;
    }

    @Basic
    @Column(name = "interest")
    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentTbLoanEntity that = (AgentTbLoanEntity) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (updatetime != null ? !updatetime.equals(that.updatetime) : that.updatetime != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (logoname != null ? !logoname.equals(that.logoname) : that.logoname != null) return false;
        if (logoAddress != null ? !logoAddress.equals(that.logoAddress) : that.logoAddress != null) return false;
        if (startingTime != null ? !startingTime.equals(that.startingTime) : that.startingTime != null) return false;
        if (repaymentTime != null ? !repaymentTime.equals(that.repaymentTime) : that.repaymentTime != null)
            return false;
        if (amountLimit != null ? !amountLimit.equals(that.amountLimit) : that.amountLimit != null) return false;
        if (identityRequirements != null ? !identityRequirements.equals(that.identityRequirements) : that.identityRequirements != null)
            return false;
        if (creditRecord != null ? !creditRecord.equals(that.creditRecord) : that.creditRecord != null) return false;
        if (realEstateRecord != null ? !realEstateRecord.equals(that.realEstateRecord) : that.realEstateRecord != null)
            return false;
        if (typeOfLoan != null ? !typeOfLoan.equals(that.typeOfLoan) : that.typeOfLoan != null) return false;
        if (productAdvantages != null ? !productAdvantages.equals(that.productAdvantages) : that.productAdvantages != null)
            return false;
        if (facingTheCrowd != null ? !facingTheCrowd.equals(that.facingTheCrowd) : that.facingTheCrowd != null)
            return false;
        if (incomeRequirements != null ? !incomeRequirements.equals(that.incomeRequirements) : that.incomeRequirements != null)
            return false;
        if (otherRequirements != null ? !otherRequirements.equals(that.otherRequirements) : that.otherRequirements != null)
            return false;
        if (review != null ? !review.equals(that.review) : that.review != null) return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        if (caseId != null ? !caseId.equals(that.caseId) : that.caseId != null) return false;
        if (balances != null ? !balances.equals(that.balances) : that.balances != null) return false;
        if (roi != null ? !roi.equals(that.roi) : that.roi != null) return false;
        if (interest != null ? !interest.equals(that.interest) : that.interest != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (logoname != null ? logoname.hashCode() : 0);
        result = 31 * result + (logoAddress != null ? logoAddress.hashCode() : 0);
        result = 31 * result + (startingTime != null ? startingTime.hashCode() : 0);
        result = 31 * result + (repaymentTime != null ? repaymentTime.hashCode() : 0);
        result = 31 * result + (amountLimit != null ? amountLimit.hashCode() : 0);
        result = 31 * result + (identityRequirements != null ? identityRequirements.hashCode() : 0);
        result = 31 * result + (creditRecord != null ? creditRecord.hashCode() : 0);
        result = 31 * result + (realEstateRecord != null ? realEstateRecord.hashCode() : 0);
        result = 31 * result + (typeOfLoan != null ? typeOfLoan.hashCode() : 0);
        result = 31 * result + (productAdvantages != null ? productAdvantages.hashCode() : 0);
        result = 31 * result + (facingTheCrowd != null ? facingTheCrowd.hashCode() : 0);
        result = 31 * result + (incomeRequirements != null ? incomeRequirements.hashCode() : 0);
        result = 31 * result + (otherRequirements != null ? otherRequirements.hashCode() : 0);
        result = 31 * result + (review != null ? review.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (caseId != null ? caseId.hashCode() : 0);
        result = 31 * result + (balances != null ? balances.hashCode() : 0);
        result = 31 * result + (roi != null ? roi.hashCode() : 0);
        result = 31 * result + (interest != null ? interest.hashCode() : 0);
        return result;
    }
}
