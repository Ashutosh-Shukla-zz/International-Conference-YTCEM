<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.write("<script type='text/javascript'>\n");
out.write("alert(' User name or password is Incorrect. Please Login Again ');\n");
out.write("setTimeout(function(){window.location.href='Login.jsp'},0);");
out.write("</script>\n");
%>
</body>
</html>