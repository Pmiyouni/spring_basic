<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <h1>req5.jsp</h1>
     <c:forEach items="${studylist}" var="study">
       ${study.p1}
       ${study.p2}
       ${study.p3} <br>
    </c:forEach>
</body>
</html>
