package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "agent_tb_logmanagment", schema = "db_financial_window", catalog = "")
public class AgentTbLogmanagmentEntity {
    private String guidLogmanagement;
    private Timestamp createTime;
    private String logUsername;
    private String logFlag;
    private String logBrowser;
    private String logOperation;
    private Timestamp updateTime;
    private String logIpadress;
    private String logType;

    @Id
    @Column(name = "guid_logmanagement")
    public String getGuidLogmanagement() {
        return guidLogmanagement;
    }

    public void setGuidLogmanagement(String guidLogmanagement) {
        this.guidLogmanagement = guidLogmanagement;
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
    @Column(name = "log_username")
    public String getLogUsername() {
        return logUsername;
    }

    public void setLogUsername(String logUsername) {
        this.logUsername = logUsername;
    }

    @Basic
    @Column(name = "log_flag")
    public String getLogFlag() {
        return logFlag;
    }

    public void setLogFlag(String logFlag) {
        this.logFlag = logFlag;
    }

    @Basic
    @Column(name = "log_browser")
    public String getLogBrowser() {
        return logBrowser;
    }

    public void setLogBrowser(String logBrowser) {
        this.logBrowser = logBrowser;
    }

    @Basic
    @Column(name = "log_operation")
    public String getLogOperation() {
        return logOperation;
    }

    public void setLogOperation(String logOperation) {
        this.logOperation = logOperation;
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
    @Column(name = "log_ipadress")
    public String getLogIpadress() {
        return logIpadress;
    }

    public void setLogIpadress(String logIpadress) {
        this.logIpadress = logIpadress;
    }

    @Basic
    @Column(name = "log_type")
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentTbLogmanagmentEntity that = (AgentTbLogmanagmentEntity) o;

        if (guidLogmanagement != null ? !guidLogmanagement.equals(that.guidLogmanagement) : that.guidLogmanagement != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (logUsername != null ? !logUsername.equals(that.logUsername) : that.logUsername != null) return false;
        if (logFlag != null ? !logFlag.equals(that.logFlag) : that.logFlag != null) return false;
        if (logBrowser != null ? !logBrowser.equals(that.logBrowser) : that.logBrowser != null) return false;
        if (logOperation != null ? !logOperation.equals(that.logOperation) : that.logOperation != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (logIpadress != null ? !logIpadress.equals(that.logIpadress) : that.logIpadress != null) return false;
        if (logType != null ? !logType.equals(that.logType) : that.logType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guidLogmanagement != null ? guidLogmanagement.hashCode() : 0;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (logUsername != null ? logUsername.hashCode() : 0);
        result = 31 * result + (logFlag != null ? logFlag.hashCode() : 0);
        result = 31 * result + (logBrowser != null ? logBrowser.hashCode() : 0);
        result = 31 * result + (logOperation != null ? logOperation.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (logIpadress != null ? logIpadress.hashCode() : 0);
        result = 31 * result + (logType != null ? logType.hashCode() : 0);
        return result;
    }
}
