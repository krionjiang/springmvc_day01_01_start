<%--
  Created by IntelliJ IDEA.
  User: krion
  Date: 2020/10/18
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--常用注解 --%>
    <a href="anno/testRequestParam?name=哈哈">RequestParam</a>

     <form action="/anno/testRequestBody" method="post">

        用户性名: <input type="text" name="username"> <br/>
        用户年龄: <input type="text" name="age"> <br/>
        <input type="submit" value="提交"> <br/>

     </form>

    <a href="/anno/testPathVariable/10">Servlet原生的API</a>


    <form action="/anno/testModeAttribute" method="post">

        用户性名: <input type="text" name="username"> <br/>
        用户年龄: <input type="text" name="age"> <br/>
        <input type="submit" value="提交"> <br/>

    </form>

    <a href="/anno/testSessionAttributes">testSessionAttributes</a>
    <a href="/anno/getSessionAttributes">getSessionAttributes</a>
    <a href="/anno/delSessionAttributes">delSessionAttributes</a>


</body>
</html>
