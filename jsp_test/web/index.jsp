<%--
  Created by IntelliJ IDEA.
  User: 小霸王
  Date: 2022/7/13
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
  <%
    String[] name = {"monkey1024", "hello"};
    request.setAttribute("nameList", name);
  %>

  <jsp:forward page="/next.jsp"></jsp:forward><%--jsp动态标签之转发，jsp没有用于重定向的标签--%>
  </body>
</html>
