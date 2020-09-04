package com.neusoft.Dao;

import com.neusoft.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface IUserDao {
   //查询所有，基于注解的mybatis
   @Select("select * from user")
   List<User> findAll();
}
