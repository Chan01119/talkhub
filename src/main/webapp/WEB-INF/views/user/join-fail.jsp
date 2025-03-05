<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 5.
  Time: 오후 5:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TalkHub</title>
</head>
<style>
  h1{
    text-align: center;
  }
  h3 {
    text-align: center;
  }
  p{
    font-size: large;
    font-weight: 500;
    text-align: center;
  }
  div{
    text-align: center;
  }
</style>
<body>
<h1>TalkHub</h1>
<h3>토크허브에 회원가입하기</h3>
<form action="${pageContext.request.contextPath }/join-proceed" method="post">
  <div>
    <label>아이디<p style="color: red">*</p> </label>
    <div>
      <input type="text" name="id"/>
    </div>
  </div>
  <div>
    <label>비밀번호</label>
    <div>
      <input type="password" name="password"/>
    </div>
  </div>
  <div>
    <label>활동명</label>
    <div>
      <input type="text" name="nickname"/>
    </div>
  </div>
  <div>
    <label>성별</label>
    <div>
      <label><input type="radio" value="남" name="gender"/>남</label>
      <label><input type="radio" value="여" name="gender"/>여</label>
      <label><input type="radio" value="비공개" name="gender"/>비공개</label>
    </div>
    <div>
      <label>출생년도</label>
      <div>
        <select name="birth">
          <c:forEach var="i" begin="1978" end="2025">
            <option value="${i}">${i}년</option>
          </c:forEach>
        </select>
      </div>
    </div>
</body>
</html>
