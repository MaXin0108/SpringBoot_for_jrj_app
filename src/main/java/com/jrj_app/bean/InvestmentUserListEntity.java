package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "investment_user_list", schema = "db_financial_window", catalog = "")
public class InvestmentUserListEntity {
    private String id;
    private Timestamp createDate;
    private Timestamp updateDate;
    private String investmentId;
    private String brandName;
    private String userId;
    private String userName;
    private Integer incomereferencevalue;
    private String extensioncompleteamount;
    private String incomeAcount;
    private String logo;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "update_date")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "investmentID")
    public String getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(String investmentId) {
        this.investmentId = investmentId;
    }

    @Basic
    @Column(name = "brandName")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "incomereferencevalue")
    public Integer getIncomereferencevalue() {
        return incomereferencevalue;
    }

    public void setIncomereferencevalue(Integer incomereferencevalue) {
        this.incomereferencevalue = incomereferencevalue;
    }

    @Basic
    @Column(name = "extensioncompleteamount")
    public String getExtensioncompleteamount() {
        return extensioncompleteamount;
    }

    public void setExtensioncompleteamount(String extensioncompleteamount) {
        this.extensioncompleteamount = extensioncompleteamount;
    }

    @Basic
    @Column(name = "income_acount")
    public String getIncomeAcount() {
        return incomeAcount;
    }

    public void setIncomeAcount(String incomeAcount) {
        this.incomeAcount = incomeAcount;
    }

    @Basic
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvestmentUserListEntity that = (InvestmentUserListEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;
        if (investmentId != null ? !investmentId.equals(that.investmentId) : that.investmentId != null) return false;
        if (brandName != null ? !brandName.equals(that.brandName) : that.brandName != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (incomereferencevalue != null ? !incomereferencevalue.equals(that.incomereferencevalue) : that.incomereferencevalue != null)
            return false;
        if (extensioncompleteamount != null ? !extensioncompleteamount.equals(that.extensioncompleteamount) : that.extensioncompleteamount != null)
            return false;
        if (incomeAcount != null ? !incomeAcount.equals(that.incomeAcount) : that.incomeAcount != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (investmentId != null ? investmentId.hashCode() : 0);
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (incomereferencevalue != null ? incomereferencevalue.hashCode() : 0);
        result = 31 * result + (extensioncompleteamount != null ? extensioncompleteamount.hashCode() : 0);
        result = 31 * result + (incomeAcount != null ? incomeAcount.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        return result;
    }
}
