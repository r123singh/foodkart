package com.foodvilla.restaurant;

import org.hibernate.Session;

import com.foodvilla.sess.FoodzillaSession;

public class RestaurantDAO {

	public RestaurantBean createrestaurant(RestaurantBean restaurantBean) {
		try {
			Session newrestaurantcreateSession=FoodzillaSession.openCurrentSession();
			newrestaurantcreateSession.beginTransaction();
			newrestaurantcreateSession.save(restaurantBean.getRestaurant());
			newrestaurantcreateSession.getTransaction().commit();
			restaurantBean.setValid(true);
		} catch (Exception e) {
			restaurantBean.setValid(false);
			restaurantBean.setErrormessage(e.getLocalizedMessage());
		}finally{
			FoodzillaSession.closeCurrentSession();
		}
		return restaurantBean;
	}

}
