package com.heizi.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@NoArgsConstructor
@Accessors(chain = true)//链式写法
public class Dept implements Serializable {
    private long deptno;//主键
    private String dname;

    //这个数据对应那个数据库的字段，
    //微服务，一个服务对应一个数据库，同一个信息可能存在不同数据库中
    private String db_source;
    public Dept(String dname) {
        this.dname = dname;
    }
}