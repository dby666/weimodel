package com.springboot.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "td_user", schema = "tdshop")
public class TdUserEntity {
    private String userId;
    private String phone;
    private String username;
    private String inviteCode;
    private String address;
    private Integer state;
    private String date;
    private String remark;

    @Id
    @Column(name = "user_id", nullable = false, length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 32)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "invite_code", nullable = true, length = 32)
    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "date", nullable = false, length = 32)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "remark", nullable = false, length = 100)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TdUserEntity that = (TdUserEntity) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(username, that.username) &&
                Objects.equals(inviteCode, that.inviteCode) &&
                Objects.equals(address, that.address) &&
                Objects.equals(state, that.state) &&
                Objects.equals(date, that.date) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, phone, username, inviteCode, address, state, date, remark);
    }
}
