package com.heizi.springcloud.service;

import com.heizi.springcloud.pojo.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
