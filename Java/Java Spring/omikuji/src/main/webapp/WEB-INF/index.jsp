<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Omikuji</title>
</head>
<body>
<h1>Send an Omikuji</h1>
    <form action="/omikuji/save" method="post">
        <label for="number">pick any number from 5 to 25</label>
        <input type="number" name="number" min="5" max="25" required>
        <label for="city">Enter name of the city</label>
        <input type="text" name="city" required>
        <label for="name">Enter name of a real person</label>
        <input type="text" name="name" required>
        <label for="hobby">Enter your hobby</label>
        <input type="text" name="hobby" required>
        <label for="thing">Enter any type of living thing</label>
        <input type="text" name="thing" required>
        <label for="somthing">Say somthing nice to somone</label>
        <textarea name="somthing"></textarea>
        <label for="button">Send and show a friend</label>
        <button type="submit" name="button">Send</button>
    </form>
</body>
</html>