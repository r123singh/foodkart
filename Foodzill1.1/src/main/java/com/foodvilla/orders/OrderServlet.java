package com.foodvilla.orders;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class OrderServlet
 */
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			StringBuffer orderStringBuffer = new StringBuffer();
			BufferedReader orderBufferedReader = request.getReader();
			String line = null;
			while ((line = orderBufferedReader.readLine()) != null) {
				orderStringBuffer.append(line);
			}
			System.out.println(orderStringBuffer.toString());
			JSONObject finalOrderJson = new JSONObject(orderStringBuffer.toString());
			int orderid = finalOrderJson.getInt("id");
			JSONObject orderJson = finalOrderJson.getJSONObject("order");
			String restaurant = orderJson.getString("restaurantName");
			String restaurantAddress = orderJson.getString("restaurantAddress");
			String deliveryAddress = orderJson.getString("deliveryAddressline1");
			Double totalprice = orderJson.getDouble("totalcharges");
			Double totaltax = orderJson.getDouble("taxcharges");
			Vector<OrderItemBean> orderitemsVector = new Vector<OrderItemBean>();
			JSONArray orderitems = orderJson.getJSONArray("orderitems");
			for (int i = 0; i < orderitems.length(); i++) {
				JSONObject orderitemJsonObject = orderitems.getJSONObject(i);
				OrderItemBean orderItemBean = new OrderItemBean();
				String itemName = orderitemJsonObject.getString("name");
				int qunatity = orderitemJsonObject.getInt("qunatity");
				String remarks = orderitemJsonObject.getString("specialinstructions");
				double price = orderitemJsonObject.getDouble("price");
				orderItemBean.setItemName(itemName);
				orderItemBean.setItemDescription("testdescription");
				orderItemBean.setItemQuantity(qunatity);
				orderItemBean.setItemRemarks(remarks);
				orderItemBean.setItemPrice(price);
				orderItemBean.setOrderItemid(1);
				orderitemsVector.add(orderItemBean);
			}
			OrderItemsBeans allitemsItemsBeans = new OrderItemsBeans();
			allitemsItemsBeans.setOrderItems(orderitemsVector);
			OrdersBean orderBean = new OrdersBean();
			orderBean.setOrderId(orderid);
			orderBean.setOrderItems(allitemsItemsBeans);
			orderBean.setDeliveryAddress(deliveryAddress);
			orderBean.setRestaurantAddress(restaurantAddress);
			orderBean.setTotalPrice(totalprice);
			orderBean.setTotalTax(totaltax);
			orderBean.setRestaurantName(restaurant);

			orderBean = OrderService.createOrder(orderBean);
			if (orderBean.isValid()) {
				response.sendRedirect("orderSuccess.jsp");
			} else {
				response.sendRedirect("orderFailure.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
