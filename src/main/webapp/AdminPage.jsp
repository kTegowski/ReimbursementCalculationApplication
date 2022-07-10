<%--
  Created by IntelliJ IDEA.
  User: ktego
  Date: 06.07.2022
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Admin Page</title>
</head>
<body>
<div style="text-align: center;">
<form action="AdminChangeMax" method="post">
<h1> Welcome <%=session.getAttribute("username")%></h1>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>Information</h2></caption>
            <th> Name </th>
            <th> Max Value </th>
            <br>
            <tr>
                <td>Millage</td>
                <td><%=session.getAttribute("millage") %>km</td>
            </tr>
            <tr>
                <td>Number of days</td>
                <td><%=session.getAttribute("numberOfDays") %> days</td>
            </tr>
            <c:forEach var="entry" items="${dataList}">
                <tr>
                    <td>${entry}</td>
                    <td>1</td>
                </tr>
            </c:forEach>


        </table>
        <br>
        <br>
        <input type="submit", value="Change">
    </div>


</form>
</div>
</body>
</html>
