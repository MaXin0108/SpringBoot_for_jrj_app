package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_worksheet", schema = "db_financial_window", catalog = "")
public class TbWorksheetEntity {
    private String guidWorksheet;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String worksheetQqCur;
    private String worksheetOriginator;
    private String worksheetCharge;
    private String guidCase;
    private String guidProcedure;
    private String guidAgreement;
    private String guidInvoice;
    private String guidSupplier;
    private String guidCompanycustomer;
    private String worksheetStaffCur;
    private String worksheetDescription;
    private String worksheetPriority;
    private String worksheetStatus;
    private Timestamp beginTime;
    private Timestamp endTime;
    private Integer worksheetAssessnumber;
    private String worksheetClassify;

    @Id
    @Column(name = "guid_worksheet")
    public String getGuidWorksheet() {
        return guidWorksheet;
    }

    public void setGuidWorksheet(String guidWorksheet) {
        this.guidWorksheet = guidWorksheet;
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
    @Column(name = "worksheet_qqCur")
    public String getWorksheetQqCur() {
        return worksheetQqCur;
    }

    public void setWorksheetQqCur(String worksheetQqCur) {
        this.worksheetQqCur = worksheetQqCur;
    }

    @Basic
    @Column(name = "worksheet_originator")
    public String getWorksheetOriginator() {
        return worksheetOriginator;
    }

    public void setWorksheetOriginator(String worksheetOriginator) {
        this.worksheetOriginator = worksheetOriginator;
    }

    @Basic
    @Column(name = "worksheet_charge")
    public String getWorksheetCharge() {
        return worksheetCharge;
    }

    public void setWorksheetCharge(String worksheetCharge) {
        this.worksheetCharge = worksheetCharge;
    }

    @Basic
    @Column(name = "guid_case")
    public String getGuidCase() {
        return guidCase;
    }

    public void setGuidCase(String guidCase) {
        this.guidCase = guidCase;
    }

    @Basic
    @Column(name = "guid_procedure")
    public String getGuidProcedure() {
        return guidProcedure;
    }

    public void setGuidProcedure(String guidProcedure) {
        this.guidProcedure = guidProcedure;
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
    @Column(name = "guid_invoice")
    public String getGuidInvoice() {
        return guidInvoice;
    }

    public void setGuidInvoice(String guidInvoice) {
        this.guidInvoice = guidInvoice;
    }

    @Basic
    @Column(name = "guid_supplier")
    public String getGuidSupplier() {
        return guidSupplier;
    }

    public void setGuidSupplier(String guidSupplier) {
        this.guidSupplier = guidSupplier;
    }

    @Basic
    @Column(name = "guid_companycustomer")
    public String getGuidCompanycustomer() {
        return guidCompanycustomer;
    }

    public void setGuidCompanycustomer(String guidCompanycustomer) {
        this.guidCompanycustomer = guidCompanycustomer;
    }

    @Basic
    @Column(name = "worksheet_staffCur")
    public String getWorksheetStaffCur() {
        return worksheetStaffCur;
    }

    public void setWorksheetStaffCur(String worksheetStaffCur) {
        this.worksheetStaffCur = worksheetStaffCur;
    }

    @Basic
    @Column(name = "worksheet_description")
    public String getWorksheetDescription() {
        return worksheetDescription;
    }

    public void setWorksheetDescription(String worksheetDescription) {
        this.worksheetDescription = worksheetDescription;
    }

    @Basic
    @Column(name = "worksheet_priority")
    public String getWorksheetPriority() {
        return worksheetPriority;
    }

    public void setWorksheetPriority(String worksheetPriority) {
        this.worksheetPriority = worksheetPriority;
    }

    @Basic
    @Column(name = "worksheet_status")
    public String getWorksheetStatus() {
        return worksheetStatus;
    }

    public void setWorksheetStatus(String worksheetStatus) {
        this.worksheetStatus = worksheetStatus;
    }

    @Basic
    @Column(name = "begin_time")
    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    @Basic
    @Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "worksheet_assessnumber")
    public Integer getWorksheetAssessnumber() {
        return worksheetAssessnumber;
    }

    public void setWorksheetAssessnumber(Integer worksheetAssessnumber) {
        this.worksheetAssessnumber = worksheetAssessnumber;
    }

    @Basic
    @Column(name = "worksheet_classify")
    public String getWorksheetClassify() {
        return worksheetClassify;
    }

    public void setWorksheetClassify(String worksheetClassify) {
        this.worksheetClassify = worksheetClassify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbWorksheetEntity that = (TbWorksheetEntity) o;

        if (guidWorksheet != null ? !guidWorksheet.equals(that.guidWorksheet) : that.guidWorksheet != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (worksheetQqCur != null ? !worksheetQqCur.equals(that.worksheetQqCur) : that.worksheetQqCur != null)
            return false;
        if (worksheetOriginator != null ? !worksheetOriginator.equals(that.worksheetOriginator) : that.worksheetOriginator != null)
            return false;
        if (worksheetCharge != null ? !worksheetCharge.equals(that.worksheetCharge) : that.worksheetCharge != null)
            return false;
        if (guidCase != null ? !guidCase.equals(that.guidCase) : that.guidCase != null) return false;
        if (guidProcedure != null ? !guidProcedure.equals(that.guidProcedure) : that.guidProcedure != null)
            return false;
        if (guidAgreement != null ? !guidAgreement.equals(that.guidAgreement) : that.guidAgreement != null)
            return false;
        if (guidInvoice != null ? !guidInvoice.equals(that.guidInvoice) : that.guidInvoice != null) return false;
        if (guidSupplier != null ? !guidSupplier.equals(that.guidSupplier) : that.guidSupplier != null) return false;
        if (guidCompanycustomer != null ? !guidCompanycustomer.equals(that.guidCompanycustomer) : that.guidCompanycustomer != null)
            return false;
        if (worksheetStaffCur != null ? !worksheetStaffCur.equals(that.worksheetStaffCur) : that.worksheetStaffCur != null)
            return false;
        if (worksheetDescription != null ? !worksheetDescription.equals(that.worksheetDescription) : that.worksheetDescription != null)
            return false;
        if (worksheetPriority != null ? !worksheetPriority.equals(that.worksheetPriority) : that.worksheetPriority != null)
            return false;
        if (worksheetStatus != null ? !worksheetStatus.equals(that.worksheetStatus) : that.worksheetStatus != null)
            return false;
        if (beginTime != null ? !beginTime.equals(that.beginTime) : that.beginTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (worksheetAssessnumber != null ? !worksheetAssessnumber.equals(that.worksheetAssessnumber) : that.worksheetAssessnumber != null)
            return false;
        if (worksheetClassify != null ? !worksheetClassify.equals(that.worksheetClassify) : that.worksheetClassify != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guidWorksheet != null ? guidWorksheet.hashCode() : 0;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (worksheetQqCur != null ? worksheetQqCur.hashCode() : 0);
        result = 31 * result + (worksheetOriginator != null ? worksheetOriginator.hashCode() : 0);
        result = 31 * result + (worksheetCharge != null ? worksheetCharge.hashCode() : 0);
        result = 31 * result + (guidCase != null ? guidCase.hashCode() : 0);
        result = 31 * result + (guidProcedure != null ? guidProcedure.hashCode() : 0);
        result = 31 * result + (guidAgreement != null ? guidAgreement.hashCode() : 0);
        result = 31 * result + (guidInvoice != null ? guidInvoice.hashCode() : 0);
        result = 31 * result + (guidSupplier != null ? guidSupplier.hashCode() : 0);
        result = 31 * result + (guidCompanycustomer != null ? guidCompanycustomer.hashCode() : 0);
        result = 31 * result + (worksheetStaffCur != null ? worksheetStaffCur.hashCode() : 0);
        result = 31 * result + (worksheetDescription != null ? worksheetDescription.hashCode() : 0);
        result = 31 * result + (worksheetPriority != null ? worksheetPriority.hashCode() : 0);
        result = 31 * result + (worksheetStatus != null ? worksheetStatus.hashCode() : 0);
        result = 31 * result + (beginTime != null ? beginTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (worksheetAssessnumber != null ? worksheetAssessnumber.hashCode() : 0);
        result = 31 * result + (worksheetClassify != null ? worksheetClassify.hashCode() : 0);
        return result;
    }
}
