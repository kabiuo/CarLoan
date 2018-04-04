package com.woniu.carloan.dao.Impl;

import com.woniu.carloan.bean.Carinfo;
import com.woniu.carloan.bean.Creditinfo;
import com.woniu.carloan.bean.Customerinfo;
import com.woniu.carloan.bean.IDcardInfo;
import com.woniu.carloan.dao.selectUserInfoDao;
import com.woniu.carloan.util.DBException;
import com.woniu.carloan.util.DBSessionFactory;

import java.util.ArrayList;
import java.util.List;

public class selectUserInfoDaoImpl implements selectUserInfoDao {

    @Override
    public List<IDcardInfo> findByNnumber(String usernumber, String username, String company) {
        String sql = "select * from idcardinfo where usernumber = ? and username = ? and company = ?";
        return DBSessionFactory.getCurrentSession().query(sql,
                (rs)->{
                    List<IDcardInfo> uinfo = new ArrayList<IDcardInfo>();
                    IDcardInfo userin = null;
                    try{
                        while(rs.next()){
                            userin = new IDcardInfo();
                            userin.setUserID(rs.getInt("userID"));
                            userin.setUserNumber(rs.getString("usernumber"));
                            userin.setUsername(rs.getString("username"));
                            userin.setIDcard(rs.getString("IDcard"));
                            userin.setCompany(rs.getString("company"));
                            uinfo.add(userin);
                        }
                    }catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                        throw new DBException("处理结果集出错");
                    }
                    return uinfo;
                },usernumber,username,company);
    }

    @Override
    public List<IDcardInfo> findByNnumber() {
        String sql = "select * from idcardinfo";
        return DBSessionFactory.getCurrentSession().query(sql,
                (rs)->{
                    List<IDcardInfo> uinfo = new ArrayList<IDcardInfo>();
                    IDcardInfo userin = null;
                    try{
                        while(rs.next()){
                            userin = new IDcardInfo();
                            userin.setUserID(rs.getInt("userID"));
                            userin.setUserNumber(rs.getString("usernumber"));
                            userin.setUsername(rs.getString("username"));
                            userin.setIDcard(rs.getString("IDcard"));
                            userin.setCompany(rs.getString("company"));
                            userin.setAddress(rs.getString("address"));
                            userin.setBirthday(rs.getString("birthday"));
                            userin.setNation(rs.getString("nation"));
                            userin.setSex(rs.getString("sex"));
                            userin.setIssuingorgan(rs.getString("issuingorgan"));
                            userin.setProducttype(rs.getString("producttype"));
                            userin.setStarttime(rs.getString("starttime"));
                            userin.setStoptime(rs.getString("stoptime"));
                            uinfo.add(userin);
                        }
                    }catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                        throw new DBException("处理结果集出错");
                    }
                    return uinfo;
                });
    }

    @Override
    public List<IDcardInfo> findByNnumber(int id) {
        String sql = "select * from idcardinfo where userID = ?";
        return DBSessionFactory.getCurrentSession().query(sql,
                (rs)->{
                    List<IDcardInfo> uinfo = new ArrayList<IDcardInfo>();
                    IDcardInfo userin = null;
                    try{
                        while(rs.next()){
                            userin = new IDcardInfo();
                            userin.setUserID(rs.getInt("userID"));
                            userin.setUserNumber(rs.getString("usernumber"));
                            userin.setUsername(rs.getString("username"));
                            userin.setIDcard(rs.getString("IDcard"));
                            userin.setCompany(rs.getString("company"));
                            userin.setAddress(rs.getString("address"));
                            userin.setBirthday(rs.getString("birthday"));
                            userin.setNation(rs.getString("nation"));
                            userin.setSex(rs.getString("sex"));
                            userin.setIssuingorgan(rs.getString("issuingorgan"));
                            userin.setProducttype(rs.getString("producttype"));
                            userin.setStarttime(rs.getString("starttime"));
                            userin.setStoptime(rs.getString("stoptime"));
                            uinfo.add(userin);
                        }
                    }catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                        throw new DBException("处理结果集出错");
                    }
                    return uinfo;
                },id);
    }

    @Override
    public boolean inspect(int id) {
        String sql = "select * from customerinfo where userID = ?";

        return DBSessionFactory.getCurrentSession().query(sql,
                (rs)->{
                    boolean retu = false;
                    try{
                        if(rs.next()){
                            retu = true;
                        }
                    }catch (Exception e) {
                        retu = false;
                        e.printStackTrace();
                        throw new DBException("处理结果集出错");
                    }
                    return retu;
                },id);
    }

    @Override
    public IDcardInfo selectAllUserinfo(int id) {
        String sql = "select * from idcardinfo where userID = ?";
        return DBSessionFactory.getCurrentSession().query(sql,
                (rs)->{
                    IDcardInfo userin = null;
                    try{
                        while(rs.next()){
                            userin = new IDcardInfo();
                            userin.setUserID(rs.getInt("userID"));
                            userin.setUserNumber(rs.getString("usernumber"));
                            userin.setUsername(rs.getString("username"));
                            userin.setIDcard(rs.getString("IDcard"));
                            userin.setCompany(rs.getString("company"));
                            userin.setAddress(rs.getString("address"));
                            userin.setBirthday(rs.getString("birthday"));
                            userin.setNation(rs.getString("nation"));
                            userin.setSex(rs.getString("sex"));
                            userin.setIssuingorgan(rs.getString("issuingorgan"));
                            userin.setProducttype(rs.getString("producttype"));
                            userin.setStarttime(rs.getString("starttime"));
                            userin.setStoptime(rs.getString("stoptime"));
                        }
                    }catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                        throw new DBException("处理结果集出错");
                    }
                    return userin;
                },id);
    }

    @Override
    public Customerinfo selectAllCustomerinfo(int id) {
        String sql = "select * from customerinfo where userID = ?";
        return DBSessionFactory.getCurrentSession().query(sql,
                (rs)->{
                    Customerinfo userin = null;
                    try{
                        while(rs.next()){
                            userin = new Customerinfo();
                            userin.setUserID(rs.getInt("userID"));
                            userin.setUsername(rs.getString("username"));
                            userin.setIDcard(rs.getString("IDcard"));
                            userin.setUsertel(rs.getString("usertel"));
                            userin.setPeraddress(rs.getString("peraddress"));
                            userin.setUnit(rs.getString("unit"));
                            userin.setUnitaddress(rs.getString("unitaddress"));
                            userin.setUnittel(rs.getString("unittel"));
                            userin.setUnitpro(rs.getString("unitpro"));
                            userin.setSalary(rs.getString("salary"));
                            userin.setSalesman(rs.getString("salesman"));
                            userin.setCommissioner(rs.getString("commissioner"));
                        }
                    }catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                        throw new DBException("处理结果集出错");
                    }
                    return userin;
                },id);
    }

    @Override
    public Carinfo selectAllCarinfo(int id) {
        String sql = "select * from carinfo where userID = ?";
        return DBSessionFactory.getCurrentSession().query(sql,
                (rs)->{
                    Carinfo userin = null;
                    try{
                        while(rs.next()){
                            userin = new Carinfo();
                            userin.setUserID(rs.getInt("userID"));
                            userin.setLicenseplate(rs.getString("licenseplate"));
                            userin.setEngineno(rs.getString("engineno"));
                            userin.setColor(rs.getString("color"));
                            userin.setBrandmodel(rs.getString("brandmodel"));
                            userin.setFristdate(rs.getString("fristdate"));
                            userin.setDeadline(rs.getString("deadline"));
                            userin.setChassisnumber(rs.getString("chassisnumber"));
                            userin.setPrice(rs.getString("price"));
                            userin.setMileage(rs.getString("mileage"));
                            userin.setIDcard(rs.getString("IDcard"));
                            userin.setNvoice(rs.getString("nvoice"));
                            userin.setOpenpolicy(rs.getString("openpolicy"));
                            userin.setCarkey(rs.getString("carkey"));
                            userin.setCertificate(rs.getString("certificate"));
                            userin.setCompolicy(rs.getString("compolicy"));
                            userin.setLicense(rs.getString("license"));
                            userin.setOriginalinvoice(rs.getString("originalinvoice"));
                            userin.setTaxcertificate(rs.getString("taxcertificate"));
                            userin.setCarimport(rs.getString("carimport"));
                        }
                    }catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                        throw new DBException("处理结果集出错");
                    }
                    return userin;
                },id);
    }

    @Override
    public Creditinfo selectAllCreditinfo(int id) {
        String sql = "select * from creditinfo where userID = ?";
        return DBSessionFactory.getCurrentSession().query(sql,
                (rs)->{
                    Creditinfo userin = null;
                    try{
                        while(rs.next()){
                            userin = new Creditinfo();
                            userin.setUserID(rs.getInt("userID"));
                            userin.setIDcard(rs.getString("IDcard"));
                            userin.setUsername(rs.getString("username"));
                            userin.setEstate(rs.getString("estate"));
                            userin.setMortgage(rs.getString("mortgage"));
                            userin.setCarproduction(rs.getString("carproduction"));
                            userin.setCarloans(rs.getString("carloans"));
                            userin.setCreditcard(rs.getString("creditcard"));
                        }
                    }catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                        throw new DBException("处理结果集出错");
                    }
                    return userin;
                },id);
    }
}
