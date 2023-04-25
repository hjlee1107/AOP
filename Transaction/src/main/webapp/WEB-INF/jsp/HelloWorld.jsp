<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>HELLO WORLD</h1>
			
			<form action="./insert.do" method = "post" >
				아이디 : <input name = "user_id"><br>
				이름 : <input name = "user_name"><br>
				이메일 : <input name = "user_email"><br>
				<input type = "submit" value = "INSERT">
			</form>
			
			
		

</body>
</html>