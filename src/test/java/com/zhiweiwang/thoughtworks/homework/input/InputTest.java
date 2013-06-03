package com.zhiweiwang.thoughtworks.homework.input;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import java.io.IOException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiweiwang.thoughtworks.homework.InputHandler;
import com.zhiweiwang.thoughtworks.homework.model.DateType;
import com.zhiweiwang.thoughtworks.homework.model.ReselvationRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class InputTest {

	@Autowired
	InputHandler inputStringParser;
	
	@Test
	public void test_if_env_configed_currectly() {
		assertThat(true, notNullValue());
	}
	
	@Test
	public void test_if_parse_date_currectly() throws IOException{
		testParseString("Regular: 21Mar2009(sat), 22Mar2009(sun)","regular", "weekend");
		testParseString("Rewards: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)","rewards", "weekday");
	}

	private void testParseString(String sting2parse, String custom, String dateType) throws IOException{
		ReselvationRequest result = inputStringParser.handle(sting2parse);
		assertThat(result.getCustomerType().toString(), is(custom));
		for(DateType date: result.getDateList())
			assertThat(date.getWeekdayType(), is(dateType));
	}
}
