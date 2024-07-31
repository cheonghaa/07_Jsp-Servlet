<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오전 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int age = 10;
    request.setAttribute("age", 40);
%>


<html>
<head>
    <title>Title</title>
</head>
<body>

<%--변수 age--%>
변수 age : <%= age%> <br>
<%--scope의 키명--%>
EL age : ${age}

</body>
</html>
