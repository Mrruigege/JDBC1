<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/29
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>登录错误</h1>
<%
    String err = (String) request.getAttribute("err");
    if (err != null){
        %>
    <h3> <%=err%></h3>
   <% }
%>
</body>
</html>
