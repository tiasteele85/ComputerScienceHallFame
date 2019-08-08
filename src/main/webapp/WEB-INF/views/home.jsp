<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tiny Records</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/yeti/bootstrap.min.css" rel="stylesheet" integrity="sha384-w6tc0TXjTUnYHwVwGgnYyV12wbRoJQo9iMlC2KdkdmVvntGgzT9jvqNEF/uKaF4m" crossorigin="anonymous">
</head>
<body>
<div >
		<nav class="navbar navbar-dark bg-primary">
		 <ul class="nav navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="/complete" >Complete List</a>
            </li>
          </ul>		
		</nav>
		</div>
	<div class="container">
	
		<h1>Show Some Tiny Records</h1>
		<p></p>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Invented</th>
					<th>Year</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ tinies }" var="tiny">
					<tr>
						<td>${ tiny.name }</td>
						<td>${ tiny.invented }</td>
						<td>${ tiny.year }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>