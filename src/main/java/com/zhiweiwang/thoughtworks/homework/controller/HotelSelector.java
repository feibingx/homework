package com.zhiweiwang.thoughtworks.homework.controller;

import java.util.Collection;
import org.springframework.stereotype.Component;

import com.zhiweiwang.thoughtworks.homework.Selector;
import com.zhiweiwang.thoughtworks.homework.model.Reselvation;

@Component
public class HotelSelector implements Selector {

	public String selectHotel(Collection<Reselvation> reselvations) {
		Reselvation reselvation = null;
		for (Reselvation revs : reselvations) {
			reselvation = compare(reselvation, revs);
		}
		return reselvation.getHotelName();
	}

	private Reselvation compare(Reselvation reselvation, Reselvation revs) {
		if (reselvation == null) {
			return revs;
		}
		if (reselvation.getPrice() > revs.getPrice()) {
			return revs;
		} else if (reselvation.getPrice() < revs.getPrice()) {
			return reselvation;
		} else {
			if (reselvation.getRating() > revs.getRating())
				return reselvation;
			else
				return revs;
		}
	}

}
