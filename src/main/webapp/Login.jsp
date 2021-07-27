<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<br>
	<div class="container">
		<h1>Log-In Form</h1>
		<div class="card">
			<div class="card-body">
				<form action="LogInFilter" method="post">

					<div class="form-group row">
						<label for="userId" class="col-sm-2 col-form-label">User ID</label>
						<div class="col-sm-7">
							<input type="number" class="form-control" name="userId" placeholder="ENTER USER ID"> 
							${userIdError }
						</div>
					</div>

					<div class="form-group row">
						<label for="password" class="col-sm-2 col-form-label">Password</label>
						<div class="col-sm-7">
							<input type="password" class="form-control" name="password" placeholder="Enter password"> 
							${passwordError }
						</div>
					</div>
					<button type="submit" class="btn btn-primary">LOGIN</button>
					<br>
					<br> <a href="ForgotPassword.jsp">Forgot Password?</a> &nbsp;&nbsp; <a href="CreateUserId.jsp">Forgot UserId</a> &nbsp;&nbsp; <a href="CreateUserId.jsp">Create UserId</a>
					<hr>
					<a href="Signup.jsp">Don't have an account?</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>