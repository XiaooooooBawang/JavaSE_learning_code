<%--
  Created by IntelliJ IDEA.
  User: 小霸王
  Date: 2022/7/14
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>next</title>
</head>
    <body>
    <%=request.getAttribute("name") %>
    <%
        int sum = 100;
    %>
    <br>
    <jsp:include page="/left.jsp"/>
    <%--jsp动态包含left.jsp,在静态包含与动态包含均可使用时，一般使用静态包含。
    因为在程序运行时只存在一个Servlet，对资源的消耗较少，且不存在调用问题，执行效率较高。--%>
    <br>
    next sum=<%= sum %>
    <br>
    ${requestScope.nameList[1]}<%--EL表达式，获取request域中的nameList,若数组中不存在该指定索引的元素，系统并不会抛出数组越界异常--%>
    </body>
</html>
