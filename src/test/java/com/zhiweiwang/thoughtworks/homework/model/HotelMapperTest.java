package com.zhiweiwang.thoughtworks.homework.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import com.zhiweiwang.thoughtworks.homework.mapper.HotelMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class HotelMapperTest {

	@Autowired
	HotelMapper hotelMapper;

	@Test
	public void test_if_init_date_is_currect() {
		List<HotelPrice> hotelList = hotelMapper.getHotelsByConidtion(DateType.sat.getWeekdayType(), CustomerType.regular.toString());

		for (HotelPrice hotelPrice : hotelList) {
			assertThat(hotelPrice.getPrice(), is(getHotelPrice(hotelPrice.getHotelname())));
		}
	}

	private int getHotelPrice(String hotelname) {
		return prices.get(hotelname);
	}

	private Map<String, Integer> prices = new HashMap<String, Integer>() {
		private static final long serialVersionUID = -1963038800899437675L;
		{
			put("Lakewook", 90);
			put("Bridgewood", 60);
			put("Ridgewood", 150);
		}
	};
}
