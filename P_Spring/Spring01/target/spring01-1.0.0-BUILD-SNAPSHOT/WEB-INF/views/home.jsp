<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<P>Query result is ${query_result}.</P>
	<input type="text" , placeholder="중간고사" id="midScore">
	<input type="text" , placeholder="기말고사" id="finScore">

</body>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

</html>