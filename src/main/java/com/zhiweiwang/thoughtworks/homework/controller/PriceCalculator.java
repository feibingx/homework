package com.zhiweiwang.thoughtworks.homework.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhiweiwang.thoughtworks.homework.mapper.HotelMapper;
import com.zhiweiwang.thoughtworks.homework.model.DateType;
import com.zhiweiwang.thoughtworks.homework.model.HotelPrice;
import com.zhiweiwang.thoughtworks.homework.model.Reselvation;
import com.zhiweiwang.thoughtworks.homework.model.ReselvationRequest;

@Component
public class PriceCalculator implements Calculator{

	@Autowired
	HotelMapper hotelMapper;
	
	public Collection<Reselvation> handle(ReselvationRequest rr) {
		Map<String, Reselvation> revs= new HashMap<String, Reselvation>();
		for(DateType dateType: rr.getDateList()){
			List<HotelPrice> hotelPrices = hotelMapper.getHotelsByConidtion(dateType.getWeekdayType(), rr.getCustomerType().toString());
			for(HotelPrice hotelPrice:hotelPrices){
				Reselvation rev = getReselvation(revs, hotelPrice);
				int newprice = rev.getPrice() + hotelPrice.getPrice();
				rev.setPrice(newprice);
				revs.put(hotelPrice.getHotelname(), rev);
			}
		}
		return revs.values();		
	}

	private Reselvation getReselvation(Map<String, Reselvation> revs,
			HotelPrice hotelPrice) {
		if(revs.get(hotelPrice.getHotelname())!=null){
			return revs.get(hotelPrice.getHotelname());
		}
		return new Reselvation(hotelPrice);
	}

}
