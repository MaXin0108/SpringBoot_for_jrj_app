package com.jrj_app.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "agent_tb_promotion", schema = "db_financial_window", catalog = "")
public class AgentTbPromotionEntity {
    private String id;
    private Timestamp createDate;
    private String createName;
    private Timestamp updateDate;
    private String updateName;
    private String loginName;
    private String homeName;
    private Timestamp buyTime;
    private String investmentId;
    private BigDecimal expenseMoney;
    private Timestamp incomeDay;
    private String checkStatus;
    private String imageName;
    private String payStatus;
    private Timestamp checkPasstime;
    private Timestamp payPasstime;
    private BigDecimal payMoney;
    private String paymentId;
    private String chargePersonId;
    private String promotionFormState;

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
    @Column(name = "create_name")
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
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
    @Column(name = "update_name")
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    @Basic
    @Column(name = "login_name")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "home_name")
    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    @Basic
    @Column(name = "buy_time")
    public Timestamp getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Timestamp buyTime) {
        this.buyTime = buyTime;
    }

    @Basic
    @Column(name = "investment_id")
    public String getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(String investmentId) {
        this.investmentId = investmentId;
    }

    @Basic
    @Column(name = "expense_money")
    public BigDecimal getExpenseMoney() {
        return expenseMoney;
    }

    public void setExpenseMoney(BigDecimal expenseMoney) {
        this.expenseMoney = expenseMoney;
    }

    @Basic
    @Column(name = "income_day")
    public Timestamp getIncomeDay() {
        return incomeDay;
    }

    public void setIncomeDay(Timestamp incomeDay) {
        this.incomeDay = incomeDay;
    }

    @Basic
    @Column(name = "check_status")
    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Basic
    @Column(name = "image_name")
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Basic
    @Column(name = "pay_status")
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    @Basic
    @Column(name = "check_passtime")
    public Timestamp getCheckPasstime() {
        return checkPasstime;
    }

    public void setCheckPasstime(Timestamp checkPasstime) {
        this.checkPasstime = checkPasstime;
    }

    @Basic
    @Column(name = "pay_passtime")
    public Timestamp getPayPasstime() {
        return payPasstime;
    }

    public void setPayPasstime(Timestamp payPasstime) {
        this.payPasstime = payPasstime;
    }

    @Basic
    @Column(name = "pay_money")
    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    @Basic
    @Column(name = "paymentID")
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    @Basic
    @Column(name = "chargePerson_id")
    public String getChargePersonId() {
        return chargePersonId;
    }

    public void setChargePersonId(String chargePersonId) {
        this.chargePersonId = chargePersonId;
    }

    @Basic
    @Column(name = "promotion_form_state")
    public String getPromotionFormState() {
        return promotionFormState;
    }

    public void setPromotionFormState(String promotionFormState) {
        this.promotionFormState = promotionFormState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentTbPromotionEntity that = (AgentTbPromotionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createName != null ? !createName.equals(that.createName) : that.createName != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;
        if (updateName != null ? !updateName.equals(that.updateName) : that.updateName != null) return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (homeName != null ? !homeName.equals(that.homeName) : that.homeName != null) return false;
        if (buyTime != null ? !buyTime.equals(that.buyTime) : that.buyTime != null) return false;
        if (investmentId != null ? !investmentId.equals(that.investmentId) : that.investmentId != null) return false;
        if (expenseMoney != null ? !expenseMoney.equals(that.expenseMoney) : that.expenseMoney != null) return false;
        if (incomeDay != null ? !incomeDay.equals(that.incomeDay) : that.incomeDay != null) return false;
        if (checkStatus != null ? !checkStatus.equals(that.checkStatus) : that.checkStatus != null) return false;
        if (imageName != null ? !imageName.equals(that.imageName) : that.imageName != null) return false;
        if (payStatus != null ? !payStatus.equals(that.payStatus) : that.payStatus != null) return false;
        if (checkPasstime != null ? !checkPasstime.equals(that.checkPasstime) : that.checkPasstime != null)
            return false;
        if (payPasstime != null ? !payPasstime.equals(that.payPasstime) : that.payPasstime != null) return false;
        if (payMoney != null ? !payMoney.equals(that.payMoney) : that.payMoney != null) return false;
        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;
        if (chargePersonId != null ? !chargePersonId.equals(that.chargePersonId) : that.chargePersonId != null)
            return false;
        if (promotionFormState != null ? !promotionFormState.equals(that.promotionFormState) : that.promotionFormState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (createName != null ? createName.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (updateName != null ? updateName.hashCode() : 0);
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (homeName != null ? homeName.hashCode() : 0);
        result = 31 * result + (buyTime != null ? buyTime.hashCode() : 0);
        result = 31 * result + (investmentId != null ? investmentId.hashCode() : 0);
        result = 31 * result + (expenseMoney != null ? expenseMoney.hashCode() : 0);
        result = 31 * result + (incomeDay != null ? incomeDay.hashCode() : 0);
        result = 31 * result + (checkStatus != null ? checkStatus.hashCode() : 0);
        result = 31 * result + (imageName != null ? imageName.hashCode() : 0);
        result = 31 * result + (payStatus != null ? payStatus.hashCode() : 0);
        result = 31 * result + (checkPasstime != null ? checkPasstime.hashCode() : 0);
        result = 31 * result + (payPasstime != null ? payPasstime.hashCode() : 0);
        result = 31 * result + (payMoney != null ? payMoney.hashCode() : 0);
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        result = 31 * result + (chargePersonId != null ? chargePersonId.hashCode() : 0);
        result = 31 * result + (promotionFormState != null ? promotionFormState.hashCode() : 0);
        return result;
    }
}
