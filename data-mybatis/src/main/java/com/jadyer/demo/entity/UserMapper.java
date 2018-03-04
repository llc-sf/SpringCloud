package com.jadyer.demo.entity;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM t_USER WHERE t_NAME = #{name}")
    User findByName(@Param("name") String name);

    //使用@Param
    @Insert("INSERT INTO t_USER(t_NAME, t_AGE) VALUES(#{name}, #{age1})")
    int insert(@Param("name") String name, @Param("age1") Integer age);

    //使用map
    //Map<String, Object> map = new HashMap<>();
    //map.put("name", "CCC");
    //map.put("age", 40);
    //userMapper.insertByMap(map);
    @Insert("INSERT INTO t_USER(t_NAME, t_AGE) VALUES(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);


    //使用对象
    @Insert("INSERT INTO t_USER(t_NAME, t_AGE) VALUES(#{name}, #{age})")
    int insertByUser(User user);
}
