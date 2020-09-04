package com.neusoft.Dao;

import com.neusoft.domain.Dept;

import javax.swing.*;
import java.util.List;

public interface DeptDao {
        //查询所有的信息
        List<Dept> findAll();
        //根据id查询
        Dept findByDept(Integer deptno);
        //保存dept
        int saveDept(Dept dept);
        //更新dept
        int updateDept(Dept dept);
        //删除
        int deleteDept(Integer deptno);
        //模糊查询
        List<Dept> findByName(String dname);
        //查询总条数
        int findCount();

}
