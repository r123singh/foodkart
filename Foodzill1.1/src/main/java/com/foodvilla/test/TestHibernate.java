package com.foodvilla.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.foodvilla.orders.FoodOrder;
import com.foodvilla.orders.Orderitem;

public class TestHibernate {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

		String restaurant = "restaurantName";
		String restaurantAddress = "restaurantAddress";
		String deliveryAddress = "deliveryAddress";
		Double totalprice = new Double(0);
		Double totaltax = new Double(0);
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setDeliveryAddress(deliveryAddress);
		foodOrder.setRestaurantAddress(restaurantAddress);
		foodOrder.setStatus("ORER");
		foodOrder.setTotalPrice(totalprice);
		foodOrder.setTotalTax(totaltax);
		foodOrder.setRestaurantName(restaurant);

		String itemName = "name";
		String description = "description";
		int qunatity = 2;
		String remarks = "remarks";
		double price = 0;
		Orderitem orderitem=new Orderitem();
		orderitem.setDescription(description);
		orderitem.setName(itemName);
		orderitem.setOrder(foodOrder);
		orderitem.setQunatity(qunatity);
		orderitem.setRemarks(remarks);
		orderitem.setPrice(price);
		orderitem.setOrderitemsid(1);
		
		// obtains the session
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(orderitem);
		
		session.getTransaction().commit();
		session.close();
		
		
	}

}
