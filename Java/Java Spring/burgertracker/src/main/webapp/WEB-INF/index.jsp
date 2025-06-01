<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Burger Tracker</title>

    <!-- Bootstrap CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container my-4">

    <h1 class="mb-4">🍔 Burger Tracker</h1>

    <!-- Burger Table -->
    <table class="table table-striped table-bordered">
        <thead class="table-dark">
            <tr>
                <th>Burger Name</th>
                <th>Restaurant Name</th>
                <th>Rating</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="burger" items="${burgers}">
                <tr>
                    <td>${burger.burgerName}</td>
                    <td>${burger.restaurantName}</td>
                    <td>${burger.rating}</td>
                    <td><a href="/edit/${burger.id}">edit</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <!-- Burger Form -->
    <div class="card mt-5">
        <div class="card-body">
            <h4 class="card-title">Add a New Burger</h4>
            <form:form method="post" action="/create" modelAttribute="burger" class="row g-3">
                
                <div class="col-md-6">
                    <form:label path="burgerName" class="form-label">Burger Name:</form:label>
                    <form:input path="burgerName" class="form-control"/>
                    <form:errors path="burgerName" cssClass="text-danger"/>
                </div>

                <div class="col-md-6">
                    <form:label path="restaurantName" class="form-label">Restaurant Name:</form:label>
                    <form:input path="restaurantName" class="form-control"/>
                    <form:errors path="restaurantName" cssClass="text-danger"/>
                </div>

                <div class="col-md-6">
                    <form:label path="rating" class="form-label">Rating:</form:label>
                    <form:input path="rating" type="number" min="1" max="5" class="form-control"/>
                    <form:errors path="rating" cssClass="text-danger"/>
                </div>

                <div class="col-md-12">
                    <form:label path="notes" class="form-label">Notes:</form:label>
                    <form:textarea path="notes" class="form-control" rows="3"/>
                    <form:errors path="notes" cssClass="text-danger"/>
                </div>

                <div class="col-12">
                    <input type="submit" value="Add Burger" class="btn btn-primary"/>
                </div>
            </form:form>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
