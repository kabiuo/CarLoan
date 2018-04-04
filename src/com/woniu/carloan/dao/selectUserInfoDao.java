package com.woniu.carloan.dao;

import com.woniu.carloan.bean.Carinfo;
import com.woniu.carloan.bean.Creditinfo;
import com.woniu.carloan.bean.Customerinfo;
import com.woniu.carloan.bean.IDcardInfo;
import java.util.List;

public interface selectUserInfoDao {
    List<IDcardInfo> findByNnumber(String usernumber, String username, String company);
    List<IDcardInfo> findByNnumber();
    List<IDcardInfo> findByNnumber(int id);
    boolean inspect(int id);

    IDcardInfo selectAllUserinfo(int id);
    Customerinfo selectAllCustomerinfo(int id);
    Carinfo selectAllCarinfo(int id);
    Creditinfo selectAllCreditinfo(int id);

}
