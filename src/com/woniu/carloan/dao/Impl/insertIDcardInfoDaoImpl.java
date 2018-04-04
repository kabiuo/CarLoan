package com.woniu.carloan.dao.Impl;

import com.woniu.carloan.bean.Carinfo;
import com.woniu.carloan.bean.Creditinfo;
import com.woniu.carloan.bean.Customerinfo;
import com.woniu.carloan.bean.IDcardInfo;
import com.woniu.carloan.dao.insertIDcardInfoDao;
import com.woniu.carloan.util.DBException;
import com.woniu.carloan.util.DBSessionFactory;

import java.sql.SQLException;

public class insertIDcardInfoDaoImpl implements insertIDcardInfoDao {
    @Override
    public boolean IDcardinso(IDcardInfo iDcardInfo) {
        String sql = "insert into idcardinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        int totalCount = DBSessionFactory.getCurrentSession().query(
                "select count(userID) from idcardinfo",
                (rs) -> {
                    int total = 0;
                    try {
                        if (rs.next()) {
                            total = rs.getInt(1);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                        throw new DBException("解析结果集错误", e);
                    }
                    return total;
                }
        );
        iDcardInfo.setUserID(totalCount+1);

        return DBSessionFactory.getCurrentSession().update(sql,
                iDcardInfo.getUserID(),
                iDcardInfo.getUserNumber(),
                iDcardInfo.getCompany(),
                iDcardInfo.getUsername(),
                iDcardInfo.getSex(),
                iDcardInfo.getNation(),
                iDcardInfo.getBirthday(),
                iDcardInfo.getAddress(),
                iDcardInfo.getIDcard(),
                iDcardInfo.getIssuingorgan(),
                iDcardInfo.getStarttime(),
                iDcardInfo.getStoptime(),
                iDcardInfo.getProducttype())==1 ;
    }

    @Override
    public boolean Customerinfo(Customerinfo customerinfo) {
        String sql = "insert into customerinfo values(?,?,?,?,?,?,?,?,?,?,?,?)";
        return DBSessionFactory.getCurrentSession().update(sql,
                customerinfo.getUserID(),
                customerinfo.getUsername(),
                customerinfo.getIDcard(),
                customerinfo.getUsertel(),
                customerinfo.getPeraddress(),
                customerinfo.getUnit(),
                customerinfo.getUnitaddress(),
                customerinfo.getUnittel(),
                customerinfo.getUnitpro(),
                customerinfo.getSalary(),
                customerinfo.getSalesman(),
                customerinfo.getCommissioner())==1 ;
    }

    @Override
    public boolean Carinfo(Carinfo carinfo) {
        String sql = "insert into carinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return DBSessionFactory.getCurrentSession().update(sql,
                carinfo.getUserID(),
                carinfo.getLicenseplate(),
                carinfo.getEngineno(),
                carinfo.getColor(),
                carinfo.getBrandmodel(),
                carinfo.getFristdate(),
                carinfo.getDeadline(),
                carinfo.getChassisnumber(),
                carinfo.getPrice(),
                carinfo.getMileage(),
                carinfo.getIDcard(),
                carinfo.getNvoice(),
                carinfo.getOpenpolicy(),
                carinfo.getCarkey(),
                carinfo.getCertificate(),
                carinfo.getCompolicy(),
                carinfo.getLicense(),
                carinfo.getOriginalinvoice(),
                carinfo.getTaxcertificate(),
                carinfo.getCarimport())==1 ;
    }

    @Override
    public boolean Creditinfo(Creditinfo creditinfo) {
        String sql = "insert into creditinfo values(?,?,?,?,?,?,?,?)";
        return DBSessionFactory.getCurrentSession().update(sql,
                creditinfo.getUserID(),
                creditinfo.getIDcard(),
                creditinfo.getUsername(),
                creditinfo.getEstate(),
                creditinfo.getMortgage(),
                creditinfo.getCarproduction(),
                creditinfo.getCarloans(),
                creditinfo.getCreditcard())==1 ;
    }
}
