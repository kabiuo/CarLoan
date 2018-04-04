<%--车辆信息--%>
<%@ page import="com.woniu.carloan.bean.Carinfo" %>
<%@ page import="java.lang.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>车贷管理</title>
    <link rel="stylesheet" type="text/css" href="demo/css/nav.css">
    <link rel="stylesheet" type="text/css" href="demo/css/unnav.css">
    <link rel="stylesheet" type="text/css" href="demo/fonts/iconfont.css">
    <link href="demo/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

    <script src="demo/js/jquery-3.3.1.js" type="text/javascript"></script>
    <script src="demo/js/formselect.js" type="text/javascript"></script>
    <script type="text/javascript" src="demo/js/nav.js"></script>
    <script src="demo/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="demo/js/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
</head>

<body>
<div class="nav">
    <div class="nav-top">
        <div id="mini" style="border-bottom:1px solid #37c6c0"><img src="demo/images/mini.png"></div>
    </div>
    <ul>
        <li class="nav-item">
            <a style="text-decoration: none; color: white;" href="javascript:;"><i
                    class="my-icon nav-icon icon_1"></i><span>信审业务管理</span><i class="my-icon nav-more"></i></a>
            <ul>
                <li>
                    <a style="text-decoration: none; color: white;" href="javascript:;"><span>总公司信审</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="javascript:;"><span>车贷签约复核</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="javascript:;"><span>车贷放款</span></a>
                </li>
            </ul>
        </li>
        <li class="nav-item">
            <a style="text-decoration: none; color: white;" href="javascript:;"><i
                    class="my-icon nav-icon icon_2"></i><span>车贷管理</span><i class="my-icon nav-more"></i></a>
            <ul>
                <li>
                    <a style="text-decoration: none; color: white;" href="selectUserInfoServlet"><span>客户身份证信息列表</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="IDcardinfo.jsp"><span>车贷读取身份证</span></a>
                </li>
            </ul>
        </li>
    </ul>
</div>
<div class="unnav">
    <div class="tablebottom">
        <p style="margin-top: 22px;">当前位置：车贷管理 > 录入车辆信息</p>
        <form action="insertCarinfoServlet" method="post" onsubmit="return carinfoFrom()">
            <table class="table table-bordered">
                <tr>
                    <td colspan="4"><p>车辆信息</p></td>
                </tr>
                <tr>
                    <td>
                        <p>机动车辆号牌</p>
                    </td>
                    <td>
                        <input id="licenseplate" name="licenseplate" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="机动车辆号牌">
                    </td>
                    <td>
                        <p>发动机号</p>
                    </td>
                    <td>
                        <input id="engineno" name="engineno" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                type="text" class="form-control" placeholder="发动机号" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>颜色</p>
                    </td>
                    <td>
                        <input id="color" name="color" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="颜色">
                    </td>
                    <td>
                        <p>厂牌型号</p>
                    </td>
                    <td>
                        <input id="brandmodel" name="brandmodel" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="厂牌型号" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>初次登记日期</p>
                    </td>
                    <td>
                        <input id="fristdate" name="fristdate" onfocus="WdatePicker({isShowClear:false,readOnly:true});"
                               style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="初次登记日期">
                    </td>
                    <td>
                        <p>年检有限期</p></td>
                    <td>
                        <input id="deadline" name="deadline" onfocus="WdatePicker({isShowClear:false,readOnly:true});"
                               style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="年检有限期">
                    </td>
                </tr>

                <tr>
                    <td><p>车架号</p></td>
                    <td>
                        <input id="chassisnumber" name="chassisnumber" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="车架号">
                    </td>
                    <td><p>车辆评估价格</p></td>
                    <td>
                        <input id="price" name="price" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="车辆评估价格">
                    </td>
                </tr>
                <tr>
                    <td><p>目前已行驶里程数</p></td>
                    <td>
                        <input id="mileage" name="mileage"
                               style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="目前已行驶里程数">
                    </td>
                    <td><p>身份证</p></td>
                    <td>
                        <select id="IDcard" name="IDcard" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">交付</option>
                            <option style="background-color: rgba(0,0,0,0.2)">未交付</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><p>车辆购置证/发票</p></td>
                    <td>
                        <select id="nvoice" name="nvoice" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">交付</option>
                            <option style="background-color: rgba(0,0,0,0.2)">未交付</option>
                        </select>
                    </td>
                    <td><p>交强保险单</p></td>
                    <td>
                        <select id="openpolicy" name="openpolicy" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">交付</option>
                            <option style="background-color: rgba(0,0,0,0.2)">未交付</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><p>车辆钥匙</p></td>
                    <td>
                        <select id="carkey" name="carkey" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">交付</option>
                            <option style="background-color: rgba(0,0,0,0.2)">未交付</option>
                        </select>
                    </td>
                    <td><p>机动车登记证</p></td>
                    <td>
                        <select id="certificate" name="certificate" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">交付</option>
                            <option style="background-color: rgba(0,0,0,0.2)">未交付</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><p>商业保险单</p></td>
                    <td>
                        <select id="compolicy" name="compolicy" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">交付</option>
                            <option style="background-color: rgba(0,0,0,0.2)">未交付</option>
                        </select>
                    </td>
                    <td><p>车辆行驶证</p></td>
                    <td>
                        <select id="license" name="license" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">交付</option>
                            <option style="background-color: rgba(0,0,0,0.2)">未交付</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><p>车辆原始发票</p></td>
                    <td>
                        <select id="originalinvoice" name="originalinvoice" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">交付</option>
                            <option style="background-color: rgba(0,0,0,0.2)">未交付</option>
                        </select>
                    </td>
                    <td><p>车辆完税证</p></td>
                    <td>
                        <select id="taxcertificate" name="taxcertificate" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">交付</option>
                            <option style="background-color: rgba(0,0,0,0.2)">未交付</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><p>进口车辆证明</p></td>
                    <td>
                        <select id="carimport" name="carimport" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">交付</option>
                            <option style="background-color: rgba(0,0,0,0.2)">未交付</option>
                        </select>
                    </td>
                    <td colspan="2">
                        <input id="userid" name="userid" style="display: none; width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" value="<%=request.getAttribute("iduser")%>">
                    </td>
                </tr>
            </table>
            <input style="float: right; margin-right: 65px;" class="btn btn-default" type="submit" value="录入车辆信息"/>
        </form>
    </div>
</div>

</body>

</html>