package com.jrj_app.bean;

import javax.persistence.*;

@Entity
@Table(name = "rebate_red_package", schema = "db_financial_window", catalog = "")
public class RebateRedPackageEntity {
    private String guid;
    private String userGuid;
    private String userName;
    private String financingId;
    private String financingName;
    private Integer income;
    private Double rebate;
    private Integer lowestMoney;
    private String image;
    private String status;
    private String type;

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
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "financing_id")
    public String getFinancingId() {
        return financingId;
    }

    public void setFinancingId(String financingId) {
        this.financingId = financingId;
    }

    @Basic
    @Column(name = "financing_name")
    public String getFinancingName() {
        return financingName;
    }

    public void setFinancingName(String financingName) {
        this.financingName = financingName;
    }

    @Basic
    @Column(name = "income")
    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    @Basic
    @Column(name = "rebate")
    public Double getRebate() {
        return rebate;
    }

    public void setRebate(Double rebate) {
        this.rebate = rebate;
    }

    @Basic
    @Column(name = "lowest_money")
    public Integer getLowestMoney() {
        return lowestMoney;
    }

    public void setLowestMoney(Integer lowestMoney) {
        this.lowestMoney = lowestMoney;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RebateRedPackageEntity that = (RebateRedPackageEntity) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (userGuid != null ? !userGuid.equals(that.userGuid) : that.userGuid != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (financingId != null ? !financingId.equals(that.financingId) : that.financingId != null) return false;
        if (financingName != null ? !financingName.equals(that.financingName) : that.financingName != null)
            return false;
        if (income != null ? !income.equals(that.income) : that.income != null) return false;
        if (rebate != null ? !rebate.equals(that.rebate) : that.rebate != null) return false;
        if (lowestMoney != null ? !lowestMoney.equals(that.lowestMoney) : that.lowestMoney != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (userGuid != null ? userGuid.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (financingId != null ? financingId.hashCode() : 0);
        result = 31 * result + (financingName != null ? financingName.hashCode() : 0);
        result = 31 * result + (income != null ? income.hashCode() : 0);
        result = 31 * result + (rebate != null ? rebate.hashCode() : 0);
        result = 31 * result + (lowestMoney != null ? lowestMoney.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
