<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-3"></div>
			<div class="col-6">
				<form action="signup" method="post">
					<div class="form-group">
						<label for="exampleInputPassword1">Username</label> <input
							type="text" name="username" class="form-control">
					</div>


					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							type="email" class="form-control" name="email">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label> <input
							type="password" class="form-control" name="password">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Mobile No.</label> <input
							type="text" class="form-control" name="mobile">
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
			<div class="col-3"></div>
		</div>
	</div>
</body>
</html>