package com.woniu.carloan.dao;

import com.woniu.carloan.bean.Admin;
import com.woniu.carloan.bean.Cusserinfo;

public interface adminLoginDao {
    boolean save(Admin s);
    Admin findByName(String username);
    Cusserinfo findCusserByName(String username);
}
