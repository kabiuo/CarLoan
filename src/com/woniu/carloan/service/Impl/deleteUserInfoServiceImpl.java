package com.woniu.carloan.service.Impl;

import com.woniu.carloan.dao.deleteUserInfoDao;
import com.woniu.carloan.dao.Impl.deleteUserInfoDaoImpl;
import com.woniu.carloan.service.deleteUserInfoService;

public class deleteUserInfoServiceImpl implements deleteUserInfoService {
    private deleteUserInfoDao deleteUserInfoDao = new deleteUserInfoDaoImpl();

    @Override
    public boolean deleteUserInfo(int id) {
        return deleteUserInfoDao.deleteById(id);
    }
}
