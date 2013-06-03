package com.zhiweiwang.thoughtworks.homework.input;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiweiwang.thoughtworks.homework.controller.Calculator;
import com.zhiweiwang.thoughtworks.homework.controller.InputHandler;
import com.zhiweiwang.thoughtworks.homework.controller.Selector;
import com.zhiweiwang.thoughtworks.homework.model.HotelPrice;
import com.zhiweiwang.thoughtworks.homework.model.Reselvation;
import com.zhiweiwang.thoughtworks.homework.model.ReselvationRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SelectorTest {

	@Autowired
	Selector hotelSelector;

	@Test
	public void test_if_selected_the_best_hotel_currectly() throws IOException {
		String hotelPrice = hotelSelector.selectHotel(getParperedDate());
	}

	private Collection<Reselvation> getParperedDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
