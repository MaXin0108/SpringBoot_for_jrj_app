package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "agent_tb_sendmsglog", schema = "db_financial_window", catalog = "")
public class AgentTbSendmsglogEntity {
    private String logGuid;
    private String desttel;
    private Timestamp msgSendtime;
    private Timestamp msgUpdatetime;
    private String uv;

    @Id
    @Column(name = "logGuid")
    public String getLogGuid() {
        return logGuid;
    }

    public void setLogGuid(String logGuid) {
        this.logGuid = logGuid;
    }

    @Basic
    @Column(name = "desttel")
    public String getDesttel() {
        return desttel;
    }

    public void setDesttel(String desttel) {
        this.desttel = desttel;
    }

    @Basic
    @Column(name = "msg_sendtime")
    public Timestamp getMsgSendtime() {
        return msgSendtime;
    }

    public void setMsgSendtime(Timestamp msgSendtime) {
        this.msgSendtime = msgSendtime;
    }

    @Basic
    @Column(name = "msg_updatetime")
    public Timestamp getMsgUpdatetime() {
        return msgUpdatetime;
    }

    public void setMsgUpdatetime(Timestamp msgUpdatetime) {
        this.msgUpdatetime = msgUpdatetime;
    }

    @Basic
    @Column(name = "uv")
    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentTbSendmsglogEntity that = (AgentTbSendmsglogEntity) o;

        if (logGuid != null ? !logGuid.equals(that.logGuid) : that.logGuid != null) return false;
        if (desttel != null ? !desttel.equals(that.desttel) : that.desttel != null) return false;
        if (msgSendtime != null ? !msgSendtime.equals(that.msgSendtime) : that.msgSendtime != null) return false;
        if (msgUpdatetime != null ? !msgUpdatetime.equals(that.msgUpdatetime) : that.msgUpdatetime != null)
            return false;
        if (uv != null ? !uv.equals(that.uv) : that.uv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logGuid != null ? logGuid.hashCode() : 0;
        result = 31 * result + (desttel != null ? desttel.hashCode() : 0);
        result = 31 * result + (msgSendtime != null ? msgSendtime.hashCode() : 0);
        result = 31 * result + (msgUpdatetime != null ? msgUpdatetime.hashCode() : 0);
        result = 31 * result + (uv != null ? uv.hashCode() : 0);
        return result;
    }
}
