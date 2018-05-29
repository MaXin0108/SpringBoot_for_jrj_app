package com.jrj_app.bean;

import javax.persistence.*;

@Entity
@Table(name = "tb_staff", schema = "db_financial_window", catalog = "")
public class TbStaffEntity {
    private String guidStaff;
    private String snStaff;
    private String nameStaff;
    private String pwdStaff;
    private String titleStaff;
    private String meetParticipants;
    private String cleanerStaff;
    private String managerPlatform;
    private Integer businessStaff;
    private String baiduManage;
    private String creativeStaff;
    private String assistantStaff;
    private String tuiguangStaff;
    private String teamStaff;
    private String leaderStaff;
    private String telStaff;
    private Double tradeProfitbili;

    @Id
    @Column(name = "guid_staff")
    public String getGuidStaff() {
        return guidStaff;
    }

    public void setGuidStaff(String guidStaff) {
        this.guidStaff = guidStaff;
    }

    @Basic
    @Column(name = "sn_staff")
    public String getSnStaff() {
        return snStaff;
    }

    public void setSnStaff(String snStaff) {
        this.snStaff = snStaff;
    }

    @Basic
    @Column(name = "name_staff")
    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    @Basic
    @Column(name = "pwd_staff")
    public String getPwdStaff() {
        return pwdStaff;
    }

    public void setPwdStaff(String pwdStaff) {
        this.pwdStaff = pwdStaff;
    }

    @Basic
    @Column(name = "title_staff")
    public String getTitleStaff() {
        return titleStaff;
    }

    public void setTitleStaff(String titleStaff) {
        this.titleStaff = titleStaff;
    }

    @Basic
    @Column(name = "meet_participants")
    public String getMeetParticipants() {
        return meetParticipants;
    }

    public void setMeetParticipants(String meetParticipants) {
        this.meetParticipants = meetParticipants;
    }

    @Basic
    @Column(name = "cleaner_staff")
    public String getCleanerStaff() {
        return cleanerStaff;
    }

    public void setCleanerStaff(String cleanerStaff) {
        this.cleanerStaff = cleanerStaff;
    }

    @Basic
    @Column(name = "manager_platform")
    public String getManagerPlatform() {
        return managerPlatform;
    }

    public void setManagerPlatform(String managerPlatform) {
        this.managerPlatform = managerPlatform;
    }

    @Basic
    @Column(name = "business_staff")
    public Integer getBusinessStaff() {
        return businessStaff;
    }

    public void setBusinessStaff(Integer businessStaff) {
        this.businessStaff = businessStaff;
    }

    @Basic
    @Column(name = "baidu_manage")
    public String getBaiduManage() {
        return baiduManage;
    }

    public void setBaiduManage(String baiduManage) {
        this.baiduManage = baiduManage;
    }

    @Basic
    @Column(name = "creative_staff")
    public String getCreativeStaff() {
        return creativeStaff;
    }

    public void setCreativeStaff(String creativeStaff) {
        this.creativeStaff = creativeStaff;
    }

    @Basic
    @Column(name = "assistant_staff")
    public String getAssistantStaff() {
        return assistantStaff;
    }

    public void setAssistantStaff(String assistantStaff) {
        this.assistantStaff = assistantStaff;
    }

    @Basic
    @Column(name = "tuiguang_staff")
    public String getTuiguangStaff() {
        return tuiguangStaff;
    }

    public void setTuiguangStaff(String tuiguangStaff) {
        this.tuiguangStaff = tuiguangStaff;
    }

    @Basic
    @Column(name = "team_staff")
    public String getTeamStaff() {
        return teamStaff;
    }

    public void setTeamStaff(String teamStaff) {
        this.teamStaff = teamStaff;
    }

    @Basic
    @Column(name = "leader_staff")
    public String getLeaderStaff() {
        return leaderStaff;
    }

    public void setLeaderStaff(String leaderStaff) {
        this.leaderStaff = leaderStaff;
    }

    @Basic
    @Column(name = "tel_staff")
    public String getTelStaff() {
        return telStaff;
    }

    public void setTelStaff(String telStaff) {
        this.telStaff = telStaff;
    }

    @Basic
    @Column(name = "tradeProfitbili")
    public Double getTradeProfitbili() {
        return tradeProfitbili;
    }

    public void setTradeProfitbili(Double tradeProfitbili) {
        this.tradeProfitbili = tradeProfitbili;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbStaffEntity that = (TbStaffEntity) o;

        if (guidStaff != null ? !guidStaff.equals(that.guidStaff) : that.guidStaff != null) return false;
        if (snStaff != null ? !snStaff.equals(that.snStaff) : that.snStaff != null) return false;
        if (nameStaff != null ? !nameStaff.equals(that.nameStaff) : that.nameStaff != null) return false;
        if (pwdStaff != null ? !pwdStaff.equals(that.pwdStaff) : that.pwdStaff != null) return false;
        if (titleStaff != null ? !titleStaff.equals(that.titleStaff) : that.titleStaff != null) return false;
        if (meetParticipants != null ? !meetParticipants.equals(that.meetParticipants) : that.meetParticipants != null)
            return false;
        if (cleanerStaff != null ? !cleanerStaff.equals(that.cleanerStaff) : that.cleanerStaff != null) return false;
        if (managerPlatform != null ? !managerPlatform.equals(that.managerPlatform) : that.managerPlatform != null)
            return false;
        if (businessStaff != null ? !businessStaff.equals(that.businessStaff) : that.businessStaff != null)
            return false;
        if (baiduManage != null ? !baiduManage.equals(that.baiduManage) : that.baiduManage != null) return false;
        if (creativeStaff != null ? !creativeStaff.equals(that.creativeStaff) : that.creativeStaff != null)
            return false;
        if (assistantStaff != null ? !assistantStaff.equals(that.assistantStaff) : that.assistantStaff != null)
            return false;
        if (tuiguangStaff != null ? !tuiguangStaff.equals(that.tuiguangStaff) : that.tuiguangStaff != null)
            return false;
        if (teamStaff != null ? !teamStaff.equals(that.teamStaff) : that.teamStaff != null) return false;
        if (leaderStaff != null ? !leaderStaff.equals(that.leaderStaff) : that.leaderStaff != null) return false;
        if (telStaff != null ? !telStaff.equals(that.telStaff) : that.telStaff != null) return false;
        if (tradeProfitbili != null ? !tradeProfitbili.equals(that.tradeProfitbili) : that.tradeProfitbili != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guidStaff != null ? guidStaff.hashCode() : 0;
        result = 31 * result + (snStaff != null ? snStaff.hashCode() : 0);
        result = 31 * result + (nameStaff != null ? nameStaff.hashCode() : 0);
        result = 31 * result + (pwdStaff != null ? pwdStaff.hashCode() : 0);
        result = 31 * result + (titleStaff != null ? titleStaff.hashCode() : 0);
        result = 31 * result + (meetParticipants != null ? meetParticipants.hashCode() : 0);
        result = 31 * result + (cleanerStaff != null ? cleanerStaff.hashCode() : 0);
        result = 31 * result + (managerPlatform != null ? managerPlatform.hashCode() : 0);
        result = 31 * result + (businessStaff != null ? businessStaff.hashCode() : 0);
        result = 31 * result + (baiduManage != null ? baiduManage.hashCode() : 0);
        result = 31 * result + (creativeStaff != null ? creativeStaff.hashCode() : 0);
        result = 31 * result + (assistantStaff != null ? assistantStaff.hashCode() : 0);
        result = 31 * result + (tuiguangStaff != null ? tuiguangStaff.hashCode() : 0);
        result = 31 * result + (teamStaff != null ? teamStaff.hashCode() : 0);
        result = 31 * result + (leaderStaff != null ? leaderStaff.hashCode() : 0);
        result = 31 * result + (telStaff != null ? telStaff.hashCode() : 0);
        result = 31 * result + (tradeProfitbili != null ? tradeProfitbili.hashCode() : 0);
        return result;
    }
}
