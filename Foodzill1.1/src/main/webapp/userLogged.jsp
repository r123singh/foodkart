<%@page import="com.foodvilla.login.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/marketing.css"
	type="text/css" rel="stylesheet" />
<title>HomePage</title>
</head>
<body>

	<center>
		<%
			UserBean currenUserBean = ((UserBean) (session.getAttribute("currentSessionUser")));
		%>

		Welcome
		<%=currenUserBean.getFirstName() + " " + currenUserBean.getLastName()%>
	</center>

	<a href="addMenuitem.jsp">Add Menu Items</a>
	<a href="ordersRequest.jsp">Add Orders</a>
	<a href="viewAllOrders.jsp">View Orders</a>

</body>
</html>