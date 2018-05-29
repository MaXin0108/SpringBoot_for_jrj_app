package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_coupon", schema = "db_financial_window", catalog = "")
public class UserCouponEntity {
    private String guid;
    private String userGuid;
    private String userName;
    private Double income;
    private String financingName;
    private String getMethod;
    private Timestamp getTime;
    private Timestamp invalidTime;
    private String used;
    private String invalid;
    private String leftDays;
    private String image;

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
    @Column(name = "income")
    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
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
    @Column(name = "get_method")
    public String getGetMethod() {
        return getMethod;
    }

    public void setGetMethod(String getMethod) {
        this.getMethod = getMethod;
    }

    @Basic
    @Column(name = "get_time")
    public Timestamp getGetTime() {
        return getTime;
    }

    public void setGetTime(Timestamp getTime) {
        this.getTime = getTime;
    }

    @Basic
    @Column(name = "invalid_time")
    public Timestamp getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(Timestamp invalidTime) {
        this.invalidTime = invalidTime;
    }

    @Basic
    @Column(name = "used")
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    @Basic
    @Column(name = "invalid")
    public String getInvalid() {
        return invalid;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid;
    }

    @Basic
    @Column(name = "left_days")
    public String getLeftDays() {
        return leftDays;
    }

    public void setLeftDays(String leftDays) {
        this.leftDays = leftDays;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserCouponEntity that = (UserCouponEntity) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (userGuid != null ? !userGuid.equals(that.userGuid) : that.userGuid != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (income != null ? !income.equals(that.income) : that.income != null) return false;
        if (financingName != null ? !financingName.equals(that.financingName) : that.financingName != null)
            return false;
        if (getMethod != null ? !getMethod.equals(that.getMethod) : that.getMethod != null) return false;
        if (getTime != null ? !getTime.equals(that.getTime) : that.getTime != null) return false;
        if (invalidTime != null ? !invalidTime.equals(that.invalidTime) : that.invalidTime != null) return false;
        if (used != null ? !used.equals(that.used) : that.used != null) return false;
        if (invalid != null ? !invalid.equals(that.invalid) : that.invalid != null) return false;
        if (leftDays != null ? !leftDays.equals(that.leftDays) : that.leftDays != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (userGuid != null ? userGuid.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (income != null ? income.hashCode() : 0);
        result = 31 * result + (financingName != null ? financingName.hashCode() : 0);
        result = 31 * result + (getMethod != null ? getMethod.hashCode() : 0);
        result = 31 * result + (getTime != null ? getTime.hashCode() : 0);
        result = 31 * result + (invalidTime != null ? invalidTime.hashCode() : 0);
        result = 31 * result + (used != null ? used.hashCode() : 0);
        result = 31 * result + (invalid != null ? invalid.hashCode() : 0);
        result = 31 * result + (leftDays != null ? leftDays.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }
}
