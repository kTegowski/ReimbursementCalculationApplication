<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Reimbursement Calculation Application</title>
</head>
<body>
<div style="text-align: center;"/>
<h1><%= "Reimbursement Calculation Application" %>
</h1>
<br/>
<form action="login" method="post">
<tr>
    <td>Username
    </td>
    <td><input type="text" name="username"></td>
</tr>
    <br>
    <br>
<tr>
    <td>Password
    </td>
    <td><input type="password" name="password"></td>
</tr>
    <br>
    <br>
    <input type="submit", value="Log in">
</form>
</body>
</html>