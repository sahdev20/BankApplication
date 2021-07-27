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
		<h1>Create/Forgot User Id</h1>
		<div class="card">
			<div class="card-body">
				<form method="post" action="CreateForgotUserIdFilter">

					<div class="form-group row">
						<label class="col-sm-2 col-form-label">Account Number</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="accNumber" placeholder="Enter Account Number"> 
							${accNumberError }
						</div>
					</div>

					<div class="form-group row">
						<label class="col-sm-2 col-form-label">Date Of Birth</label>
						<div class="col-sm-7">
							<input type="date" class="form-control" name="dob" placeholder="DD-MM-YYYY"> 
							${dobError }
						</div>
					</div>
					<button type="submit" class="btn btn-primary">SUBMIT</button>
					<br>
					<br> <a href="Login.jsp">Back to login</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>