<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Category Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">

    <a href="/" class="btn btn-outline-primary mb-3">Home</a>

    <h1>${category.name}</h1>

    <h4 class="mt-4">Products in this Category:</h4>
    <ul>
        <c:forEach var="prod" items="${category.products}">
            <li>${prod.name}</li>
        </c:forEach>
    </ul>

    <hr>

    <h4>Add Product to this Category</h4>
    <form action="/categories/${category.id}/addProduct" method="post">
    
    <div class="mb-3">
        <label for="productSelect">Select Product:</label>
        <select id="productSelect" name="productId" class="form-select">
            <c:forEach var="product" items="${unassigned}">
                <option value="${product.id}">${product.name}</option>
            </c:forEach>
        </select>
    </div>

    <button type="submit" class="btn btn-success">Add</button>
</form>

</div>
</body>
</html>
