<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>New Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">New Product</h1>

    <a href="/" class="btn btn-outline-primary mb-3">Home</a>

    <form:form action="/products" method="post" modelAttribute="product" class="needs-validation">
        <div class="mb-3">
            <form:label path="name">Name:</form:label>
            <form:input path="name" class="form-control"/>
            <form:errors path="name" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <form:label path="description">Description:</form:label>
            <form:textarea path="description" class="form-control"/>
            <form:errors path="description" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <form:label path="price">Price:</form:label>
            <form:input path="price" type="number" step="0.01" class="form-control"/>
            <form:errors path="price" cssClass="text-danger"/>
        </div>

        <button type="submit" class="btn btn-success">Submit</button>
    </form:form>
</div>
</body>
</html>
