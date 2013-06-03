package com.zhiweiwang.thoughtworks.homework.input;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiweiwang.thoughtworks.homework.Selector;
import com.zhiweiwang.thoughtworks.homework.model.Reselvation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SelectorTest {

	@Autowired
	Selector hotelSelector;

	@Test
	public void test_if_selected_the_best_hotel_currectly() throws IOException {
		assertThat(hotelSelector.selectHotel(getParperedDate()), is("Bridgewood"));
	}

	private Collection<Reselvation> getParperedDate() {
		ArrayList<Reselvation> revs = new ArrayList<Reselvation>();
		revs.add(buildReslvation("Lakewook", 4, 250));
		revs.add(buildReslvation("Bridgewood", 5, 250));
		revs.add(buildReslvation("Ridgewood", 5, 260));
		return revs;
	}

	private Reselvation buildReslvation(String name, int rating, int price) {
		Reselvation res = new Reselvation();
		res.setHotelName(name);
		res.setPrice(price);
		res.setRating(rating);
		return res;
	}
}
