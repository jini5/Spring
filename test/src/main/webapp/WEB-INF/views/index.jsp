<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-10-28
  Time: 오후 4:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SPRING</title>
  </head>
  <body>
  ${now}

  <%
    request.getAttribute("now");
  %>
  </body>
</html>
