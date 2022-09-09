<%@page import="com.cb.model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String arr[] = {"Vikas","Mohan","Shyam","Meena","Rajesh"};

	ArrayList<Employee> list = new ArrayList();
	list.add(new Employee("Vikas",23,34500));
	list.add(new Employee("Gopal",21,24500));
	list.add(new Employee("Mahesh",24,35500));
	list.add(new Employee("Vijay",26,36600));
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Data Show</h1>
		
		<table border="1" cellpadding="5" cellspacing="5">
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Salary</th>
			</tr>
			<% for(Employee emp : list) { %>
				<tr>
					<td><%=emp.getName()%></td>
					<td><%=emp.getAge()%></td>
					<td><%=emp.getSalary()%></td>
				</tr>
			<%}%>
		</table>
		
		<hr>
		<ol>
			<% for(String str  : arr)
			{
				out.write("<li>" + str + "</li>");
			} %>
		</ol>
		
		<ol>
			<% for(String str  : arr){%>
				<li><%=str%></li>
			<% } %>
		</ol>
</body>
</html>