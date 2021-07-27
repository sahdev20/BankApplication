<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
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
		<h1>Signup Form</h1>
		<div class="card">
			<div class="card-body">
				<form action="SignupFilterController" method="post">

					<div class="form-group row">
						<label for="accNumber" class="col-sm-2 col-form-label">Account Number</label>
						<div class="col-sm-7">
							<input type="number" class="form-control" name="accNumber"
								placeholder="Enter Account Number">
						</div>
					</div>

					<div class="form-group row">
						<label for="firstName" class="col-sm-2 col-form-label">FirstName</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="firstName"
								placeholder="Enter FirstName">
						</div>
					</div>

					<div class="form-group row">
						<label for="lastName" class="col-sm-2 col-form-label">LastName</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="lastName"
								placeholder="Enter LastName">
						</div>
					</div>

					<div class=" form-group row">
						<label for="email" class="col-sm-2 col-form-label">Email</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="email"
								placeholder="Enter Email">
						</div>
					</div>
					
					<div class="form-group row">
						<label for="contact" class="col-sm-2 col-form-label">ContactNo</label>
						<div class="col-sm-7">
							<input type="number" class="form-control" name="contact"
								placeholder="Enter Contact Number">
						</div>
					</div>

					<div class=" form-group row">
						<label for="dob" class="col-sm-2 col-form-label">Date Of Birth</label>
						<div class="col-sm-7">
							<input type="date" class="form-control" name="dob"
								placeholder="DD-MM-YYYY">
						</div>
					</div>

					<div class="form-group row">
						<label for="password" class="col-sm-2 col-form-label">Password</label>
						<div class="col-sm-7">
							<input type="password" class="form-control" name="password"
								placeholder="Enter Password">
						</div>
					</div>
					
					<div class="form-group row">
						<label for="confirmPassword" class="col-sm-2 col-form-label">Confirm Password</label>
						<div class="col-sm-7">
							<input type="password" class="form-control" name="confirmPassword"
								placeholder="Enter Password Again">
						</div>
					</div>
					
					<button type="submit" class="btn btn-primary">Submit</button>
					<br>
					<br> <a href="Login.jsp">Back to login</a>
				</form>
			</div>
		</div>
	</div>

</body>
</html>