package com.woniu.carloan.service;

import com.woniu.carloan.bean.Carinfo;
import com.woniu.carloan.bean.Creditinfo;
import com.woniu.carloan.bean.Customerinfo;
import com.woniu.carloan.bean.IDcardInfo;

public interface insertIDcardInfoService {
    boolean addUserInfo(IDcardInfo iDcardInfo);
    boolean addCustomerInfo(Customerinfo customerinfo);
    boolean addCarInfo(Carinfo carinfo);
    boolean addCreditinfo(Creditinfo creditinfo);
}
