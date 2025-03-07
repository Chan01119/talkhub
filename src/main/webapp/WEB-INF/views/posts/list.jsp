<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 7.
  Time: 오전 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>게시글 리스트</title>
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
<h1>게시판</h1>
<h2>[목록]</h2>
<hr/>
<c:forEach var="one" items="${posts}">
    <div>
            ${one.id}|[<span style="color: aquamarine">${one.category}]</span>|

            ${one.title}

            ${one.writerId}|
            ${one.writedAt}|
            ${one.views}|
            ${one.likes}

    </div>

</c:forEach>
<a href="${pageContext.request.contextPath}/posts-create"></a>

</body>
</html>
