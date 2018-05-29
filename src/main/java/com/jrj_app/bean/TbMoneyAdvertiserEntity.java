package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_money_advertiser", schema = "db_financial_window", catalog = "")
public class TbMoneyAdvertiserEntity {
    private String id;
    private String snCase;
    private Timestamp time;
    private String outTradeNo;
    private String tradeNo;
    private String totalAmout;
    private String type;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sn_case")
    public String getSnCase() {
        return snCase;
    }

    public void setSnCase(String snCase) {
        this.snCase = snCase;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "out_trade_no")
    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    @Basic
    @Column(name = "trade_no")
    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    @Basic
    @Column(name = "total_amout")
    public String getTotalAmout() {
        return totalAmout;
    }

    public void setTotalAmout(String totalAmout) {
        this.totalAmout = totalAmout;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbMoneyAdvertiserEntity that = (TbMoneyAdvertiserEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (snCase != null ? !snCase.equals(that.snCase) : that.snCase != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (outTradeNo != null ? !outTradeNo.equals(that.outTradeNo) : that.outTradeNo != null) return false;
        if (tradeNo != null ? !tradeNo.equals(that.tradeNo) : that.tradeNo != null) return false;
        if (totalAmout != null ? !totalAmout.equals(that.totalAmout) : that.totalAmout != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (snCase != null ? snCase.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (outTradeNo != null ? outTradeNo.hashCode() : 0);
        result = 31 * result + (tradeNo != null ? tradeNo.hashCode() : 0);
        result = 31 * result + (totalAmout != null ? totalAmout.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
