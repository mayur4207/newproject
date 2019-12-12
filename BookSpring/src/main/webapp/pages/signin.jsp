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
				<form action="signin" method="post">
					<div class="form-group">
						<label for="exampleInputPassword1">Username</label> <input
							type="text" name="username" class="form-control">
					</div>


					
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label> <input
							type="password" class="form-control" name="password">
					</div>
					

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
			<div class="col-3"></div>
		</div>
	</div>

</body>
</html>