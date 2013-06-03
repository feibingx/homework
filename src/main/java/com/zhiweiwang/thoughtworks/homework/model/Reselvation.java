package com.zhiweiwang.thoughtworks.homework.model;

public class Reselvation{
	String hotelName;
	int rating= 0;
	int price = 0;
	
	public Reselvation(){};
	
	public Reselvation(HotelPrice hotelPrice){
		hotelName = hotelPrice.getHotelname();
		rating = hotelPrice.getRating();
	};

	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
