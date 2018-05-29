package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_company_details", schema = "db_financial_window", catalog = "")
public class TbCompanyDetailsEntity {
    private String id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String companyName;
    private String corporateRepresentative;
    private String registeredCapital;
    private String companyPhone;
    private String unifiedSocialCreditCode;
    private String registrationNumber;
    private Timestamp foundingTime;
    private String detailedAddress;
    private String platformIntroduction;
    private String brandname;
    private Timestamp startSpreadTime;
    private String investmentId;
    private Double yearlyInterestRate;
    private String logoAddress;
    private String organizationCode;
    private String officialQqGroup;
    private String customerServiceQq;
    private String standardPeriod;
    private String investmentRedEnvelopes;
    private String surplusDelivery;
    private String deliveryState;
    private String spreadLink;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "company_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "corporate_representative")
    public String getCorporateRepresentative() {
        return corporateRepresentative;
    }

    public void setCorporateRepresentative(String corporateRepresentative) {
        this.corporateRepresentative = corporateRepresentative;
    }

    @Basic
    @Column(name = "registered_capital")
    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    @Basic
    @Column(name = "company_phone")
    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    @Basic
    @Column(name = "unified_social_credit_code")
    public String getUnifiedSocialCreditCode() {
        return unifiedSocialCreditCode;
    }

    public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
    }

    @Basic
    @Column(name = "registration_number")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Basic
    @Column(name = "founding_time")
    public Timestamp getFoundingTime() {
        return foundingTime;
    }

    public void setFoundingTime(Timestamp foundingTime) {
        this.foundingTime = foundingTime;
    }

    @Basic
    @Column(name = "detailed_address")
    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    @Basic
    @Column(name = "platform_introduction")
    public String getPlatformIntroduction() {
        return platformIntroduction;
    }

    public void setPlatformIntroduction(String platformIntroduction) {
        this.platformIntroduction = platformIntroduction;
    }

    @Basic
    @Column(name = "brandname")
    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    @Basic
    @Column(name = "start_spread_time")
    public Timestamp getStartSpreadTime() {
        return startSpreadTime;
    }

    public void setStartSpreadTime(Timestamp startSpreadTime) {
        this.startSpreadTime = startSpreadTime;
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
    @Column(name = "yearly_interest_rate")
    public Double getYearlyInterestRate() {
        return yearlyInterestRate;
    }

    public void setYearlyInterestRate(Double yearlyInterestRate) {
        this.yearlyInterestRate = yearlyInterestRate;
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
    @Column(name = "organization_code")
    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    @Basic
    @Column(name = "official_qq_group")
    public String getOfficialQqGroup() {
        return officialQqGroup;
    }

    public void setOfficialQqGroup(String officialQqGroup) {
        this.officialQqGroup = officialQqGroup;
    }

    @Basic
    @Column(name = "customer_service_qq")
    public String getCustomerServiceQq() {
        return customerServiceQq;
    }

    public void setCustomerServiceQq(String customerServiceQq) {
        this.customerServiceQq = customerServiceQq;
    }

    @Basic
    @Column(name = "standard_period")
    public String getStandardPeriod() {
        return standardPeriod;
    }

    public void setStandardPeriod(String standardPeriod) {
        this.standardPeriod = standardPeriod;
    }

    @Basic
    @Column(name = "investment_red_envelopes")
    public String getInvestmentRedEnvelopes() {
        return investmentRedEnvelopes;
    }

    public void setInvestmentRedEnvelopes(String investmentRedEnvelopes) {
        this.investmentRedEnvelopes = investmentRedEnvelopes;
    }

    @Basic
    @Column(name = "surplus_delivery")
    public String getSurplusDelivery() {
        return surplusDelivery;
    }

    public void setSurplusDelivery(String surplusDelivery) {
        this.surplusDelivery = surplusDelivery;
    }

    @Basic
    @Column(name = "delivery_state")
    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    @Basic
    @Column(name = "spread_link")
    public String getSpreadLink() {
        return spreadLink;
    }

    public void setSpreadLink(String spreadLink) {
        this.spreadLink = spreadLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCompanyDetailsEntity that = (TbCompanyDetailsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (corporateRepresentative != null ? !corporateRepresentative.equals(that.corporateRepresentative) : that.corporateRepresentative != null)
            return false;
        if (registeredCapital != null ? !registeredCapital.equals(that.registeredCapital) : that.registeredCapital != null)
            return false;
        if (companyPhone != null ? !companyPhone.equals(that.companyPhone) : that.companyPhone != null) return false;
        if (unifiedSocialCreditCode != null ? !unifiedSocialCreditCode.equals(that.unifiedSocialCreditCode) : that.unifiedSocialCreditCode != null)
            return false;
        if (registrationNumber != null ? !registrationNumber.equals(that.registrationNumber) : that.registrationNumber != null)
            return false;
        if (foundingTime != null ? !foundingTime.equals(that.foundingTime) : that.foundingTime != null) return false;
        if (detailedAddress != null ? !detailedAddress.equals(that.detailedAddress) : that.detailedAddress != null)
            return false;
        if (platformIntroduction != null ? !platformIntroduction.equals(that.platformIntroduction) : that.platformIntroduction != null)
            return false;
        if (brandname != null ? !brandname.equals(that.brandname) : that.brandname != null) return false;
        if (startSpreadTime != null ? !startSpreadTime.equals(that.startSpreadTime) : that.startSpreadTime != null)
            return false;
        if (investmentId != null ? !investmentId.equals(that.investmentId) : that.investmentId != null) return false;
        if (yearlyInterestRate != null ? !yearlyInterestRate.equals(that.yearlyInterestRate) : that.yearlyInterestRate != null)
            return false;
        if (logoAddress != null ? !logoAddress.equals(that.logoAddress) : that.logoAddress != null) return false;
        if (organizationCode != null ? !organizationCode.equals(that.organizationCode) : that.organizationCode != null)
            return false;
        if (officialQqGroup != null ? !officialQqGroup.equals(that.officialQqGroup) : that.officialQqGroup != null)
            return false;
        if (customerServiceQq != null ? !customerServiceQq.equals(that.customerServiceQq) : that.customerServiceQq != null)
            return false;
        if (standardPeriod != null ? !standardPeriod.equals(that.standardPeriod) : that.standardPeriod != null)
            return false;
        if (investmentRedEnvelopes != null ? !investmentRedEnvelopes.equals(that.investmentRedEnvelopes) : that.investmentRedEnvelopes != null)
            return false;
        if (surplusDelivery != null ? !surplusDelivery.equals(that.surplusDelivery) : that.surplusDelivery != null)
            return false;
        if (deliveryState != null ? !deliveryState.equals(that.deliveryState) : that.deliveryState != null)
            return false;
        if (spreadLink != null ? !spreadLink.equals(that.spreadLink) : that.spreadLink != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (corporateRepresentative != null ? corporateRepresentative.hashCode() : 0);
        result = 31 * result + (registeredCapital != null ? registeredCapital.hashCode() : 0);
        result = 31 * result + (companyPhone != null ? companyPhone.hashCode() : 0);
        result = 31 * result + (unifiedSocialCreditCode != null ? unifiedSocialCreditCode.hashCode() : 0);
        result = 31 * result + (registrationNumber != null ? registrationNumber.hashCode() : 0);
        result = 31 * result + (foundingTime != null ? foundingTime.hashCode() : 0);
        result = 31 * result + (detailedAddress != null ? detailedAddress.hashCode() : 0);
        result = 31 * result + (platformIntroduction != null ? platformIntroduction.hashCode() : 0);
        result = 31 * result + (brandname != null ? brandname.hashCode() : 0);
        result = 31 * result + (startSpreadTime != null ? startSpreadTime.hashCode() : 0);
        result = 31 * result + (investmentId != null ? investmentId.hashCode() : 0);
        result = 31 * result + (yearlyInterestRate != null ? yearlyInterestRate.hashCode() : 0);
        result = 31 * result + (logoAddress != null ? logoAddress.hashCode() : 0);
        result = 31 * result + (organizationCode != null ? organizationCode.hashCode() : 0);
        result = 31 * result + (officialQqGroup != null ? officialQqGroup.hashCode() : 0);
        result = 31 * result + (customerServiceQq != null ? customerServiceQq.hashCode() : 0);
        result = 31 * result + (standardPeriod != null ? standardPeriod.hashCode() : 0);
        result = 31 * result + (investmentRedEnvelopes != null ? investmentRedEnvelopes.hashCode() : 0);
        result = 31 * result + (surplusDelivery != null ? surplusDelivery.hashCode() : 0);
        result = 31 * result + (deliveryState != null ? deliveryState.hashCode() : 0);
        result = 31 * result + (spreadLink != null ? spreadLink.hashCode() : 0);
        return result;
    }
}
