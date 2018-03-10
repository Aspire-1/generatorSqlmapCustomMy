package com.aspire.OnlineMeal.model;

import java.math.BigDecimal;

public class UserInfo {
    private BigDecimal id;

    private String registPhone;

    private String registEmail;

    private String registCode;

    private String registCodeTime;

    private String registTime;

    private String lastLoginTime;

    private String password;

    private String loginState;

    private String state;

    private String isDelete;

    private String address;

    private byte[] headPhoto;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getRegistPhone() {
        return registPhone;
    }

    public void setRegistPhone(String registPhone) {
        this.registPhone = registPhone == null ? null : registPhone.trim();
    }

    public String getRegistEmail() {
        return registEmail;
    }

    public void setRegistEmail(String registEmail) {
        this.registEmail = registEmail == null ? null : registEmail.trim();
    }

    public String getRegistCode() {
        return registCode;
    }

    public void setRegistCode(String registCode) {
        this.registCode = registCode == null ? null : registCode.trim();
    }

    public String getRegistCodeTime() {
        return registCodeTime;
    }

    public void setRegistCodeTime(String registCodeTime) {
        this.registCodeTime = registCodeTime == null ? null : registCodeTime.trim();
    }

    public String getRegistTime() {
        return registTime;
    }

    public void setRegistTime(String registTime) {
        this.registTime = registTime == null ? null : registTime.trim();
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime == null ? null : lastLoginTime.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLoginState() {
        return loginState;
    }

    public void setLoginState(String loginState) {
        this.loginState = loginState == null ? null : loginState.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public byte[] getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(byte[] headPhoto) {
        this.headPhoto = headPhoto;
    }
}