<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="MenuPage.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Registration Page</h1>

	<form action="SaveReg" method="post">
		<pre>
            Name<input type="text" name="name" />
            Email<input type="text" name="email" />
            Phone<input type="text" name="mobile" />
            Password<input type="text" name="password" />
            <input type="submit" value="Save" />
        </pre>
	</form>
</body>
</html>
