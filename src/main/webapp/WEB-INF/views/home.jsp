<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<p> <a href="${pageContext.request.contextPath}/Lectures">강의 수강 내역</a>
<p> <a href="${pageContext.request.contextPath}/LecturesApply">수강 신청 하기</a>
<p> <a href="${pageContext.request.contextPath}/LecturesReferenceSemester">학기별 이수학점 조회</a>
<p> <a href="${pageContext.request.contextPath}/LecturesReferenceKind">학점 종류별로 조회</a>
</body>
</html>
