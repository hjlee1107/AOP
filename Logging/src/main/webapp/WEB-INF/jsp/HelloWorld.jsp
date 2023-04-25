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

	<c:set var = "list" value = "${helloList }" />

	<h1>HELLO WORLD</h1>
	
			<table border="1">
				<tr>
					<th>아이디</th>
					<th>이 름</th>
					<th>이메일</th>
				</tr>
				
					<c:if test="${!empty list }">
					<c:forEach items="${list }" var = "hello">
					<tr>
						<td>${hello.user_id }</td>
						<td>${hello.user_name }</td>
						<td>${hello.user_email }</td>
					</tr>
					</c:forEach>
					</c:if>
					
					<c:if test="${empty list }">
					<tr>
						<td colspan = "3">조회할 유저가 없습니다.</td>
					</tr>
					</c:if>
				
			</table>
			
			<br><br><br>
			
			<form action="./insert.do" method = "post" >
				아이디 : <input name = "user_id"><br>
				이름 : <input name = "user_name"><br>
				이메일 : <input name = "user_email"><br>
				
				<input type = "submit" value = "INSERT">
			</form>
			
			
		

</body>
</html>