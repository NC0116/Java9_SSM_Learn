package com.neusoft.Dao;

import com.neusoft.domain.User;

import java.util.Date;
import java.util.List;

public interface IUserDao {
   //   基于持久层的mybatis
   List<User> findAll();

   //根据id查询
   User findById(Integer id);

   //保存用户  返回插入后的自增长id值在user里面，不是返回值
   int saveUser(User user);

   //更新用户
   int updateUser(User user);

   //   删除用户
   int deleteUser(Integer id);


   //根据姓名模糊查询
   List<User> findByName(String username);

   //查询总记录数
   int findCount();

   //
   List<User> findByCondition(User user);

}
