package com.zhiweiwang.thoughtworks.homework.model;

public class HotelPrice {

	int id;
	String hotelname;
	String datecondition;
	String customcondition;
	int price;
	int rating;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getDatecondition() {
		return datecondition;
	}
	public void setDatecondition(String datecondition) {
		this.datecondition = datecondition;
	}
	public String getCustomcondition() {
		return customcondition;
	}
	public void setCustomcondition(String customcondition) {
		this.customcondition = customcondition;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}