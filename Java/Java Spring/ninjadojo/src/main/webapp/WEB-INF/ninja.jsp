<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Ninja</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap Icons -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.0/font/bootstrap-icons.css">
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8 col-lg-6">
                <h1 class="text-center mb-4"><i class="bi bi-person-plus"></i> New Ninja</h1>
                
                <form:form method="post" modelAttribute="ninja" action="/ninjas/new" class="border p-4 rounded shadow-sm bg-light">
                    <div class="mb-3">
                        <form:label path="dojo" class="form-label fw-bold">Dojo:</form:label>
                        <form:select path="dojo" class="form-select">
                            <c:forEach items="${dojos}" var="dojo">
                                <form:option value="${dojo.id}">${dojo.name}</form:option>
                            </c:forEach>
                        </form:select>
                    </div>
                    
                    <div class="mb-3">
                        <form:label path="firstName" class="form-label fw-bold">First Name:</form:label>
                        <form:input path="firstName" class="form-control" placeholder="Enter first name"/>
                        <form:errors path="firstName" cssClass="text-danger"/>
                    </div>
                    
                    <div class="mb-3">
                        <form:label path="lastName" class="form-label fw-bold">Last Name:</form:label>
                        <form:input path="lastName" class="form-control" placeholder="Enter last name"/>
                        <form:errors path="lastName" cssClass="text-danger"/>
                    </div>
                    
                    <div class="mb-4">
                        <form:label path="age" class="form-label fw-bold">Age:</form:label>
                        <form:input path="age" type="number" class="form-control" placeholder="Enter age"/>
                        <form:errors path="age" cssClass="text-danger"/>
                    </div>
                    
                    <div class="d-grid gap-2">
                        <button type="submit" class="btn btn-primary">
                            <i class="bi bi-save"></i> Create Ninja
                        </button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>