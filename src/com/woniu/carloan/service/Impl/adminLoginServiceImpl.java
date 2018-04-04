package com.woniu.carloan.service.Impl;

import com.woniu.carloan.bean.Admin;
import com.woniu.carloan.bean.Cusserinfo;
import com.woniu.carloan.dao.Impl.adminLoginDaoImpl;
import com.woniu.carloan.dao.adminLoginDao;
import com.woniu.carloan.service.adminLoginService;
import org.apache.commons.codec.digest.DigestUtils;

public class adminLoginServiceImpl implements adminLoginService {
    private adminLoginDao ad = new adminLoginDaoImpl();
    @Override
    public boolean addAdmin(Admin s) {
        // TODO Auto-generated method stub
        s.setAdminPassword(DigestUtils.md5Hex(s.getAdminPassword()));
        return ad.save(s);
    }

    @Override
    public boolean login(String username, String password) {
        // TODO Auto-generated method stub
        Admin admin =  ad.findByName(username);
        if(admin != null){
            String md5 = DigestUtils.md5Hex(password);
            return admin.getAdminPassword().equals(md5);
        }else{
            return false;
        }
    }

    @Override
    public boolean Cusserlogin(String username, String password) {
        Cusserinfo admin =  ad.findCusserByName(username);
        if(admin != null){
            return admin.getCusserPassword().equals(password);
        }else{
            return false;
        }
    }
}
