<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Menu Item</title>
</head>
<body>
<form action="CreateJsonOrderServlet" method="post" title="Book Order">
<label>Restaurant</label><input type="text" name="restaurant"/><br/>
<label>Restaurant Address</label><input type="text" name="restaurantAddress"/><br/>
<label>Restaurant Category</label><input type="text" name="restaurantCategory"/><br/>

<label>Item Name</label><input type="text" name="itemName"/><br/>
<label>Item Description</label><input type="text" name="itemDescription"/><br>
<label>Item Type</label><input type="text" name="itemType"/><br>
<label>Item Price</label><input type="text" name="itemPrice"/><br>


<input type="submit" value="submit" />

</form>

</body>
</html>