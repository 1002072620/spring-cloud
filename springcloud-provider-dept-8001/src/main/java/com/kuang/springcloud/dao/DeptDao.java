package com.kuang.springcloud.dao;


import com.kuang.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/*@Mapper
//为了把mapper这个DAO交給Spring管理
//为了给mapper接口 自动根据一个添加@Mapper注解的接口生成一个实现类
@Repository*/
//注意实现接口
public interface DeptDao {

     boolean addDept(Dept dept);

     Dept queryById(Long id);

     List<Dept> querAll();
}
