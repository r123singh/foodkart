package com.foodvilla.restaurant;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class RestaurantService {

	public static RestaurantBean createnewrestaurantobject(RestaurantBean restaurantBean) {
		RestaurantDAO restaurantdao = null;
		Restaurant restaurant = null;
		try {
			restaurantdao = new RestaurantDAO();
			restaurant = new Restaurant();
			restaurant.setAddress(restaurantBean.getRestaurantaddress());
			restaurant.setCategory(restaurantBean.getRestaurantfoodcategory());
			SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
			java.util.Date restaurantclosetime = dateFormat.parse(restaurantBean.getRestaurantstarttime());
			java.util.Date restaurantstarttime = dateFormat.parse(restaurantBean.getRestaurantstarttime());
			Date sqlrestaurantstarttime = new Date(restaurantstarttime.getTime());
			Date sqlrestaurantclosetime = new Date(restaurantclosetime.getTime());
			restaurant.setClosetime(sqlrestaurantclosetime);
			restaurant.setStarttime(sqlrestaurantstarttime);
			restaurant.setCreated(new Date(System.currentTimeMillis()));
			restaurant.setDeliverycharges(Double.parseDouble(restaurantBean.getRestaurantdeliverycharges()));
			restaurant.setEsitmatedtime(Integer.parseInt(restaurantBean.getRestaurantestimateddeliverytime()));
			restaurant.setLocation(restaurantBean.getRestaurantlocation());
			restaurant.setMinimumordercharges(Double.parseDouble(restaurantBean.getRestaurantminimumordercharges()));
			restaurant.setName(restaurantBean.getRestaurantname());
			restaurant.setPaymentmode(restaurantBean.getRestaurantpaymentmode());
			restaurant.setFoodcategory(restaurantBean.getRestaurantfoodcategory());
			restaurantBean.setRestaurant(restaurant);
			restaurantBean = restaurantdao.createrestaurant(restaurantBean);
		} catch (Exception e) {
			restaurantBean.setValid(false);
			restaurantBean.setErrormessage(e.getLocalizedMessage());
		}

		return restaurantBean;
	}
}
