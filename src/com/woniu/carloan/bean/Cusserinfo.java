package com.woniu.carloan.bean;

public class Cusserinfo {
    private String cusserName;
    private String cusserPassword;
    private int cusserID;

    public Cusserinfo(){

    }

    public Cusserinfo(String cusserName, String cusserPassword, int cusserID) {
        this.cusserName = cusserName;
        this.cusserPassword = cusserPassword;
        this.cusserID = cusserID;
    }

    public Cusserinfo(String cusserName, String cusserPassword) {
        this.cusserName = cusserName;
        this.cusserPassword = cusserPassword;
    }

    public String getCusserName() {
        return cusserName;
    }

    public String getCusserPassword() {
        return cusserPassword;
    }

    public int getCusserID() {
        return cusserID;
    }

    public void setCusserName(String cusserName) {
        this.cusserName = cusserName;
    }

    public void setCusserPassword(String cusserPassword) {
        this.cusserPassword = cusserPassword;
    }

    public void setCusserID(int cusserID) {
        this.cusserID = cusserID;
    }
}
