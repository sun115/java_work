<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <style>
    table {
      width: 100%;
    }

    th {
      background: #eee;
      padding: 5px;
    }

    td {
      text-align: center;
      padding: 5px;
    }

    th,
    td {
      border: 1px solid #eee;
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
  <a href="/spring03/input">������ �Է��ϱ�</a>

    <table>
    <tr>
      <th>idx</th>
      <th>�̸�</th>
      <th>�ּ�</th>
      <th>����</th>
    </tr>
    ${select_result}
  </table>
  <p>���� ���ֹ� : ${seoul_count}��</p>
</body>

</html>
