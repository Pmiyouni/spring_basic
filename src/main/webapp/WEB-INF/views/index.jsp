<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>안녕하세요!!</h2>
    <a href ="/demo1">demo1 주소 요청</a>
    <form action = "/demo2" method= "post">
                   param1: <input type="text" name="param1"><br>
                   param2: <input type="text" name="param2"><br>
                   <input type="submit" value="전송">
    </form>
    <form action = "/demo3" method= "post">
                  param1: <input type="text" name="param1"><br>
                  param2: <input type="text" name="param2"><br>
                  <input type="submit" value="전송">
                     <!-- dto의 필드와 이름이 같아야함 -->
                     <!-- 동일한 필드의 setter를 찾아감-->
    </form>
     <a href ="/result1">변수 화면에 출력</a>
     <a href ="/result2">DTO 객체 화면에 출력</a>
     <a href ="/result3">List 객체 화면에 출력</a>
</body>
</html>
