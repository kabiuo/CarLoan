package com.woniu.carloan.service.Impl;

import com.woniu.carloan.bean.IDcardInfo;
import com.woniu.carloan.dao.Impl.updateUserInfoDaoImpl;
import com.woniu.carloan.dao.updateUserInfoDao;
import com.woniu.carloan.service.updateUserInfoService;

public class updateUserInfoServiceImpl implements updateUserInfoService {
    private updateUserInfoDao updateUserInfoDao = new updateUserInfoDaoImpl();
    @Override
    public boolean updateIDcard(IDcardInfo iDcardInfo, int id) {
        return updateUserInfoDao.updateIdInfo(iDcardInfo);
    }
}
