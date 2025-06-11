<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">

    <a href="/" class="btn btn-outline-primary mb-3">Home</a>

    <h1>${product.name}</h1>
    <p><strong>Description:</strong> ${product.description}</p>
    <p><strong>Price:</strong> $${product.price}</p>

    <h4 class="mt-4">Categories:</h4>
    <ul>
        <c:forEach var="cat" items="${product.categories}">
            <li>${cat.name}</li>
        </c:forEach>
    </ul>

    <hr>

    <h4>Add Category to Product</h4>
   <form action="/products/${product.id}/addCategory" method="post">
    <div class="mb-3">
        <label for="categorySelect">Select Category:</label>
        <select id="categorySelect" name="categoryId" class="form-select">
            <c:forEach var="category" items="${unassigned}">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>
    </div>

    <button type="submit" class="btn btn-success">Add</button>
</form>


</div>
</body>
</html>
