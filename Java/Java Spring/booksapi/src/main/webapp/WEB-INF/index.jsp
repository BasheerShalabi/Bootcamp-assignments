<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reading Books</title>
</head>
<body>
    <h1>${book.title}</h1>
    <h4>Description: ${book.description}</h4>
    <h4>Language: ${book.language}</h4>
    <h4>Number of pages: ${book.numberOfPages}</h4>
</body>
</html>