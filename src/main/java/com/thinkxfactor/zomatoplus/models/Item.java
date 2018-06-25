package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

public class Item implements Serializable {
	private String MenuItem;
	private float ItemPrice;
	
	public Item() {
		
	}
	
	public Item(String MenuItem, float ItemPrice) {
		this.MenuItem = MenuItem;
		this.ItemPrice = ItemPrice;
	}

	public String getMenuItem() {
		return MenuItem;
	}

	public void setMenuItem(String menuItem) {
		MenuItem = menuItem;
	}

	public float getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(float itemPrice) {
		ItemPrice = itemPrice;
	}
	
}
