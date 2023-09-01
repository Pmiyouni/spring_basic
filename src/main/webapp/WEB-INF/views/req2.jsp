<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <h3>req2.jsp</h3>
     <c:forEach items="${demoList}" var="demoList">
       ${demoList} <br>
       name: ${demoList.name} <br>
       age : ${demoList.age}  <br>
    </c:forEach>
</body>
</html>
