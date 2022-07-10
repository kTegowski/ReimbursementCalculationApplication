<%--
  Created by IntelliJ IDEA.
  User: ktego
  Date: 06.07.2022
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Your Reimbursement</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>Information</h2></caption>
        <th> Name </th>
        <th> Value </th>

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
                <td>${entry.key}</td>
                <td>${entry.value} $</td>
            </tr>
        </c:forEach>
        <tr>
            <td>Total Cost</td>
            <td><%=session.getAttribute("cost") %> $</td>
        </tr>

    </table>

    </div>
</body>
</html>
