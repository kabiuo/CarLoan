package com.woniu.carloan.bean;

public class Carinfo {
    private int userID;
    private String licenseplate;
    private String engineno;
    private String color;
    private String brandmodel;
    private String fristdate;
    private String deadline;
    private String chassisnumber;
    private String price;
    private String mileage;
    private String IDcard;
    private String nvoice;
    private String openpolicy;
    private String carkey;
    private String certificate;
    private String compolicy;
    private String license;
    private String originalinvoice;
    private String taxcertificate;
    private String carimport;

    public Carinfo(){

    }

    public Carinfo(int userID, String licenseplate, String engineno, String color, String brandmodel, String fristdate, String deadline, String chassisnumber, String price, String mileage, String IDcard, String nvoice, String openpolicy, String carkey, String certificate, String compolicy, String license, String originalinvoice, String taxcertificate, String carimport) {
        this.userID = userID;
        this.licenseplate = licenseplate;
        this.engineno = engineno;
        this.color = color;
        this.brandmodel = brandmodel;
        this.fristdate = fristdate;
        this.deadline = deadline;
        this.chassisnumber = chassisnumber;
        this.price = price;
        this.mileage = mileage;
        this.IDcard = IDcard;
        this.nvoice = nvoice;
        this.openpolicy = openpolicy;
        this.carkey = carkey;
        this.certificate = certificate;
        this.compolicy = compolicy;
        this.license = license;
        this.originalinvoice = originalinvoice;
        this.taxcertificate = taxcertificate;
        this.carimport = carimport;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getEngineno() {
        return engineno;
    }

    public void setEngineno(String engineno) {
        this.engineno = engineno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFristdate() {
        return fristdate;
    }

    public void setFristdate(String fristdate) {
        this.fristdate = fristdate;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getChassisnumber() {
        return chassisnumber;
    }

    public void setChassisnumber(String chassisnumber) {
        this.chassisnumber = chassisnumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getIDcard() {
        return IDcard;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public String getNvoice() {
        return nvoice;
    }

    public void setNvoice(String nvoice) {
        this.nvoice = nvoice;
    }

    public String getOpenpolicy() {
        return openpolicy;
    }

    public void setOpenpolicy(String openpolicy) {
        this.openpolicy = openpolicy;
    }

    public String getCarkey() {
        return carkey;
    }

    public void setCarkey(String carkey) {
        this.carkey = carkey;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getCompolicy() {
        return compolicy;
    }

    public void setCompolicy(String compolicy) {
        this.compolicy = compolicy;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getOriginalinvoice() {
        return originalinvoice;
    }

    public void setOriginalinvoice(String originalinvoice) {
        this.originalinvoice = originalinvoice;
    }

    public String getTaxcertificate() {
        return taxcertificate;
    }

    public void setTaxcertificate(String taxcertificate) {
        this.taxcertificate = taxcertificate;
    }

    public String getCarimport() {
        return carimport;
    }

    public void setCarimport(String carimport) {
        this.carimport = carimport;
    }

    public String getBrandmodel() {
        return brandmodel;
    }

    public void setBrandmodel(String brandmodel) {
        this.brandmodel = brandmodel;
    }
}
