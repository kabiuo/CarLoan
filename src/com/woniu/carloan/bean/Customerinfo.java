package com.woniu.carloan.bean;

public class Customerinfo {
    private int userID;
    private String username;
    private String IDcard;
    private String peraddress;
    private String usertel;
    private String unit;
    private String unitaddress;
    private String unitpro;
    private String unittel;
    private String salary;
    private String salesman;
    private String commissioner;

    public Customerinfo(){

    }

    public Customerinfo(
            int userID,
            String username,
            String IDcard,
            String peraddress,
            String usertel,
            String unit,
            String unitaddress,
            String unitpro,
            String unittel,
            String salary,
            String salesman,
            String commissioner) {
        this.userID = userID;
        this.username = username;
        this.IDcard = IDcard;
        this.peraddress = peraddress;
        this.usertel = usertel;
        this.unit = unit;
        this.unitaddress = unitaddress;
        this.unitpro = unitpro;
        this.unittel = unittel;
        this.salary = salary;
        this.salesman = salesman;
        this.commissioner = commissioner;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getIDcard() {
        return IDcard;
    }

    public String getPeraddress() {
        return peraddress;
    }

    public String getUsertel() {
        return usertel;
    }

    public String getUnit() {
        return unit;
    }

    public String getUnitaddress() {
        return unitaddress;
    }

    public String getUnitpro() {
        return unitpro;
    }

    public String getUnittel() {
        return unittel;
    }

    public String getSalary() {
        return salary;
    }

    public String getSalesman() {
        return salesman;
    }

    public String getCommissioner() {
        return commissioner;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public void setPeraddress(String peraddress) {
        this.peraddress = peraddress;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setUnitaddress(String unitaddress) {
        this.unitaddress = unitaddress;
    }

    public void setUnitpro(String unitpro) {
        this.unitpro = unitpro;
    }

    public void setUnittel(String unittel) {
        this.unittel = unittel;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public void setCommissioner(String commissioner) {
        this.commissioner = commissioner;
    }
}
