package com.foodvilla.orders;

import java.util.List;
import java.util.Vector;

public class OrderService {

	private static final String ORDER_CREATED = "NEW_ORDER";
	private static final int ALL_ORDER_ITEM_UNIQUE = 2;

	public static OrdersBean createOrder(OrdersBean orderBean) {

		FoodOrder foodOrder = new FoodOrder();

		foodOrder.setDeliveryAddress(orderBean.getDeliveryAddress());
		foodOrder.setRestaurantName(orderBean.getRestaurantName());
		foodOrder.setRestaurantAddress(orderBean.getRestaurantAddress());
		foodOrder.setTotalPrice(orderBean.getTotalPrice());
		foodOrder.setTotalTax(orderBean.getTotalTax());
		foodOrder.setStatus(ORDER_CREATED);

		OrderItemsBeans orderItemsBeans = orderBean.getOrderItems();

		int uniqueallorderItemid = generateUniqueAllitemId();
		orderItemsBeans.setAllorderItemsid(uniqueallorderItemid);
		orderItemsBeans = createorderItems(foodOrder, orderItemsBeans);
		if (orderItemsBeans.isValid()) {
			orderBean.setValid(true);
		} else {
			orderBean.setValid(false);
		}
		return orderBean;
	}

	private static int generateUniqueAllitemId() {
		// GENERATING UNIQUE ID ONLY FOR ALL ITEMS COMBINED IN AN ORDER
		return ALL_ORDER_ITEM_UNIQUE;
	}

	public static OrderItemsBeans createorderItems(FoodOrder foodOrder, OrderItemsBeans orderItemsBeans) {

		Vector<OrderItemBean> orderItemBeans = orderItemsBeans.getOrderItems();
		for (OrderItemBean orderItemBean : orderItemBeans) {
			orderItemBean.setAllorderitemsid(orderItemsBeans.getAllorderItemsid());
			orderItemBean = OrderDAO.createOrderitem(orderItemBean, foodOrder);
			if (!orderItemBean.isValid()) {
				orderItemsBeans.setValid(false);
				break;
			} else {
				orderItemsBeans.setValid(true);
			}
		}
		return orderItemsBeans;
	}

	public static OrdersBean getorders() {
		OrdersBean ordersBean = new OrdersBean();
		ordersBean = OrderDAO.getallOrders(ordersBean);
		return ordersBean;
	}

	public static OrderListBean fetchallOrders(OrderListBean orderListBean) {
		FoodOrdersBean foodOrdersBean = new FoodOrdersBean();
		foodOrdersBean.setValid(false);
		Vector<OrdersBean> orderlistVector = null;
		foodOrdersBean = OrderDAO.fetchallOrders(foodOrdersBean);
		if (foodOrdersBean.isValid() && foodOrdersBean.getFoodOrders() != null) {
			List<FoodOrder> foodOrders = foodOrdersBean.getFoodOrders();
			orderlistVector = new Vector<OrdersBean>();
			for (FoodOrder foodOrder : foodOrders) {
				OrdersBean ordersBean = new OrdersBean();
				ordersBean.setOrderId(foodOrder.getOrderid());
				ordersBean.setDeliveryAddress(foodOrder.getDeliveryAddress());
				ordersBean.setRestaurantAddress(foodOrder.getRestaurantAddress());
				ordersBean.setRestaurantName(foodOrder.getRestaurantName());
				ordersBean.setStatus(foodOrder.getStatus());
				ordersBean.setTotalPrice(foodOrder.getTotalPrice());
				ordersBean.setTotalTax(foodOrder.getTotalTax());
				ordersBean.setOrderdate(foodOrder.getOrderDate());
				ordersBean.setValid(false);
				ordersBean = OrderDAO.fetchallOrderitems(ordersBean);
				if (!ordersBean.getOrderItems().isValid()) {
					ordersBean.setValid(false);
				} else {
					ordersBean.setValid(true);
				}
				orderlistVector.add(ordersBean);
			}
		}
		orderListBean.setOrderlistVector(orderlistVector);

		return orderListBean;
	}

}
