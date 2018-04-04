function formsele() {
    var usernumber = document.getElementById("userNumber");
    var username = document.getElementById("userName");
    var company = document.getElementById("company");
    if (trim(usernumber.value) == null || trim(usernumber.value) == "") {
        alert("合同编号不能为空");
        usernumber.focus();
        return false;
    }
    if (trim(username.value) == null || trim(username.value) == "") {
        alert("借款人不能为空");
        username.focus();
        return false;
    }
    if (trim(company.value) == null || trim(company.value) == "") {
        alert("分公司不能为空");
        company.focus();
        return false;
    }

    return true;
}

function trim(str) { //删除左右两端的空格
    return str.replace(/(^\s*)|(\s*$)/g, "");
}

function tram1(str) {
    //去掉字符串中的“-”
    return str.replace("-","");
}

function tram2(str) {
    //去掉字符串中的“-”
    return str.replace("-","");
}

function idcardinfo() {
    var username = document.getElementById("username");//姓名
    var sex = document.getElementById("sex");//性别
    var nation = document.getElementById("nation");//民族
    var birthday = document.getElementById("birthday");//出生年月
    var address = document.getElementById("address");//地址
    var IDcard = document.getElementById("IDcard");//身份证号
    var issuingorgan = document.getElementById("issuingorgan");//发证机关
    var starttime = document.getElementById("starttime");//开始时间
    var stoptime = document.getElementById("address");//停止时间
    var producttype = document.getElementById("producttype");//产品类型
    var usernumber = document.getElementById("usernumber");//合同编号
    var company = document.getElementById("company");//company
    var userid = document.getElementById("userid");//ID
    var reg=/^[1-9]\d*$|^0$/;   // 注意：故意限制了 0321 这种格式，如不需要，直接reg=/^\d+$/;

    if (trim(usernumber.value) == null || trim(usernumber.value) == "") {
        alert("合同编号不能为空");
        usernumber.focus();
        return false;
    }else {
        if(trim(usernumber.value).length != 7){
            alert("合同编号只能是7位");
            usernumber.focus();
            return false;
        }else {
            if(reg.test(usernumber.value) == true){
            }else{
                alert("合同编号只能是纯数字！");
                usernumber.focus();
                return false;
            }
        }
    }
    if (trim(company.value) == null || trim(company.value) == "") {
        alert("分公司不能为空");
        company.focus();
        return false;
    }
    if (trim(username.value) == null || trim(username.value) == "") {
        alert("姓名不能为空");
        username.focus();
        return false;
    }
    if (trim(sex.value) == null || trim(sex.value) == "") {
        alert("性别不能为空");
        sex.focus();
        return false;
    }
    if (trim(nation.value) == null || trim(nation.value) == "") {
        alert("民族不能为空");
        nation.focus();
        return false;
    }
    if (trim(birthday.value) == null || trim(birthday.value) == "") {
        alert("出生年月不能为空");
        birthday.focus();
        return false;
    }
    if (trim(address.value) == null || trim(address.value) == "") {
        alert("地址不能为空");
        address.focus();
        return false;
    }
    if (trim(IDcard.value) == null || trim(IDcard.value) == "") {
        alert("身份证号不能为空");
        IDcard.focus();
        return false;
    }else {
        if (trim(IDcard.value).length != 18){
            alert("身份证号为18位，请仔细检查");
            IDcard.focus();
            return false;
        }
    }
    if (trim(issuingorgan.value) == null || trim(issuingorgan.value) == "") {
        alert("发证机关不能为空");
        issuingorgan.focus();
        return false;
    }
    if (trim(starttime.value) == null || trim(starttime.value) == "") {
        alert("有效时间不能为空");
        starttime.focus();
        return false;
    }
    if (trim(stoptime.value) == null || trim(stoptime.value) == "") {
        alert("失效时间不能为空");
        stoptime.focus();
        return false;
    }
    if (trim(producttype.value) == null || trim(producttype.value) == "") {
        alert("产品类型不能为空");
        producttype.focus();
        return false;
    }
    // if (trim(userid.value) == null || trim(userid.value) == "") {
    //     alert("ID不能为空");
    //     userid.focus();
    //     return false;
    // }
    return true;
}

function checkuseername(){
    var selectvalue = document.getElementById("select").value;
    var password = document.getElementById("password"); //获取密码框值
    var usernamevalue = document.getElementById("username").value;
    // var kefu = "客服";
    // var admin = "管理员";
    // var reg=/^[1-9]\d*$|^0$/;   // 注意：故意限制了 0321 这种格式，如不需要，直接reg=/^\d+$/;
    // if (selectvalue == kefu){
    //     if(reg.test(usernamevalue) == true){
    //         return true;
    //     }else{
    //         alert("客服账号是纯数字哦！请联系管理员！");
    //         return false;
    //     }
    // }

    if(password.value.length < 5){
        alert("密码长度不少于五位！");
        password.focus();
        return false;
    }
}

function CustomerinfoFrom() {
    var username = document.getElementById("username");
    var IDcard = document.getElementById("IDcard");
    var peraddress = document.getElementById("peraddress");
    var usertel = document.getElementById("usertel");
    var unit = document.getElementById("unit");
    var unitaddress = document.getElementById("unitaddress");
    var unittel = document.getElementById("unittel");
    var salary = document.getElementById("salary");
    var salesman = document.getElementById("salesman");
    var commissioner = document.getElementById("commissioner");

    if (trim(username.value) == null || trim(username.value) == "") {
        alert("申请人姓名不能为空");
        username.focus();
        return false;
    }
    if (trim(IDcard.value) == null || trim(IDcard.value) == "") {
        alert("身份证号码不能为空");
        IDcard.focus();
        return false;
    }
    if (trim(peraddress.value) == null || trim(peraddress.value) == "") {
        alert("户籍地址不能为空");
        peraddress.focus();
        return false;
    }
    if (trim(usertel.value) == null || trim(usertel.value) == "") {
        alert("申请人手机号码不能为空");
        usertel.focus();
        return false;
    }
    if (trim(unit.value) == null || trim(unit.value) == "") {
        alert("工作单位全称不能为空");
        unit.focus();
        return false;
    }
    if (trim(unitaddress.value) == null || trim(unitaddress.value) == "") {
        alert("工作单位地址不能为空");
        unitaddress.focus();
        return false;
    }
    if (trim(unittel.value) == null || trim(unittel.value) == "") {
        alert("单位电话不能为空");
        unittel.focus();
        return false;
    }
    if (trim(salary.value) == null || trim(salary.value) == "") {
        alert("月收入不能为空");
        salary.focus();
        return false;
    }
    if (trim(salesman.value) == null || trim(salesman.value) == "") {
        alert("业务员姓名不能为空");
        salesman.focus();
        return false;
    }
    if (trim(commissioner.value) == null || trim(commissioner.value) == "") {
        alert("车贷专员不能为空");
        commissioner.focus();
        return false;
    }
}



function CreditinfoFrom() {
    var username = document.getElementById("username");
    var IDcard = document.getElementById("IDcard");
    var creditcard = document.getElementById("creditcard");

    if (trim(username.value) == null || trim(username.value) == "") {
        alert("姓名不能为空");
        username.focus();
        return false;
    }
    if (trim(IDcard.value) == null || trim(IDcard.value) == "") {
        alert("身份证号码不能为空");
        username.focus();
        return false;
    }
    if (trim(creditcard.value) == null || trim(creditcard.value) == "") {
        alert("信用卡、贷款累计预期次数不能为空");
        creditcard.focus();
        return false;
    }
}


function carinfoFrom() {
    var licenseplate = document.getElementById("licenseplate");
    var engineno = document.getElementById("engineno");
    var color = document.getElementById("color");
    var brandmodel = document.getElementById("brandmodel");
    var fristdate = document.getElementById("fristdate");
    var deadline = document.getElementById("deadline");
    var chassisnumber = document.getElementById("chassisnumber");
    var price = document.getElementById("price");
    var mileage = document.getElementById("mileage");

    if (trim(licenseplate.value) == null || trim(licenseplate.value) == "") {
        alert("机动车辆号牌不能为空");
        licenseplate.focus();
        return false;
    }
    if (trim(engineno.value) == null || trim(engineno.value) == "") {
        alert("发动机号不能为空");
        engineno.focus();
        return false;
    }
    if (trim(color.value) == null || trim(color.value) == "") {
        alert("颜色不能为空");
        color.focus();
        return false;
    }
    if (trim(brandmodel.value) == null || trim(brandmodel.value) == "") {
        alert("厂牌型号不能为空");
        brandmodel.focus();
        return false;
    }
    if (trim(fristdate.value) == null || trim(fristdate.value) == "") {
        alert("初次登记日期不能为空");
        fristdate.focus();
        return false;
    }
    if (trim(deadline.value) == null || trim(deadline.value) == "") {
        alert("年检有效期不能为空");
        deadline.focus();
        return false;
    }
    if (trim(chassisnumber.value) == null || trim(chassisnumber.value) == "") {
        alert("车架号不能为空");
        chassisnumber.focus();
        return false;
    }
    if (trim(price.value) == null || trim(price.value) == "") {
        alert("车辆评估价格不能为空");
        price.focus();
        return false;
    }
    if (trim(mileage.value) == null || trim(mileage.value) == "") {
        alert("目前已行驶里程数不能为空");
        mileage.focus();
        return false;
    }
}