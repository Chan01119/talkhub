<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 4.
  Time: 오후 5:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>TalkHub로그인</title>
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
</style>
<body>
<h1>TalkHub 로그인 :></h1>
<h3>로그인 하세열 ㅋㅅㅋ</h3>
<form action="${pageContext.request.contextPath }/login-proceed">
    <div>
        <label>아이디</label>
        <div>
            <input type="text" name="id"/>
        </div>
    </div>
    <div>
        <label>비밀번호</label>
        <div>
            <input type="password" name="password"/>
        </div>
        <div>
            <button
                    type="submit">등록하기
            </button>
        </div>
</form>
</body>
</html>
