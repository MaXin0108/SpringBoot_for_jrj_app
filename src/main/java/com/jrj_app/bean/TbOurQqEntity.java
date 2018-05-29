package com.jrj_app.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_our_qq", schema = "db_financial_window", catalog = "")
public class TbOurQqEntity {
    private String id;
    private Timestamp uptime;
    private String username;
    private String qq;
    private String password;
    private String name;
    private String pingtai;
    private String yongtu;
    private String alias;
    private String validationQuestion;
    private String company;

    @Id
    @Column(name = "Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uptime")
    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "qq")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "pingtai")
    public String getPingtai() {
        return pingtai;
    }

    public void setPingtai(String pingtai) {
        this.pingtai = pingtai;
    }

    @Basic
    @Column(name = "yongtu")
    public String getYongtu() {
        return yongtu;
    }

    public void setYongtu(String yongtu) {
        this.yongtu = yongtu;
    }

    @Basic
    @Column(name = "alias")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Basic
    @Column(name = "validation_question")
    public String getValidationQuestion() {
        return validationQuestion;
    }

    public void setValidationQuestion(String validationQuestion) {
        this.validationQuestion = validationQuestion;
    }

    @Basic
    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbOurQqEntity that = (TbOurQqEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (uptime != null ? !uptime.equals(that.uptime) : that.uptime != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pingtai != null ? !pingtai.equals(that.pingtai) : that.pingtai != null) return false;
        if (yongtu != null ? !yongtu.equals(that.yongtu) : that.yongtu != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (validationQuestion != null ? !validationQuestion.equals(that.validationQuestion) : that.validationQuestion != null)
            return false;
        if (company != null ? !company.equals(that.company) : that.company != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (uptime != null ? uptime.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pingtai != null ? pingtai.hashCode() : 0);
        result = 31 * result + (yongtu != null ? yongtu.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (validationQuestion != null ? validationQuestion.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        return result;
    }
}
