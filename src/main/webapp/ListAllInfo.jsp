<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<UserBean> arrayList = (ArrayList<UserBean>) request.getAttribute("listuser");
	%>

	<div class="container">
		<h1>User Data</h1>
		<div class="card">
			<div class="card-body">
				<form method="post">
					<div class="row">
						<div class="col-med-6">
							<table class="table table-hover" border="1">
								<thead>
									<tr>
										<td>Account Number</td>
										<td>FirstName</td>
										<td>LastName</td>
										<td>Email</td>
										<td>&nbsp;UserId&nbsp;</td>
									</tr>
								</thead>
								<tbody>
									<%
									for (UserBean user : arrayList) {
									%>
									<tr>
										<td><%=user.getAccNumber()%></td>
										<td><%=user.getFirstName()%></td>
										<td><%=user.getLastName()%></td>
										<td><%=user.getEmail()%></td>
										<td><%=user.getUserId()%></td>
										<%-- <td><a
							href="DbEditStudentController?studentId=<%=sb.getStudentId()%>">
								Edit </a> |<a
							href="DbDeleteStudentController?studentId=<%=sb.getStudentId()%>">Delete
						</a></td> --%>
									</tr>
									<%
									}
									%>
								</tbody>
							</table>
							<br> <br> <a href="Login.jsp">Back to login</a>
						</div>
						<!-- end of col-med-6 -->
					</div>
					<!-- end of row -->
				</form>
				<!-- end of form -->
			</div>
			<!-- end of card-body class -->
		</div>
		<!-- end of card class -->
	</div>
	<!-- end of container class -->




</body>
</html>