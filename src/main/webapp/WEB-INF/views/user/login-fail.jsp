<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 5.
  Time: 오후 4:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TalkHub</title>
</head>
<style>
    h1 {
        text-align: center;
    }

    p {
        font-size: large;
        font-weight: 500;
        text-align: center;
    }
    div{
        text-align: center;
    }
</style>
<body>
<h1>Talkhub 로그인 실패 !</h1>
<p>
    아이디 또는 비밀번호가 일치하지 않습니다. 다시 입력하여 주십시오.
</p>
<form action="${pageContext.request.contextPath }/login-proceed" method="post">
    <div>
        <label>아이디</label>
        <div>
            <input type="text" name="id" value="${id}"/>
        </div>
    </div>
    <div>
        <label>비밀번호</label>
        <div>
            <input type="password" name="password"/>
        </div>
    </div>
    <p style="color: red; font-size: small">
        ${error}
    </p>
    <div>
        <button type="submit">사용자인증</button>
    </div>
</body>
</html>
