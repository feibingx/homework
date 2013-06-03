package com.zhiweiwang.thoughtworks.homework.model;

import java.util.ArrayList;
import java.util.List;


public class ReselvationRequest {

	private CustomerType customerType;
	private List<DateType> dateList = new ArrayList<DateType>();

	public List<DateType> getDateList() {
		return dateList ;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public void addDate(DateType datetype) {
		dateList.add(datetype);
	}



}
