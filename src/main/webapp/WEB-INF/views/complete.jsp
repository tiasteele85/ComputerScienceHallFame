<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete List</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/yeti/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-w6tc0TXjTUnYHwVwGgnYyV12wbRoJQo9iMlC2KdkdmVvntGgzT9jvqNEF/uKaF4m"
	crossorigin="anonymous">
</head>
<body>
	<div>
		<nav class="navbar navbar-dark bg-primary navbar-right">
			<ul class="nav navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="/"  >Tiny List</a>
            </li>
          </ul>
		</nav>
	</div>
	<div class="container">

		<h1>Show Some Complete Records</h1>
		<p></p>
		<table class="table">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Innovation</th>
					<th>Year</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ completed }" var="complete">
					<tr>
						<td>${ complete.firstName }</td>
						<td>${ complete.lastName }</td>
						<td>${ complete.innovation }</td>
						<td>${ complete.year }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>