<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-29
  Time: 오후 2:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>getParameterValues 실습</h1>
<form action="login" method="post">
    <fieldset>
        <legend> 좋아하는 운동 및 성별</legend>
        <ul>
            <li><label for="baseball">야구</label>
                <input type="checkbox" id="baseball" value="야구">
                <label for="football">축구</label>
                <input type="checkbox" id="football" value="축구">
                <label for="basketball">농구</label>
                <input type="checkbox" id="basketball" value="농구">
            </li>

            <li>
                <label for="male">남</label>
                <input type="radio" id="male" name="sex" value="남자" checked>
                <label for="female">여</label>
                <input type="radio" id="female" name="sex" value="여자">
            </li>
            <input type="submit" value="전송">

        </ul>
    </fieldset>
</body>
</html>
