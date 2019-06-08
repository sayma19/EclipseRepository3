<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<a class="btn btn-success" href="">Home</a>
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h1 class="panel-title">Customer Report</h1>
				</div>
				<div class="panel-body">
					<table class="table table-hover">
						<tr>
							<th>Customer no</th>
							<th>Base pack</th>
							<th>Optional pack</th>
						</tr>
						<c:forEach items="${clist}" var="c">
							<tr>
								<td><a href='customers/<c:out value="${c.custno}"/>'>${c.custno}</a>
								<td>${c.bpack}</td>
								<td>${c.opack}</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>