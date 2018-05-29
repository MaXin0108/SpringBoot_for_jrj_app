package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "db_api_reqlog", schema = "db_financial_window", catalog = "")
public class DbApiReqlogEntity {
    private String guid;
    private Timestamp createtime;
    private Timestamp updatetime;
    private String requesturl;
    private String requestip;
    private String requestUserAgent;
    private String requestCookie;
    private String timestamp;
    private String requestParameter;
    private String md5StringValidate;
    private String requestLocation;
    private String loginmode;
    private String platfrom;

    @Id
    @Column(name = "guid")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "createtime")
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "updatetime")
    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    @Basic
    @Column(name = "requesturl")
    public String getRequesturl() {
        return requesturl;
    }

    public void setRequesturl(String requesturl) {
        this.requesturl = requesturl;
    }

    @Basic
    @Column(name = "requestip")
    public String getRequestip() {
        return requestip;
    }

    public void setRequestip(String requestip) {
        this.requestip = requestip;
    }

    @Basic
    @Column(name = "requestUserAgent")
    public String getRequestUserAgent() {
        return requestUserAgent;
    }

    public void setRequestUserAgent(String requestUserAgent) {
        this.requestUserAgent = requestUserAgent;
    }

    @Basic
    @Column(name = "requestCookie")
    public String getRequestCookie() {
        return requestCookie;
    }

    public void setRequestCookie(String requestCookie) {
        this.requestCookie = requestCookie;
    }

    @Basic
    @Column(name = "timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "requestParameter")
    public String getRequestParameter() {
        return requestParameter;
    }

    public void setRequestParameter(String requestParameter) {
        this.requestParameter = requestParameter;
    }

    @Basic
    @Column(name = "md5StringValidate")
    public String getMd5StringValidate() {
        return md5StringValidate;
    }

    public void setMd5StringValidate(String md5StringValidate) {
        this.md5StringValidate = md5StringValidate;
    }

    @Basic
    @Column(name = "requestLocation")
    public String getRequestLocation() {
        return requestLocation;
    }

    public void setRequestLocation(String requestLocation) {
        this.requestLocation = requestLocation;
    }

    @Basic
    @Column(name = "loginmode")
    public String getLoginmode() {
        return loginmode;
    }

    public void setLoginmode(String loginmode) {
        this.loginmode = loginmode;
    }

    @Basic
    @Column(name = "platfrom")
    public String getPlatfrom() {
        return platfrom;
    }

    public void setPlatfrom(String platfrom) {
        this.platfrom = platfrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbApiReqlogEntity that = (DbApiReqlogEntity) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (updatetime != null ? !updatetime.equals(that.updatetime) : that.updatetime != null) return false;
        if (requesturl != null ? !requesturl.equals(that.requesturl) : that.requesturl != null) return false;
        if (requestip != null ? !requestip.equals(that.requestip) : that.requestip != null) return false;
        if (requestUserAgent != null ? !requestUserAgent.equals(that.requestUserAgent) : that.requestUserAgent != null)
            return false;
        if (requestCookie != null ? !requestCookie.equals(that.requestCookie) : that.requestCookie != null)
            return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (requestParameter != null ? !requestParameter.equals(that.requestParameter) : that.requestParameter != null)
            return false;
        if (md5StringValidate != null ? !md5StringValidate.equals(that.md5StringValidate) : that.md5StringValidate != null)
            return false;
        if (requestLocation != null ? !requestLocation.equals(that.requestLocation) : that.requestLocation != null)
            return false;
        if (loginmode != null ? !loginmode.equals(that.loginmode) : that.loginmode != null) return false;
        if (platfrom != null ? !platfrom.equals(that.platfrom) : that.platfrom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        result = 31 * result + (requesturl != null ? requesturl.hashCode() : 0);
        result = 31 * result + (requestip != null ? requestip.hashCode() : 0);
        result = 31 * result + (requestUserAgent != null ? requestUserAgent.hashCode() : 0);
        result = 31 * result + (requestCookie != null ? requestCookie.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (requestParameter != null ? requestParameter.hashCode() : 0);
        result = 31 * result + (md5StringValidate != null ? md5StringValidate.hashCode() : 0);
        result = 31 * result + (requestLocation != null ? requestLocation.hashCode() : 0);
        result = 31 * result + (loginmode != null ? loginmode.hashCode() : 0);
        result = 31 * result + (platfrom != null ? platfrom.hashCode() : 0);
        return result;
    }
}
