<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 6.
  Time: 오후 4:52
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

    h3 {
        text-align: center;
    }

    p {
        font-size: large;
        font-weight: 500;
        text-align: center;
    }

    div {
        text-align: center;
    }
</style>
<body>
<h1>TalkHub글쓰기</h1>
<form action="${pageContext.request.contextPath }/post-create-proceed">
    <div>
        <label>작성자 아이디</label>
        <div>
            <input type="text" name="writerId">
        </div>
    </div>
    <div>
        <label>카테고리</label>
        <div>
            <input type="text" name="category">
        </div>
    </div>
    <div>
        <label>타이틀</label>
        <div>
            <input type="text" name="title">
        </div>
    </div>
    <div>
        <label>내용을 써주세요.</label>
        <div>
            <input type="text" name="context">
        </div>
    </div>
</form>
</body>
</html>
