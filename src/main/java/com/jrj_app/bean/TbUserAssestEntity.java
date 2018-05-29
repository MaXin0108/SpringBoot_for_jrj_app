package com.jrj_app.bean;

import javax.persistence.*;

@Entity
@Table(name = "tb_user_assest", schema = "db_financial_window", catalog = "")
public class TbUserAssestEntity {
    private String guid;
    private String nickname;
    private String phone;
    private String password;
    private String realName;
    private String logoUrl;
    private String address;
    private Double availableBalance;
    private Double receiveAmount;
    private Double returnAmount;

    @Id
    @Column(name = "guid")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "real_name")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "logo_url")
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
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
    @Column(name = "available_balance")
    public Double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    @Basic
    @Column(name = "receive_amount")
    public Double getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(Double receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    @Basic
    @Column(name = "return_amount")
    public Double getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(Double returnAmount) {
        this.returnAmount = returnAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUserAssestEntity that = (TbUserAssestEntity) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (logoUrl != null ? !logoUrl.equals(that.logoUrl) : that.logoUrl != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (availableBalance != null ? !availableBalance.equals(that.availableBalance) : that.availableBalance != null)
            return false;
        if (receiveAmount != null ? !receiveAmount.equals(that.receiveAmount) : that.receiveAmount != null)
            return false;
        if (returnAmount != null ? !returnAmount.equals(that.returnAmount) : that.returnAmount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (logoUrl != null ? logoUrl.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (availableBalance != null ? availableBalance.hashCode() : 0);
        result = 31 * result + (receiveAmount != null ? receiveAmount.hashCode() : 0);
        result = 31 * result + (returnAmount != null ? returnAmount.hashCode() : 0);
        return result;
    }
}
