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
    body {
        text-align: center;
    }
    p {
        font-size: large;
        font-weight: 500;
    }
</style>
<body>
<h1>TalkHub글쓰기</h1>
<hr/>
<form action="${pageContext.request.contextPath }/posts-create-proceed">
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
        <div>
            <button
                    type="submit">등록하기
            </button>
        </div>
    </div>
</form>
</body>
</html>
