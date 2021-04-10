package com.kuang.springcloud.service;

import com.kuang.springcloud.pojo.Dept;

import java.util.List;
//service应该和Dao一样

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> querAll();
}
