<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/style.css">
    <title>Fruit Store</title>
</head>
<body>
<h1>
Welcome to the Fruit Store
</h1>
<table>
<thead>
<tr>
<th>name</th>
<th>price</th>
</tr>
</thead>
<tbody>
    <c:forEach var="fruit" items="${fruits}">
        <tr>
            <td>${fruit.name}</td>
            <td>${fruit.price}</td>
        </tr>
    </c:forEach>
</tbody>
</table>
    
</body>
</html>