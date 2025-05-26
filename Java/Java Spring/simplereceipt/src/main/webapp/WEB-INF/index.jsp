<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Future Dev page</title>
</head>
<body>
<p>
<c:out value="${name}" default="No message provided."/>
</p>
<p><c:out value="${itemName}" default="No message provided."/></p>

<p><c:out value="${price}" default="No message provided."/></p>

<p><c:out value="${description}" default="No message provided."/></p>

<p><c:out value="${vendor}" default="No message provided."/></p>
</body>
</html>
