package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "loan_user_list", schema = "db_financial_window", catalog = "")
public class LoanUserListEntity {
    private String guid;
    private String userGuid;
    private String username;
    private Integer loanAmount;
    private String loanTime;
    private Double loanRate;
    private String repayMethod;
    private String loanProductGuid;
    private String uploadIdImg;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String loanProductImg;
    private String loanProductName;

    @Id
    @Column(name = "guid")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "user_guid")
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
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
    @Column(name = "loan_amount")
    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Basic
    @Column(name = "loan_time")
    public String getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(String loanTime) {
        this.loanTime = loanTime;
    }

    @Basic
    @Column(name = "loan_rate")
    public Double getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(Double loanRate) {
        this.loanRate = loanRate;
    }

    @Basic
    @Column(name = "repay_method")
    public String getRepayMethod() {
        return repayMethod;
    }

    public void setRepayMethod(String repayMethod) {
        this.repayMethod = repayMethod;
    }

    @Basic
    @Column(name = "loan_product_guid")
    public String getLoanProductGuid() {
        return loanProductGuid;
    }

    public void setLoanProductGuid(String loanProductGuid) {
        this.loanProductGuid = loanProductGuid;
    }

    @Basic
    @Column(name = "upload_id_img")
    public String getUploadIdImg() {
        return uploadIdImg;
    }

    public void setUploadIdImg(String uploadIdImg) {
        this.uploadIdImg = uploadIdImg;
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
    @Column(name = "loan_product_img")
    public String getLoanProductImg() {
        return loanProductImg;
    }

    public void setLoanProductImg(String loanProductImg) {
        this.loanProductImg = loanProductImg;
    }

    @Basic
    @Column(name = "loan_product_name")
    public String getLoanProductName() {
        return loanProductName;
    }

    public void setLoanProductName(String loanProductName) {
        this.loanProductName = loanProductName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoanUserListEntity that = (LoanUserListEntity) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (userGuid != null ? !userGuid.equals(that.userGuid) : that.userGuid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (loanAmount != null ? !loanAmount.equals(that.loanAmount) : that.loanAmount != null) return false;
        if (loanTime != null ? !loanTime.equals(that.loanTime) : that.loanTime != null) return false;
        if (loanRate != null ? !loanRate.equals(that.loanRate) : that.loanRate != null) return false;
        if (repayMethod != null ? !repayMethod.equals(that.repayMethod) : that.repayMethod != null) return false;
        if (loanProductGuid != null ? !loanProductGuid.equals(that.loanProductGuid) : that.loanProductGuid != null)
            return false;
        if (uploadIdImg != null ? !uploadIdImg.equals(that.uploadIdImg) : that.uploadIdImg != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (loanProductImg != null ? !loanProductImg.equals(that.loanProductImg) : that.loanProductImg != null)
            return false;
        if (loanProductName != null ? !loanProductName.equals(that.loanProductName) : that.loanProductName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (userGuid != null ? userGuid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (loanAmount != null ? loanAmount.hashCode() : 0);
        result = 31 * result + (loanTime != null ? loanTime.hashCode() : 0);
        result = 31 * result + (loanRate != null ? loanRate.hashCode() : 0);
        result = 31 * result + (repayMethod != null ? repayMethod.hashCode() : 0);
        result = 31 * result + (loanProductGuid != null ? loanProductGuid.hashCode() : 0);
        result = 31 * result + (uploadIdImg != null ? uploadIdImg.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (loanProductImg != null ? loanProductImg.hashCode() : 0);
        result = 31 * result + (loanProductName != null ? loanProductName.hashCode() : 0);
        return result;
    }
}
