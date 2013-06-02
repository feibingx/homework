package com.zhiweiwang.thoughtworks.homework.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zhiweiwang.thoughtworks.homework.model.Hotel;

public interface HotelMapper {

	@Select("select * FROM hotel WHERE dateCondition = #{dateCondition} and customCondition =#{customCondition}")
	List<Hotel> getHotelsByConidtion(@Param("dateCondition") String dateCondition,@Param("customCondition") String customCondition);

//	@Insert("insert into dt_users(username, passwd, email) values (#{username},#{passwd},#{email})")
//	void insertRow(@Param("username") String username, @Param("passwd") String passwd, @Param("email") String email);
//
////	@Insert("insert into dt_users(username, passwd, email) values (#{username},#{passwd},#{email})")
////	void insertRow(Map<String, Object> map);
//	
//	@Select("select * FROM dt_users WHERE username = #{username}")
//	Hotel get_user(String username);
//
//	@Select("select * FROM dt_users WHERE id = #{id}")
//	Hotel get_userById(int id);
//
//	@Update("update dt_users set passwd=#{passwd} where username=#{username}")
//	void updatPasswd(@Param("username") String username, @Param("passwd") String passwd);
//	
//	@Update("update dt_users set role=#{role} where username=#{username}")
//	void updatRole(@Param("username") String username, @Param("role") String role);
}