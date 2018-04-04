package com.woniu.carloan.service.Impl;

import com.woniu.carloan.bean.Carinfo;
import com.woniu.carloan.bean.Creditinfo;
import com.woniu.carloan.bean.Customerinfo;
import com.woniu.carloan.bean.IDcardInfo;
import com.woniu.carloan.dao.selectUserInfoDao;
import com.woniu.carloan.dao.Impl.selectUserInfoDaoImpl;
import com.woniu.carloan.service.selcetUserInfoService;

import java.util.List;

public class selcetUserInfoServiceImpl implements selcetUserInfoService {
    private selectUserInfoDao selectUserInfoDao = new selectUserInfoDaoImpl();

    @Override
    public List<IDcardInfo> selectUserinfo(String usernumber, String username, String company) {
        return selectUserInfoDao.findByNnumber(usernumber,username,company);
    }

    @Override
    public List<IDcardInfo> selectUserinfo() {
        return selectUserInfoDao.findByNnumber();
    }

    @Override
    public List<IDcardInfo> selectUserinfo(int id) {
        return selectUserInfoDao.findByNnumber(id);
    }

    @Override
    public boolean inspect(int id) {
        return selectUserInfoDao.inspect(id);
    }

    @Override
    public IDcardInfo selectAllUserinfo(int id) {
        return selectUserInfoDao.selectAllUserinfo(id);
    }

    @Override
    public Customerinfo selectAllCustomerinfo(int id) {
        return selectUserInfoDao.selectAllCustomerinfo(id);
    }

    @Override
    public Carinfo selectAllCarinfo(int id) {
        return selectUserInfoDao.selectAllCarinfo(id);
    }

    @Override
    public Creditinfo selectAllCreditinfo(int id) {
        return selectUserInfoDao.selectAllCreditinfo(id);
    }
}
