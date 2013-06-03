package com.zhiweiwang.thoughtworks.homework.controller;

import java.io.IOException;
import com.zhiweiwang.thoughtworks.homework.model.ReselvationRequest;

public interface InputHandler{
	public ReselvationRequest handle(String str) throws IOException;
}
