<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table border=1>
<tr>
<th>MovieId</th>
<th>MovieName</th>
<th>Likes</th>
<th>Click To Like</th>
</tr>

<c:forEach var="entry" items="${movies}">

<tr>

<td>${entry.key}</td>
<td>${entry.value.moviename}</td>
<td>${entry.value.rating}</td>
<td><a href="givenRating?mid=${entry.key}">Like</a></td> givenRating


</tr>

</c:forEach>





</table>


</html>