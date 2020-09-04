package com.neusoft.Dao;

import com.neusoft.domain.User;

import java.util.Date;
import java.util.List;

public interface IUserDao {
//   基于持久层的mybatis
   List<User> findAll();
}
