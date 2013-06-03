package com.zhiweiwang.thoughtworks.homework.controller;

import java.util.Collection;

import com.zhiweiwang.thoughtworks.homework.model.HotelPrice;
import com.zhiweiwang.thoughtworks.homework.model.Reselvation;

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
