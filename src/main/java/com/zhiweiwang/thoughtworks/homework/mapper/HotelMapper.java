package com.zhiweiwang.thoughtworks.homework.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.zhiweiwang.thoughtworks.homework.model.HotelPrice;

public interface HotelMapper {

	@Select("select * FROM hotel WHERE dateCondition = #{dateCondition} and customCondition =#{customCondition}")
	List<HotelPrice> getHotelsByConidtion(@Param("dateCondition") String dateCondition,@Param("customCondition") String customCondition);
}