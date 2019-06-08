<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>change Page</title>
<link href="/Question1/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<div class="container">
		<div class="jumbotron">
		<a class="btn btn-success" href="">Home</a>
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h1 class="panel-title">Following are the details</h1>
				</div>
				${msg}
				<div class="panel-body">
				<f:form class="form-horizontal" method="post" action="/Question1/changeorder">
				<div class="form-group">
						<f:label path="bpack" class="col-md-2 control-label">Base Pack</f:label>
						<div class="col-md-10">
						<f:select path="bpack">
							 <f:option value = "Disco Hindi" label = "Disco Hindi"/>
							 <f:option value = "Classical Magic" label = "Classical Magic"/>
							  <f:option value = "Western Goodies" label = "Western Goodies"/>
						</f:select>
						<f:errors path="bpack"></f:errors>
						</div>
					</div>
					
					<div class="form-group">
						<f:label path="opack" class="col-md-2 control-label">Optional pack</f:label>
						<div class="col-md-10">
						<f:select path="opack">
							 <f:option value = "None" label ="None"/>
							 <f:option value = "Sports" label = "Sports"/>
							  <f:option value = "Comedy" label ="Comedy" />
						</f:select>
						<f:errors path="opack"></f:errors>
						</div>
					</div>
					
					<div class="col-md-offset-2 col-md-10">
					<button type="submit" class="btn btn=success">Submit</button>
					</div>
				</f:form>
				</div>
			</div>
		</div>
	</div>
	<script src="/Question1/webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="/Question1/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>