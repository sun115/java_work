<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>사용자 관리</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2 class="text-center">Git 목록</h2>
		<table class="table table-bordered table table-hover"> 
			<thead> 
				<tr> 
					<th>아이디</th> 
			 		<th>이름</th>  
					<th>gitId</th>
					<th>gitAddress</th>
				</tr> 
		</thead> 
		<tbody> 
			<c:forEach var="git" items="${gitList}">
				<tr>
					<td>
					 	${git.userId}
					 </td>
 				 	 <td>				
					 	${git.name}
					 </td> 
					<td>${git.gitId}</td>
					<td>${git.gitAddress}</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="3">
					<a href="insertGitForm.do">git 등록</a>
				</td>
				<td colspan="3">
					<a href="getUserList.do">사용자 조회</a>
				</td>
			</tr>
		</tbody> 
	</table>
	</div>
</body>
</html>








