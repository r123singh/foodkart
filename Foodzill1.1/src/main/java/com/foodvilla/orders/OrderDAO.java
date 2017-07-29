package com.foodvilla.orders;

import java.util.List;
import java.util.Vector;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.foodvilla.sess.FoodzillaSession;

public class OrderDAO {

	public static OrderItemBean createOrderitem(OrderItemBean orderItemBean, FoodOrder foodOrder) {
		try {
			Session orderCreationSession = FoodzillaSession.openCurrentSession();

			orderCreationSession.beginTransaction();

			Orderitem orderitem = new Orderitem(foodOrder);

			orderitem.setDescription(orderItemBean.getItemDescription());
			orderitem.setOrderitemsid(orderItemBean.getAllorderitemsid());
			orderitem.setName(orderItemBean.getItemName());
			orderitem.setRemarks(orderItemBean.getItemRemarks());
			orderitem.setPrice(orderItemBean.getItemPrice());
			orderitem.setQunatity(orderItemBean.getItemQuantity());

			orderCreationSession.save(orderitem);
			orderCreationSession.getTransaction().commit();
			System.out.println("item saved");
			orderItemBean.setValid(true);
		} catch (Exception e) {
			System.out.println("item not saved");
			System.out.println(e.getLocalizedMessage());
			orderItemBean.setValid(false);
		} finally {
			FoodzillaSession.closeCurrentSession();
		}

		return orderItemBean;
	}

	public static OrdersBean createNewOrder(OrdersBean ordersBean) {
		try {
			Session orderCreationSession = FoodzillaSession.openCurrentSession();
			orderCreationSession.getTransaction().begin();
			FoodOrder foodOrder = new FoodOrder();
			foodOrder.setDeliveryAddress(ordersBean.getDeliveryAddress());
			foodOrder.setRestaurantName(ordersBean.getRestaurantName());
			foodOrder.setRestaurantAddress(ordersBean.getRestaurantAddress());
			foodOrder.setTotalPrice(ordersBean.getTotalPrice());
			foodOrder.setTotalTax(ordersBean.getTotalTax());
			foodOrder.setStatus(ordersBean.getStatus());
			Long orderId = (Long) orderCreationSession.save(foodOrder);
			orderCreationSession.getTransaction().commit();
			ordersBean.setOrderId(orderId);
			ordersBean.setValid(true);

		} catch (Exception e) {
			ordersBean.setValid(false);
		} finally {
			FoodzillaSession.closeCurrentSession();
		}
		return ordersBean;
	}

	public static NewOrderBean getNewOrder(NewOrderBean newOrderBean) {
		FoodOrder foodOrder = null;
		try {
			Session orderSession = FoodzillaSession.openCurrentSession();
			foodOrder = (FoodOrder) orderSession.get(FoodOrder.class, newOrderBean.getOrderid());
			newOrderBean.setFoodOrder(foodOrder);
			newOrderBean.setValid(true);
		} catch (Exception e) {
			newOrderBean.setValid(false);
		} finally {
			FoodzillaSession.closeCurrentSession();
		}
		return newOrderBean;
	}

	public static OrdersBean getallOrders(OrdersBean ordersBean) {
		// TODO Auto-generated method stub
		try {
			Session orderSession = FoodzillaSession.openCurrentSession();
			org.hibernate.Query query = orderSession.createQuery("from foodorder");
			List<FoodOrder> orders = (List<FoodOrder>) query.setMaxResults(1);
			for (FoodOrder order : orders) {
				ordersBean.setFoodOrder(order);
			}
			ordersBean.setValid(true);
		} catch (Exception e) {
			ordersBean.setValid(false);
		} finally {
			FoodzillaSession.closeCurrentSession();
		}
		return ordersBean;
	}

	public static FoodOrdersBean fetchallOrders(FoodOrdersBean foodOrdersBean) {
		List<FoodOrder> foodOrders = null;
		try {
			Session fetchOrdersSession = FoodzillaSession.openCurrentSession();
			foodOrders = ((List<FoodOrder>) fetchOrdersSession.createCriteria(FoodOrder.class).list());
			if (foodOrders != null) {
				foodOrdersBean.setFoodOrders(foodOrders);
				foodOrdersBean.setValid(true);
			}
		} catch (Exception e) {
			foodOrdersBean.setValid(false);
		} finally {
			FoodzillaSession.closeCurrentSession();
		}
		return foodOrdersBean;
	}

	public static OrdersBean fetchallOrderitems(OrdersBean ordersBean) {
		// TODO Auto-generated method stub
		OrderItemsBeans orderItemsBeans = null;
		Vector<OrderItemBean> orderItemBean = null;
		try {
			orderItemsBeans = new OrderItemsBeans();
			Session fetchItemSession = FoodzillaSession.openCurrentSession();
			Criteria criteria = fetchItemSession.createCriteria(Orderitem.class);
			criteria.add(Restrictions.eq("order_id", ordersBean.getOrderId()));
			List<Orderitem> orderitems = criteria.list();
			if (orderitems != null) {
				orderItemBean = new Vector<OrderItemBean>();
				for (Orderitem orderitem : orderitems) {
					OrderItemBean itemBean = new OrderItemBean();
					itemBean.setItemName(orderitem.getName());
					itemBean.setItemPrice(orderitem.getPrice());
					itemBean.setItemDescription(orderitem.getDescription());
					itemBean.setItemQuantity(orderitem.getQunatity());
					itemBean.setItemRemarks(orderitem.getRemarks());
					itemBean.setOrderItemid(orderitem.getOrderitemid());
					orderItemBean.add(itemBean);
				}
				orderItemsBeans.setOrderItems(orderItemBean);
				orderItemsBeans.setValid(true);
				ordersBean.setOrderItems(orderItemsBeans);
			}

		} catch (Exception e) {
			orderItemsBeans.setValid(false);
			ordersBean.setOrderItems(orderItemsBeans);
		} finally {
			FoodzillaSession.closeCurrentSession();
		}
		return ordersBean;
	}
}
