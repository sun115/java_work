<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>����� ���� ���</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2 class="text-center">git ���� ���</h2>
		<div>
			<form method="post" action="insertGit.do"  >
				<table  class="table table-bordered table table-hover">
					<tr>
						<td>���̵� :</td>
						<td><select name="userId">
								<c:forEach var="userId" items="${map.idList}">
									<option value="${userId}">${userId}</option>
								</c:forEach>
								</select></td>
					</tr>
					<tr>
						<td>git ���̵� </td>
						<td><input type="text" name="gitId" /></td>
					</tr>
					<tr>
						<td>git �ּ� </td>
						<td><input type="text" name="gitAddress" /></td>
					</tr>
					<tr>
					<td colspan="2"  class="text-center">
						<input type="submit" value="���" /></td>
					</tr>
					<tr>					
						<td colspan="2" class="text-center"><a href="getGitList.do">git ��Ϻ���</a></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>