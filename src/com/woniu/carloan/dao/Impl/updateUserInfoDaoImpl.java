package com.woniu.carloan.dao.Impl;

import com.woniu.carloan.bean.IDcardInfo;
import com.woniu.carloan.dao.updateUserInfoDao;
import com.woniu.carloan.util.DBSessionFactory;

public class updateUserInfoDaoImpl implements updateUserInfoDao {
    @Override
    public boolean updateIdInfo(IDcardInfo iDcardInfo) {
        String sql = "update idcardinfo set usernumber = ?, company = ?, username = ?, sex = ?, nation = ?, birthday = ?, address = ?, IDcard = ?, issuingorgan = ?, starttime = ?, stoptime = ?, producttype = ? where userID = ?";
        return DBSessionFactory.getCurrentSession().update(sql,
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
                iDcardInfo.getProducttype(),
                iDcardInfo.getUserID())==1 ;
    }
}
