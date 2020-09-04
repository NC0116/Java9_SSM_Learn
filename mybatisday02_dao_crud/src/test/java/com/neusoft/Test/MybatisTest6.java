package com.neusoft.Test;

import com.neusoft.Dao.DeptDao;
import com.neusoft.Dao.IUserDao;
import com.neusoft.domain.Dept;
import com.neusoft.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


public class MybatisTest6 {
//    @Test
//    public void  test5() throws IOException {
//        //读取配置文件
//        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        //创建工厂
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory = builder.build(in);
//        //使用工厂生产的SqlSession对象
//        SqlSession session = factory.openSession();
//        //        使用SqlSession创建Dao接口的代理对象
//        IUserDao userDao = session.getMapper(IUserDao.class);
//        //使用代理对象执行方法
//        List<User> users = userDao.findAll();
//        for (User user : users){
//            System.out.println(user);
//        }
//        session.close();
//        in.close();
//    }

    private  InputStream in;
    private  SqlSession sqlSession;
    private  DeptDao deptDao;
    // 在测试方法之前执行
    @Before
    public void init() throws IOException {
        // 1. 读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2. 创建 SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        // 3. 使用 工厂生产的 SqlSession对象
        sqlSession = factory.openSession();
        // 4. 使用SqlSession 创建Dao 接口 的代理对象
        deptDao = sqlSession.getMapper(DeptDao.class);
    }
    @After
    public void destroy() throws IOException {
        // 提交事物
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
    @Test
    public void testFindAll(){
        List<Dept> depts = deptDao.findAll();
        for (Dept dept : depts){
            System.out.println(dept);
        }
    }

    @Test
    public void testFindOne(){
        Dept byDept = deptDao.findByDept(30);
        System.out.println(byDept);

    }

    @Test
    public void testSave(){//TODO
        Dept dept = new Dept();
        dept.setDname("张三");
        dept.setLoc("葫芦岛");
        int i = deptDao.saveDept(dept);
        System.out.println(i);

    }

    @Test
    public void testUpdate(){
        Dept dept = new Dept();
        dept.setDeptno(70);
        dept.setDname("张三");
        dept.setLoc("葫芦岛");
        int i = deptDao.updateDept(dept);
        System.out.println(i);

    }
    @Test
    public void testDelete(){
        int i = deptDao.deleteDept(70);
        System.out.println(i);
    }

    @Test
    public void testFindByName(){
        List<Dept> depts = deptDao.findByName("%张%");
        for (Dept dept : depts){
            System.out.println(dept);
        }
    }
    @Test
    public void testFindCount(){
        int count = deptDao.findCount();
        System.out.println(count);
    }

}
