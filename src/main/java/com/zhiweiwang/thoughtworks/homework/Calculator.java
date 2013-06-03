package com.zhiweiwang.thoughtworks.homework;

import java.util.Collection;
import com.zhiweiwang.thoughtworks.homework.model.Reselvation;
import com.zhiweiwang.thoughtworks.homework.model.ReselvationRequest;

public interface Calculator {
	public Collection<Reselvation> handle(ReselvationRequest rr);
}
