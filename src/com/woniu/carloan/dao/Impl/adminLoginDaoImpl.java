package com.woniu.carloan.dao.Impl;

import com.woniu.carloan.bean.Admin;
import com.woniu.carloan.bean.Cusserinfo;
import com.woniu.carloan.dao.adminLoginDao;
import com.woniu.carloan.util.DBSessionFactory;

public class adminLoginDaoImpl implements adminLoginDao {
    public boolean save(Admin s){
        String sql = "insert into admin values(?,?,?)";
        return DBSessionFactory.getCurrentSession().update(sql,
                s.getId(),
                s.getAdminName(),
                s.getAdminPassword())==1;
    }

    @Override
    public Admin findByName(String username) {
        // TODO Auto-generated method stub
        String sql = "select * from admin where adminnumber = ?";
        return DBSessionFactory.getCurrentSession().query(sql,
                (rs)->{
                    Admin admin = null;
                    try{
                        if(rs.next()){
                            admin = new Admin();
                            admin.setId(rs.getInt("adminID"));
                            admin.setAdminName(rs.getString("adminnumber"));
                            admin.setAdminPassword(rs.getString("adminpassword"));
                        }
                    }catch (Exception e) {
                        // TODO: handle exception
                    }
                    return admin;
                },username);
    }

    @Override
    public Cusserinfo findCusserByName(String username) {
        String sql = "select * from cusser where cussernumber = ?";
        return DBSessionFactory.getCurrentSession().query(sql,
                (rs)->{
                    Cusserinfo admin = null;
                    try{
                        if(rs.next()){
                            admin = new Cusserinfo();
                            admin.setCusserID(rs.getInt("cusserID"));
                            admin.setCusserName(rs.getString("cussernumber"));
                            admin.setCusserPassword(rs.getString("cusserpassword"));
                        }
                    }catch (Exception e) {
                        // TODO: handle exception
                    }
                    return admin;
                },username);
    }
}
