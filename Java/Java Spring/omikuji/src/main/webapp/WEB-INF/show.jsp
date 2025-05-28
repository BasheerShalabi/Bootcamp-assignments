<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Omikuji</title>
</head>
<body>
    <h1>Here's your Omikuji</h1>
    <p>Number: ${number}</p>
    <p>City: ${city}</p>
    <p>Name: ${name}</p>
    <p>Hobby: ${hobby}</p>
    <p>Living Thing: ${thing}</p>
    <p>Something Nice: ${something}</p>


    <a href="/omikuji">Go back</a>
</body>
</html>