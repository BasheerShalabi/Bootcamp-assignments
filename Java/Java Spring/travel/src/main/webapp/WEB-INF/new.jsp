<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-4 p-4 border rounded bg-light shadow">
    <h3 class="text-primary">Expense details</h3>
    <p><strong>ExpenseName:</strong> ${travel.expenseName}</p>
    <p><strong>Vendor:</strong> ${travel.vendor}</p>
    <p><strong>Amount:</strong> ${travel.amount}</p>
    <p><strong>Description:</strong> ${travel.description}</p>
</div>

	<a href="/"  class="text-primary text-decoration-underline">Travels Page</a>
	
</body>
</html>