<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form method="get"action="${pageContext.request.contextPath}/doapply"></form>
	<table>
	<tr><td> �⵵ : </td><td><input name="year"type="text"/></td></tr>	
	<tr><td> �б� : </td><td><input name="semester"type="text"/></td></tr>	
	<tr><td> �����ڵ� : </td><td><input name="lecturecode"type="text"/></td></tr>	
	<tr><td> �����̸� : </td><td><input name="lecturename"type="text"/></td></tr>	
	<tr><td> �������� : </td><td><input name="lecturekind"type="text"/></td></tr>	
	<tr><td> ���� : </td><td><input name="credits"type="text"/></td></tr>	
	<tr><td></td><td><input value="Apply Lectures"type="submit"/></td></tr>
	</table>
</body>
</html>