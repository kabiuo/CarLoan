package com.woniu.carloan.service.Impl;

import com.woniu.carloan.bean.Carinfo;
import com.woniu.carloan.bean.Creditinfo;
import com.woniu.carloan.bean.Customerinfo;
import com.woniu.carloan.bean.IDcardInfo;
import com.woniu.carloan.dao.insertIDcardInfoDao;
import com.woniu.carloan.dao.Impl.insertIDcardInfoDaoImpl;
import com.woniu.carloan.service.insertIDcardInfoService;

public class insertIDcardInfoServiceImpl implements insertIDcardInfoService {
    private insertIDcardInfoDao insertIDcardInfoDao = new insertIDcardInfoDaoImpl();
    @Override
    public boolean addUserInfo(IDcardInfo iDcardInfo) {
        return insertIDcardInfoDao.IDcardinso(iDcardInfo);
    }

    @Override
    public boolean addCustomerInfo(Customerinfo customerinfo) {
        return insertIDcardInfoDao.Customerinfo(customerinfo);
    }

    @Override
    public boolean addCarInfo(Carinfo carinfo) {
        return insertIDcardInfoDao.Carinfo(carinfo);
    }

    @Override
    public boolean addCreditinfo(Creditinfo creditinfo) {
        return insertIDcardInfoDao.Creditinfo(creditinfo);
    }
}
