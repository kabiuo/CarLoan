package com.woniu.carloan.dao;

import com.woniu.carloan.bean.Carinfo;
import com.woniu.carloan.bean.Creditinfo;
import com.woniu.carloan.bean.Customerinfo;
import com.woniu.carloan.bean.IDcardInfo;

public interface insertIDcardInfoDao {
    boolean IDcardinso(IDcardInfo iDcardInfo);
    boolean Customerinfo(Customerinfo customerinfo);
    boolean Carinfo(Carinfo carinfo);
    boolean Creditinfo(Creditinfo creditinfo);
}
