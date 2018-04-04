package com.woniu.carloan.dao.Impl;

import com.woniu.carloan.dao.deleteUserInfoDao;
import com.woniu.carloan.util.DBSessionFactory;

public class deleteUserInfoDaoImpl implements deleteUserInfoDao {
    @Override
    public boolean deleteById(int id) {
        boolean str = false;
        String sql = "delete from idcardinfo where userID = ?";
        String sql1 = "delete from customerinfo where userID = ?";
        String sql2 = "delete from carinfo where userID = ?";
        String sql3 = "delete from creditinfo where userID = ?";
        if (DBSessionFactory.getCurrentSession().update(sql,
                id)== 1 ){
            str = true;
        }else {
            return false;
        }
        if (DBSessionFactory.getCurrentSession().update(sql1,
                id)== 1 ){
            str = true;
        }else {
            return false;
        }
        if (DBSessionFactory.getCurrentSession().update(sql2,
                id)== 1 ){
            str = true;
        }else {
            return false;
        }
        if (DBSessionFactory.getCurrentSession().update(sql3,
                id)== 1 ){
            str = true;
        }else {
            return false;
        }
        return str;
    }
}
