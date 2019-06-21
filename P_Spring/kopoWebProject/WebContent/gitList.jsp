<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>����� ����</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2 class="text-center">Git ���</h2>
		<table class="table table-bordered table table-hover"> 
			<thead> 
				<tr> 
					<th>���̵�</th> 
			 		<th>�̸�</th>  
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
					<a href="insertGitForm.do">git ���</a>
				</td>
				<td colspan="3">
					<a href="getUserList.do">����� ��ȸ</a>
				</td>
			</tr>
		</tbody> 
	</table>
	</div>
</body>
</html>








