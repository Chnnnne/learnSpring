<%--
  Created by IntelliJ IDEA.
  User: 95266
  Date: 2022/3/24
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll"> 测试findALl</a> <br>

    <h1>测试保存</h1>
    <form method="post" action="<%=request.getContextPath()%>/account/saveAccount">
        name:<input type="text" name="name"/> <br/>
        money:<input type="text" name="money"> <br/>
        <input type="submit" value="Save"><br/>
    </form>
</body>
</html>
