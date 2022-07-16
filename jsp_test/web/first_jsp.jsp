<%--
  Created by IntelliJ IDEA.
  User: 小霸王
  Date: 2022/7/13
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%--<%@include file=""%> 静态包含  --%>
<!--html注释，可以在客户端浏览器中以查看源代码的方式看到-->
<%--jsp注释，在浏览器源码中不会被看到--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>第一个JSP</title>
    </head>
    <body>
        <%
            Date d = new Date();
            out.write(d.toString());
            <%=d%><%--jsp表达式，直接out.write输出d,不需分号结尾--%>
            <%--  java代码中
                - 声明变量不能添加访问权限修饰符；
                - 不能定义方法；
                - 不能定义静态语句块；--%>
        %>
    </body>
</html>