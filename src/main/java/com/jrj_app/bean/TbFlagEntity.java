package com.jrj_app.bean;

import javax.persistence.*;

@Entity
@Table(name = "tb_flag", schema = "db_financial_window", catalog = "")
public class TbFlagEntity {
    private String guid;
    private Integer flag;
    private String msgcontent;

    @Id
    @Column(name = "guid")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "flag")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "msgcontent")
    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbFlagEntity that = (TbFlagEntity) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (msgcontent != null ? !msgcontent.equals(that.msgcontent) : that.msgcontent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (msgcontent != null ? msgcontent.hashCode() : 0);
        return result;
    }
}
