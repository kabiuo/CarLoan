package com.woniu.carloan.bean;

public class IDcardInfo {
    private int userID;
    private String userNumber;
    private String company;
    private String username;
    private String sex;
    private String nation;
    private String birthday;
    private String address;
    private String IDcard;
    private String issuingorgan;
    private String starttime;
    private String stoptime;
    private String producttype;

    public IDcardInfo(){

    }

    public IDcardInfo(String userNumber, String company, String username, String sex, String nation, String birthday, String address, String IDcard, String issuingorgan, String starttime, String stoptime, String producttype) {
        this.userNumber = userNumber;
        this.company = company;
        this.username = username;
        this.sex = sex;
        this.nation = nation;
        this.birthday = birthday;
        this.address = address;
        this.IDcard = IDcard;
        this.issuingorgan = issuingorgan;
        this.starttime = starttime;
        this.stoptime = stoptime;
        this.producttype = producttype;
    }

    public IDcardInfo(int userID, String userNumber, String company, String username, String sex, String nation, String birthday, String address, String IDcard, String issuingorgan, String starttime, String stoptime, String producttype) {
        this.userID = userID;
        this.userNumber = userNumber;
        this.company = company;
        this.username = username;
        this.sex = sex;
        this.nation = nation;
        this.birthday = birthday;
        this.address = address;
        this.IDcard = IDcard;
        this.issuingorgan = issuingorgan;
        this.starttime = starttime;
        this.stoptime = stoptime;
        this.producttype = producttype;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public String getCompany() {
        return company;
    }

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public String getNation() {
        return nation;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getIDcard() {
        return IDcard;
    }

    public String getIssuingorgan() {
        return issuingorgan;
    }

    public String getStarttime() {
        return starttime;
    }

    public String getStoptime() {
        return stoptime;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public void setIssuingorgan(String issuingorgan) {
        this.issuingorgan = issuingorgan;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public void setStoptime(String stoptime) {
        this.stoptime = stoptime;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }
}
