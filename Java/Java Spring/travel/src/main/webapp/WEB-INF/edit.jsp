<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ page isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>travel details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<h1 class="text-center mb-4">Edit Expense :</h1>

		<form:form action="/update/expense/${Travel.id}" method="post" modelAttribute="Travel" class="card p-4 shadow">
			<input type="hidden" name="_method" value="put">
			<div class="mb-3">
				<form:label path="expenseName" class="form-label">ExpenseName :</form:label>
				<form:input path="expenseName" cssClass="form-control" />
				<form:errors path="expenseName" cssClass="text-danger" />
			</div>

			<div class="mb-3">
				<form:label path="vendor" class="form-label">Vendor :</form:label>
				<form:input path="vendor" cssClass="form-control" />
				<form:errors path="vendor" cssClass="text-danger" />
			</div>

			<div class="mb-3">
			    <form:label path="amount" class="form-label">Amount :</form:label>
			    <input type="number" min="1" class="form-control"
			           name="amount" value="${Travel.amount}" />
			    <form:errors path="amount" cssClass="text-danger" />
			</div>

			<div class="mb-3">
				<form:label path="description" class="form-label">Description</form:label>
				<form:input path="description" cssClass="form-control"  />
				<form:errors path="description" cssClass="text-danger" />
			</div>

			<div class="d-grid">
				<input type="submit" value="Update" class="btn btn-primary" />
			</div>
		</form:form>
	</div>
		<a href="/"  class="text-primary text-decoration-underline">Travels Page</a>
	
	
</body>
</html>