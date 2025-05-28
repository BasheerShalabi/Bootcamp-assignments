<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ninja Gold</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <label for="gold">Your Gold:</label>
    <input type="text" name="gold" value="${gold}" disabled>

    <section>
        <div>
            <h3>Farm</h3>
            <p>(earns 10-20 gold)</p>
            <form action="/find" method="post">
                <input type="hidden" value="10" name="min">
                <input type="hidden" value="20" name="max">
                <input type="hidden" value="Farm" name="location">
                <input type="submit" value="Find Gold!">
            </form>
        </div>
        <div>
            <h3>Cave</h3>
            <p>(earns 10-20 gold)</p>
            <form action="/find" method="post">
                <input type="hidden" value="5" name="min">
                <input type="hidden" value="10" name="max">
                <input type="hidden" value="Cave" name="location">
                <input type="submit" value="Find Gold!">
            </form>
        </div>
        <div>
            <h3>House</h3>
            <p>(earns 10-20 gold)</p>
            <form action="/find" method="post">
                <input type="hidden" value="2" name="min">
                <input type="hidden" value="5" name="max">
                <input type="hidden" value="House" name="location">
                <input type="submit" value="Find Gold!">
            </form>
        </div>
        <div>
            <h3>Quest</h3>
            <p>(earns/takes 0-50 gold)</p>
            <form action="/find" method="post">
                <input type="hidden" value="0" name="min">
                <input type="hidden" value="50" name="max">
                <input type="hidden" value="Quest" name="location">
                <input type="submit" value="Find Gold!">
            </form>
        </div>
    </section>

    <label for="activities">Activities:</label>

    <div>
    <c:forEach var="activity" items="${activities}">
        ${activity}
    </c:forEach>
    </div>

</body>
</html>