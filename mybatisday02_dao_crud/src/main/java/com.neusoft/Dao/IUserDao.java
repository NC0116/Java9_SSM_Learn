package com.neusoft.Dao;

import com.neusoft.domain.User;

import java.util.Date;
import java.util.List;

public interface IUserDao {
//   基于持久层的mybatis
   List<User> findAll();
   //根据id查询
   User findById(Integer id);
}
