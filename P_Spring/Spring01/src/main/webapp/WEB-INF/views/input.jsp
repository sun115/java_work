<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<style>
	form {margin: 0 auto;	padding: 10px;	background: #eee;}
	label {	display: inline-block; width: 200px; text-align: center;}
	input {display: inline-block; width: 300px;}
	form span {display: block; paddin: 10px; text-align: center}
	input [type="submit"] {display: inline-block; margin: 5px 0px 0px 140px;}
</style>
<link rel="stylesheet" type="text/css" href="input.css"/>
</head>
<body>
	<form action="/spring01/input" method="get">
		<span><label>이름</label><input type="text"name="name" /></span>
		<span><label>중간점수</label><input type="number" name="middle_score"/></span>
		<span><label>기말점수</label><input type="number" name="final_score"/></span>
		<span><input type="submit" value = "데이터 전송" /></span><br/>
		
	</form>
	<form action="/spring01/list" method="get">
	<span><input type="submit" value = "데이터 불러오기" /></span>
	</form>
</body>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

</html>