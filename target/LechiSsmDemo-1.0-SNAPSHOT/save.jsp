<%--
  Created by IntelliJ IDEA.
  User: WangKe
  Date: 2019/9/10
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save</title>
</head>
<body>

    <h1>添加账户信息表单</h1>

<form name="users" action="${pageContext.request.contextPath}/users/save" method="post">

    用户名：<input type="text" name="name"><br>
    密码：<input type="text" name="password"><br>

    <input type="submit" value="保存"><br>


</form>


    <form name="users" action="${pageContext.request.contextPath}/users/findone" method="post">

        用户名：<input type="text" name="name"><br>
        密码：<input type="text" name="password"><br>

        <input type="submit" value="保存"><br>


    </form>

</body>
</html>
