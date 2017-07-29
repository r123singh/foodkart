package com.foodvilla.menu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.foodvilla.login.User;
import com.foodvilla.restaurant.Restaurant;
import com.foodvilla.restaurant.RestaurantBean;
import com.foodvilla.sess.FoodzillaSession;

public class MenuDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;

	public static Vector<MenuItemBean> getMenuBean() {
		Vector<MenuItemBean> menuItemBeans = new Vector<MenuItemBean>();
		return menuItemBeans;

	}

	public static MenuItemBean createMenuitem(MenuItemBean menuItemBean) {
		menuItemBean.setValid(false);
		Session menuitemSession = null;
		try {
			menuitemSession = FoodzillaSession.openCurrentSession();
			MenuItem menuItem = menuItemBean.getMenuItem();
			menuitemSession.beginTransaction();
			menuitemSession.save(menuItem);
			menuitemSession.getTransaction().commit();
			menuItemBean.setValid(true);
		} catch (Exception e) {
			menuItemBean.setValid(false);
		} finally {
			FoodzillaSession.closeCurrentSession();
		}
		return menuItemBean;
	}

	public static RestaurantBean getRestaurantbyName(RestaurantBean restaurantBean) {
		Session menuitemSession = null;
		Restaurant restaurant = null;
		try {
			menuitemSession = FoodzillaSession.openCurrentSession();
			menuitemSession.beginTransaction();
			Criteria criteria = menuitemSession.createCriteria(User.class);
			criteria.add(Restrictions.eq("name", restaurantBean.getRestaurantname()));
			criteria.setMaxResults(1);
			restaurant = (Restaurant) criteria.uniqueResult();
			menuitemSession.getTransaction().commit();
			restaurantBean.setRestaurant(restaurant);
			restaurantBean.setValid(true);
		} catch (Exception e) {
			restaurantBean.setValid(false);
		} finally {
			FoodzillaSession.closeCurrentSession();
		}
		return restaurantBean;
	}

}
