package com.zhiweiwang.thoughtworks.homework.controller;

import java.io.IOException;

import org.springframework.stereotype.Component;
import com.zhiweiwang.thoughtworks.homework.model.CustomerType;
import com.zhiweiwang.thoughtworks.homework.model.DateType;
import com.zhiweiwang.thoughtworks.homework.model.ReselvationRequest;

@Component("inputStringParser")
public class InputStringParser implements InputHandler{

	public ReselvationRequest handle(String str) throws IOException {
		ReselvationRequest rr = new ReselvationRequest();
		rr.setCustomerType(CustomerType.valueOf(str.substring(0, str.indexOf(':')).toLowerCase()));
		for(String dt: str.substring(str.indexOf(':')+1, str.length()).split(",")){
			rr.addDate(parseDateString(dt));			
		}
		return rr;
	}

	private DateType parseDateString(String dt) {
		return DateType.valueOf(spliteDay(dt)); 
	}

	private String spliteDay(String dt) {
		return dt.substring(dt.indexOf('(')+1, dt.indexOf(')')).toLowerCase();
	}
}
