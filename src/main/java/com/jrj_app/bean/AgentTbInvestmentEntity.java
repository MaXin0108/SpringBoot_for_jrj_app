package com.jrj_app.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "agent_tb_investment", schema = "db_financial_window", catalog = "")
public class AgentTbInvestmentEntity {
    private String id;
    private Timestamp createDate;
    private Timestamp updateDate;
    private String createName;
    private String updateName;
    private String investmentId;
    private Timestamp spreadDate;
    private String brandName;
    private BigDecimal incomereferencevalue;
    private String redenvelopes;
    private String upamount;
    private String restinvestmentamount;
    private Integer updaycount;
    private String extensioncompleteamount;
    private String spreadlink;
    private String logo;
    private String annoucement;
    private String spreadpolicy;
    private String state;
    private String chargeStaffAdd;
    private String chargeStaffCur;
    private Timestamp datetimeAddCase;
    private String statusCase;
    private String caseid;
    private BigDecimal channelcost;
    private BigDecimal charge;
    private Integer startInvestAmount;
    private String inputred;
    private Double expensehas;
    private String statelink;
    private String generalizedBidStatus;
    private Double availableBalance;
    private String showType;

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
    @Column(name = "investmentID")
    public String getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(String investmentId) {
        this.investmentId = investmentId;
    }

    @Basic
    @Column(name = "spreaddate")
    public Timestamp getSpreadDate() {
        return spreadDate;
    }

    public void setSpreadDate(Timestamp spreadDate) {
        this.spreadDate = spreadDate;
    }

    @Basic
    @Column(name = "brandname")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Basic
    @Column(name = "incomereferencevalue")
    public BigDecimal getIncomereferencevalue() {
        return incomereferencevalue;
    }

    public void setIncomereferencevalue(BigDecimal incomereferencevalue) {
        this.incomereferencevalue = incomereferencevalue;
    }

    @Basic
    @Column(name = "redenvelopes")
    public String getRedenvelopes() {
        return redenvelopes;
    }

    public void setRedenvelopes(String redenvelopes) {
        this.redenvelopes = redenvelopes;
    }

    @Basic
    @Column(name = "upamount")
    public String getUpamount() {
        return upamount;
    }

    public void setUpamount(String upamount) {
        this.upamount = upamount;
    }

    @Basic
    @Column(name = "restinvestmentamount")
    public String getRestinvestmentamount() {
        return restinvestmentamount;
    }

    public void setRestinvestmentamount(String restinvestmentamount) {
        this.restinvestmentamount = restinvestmentamount;
    }

    @Basic
    @Column(name = "updaycount")
    public Integer getUpdaycount() {
        return updaycount;
    }

    public void setUpdaycount(Integer updaycount) {
        this.updaycount = updaycount;
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
    @Column(name = "spreadlink")
    public String getSpreadlink() {
        return spreadlink;
    }

    public void setSpreadlink(String spreadlink) {
        this.spreadlink = spreadlink;
    }

    @Basic
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "annoucement")
    public String getAnnoucement() {
        return annoucement;
    }

    public void setAnnoucement(String annoucement) {
        this.annoucement = annoucement;
    }

    @Basic
    @Column(name = "spreadpolicy")
    public String getSpreadpolicy() {
        return spreadpolicy;
    }

    public void setSpreadpolicy(String spreadpolicy) {
        this.spreadpolicy = spreadpolicy;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "chargestaffadd")
    public String getChargeStaffAdd() {
        return chargeStaffAdd;
    }

    public void setChargeStaffAdd(String chargeStaffAdd) {
        this.chargeStaffAdd = chargeStaffAdd;
    }

    @Basic
    @Column(name = "chargestaffcur")
    public String getChargeStaffCur() {
        return chargeStaffCur;
    }

    public void setChargeStaffCur(String chargeStaffCur) {
        this.chargeStaffCur = chargeStaffCur;
    }

    @Basic
    @Column(name = "datetimeaddcase")
    public Timestamp getDatetimeAddCase() {
        return datetimeAddCase;
    }

    public void setDatetimeAddCase(Timestamp datetimeAddCase) {
        this.datetimeAddCase = datetimeAddCase;
    }

    @Basic
    @Column(name = "statuscase")
    public String getStatusCase() {
        return statusCase;
    }

    public void setStatusCase(String statusCase) {
        this.statusCase = statusCase;
    }

    @Basic
    @Column(name = "caseid")
    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    @Basic
    @Column(name = "channelcost")
    public BigDecimal getChannelcost() {
        return channelcost;
    }

    public void setChannelcost(BigDecimal channelcost) {
        this.channelcost = channelcost;
    }

    @Basic
    @Column(name = "charge")
    public BigDecimal getCharge() {
        return charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }

    @Basic
    @Column(name = "startinvestamount")
    public Integer getStartInvestAmount() {
        return startInvestAmount;
    }

    public void setStartInvestAmount(Integer startInvestAmount) {
        this.startInvestAmount = startInvestAmount;
    }

    @Basic
    @Column(name = "inputred")
    public String getInputred() {
        return inputred;
    }

    public void setInputred(String inputred) {
        this.inputred = inputred;
    }

    @Basic
    @Column(name = "expensehas")
    public Double getExpensehas() {
        return expensehas;
    }

    public void setExpensehas(Double expensehas) {
        this.expensehas = expensehas;
    }

    @Basic
    @Column(name = "statelink")
    public String getStatelink() {
        return statelink;
    }

    public void setStatelink(String statelink) {
        this.statelink = statelink;
    }

    @Basic
    @Column(name = "generalized_bid_status")
    public String getGeneralizedBidStatus() {
        return generalizedBidStatus;
    }

    public void setGeneralizedBidStatus(String generalizedBidStatus) {
        this.generalizedBidStatus = generalizedBidStatus;
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
    @Column(name = "show_type")
    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentTbInvestmentEntity that = (AgentTbInvestmentEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;
        if (createName != null ? !createName.equals(that.createName) : that.createName != null) return false;
        if (updateName != null ? !updateName.equals(that.updateName) : that.updateName != null) return false;
        if (investmentId != null ? !investmentId.equals(that.investmentId) : that.investmentId != null) return false;
        if (spreadDate != null ? !spreadDate.equals(that.spreadDate) : that.spreadDate != null) return false;
        if (brandName != null ? !brandName.equals(that.brandName) : that.brandName != null) return false;
        if (incomereferencevalue != null ? !incomereferencevalue.equals(that.incomereferencevalue) : that.incomereferencevalue != null)
            return false;
        if (redenvelopes != null ? !redenvelopes.equals(that.redenvelopes) : that.redenvelopes != null) return false;
        if (upamount != null ? !upamount.equals(that.upamount) : that.upamount != null) return false;
        if (restinvestmentamount != null ? !restinvestmentamount.equals(that.restinvestmentamount) : that.restinvestmentamount != null)
            return false;
        if (updaycount != null ? !updaycount.equals(that.updaycount) : that.updaycount != null) return false;
        if (extensioncompleteamount != null ? !extensioncompleteamount.equals(that.extensioncompleteamount) : that.extensioncompleteamount != null)
            return false;
        if (spreadlink != null ? !spreadlink.equals(that.spreadlink) : that.spreadlink != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (annoucement != null ? !annoucement.equals(that.annoucement) : that.annoucement != null) return false;
        if (spreadpolicy != null ? !spreadpolicy.equals(that.spreadpolicy) : that.spreadpolicy != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (chargeStaffAdd != null ? !chargeStaffAdd.equals(that.chargeStaffAdd) : that.chargeStaffAdd != null)
            return false;
        if (chargeStaffCur != null ? !chargeStaffCur.equals(that.chargeStaffCur) : that.chargeStaffCur != null)
            return false;
        if (datetimeAddCase != null ? !datetimeAddCase.equals(that.datetimeAddCase) : that.datetimeAddCase != null)
            return false;
        if (statusCase != null ? !statusCase.equals(that.statusCase) : that.statusCase != null) return false;
        if (caseid != null ? !caseid.equals(that.caseid) : that.caseid != null) return false;
        if (channelcost != null ? !channelcost.equals(that.channelcost) : that.channelcost != null) return false;
        if (charge != null ? !charge.equals(that.charge) : that.charge != null) return false;
        if (startInvestAmount != null ? !startInvestAmount.equals(that.startInvestAmount) : that.startInvestAmount != null)
            return false;
        if (inputred != null ? !inputred.equals(that.inputred) : that.inputred != null) return false;
        if (expensehas != null ? !expensehas.equals(that.expensehas) : that.expensehas != null) return false;
        if (statelink != null ? !statelink.equals(that.statelink) : that.statelink != null) return false;
        if (generalizedBidStatus != null ? !generalizedBidStatus.equals(that.generalizedBidStatus) : that.generalizedBidStatus != null)
            return false;
        if (availableBalance != null ? !availableBalance.equals(that.availableBalance) : that.availableBalance != null)
            return false;
        if (showType != null ? !showType.equals(that.showType) : that.showType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (createName != null ? createName.hashCode() : 0);
        result = 31 * result + (updateName != null ? updateName.hashCode() : 0);
        result = 31 * result + (investmentId != null ? investmentId.hashCode() : 0);
        result = 31 * result + (spreadDate != null ? spreadDate.hashCode() : 0);
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (incomereferencevalue != null ? incomereferencevalue.hashCode() : 0);
        result = 31 * result + (redenvelopes != null ? redenvelopes.hashCode() : 0);
        result = 31 * result + (upamount != null ? upamount.hashCode() : 0);
        result = 31 * result + (restinvestmentamount != null ? restinvestmentamount.hashCode() : 0);
        result = 31 * result + (updaycount != null ? updaycount.hashCode() : 0);
        result = 31 * result + (extensioncompleteamount != null ? extensioncompleteamount.hashCode() : 0);
        result = 31 * result + (spreadlink != null ? spreadlink.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (annoucement != null ? annoucement.hashCode() : 0);
        result = 31 * result + (spreadpolicy != null ? spreadpolicy.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (chargeStaffAdd != null ? chargeStaffAdd.hashCode() : 0);
        result = 31 * result + (chargeStaffCur != null ? chargeStaffCur.hashCode() : 0);
        result = 31 * result + (datetimeAddCase != null ? datetimeAddCase.hashCode() : 0);
        result = 31 * result + (statusCase != null ? statusCase.hashCode() : 0);
        result = 31 * result + (caseid != null ? caseid.hashCode() : 0);
        result = 31 * result + (channelcost != null ? channelcost.hashCode() : 0);
        result = 31 * result + (charge != null ? charge.hashCode() : 0);
        result = 31 * result + (startInvestAmount != null ? startInvestAmount.hashCode() : 0);
        result = 31 * result + (inputred != null ? inputred.hashCode() : 0);
        result = 31 * result + (expensehas != null ? expensehas.hashCode() : 0);
        result = 31 * result + (statelink != null ? statelink.hashCode() : 0);
        result = 31 * result + (generalizedBidStatus != null ? generalizedBidStatus.hashCode() : 0);
        result = 31 * result + (availableBalance != null ? availableBalance.hashCode() : 0);
        result = 31 * result + (showType != null ? showType.hashCode() : 0);
        return result;
    }
}
