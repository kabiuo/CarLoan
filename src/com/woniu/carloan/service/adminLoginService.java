package com.woniu.carloan.service;

import com.woniu.carloan.bean.Admin;

public interface adminLoginService {
    boolean addAdmin(Admin s);
    boolean login(String username, String password);
    boolean Cusserlogin(String username, String password);
}
