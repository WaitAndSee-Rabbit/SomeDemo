<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="login" method="post">
			<input type="text" name="command.username"></input>
			<input type="text" name="command.password"></input>
				<br/>
			 <input type="submit" value="SUBMIT" />
		</form>
	</div>
	
	<div>
		<form action="login1" method="get">
			<input type="text" name="name"></input>
				<br/>
			 <input type="submit" value="SUBMIT" />
		</form>
	</div>
	
	
</body>
</html>