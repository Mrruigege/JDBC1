<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/29
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="position:absolute;left: 40%">
    <h2 style="text-align: center">登录</h2>
    <form action="log" method="post">
        <p>    用户:<input type="text" name="name" id="name"/></p>
        <p>    密码:<input type="text" name="password" id="password"/></p>
        <input type="submit" value="登录"/> <a href="Pregister.jsp"><h6>没有账号注册</h6></a>
    </form>
</div>
</body>
</html>
