<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>New Category</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">New Category</h1>

    <a href="/" class="btn btn-outline-primary mb-3">Home</a>

    <form:form action="/categories" method="post" modelAttribute="category" class="needs-validation">
        <div class="mb-3">
            <form:label path="name">Name:</form:label>
            <form:input path="name" class="form-control"/>
            <form:errors path="name" cssClass="text-danger"/>
        </div>

        <button type="submit" class="btn btn-success">Submit</button>
    </form:form>
</div>
</body>
</html>
