package com.foodvilla.menu;

import com.foodvilla.restaurant.Restaurant;
import com.foodvilla.restaurant.RestaurantBean;

public class MenuService {

	public static MenuItemBean createMenuitem(MenuItemBean menuItemBean) {
		Restaurant restaurant = null;
		RestaurantBean restaurantBean = new RestaurantBean();
		restaurantBean.setRestaurantname(menuItemBean.getRestaurantName());
		restaurantBean = MenuDAO.getRestaurantbyName(restaurantBean);
		if (restaurantBean.isValid() && restaurantBean.getRestaurant() != null) {
			restaurant = restaurantBean.getRestaurant();
			MenuItem menuItem = new MenuItem(restaurant);
			menuItem.setDescription(menuItemBean.getItemDescription());
			menuItem.setName(menuItemBean.getItemName());
			menuItem.setPrice(menuItemBean.getItemPrice());
			menuItem.setType(menuItemBean.getType());
			menuItemBean.setMenuItem(menuItem);
			menuItemBean = MenuDAO.createMenuitem(menuItemBean);
		} else if (restaurantBean.isValid() && restaurantBean.getRestaurant() == null) {
			restaurant = new Restaurant();
			restaurant.setName(menuItemBean.getRestaurantName());
			restaurant.setCategory(menuItemBean.getRestaurantCategory());
			restaurant.setAddress(menuItemBean.getRestaurantAddress());

			MenuItem menuItem = new MenuItem(restaurant);
			menuItem.setDescription(menuItemBean.getItemDescription());
			menuItem.setName(menuItemBean.getItemName());
			menuItem.setPrice(menuItemBean.getItemPrice());
			menuItem.setType(menuItemBean.getType());
			menuItemBean.setMenuItem(menuItem);
			menuItemBean = MenuDAO.createMenuitem(menuItemBean);
		} else if (!restaurantBean.isValid()) {
			menuItemBean.setValid(false);
		}

		return menuItemBean;
	}

}
