<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List" %>
<%@ page import="com.woniu.carloan.bean.IDcardInfo" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>车贷管理</title>
    <!-- <link rel="stylesheet" type="text/css" href="css/htmleaf-demo.css"> -->
    <link rel="stylesheet" type="text/css" href="demo/css/nav.css">
    <link rel="stylesheet" type="text/css" href="demo/css/unnav.css">
    <link rel="stylesheet" type="text/css" href="demo/fonts/iconfont.css">
    <link href="demo/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

    <script src="demo/js/jquery-3.3.1.js" type="text/javascript"></script>
    <script src="demo/js/formselect.js" type="text/javascript"></script>
    <script type="text/javascript" src="demo/js/nav.js"></script>
    <script src="demo/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
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
    <p style="margin-top: 22px;">当前位置：车贷管理 > 客户身份证信息列表</p>
    <div class="tabletop">
        <p>查询条件</p>
        <form action="selectUserInfoServlet" method="post" onsubmit="return formsele()" class="form-one">
            <div class="form">
                <label>合同编号&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <input class="form-control-user" type="text" placeholder="合同编号" name="userNumber" id="userNumber"/>
            </div>
            <div class="form">
                <label>借款人&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <input class="form-control-user" type="text" placeholder="借款人" name="userName" id="userName"/>
            </div>
            <div class="form">
                <label>分公司&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <input class="form-control-user" type="text" placeholder="分公司" name="company" id="company"/>
            </div>
            <div class="form">
                <input type="submit" class="btn btn-default" value="查询"/>
            </div>
            <div class="form">
                <a href="selectUserInfoServlet"><input type="button" class="btn btn-default" value="全部查询"/></a>
            </div>
        </form>
    </div>
    <div class="tablebottom">
        <p style="margin-top: 22px;">当前位置：车贷管理 > 客户身份证信息列表</p>
        <!--<tr>
            <th>序号</th>
            <th>合同编号</th>
            <th>借款人</th>
            <th>身份证号</th>
            <th>分公司</th>
            <th>操作</th>
        </tr>-->
        <div class="table-responsive">
            <table class="table table-bordered">
                <tr>
                    <th><p>序号</p></th>
                    <th><p>合同编号</p></th>
                    <th><p>借款人</p></th>
                    <th><p>身份证号</p></th>
                    <th><p>分公司</p></th>
                    <th><p>操作</p></th>
                </tr>
                <%
                    List<IDcardInfo> ss = (List<IDcardInfo>) request.getAttribute("userinfolist");
                    for (IDcardInfo s : ss) {
                %>
                <tr>
                    <td>
                        <p>
                            <%=s.getUserID()%>
                        </p>
                    </td>
                    <td>
                        <p>
                            <%=s.getUserNumber()%>
                        </p>
                    </td>
                    <td>
                        <p>
                            <%=s.getUsername()%>
                        </p>
                    </td>
                    <td>
                        <p>
                            <%=s.getIDcard()%>
                        </p>
                    </td>
                    <td>
                        <p>
                            <%=s.getCompany()%>
                        </p>
                    </td>
                    <td>
                        <p>
                            <a style="color: white; text-decoration: none;" href="inspectServlet?id=<%=s.getUserID()%>&username=<%=s.getUsername()%>&idcard=<%=s.getIDcard()%>" onclick="return confirm('立即录入车贷信息？')">车贷信息录入</a>
                            <%--<a style="color: white; text-decoration: none;" href="Customerinfo.jsp?id=<%=s.getUserID()%>&username=<%=s.getUsername()%>&idcard=<%=s.getIDcard()%>" onclick="return confirm('立即录入车贷信息？')">车贷信息录入</a>--%>
                            <a style="color: white; text-decoration: none;" href="updateIDcardinfo.jsp?userid=<%=s.getUserID()%>&usernumber=<%=s.getUserNumber()%>
                            &username=<%=s.getUsername()%>&idcard=<%=s.getIDcard()%>&company=<%=s.getCompany()%>
                            &nation=<%=s.getNation()%>&address=<%=s.getAddress()%>&birthday=<%=s.getBirthday()%>
                            &issuingorgan=<%=s.getIssuingorgan()%>&starttime=<%=s.getStarttime()%>&stoptime=<%=s.getStoptime()%>
                            &producttype=<%=s.getProducttype()%>&sex=<%=s.getSex()%>">修改申请</a>
                            <a style="color: white; text-decoration: none;" href="selectAllUserInfoServlet?id=<%=s.getUserID()%>">查看申请信息</a>
                            <a style="color: white; text-decoration: none;" href="deleteUserInfoServlet?id=<%=s.getUserID()%>" onclick="return confirm('确定撤销？')">撤销申请</a>
                        </p>
                    </td>
                </tr>
                <%
                    }// 循环结束
                %>
            </table>
            <a style="float: right; margin-right: 65px;" class="btn btn-default" href="IDcardinfo.jsp" role="button">新增车贷申请</a>
        </div>
    </div>
</div>

</body>

</html>