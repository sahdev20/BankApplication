<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- <form action="SignupController" method="post">
	<include page="SignupForm.css" >
		<div class="container">
			<h1>Register</h1>
			<p>Please fill in this form to create an account.</p>
			<hr>

			<label for="email"><b>Email</b></label> 
			<input type="text" placeholder="Enter Email" name="email" id="email" required>
			
			<label for="psw"><b>Password</b></label> 
			<input type="password" placeholder="Enter Password" name="psw" id="psw" required> 
			
			<label for="psw-repeat"><b>Repeat Password</b></label> 
			<input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>
			<hr>
			<p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
			<button type="submit" class="registerbtn">Register</button>
		</div>

		<div class="container signin">
			<p>Already have an account? <a href="#">Sign in</a>.</p>
		</div>
	</form> -->

	<!-- Modal -->
	<include page="SignupForm.css">
	<div class="modal fade" id="elegantModalForm" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<!--Content-->
			<div class="modal-content form-elegant">
				<!--Header-->
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 dark-grey-text font-weight-bold my-3"
						id="myModalLabel">
						<strong>Sign in</strong>
					</h3>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<!--Body-->
				<div class="modal-body mx-4">
					<!--Body-->
					<div class="md-form mb-5">
						<input type="email" id="Form-email1" class="form-control validate">
						<label data-error="wrong" data-success="right" for="Form-email1">Your
							email</label>
					</div>

					<div class="md-form pb-3">
						<input type="password" id="Form-pass1"
							class="form-control validate"> <label data-error="wrong"
							data-success="right" for="Form-pass1">Your password</label>
						<p class="font-small blue-text d-flex justify-content-end">
							Forgot <a href="#" class="blue-text ml-1"> Password?</a>
						</p>
					</div>

					<div class="text-center mb-3">
						<button type="button"
							class="btn blue-gradient btn-block btn-rounded z-depth-1a">Sign
							in</button>
					</div>
					<p
						class="font-small dark-grey-text text-right d-flex justify-content-center mb-3 pt-2">
						or Sign in with:</p>

					<div class="row my-3 d-flex justify-content-center">
						<!--Facebook-->
						<button type="button"
							class="btn btn-white btn-rounded mr-md-3 z-depth-1a">
							<i class="fab fa-facebook-f text-center"></i>
						</button>
						<!--Twitter-->
						<button type="button"
							class="btn btn-white btn-rounded mr-md-3 z-depth-1a">
							<i class="fab fa-twitter"></i>
						</button>
						<!--Google +-->
						<button type="button" class="btn btn-white btn-rounded z-depth-1a">
							<i class="fab fa-google-plus-g"></i>
						</button>
					</div>
				</div>
				<!--Footer-->
				<div class="modal-footer mx-5 pt-3 mb-1">
					<p class="font-small grey-text d-flex justify-content-end">
						Not a member? <a href="#" class="blue-text ml-1"> Sign Up</a>
					</p>
				</div>
			</div>
			<!--/.Content-->
		</div>
	</div>
	<!-- Modal -->

	<div class="text-center">
		<a href="" class="btn btn-default btn-rounded" data-toggle="modal"
			data-target="#elegantModalForm">Launch modal Login Form</a>
	</div>
</body>
</html>