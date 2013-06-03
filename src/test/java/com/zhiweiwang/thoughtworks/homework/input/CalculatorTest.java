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

import com.zhiweiwang.thoughtworks.homework.Calculator;
import com.zhiweiwang.thoughtworks.homework.InputHandler;
import com.zhiweiwang.thoughtworks.homework.model.Reselvation;
import com.zhiweiwang.thoughtworks.homework.model.ReselvationRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CalculatorTest {

	@Autowired
	InputHandler inputStringParser;

	@Autowired
	Calculator priceCalculator;


	@Test
	public void test_if_env_configed_currectly() {
		assertThat(true, notNullValue());
	}

	@Test
	public void test_if_calculate_currectly() throws IOException {
		ReselvationRequest rr = inputStringParser.handle("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)");
		Collection<Reselvation> result = priceCalculator.handle(rr);
		for(Reselvation res: result){
			assertThat(res.getPrice(),is(resultMap.get(res.getHotelName())));
		}
	}
	
	private Map<String , Integer> resultMap = new HashMap<String , Integer>(){
		private static final long serialVersionUID = 2141991643345137262L;

	{
		put("Lakewook",240);
		put("Bridgewood",270);
		put("Ridgewood",240);
	}};
	
}
