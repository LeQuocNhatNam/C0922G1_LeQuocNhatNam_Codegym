<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/31/2023
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Currency</title>
</head>
<body>
<form action="/convert" method="post">
  <table>
    <tr>
      <th>USD</th>
      <th>VND</th>
    </tr>
    <tr>
      <td><input name="usd" type="number" placeholder="enter USD"></td>
      <td>
        ${vnd}
      </td>
    </tr>
    <tr>
      <td colspan="2"><button type="submit">Convert</button></td>
    </tr>
  </table>
</form>
</body>
</html>
