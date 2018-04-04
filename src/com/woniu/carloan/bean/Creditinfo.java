package com.woniu.carloan.bean;

public class Creditinfo {
    private int userID;
    private String IDcard;
    private String username;
    private String estate;
    private String mortgage;
    private String carproduction;
    private String carloans;
    private String creditcard;

    public Creditinfo(){

    }

    public Creditinfo(int userID, String IDcard, String username, String estate, String mortgage, String carproduction, String carloans, String creditcard) {
        this.userID = userID;
        this.IDcard = IDcard;
        this.username = username;
        this.estate = estate;
        this.mortgage = mortgage;
        this.carproduction = carproduction;
        this.carloans = carloans;
        this.creditcard = creditcard;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getIDcard() {
        return IDcard;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    public String getMortgage() {
        return mortgage;
    }

    public void setMortgage(String mortgage) {
        this.mortgage = mortgage;
    }

    public String getCarproduction() {
        return carproduction;
    }

    public void setCarproduction(String carproduction) {
        this.carproduction = carproduction;
    }

    public String getCarloans() {
        return carloans;
    }

    public void setCarloans(String carloans) {
        this.carloans = carloans;
    }

    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }
}
