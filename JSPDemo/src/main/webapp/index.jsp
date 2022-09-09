<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Pataa Navigation Home Page</h1>
	
	<% 
		int num = 100;
	 out.write("Value : " + value);
	    
	   out.write(hello());
	%>
	
	<%!
		int value = 232;
	
		//out.write("Value : " + value);
		int z = value * 10;
		private String hello(){
			return "Good Morning !";
		}
	%>
	<hr>
	<% 	   
	out.write("Num : " + num);
	 out.write(hello());
	%>
	<hr>
	
	<b>Num : <% out.write(num+"");%></b> <br>
	
	<b>Num : <%=num*10%></b>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>