<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New dojo</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <h1 class="text-center mb-4">New Dojo</h1>
                
                <form:form method="post" modelAttribute="dojo" action="/dojos/new" class="border p-4 rounded shadow-sm">
                    <div class="mb-3">
                        <form:label path="name" class="form-label">Name:</form:label>
                        <form:input path="name" class="form-control"/>
                        <form:errors path="name" cssClass="text-danger"/>
                    </div>
                    <div class="d-grid">
                        <input type="submit" value="Create" class="btn btn-primary"/>
                    </div>
                </form:form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>