package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {

	public static void main(String[] args) throws ParseException {
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testModifyMenuItem();
		testGetMenuItem();
	}

	static void testGetMenuItemListAdmin() {
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		// it also prints directly all the list items
		List<MenuItem> menuItems = menuItemDaoCollectionImpl
				.getMenuItemListAdmin();
		for (MenuItem menuItem : menuItems) {
			System.out.println(menuItem.toString());
		}
		System.out.println();
	}

	static void testGetMenuItemListCustomer() {
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		System.out.println("Menu Item List Customer");
		List<MenuItem> menuItems = menuItemDaoCollectionImpl
				.getMenuItemListCustomer();
		for (MenuItem menuItem : menuItems) {
			System.out.println(menuItem.toString());
		}
		System.out.println();
	}

	static void testModifyMenuItem() throws ParseException {
		MenuItem menuItem = new MenuItem(000002, "Cake", 80.00f, true,
				DateUtil.convertToDate("11/12/2017"), "Snack", false);

		MenuItemDaoCollectionImpl menuItemCollectiomImpl = new MenuItemDaoCollectionImpl();

		MenuItemDao menuItemDao = menuItemCollectiomImpl;

		menuItemDao.modifyMenuItem(menuItem);
		System.out.println("Modified Menu Item2 Details are :\n"
				+ menuItemDao.getMenuItem(2));
		System.out.println();

	}

	static void testGetMenuItem() {
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		MenuItemDao menuItemDao = menuItemDaoCollectionImpl;
		System.out.println("Required MenuItem with id=2 :");
		System.out.println(menuItemDao.getMenuItem(2));
	}
}
