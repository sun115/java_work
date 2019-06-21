<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <style>
    form {
      width: 100%;
      padding: 10px;
      border: 1px solid #eee;
      margin: 10px auto;
      width: 95%;
    }
    form label {
      display: inline-block;
      width: 100%;
      padding: 5px 10px;
      background: #eee;
      border-radius: 5px 0px;
    }
    form input {
      width: 100%;
      display: inline-block;
      margin: 0px 0px 20px 0px;
    }
    form input[type="submit"] {
      width: 50%;
      display: block;
      margin: 10px auto;
      background: #aaaa99;
      color: #fff;
      border: 0px;
      padding: 10px;
    }
    a {
      padding: 10px 30px;
      display: inline-block;
      margin: 5px;
      background: #99aaaa;
      color: #fff;
      border-radius: 5px;
      text-decoration: none;
      font-weight: bold;
    }

  </style>
</head>

<body>
  <a href="">목록으로</a>
  <form action="input_student" method="get">
    <label>이름</label>
    <input type="text" placeholder="이름입력" />
    <label>주소</label>
    <input type="text" placeholder="주소입력" />
    <label>생일</label>
    <input type="text" placeholder="생일입력" />
    <input type="submit" value="입력 완료" />
  </form>
</body>

</html>
