<%@page import="com.cb.model.EmpData"%>
<%@page import="java.util.List"%>
<%@page import="com.cb.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	EmployeeDao dao = new EmployeeDao();
	List<EmpData> list = dao.list();
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Employee Records</h1>
		<table align='center' border='1' cellpadding='10' cellspacing='5'>
			<tr>
				<th>Emp ID</th>
				<th>Name</th>
				<th>Phone</th>
				<th>Email</th>
				<th>City</th>
				<th>Salary</th>
			</tr>
			<% for(EmpData emp : list) { %>
				<tr>
					<td><%=emp.getId()%></td>
					<td><%=emp.getName()%></td>
					<td><%=emp.getPhone()%></td>
					<td><%=emp.getEmail()%></td>
					<td><%=emp.getCity()%></td>
					<td><%=emp.getSalary()%></td>
				</tr>
			<%} %>
		</table>
		
		<button onclick="load()">Load Data</button>
		<h1>Employee Records</h1>
		<table align='center' border='1' cellpadding='10' cellspacing='5'>
		<thead>
			<tr>
				<th>Emp ID</th>
				<th>Name</th>
				<th>Phone</th>
				<th>Email</th>
				<th>City</th>
				<th>Salary</th>
			</tr>
			</thead>
			<tbody id='tb'>

			</tbody>
		</table>
</body>

<script>
	function load()
	{
		var tb = document.getElementById('tb');
		var req = new XMLHttpRequest(); 
		// 0:Object Create 1:init 2:request send 3:running 4:response come
		//alert(req.readyState);
		
		req.open("GET","empdata");
		//alert(req.readyState);
		
		req.onreadystatechange = function()
		{
			if(req.readyState==4){
				var obj = JSON.parse(req.responseText);
				for(var ob of obj)
				{
					var tr = document.createElement('tr');
					
					var td1 = document.createElement('td'); td1.innerHTML = ob.id;
					var td2 = document.createElement('td'); td2.innerHTML = ob.name;
					var td3 = document.createElement('td'); td3.innerHTML = ob.phone;
					var td4 = document.createElement('td'); td4.innerHTML = ob.email;
					var td5 = document.createElement('td'); td5.innerHTML = ob.city;
					var td6 = document.createElement('td'); td6.innerHTML = ob.salary;
					
					tr.appendChild(td1);
					tr.appendChild(td2);
					tr.appendChild(td3);
					tr.appendChild(td4);
					tr.appendChild(td5);
					tr.appendChild(td6);
					tb.appendChild(tr);
				}
			}
		}
		
		req.send();
	}
</script>

</html>