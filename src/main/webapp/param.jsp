<%--
  Created by IntelliJ IDEA.
  User: krion
  Date: 2020/10/18
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%--请求参数绑定--%>

<%--        <a href="/param/testParam?username=lalal&password=123">请求参数绑定</a>--%>

    <%--<form action="/param/saveAccount" method="post">
        性名: <input type="text" name="username"/> <br/>
        密码: <input type="text" name="password"> <br/>
        金额: <input type="text" name="money"> <br/>
        用户性名: <input type="text" name="user.username"> <br/>
        用户年龄: <input type="text" name="user.age"> <br/>
        <input type="submit" value="提交"> <br/>

    </form>--%>


        <%--把数据封装到Account类中,类中存在list和map的集合
        <form action="/param/saveAccount" method="post">
            性名: <input type="text" name="username"/> <br/>
            密码: <input type="text" name="password"> <br/>
            金额: <input type="text" name="money"> <br/>
            用户性名: <input type="text" name="list[0].username"> <br/>
            用户年龄: <input type="text" name="list[0].age"> <br/>

            用户性名: <input type="text" name="map['one'].username"> <br/>
            用户年龄: <input type="text" name="map['two'].age"> <br/>
            <input type="submit" value="提交"> <br/>

        </form>--%>

        <%--自行定义类型转换器--%>
       <%-- <form action="/param/saveUser" method="post">

            用户性名: <input type="text" name="username"> <br/>
            用户年龄: <input type="text" name="age"> <br/>
            用户生日:  <input type="text" name="date"> <br/>
            <input type="submit" value="提交"> <br/>

        </form>--%>

        <a href="param/testServlet">Servlet原生的API</a>


</body>
</html>
