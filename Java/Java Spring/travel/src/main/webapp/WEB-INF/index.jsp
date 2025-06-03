<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"rel="stylesheet">
</head>
<body class="bg-light">
	<h1>Save Travels</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">ExpenseName</th>
				<th scope="col">Vendor</th>
				<th scope="col">Amount</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="travel" items="${travel}">
				<tr>
					<td><a href="/expense/${travel.id}">${travel.expenseName}</a></td>
					<td>${travel.vendor}</td>
					<td>${travel.amount}$</td>
		    		<td>
					    <div class="d-flex gap-2">
					        <a href="/expense/edit/${travel.id}" class="btn btn-primary">Edit</a>
					        <form action="/delete/${travel.id}" method="post">
					            <input type="hidden" name="_method" value="delete">
					            <input type="submit" value="Delete" class="btn btn-danger">
					        </form>
					    </div>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="container mt-5">
		<h1 class="text-center mb-4">Add an Expense :</h1>

		<form:form action="/form" method="post" modelAttribute="Travel"
			class="card p-4 shadow">
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
			           name="amount"/>
			    <form:errors path="amount" cssClass="text-danger" />
			</div>

			<div class="mb-3">
				<form:label path="description" class="form-label">Description</form:label>
				<form:input path="description" cssClass="form-control"  />
				<form:errors path="description" cssClass="text-danger" />
			</div>

			<div class="d-grid">
				<input type="submit" value="Create Expense" class="btn btn-primary" />
			</div>
		</form:form>
	</div>

</body>
</html>