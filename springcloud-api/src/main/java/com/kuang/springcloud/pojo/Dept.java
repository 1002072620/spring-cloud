package com.kuang.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
//一定要实现序列化

@Data
@NoArgsConstructor
@Accessors//链式写法
public class Dept implements Serializable {
//    mysql对应真实的数据类，类表关系映射
    private Long deptno;//主键
    private String dname;//名称
    //一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
