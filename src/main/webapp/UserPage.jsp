<%@ page import="java.util.ArrayList" %><%--
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
    <title>User Page</title>
</head>
<body>
<div style="text-align: center;">
<form action="LoadingData" method="post">
<h1> Welcome <%=session.getAttribute("username")%></h1>
    <h2>Create your new reimbursement claim</h2>

<tr>
    <td>Millage
    </td>&nbsp&nbsp
    <td><input type="text" name="millage"></td>
    <br>
    <br>
    <td> Receipts 1

        <select name="receipts1">
            <option value="5"></option>
            <c:forEach items="${dataList}" var="dataName" varStatus="loop">
                <option value="${loop.index}">
                        ${dataName}
                </option>
            </c:forEach>
        </select>
    <td>&nbsp&nbspCost =
    </td>
    <td><input type="text" name="cost1"></td>
    </tr>
    <br>
    <br>
    <td> Receipts 2

        <select name="receipts2">
            <option value="5"></option>
            <c:forEach items="${dataList}" var="dataName" varStatus="loop">
                <option value="${loop.index}">
                        ${dataName}
                </option>
            </c:forEach>
        </select>
    <td>&nbsp&nbspCost =
    </td>
    <td><input type="text" name="cost2"></td>
    </td>
    <br>
    <br>
    <td> Receipts 3

        <select name="receipts3">
            <option value="5"></option>
            <c:forEach items="${dataList}" var="dataName" varStatus="loop">
                <option value="${loop.index}">
                        ${dataName}
                </option>
            </c:forEach>

        </select>
    <td>&nbsp&nbspCost =
    </td>
    <td><input type="text" name="cost3"></td>
    </td>
    <br>
    <br>
    <td> Receipts 4

        <select name="receipts4">
            <option value="5"></option>
            <c:forEach items="${dataList}" var="dataName" varStatus="loop">
                <option value="${loop.index}">
                        ${dataName}
                </option>
            </c:forEach>
        </select>
    <td>&nbsp&nbspCost =
    </td>
    <td><input type="text" name="cost4"></td>
    </td>
    <br>
    <br>
    <td> Receipts 5

        <select name="receipts5">
            <option value="5"></option>
            <c:forEach items="${dataList}" var="dataName" varStatus="loop">
                <option value="${loop.index}">
                        ${dataName}
                </option>
            </c:forEach>
        </select>
    <td>&nbsp&nbspCost =
    </td>
    <td><input type="text" name="cost5"></td>
    </td>
    <br>
    <br>
    <td>
        First Day
    </td>
    <td><input type="date" name="startday"></td>
    <td>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    </td>
    <td>
        Last Day
    </td>
    <td><input type="date" name="lastday"></td>
    <br>
    <br>
    <input type="submit", value="Calculate">
</form>
</div>
</body>
</html>
