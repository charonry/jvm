package com.init.charon.stack;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.init.charon.entity.Dept;
import com.init.charon.entity.Emp;

import java.util.Arrays;

/**
 * 调用第三方jar包导致内存溢出,json数据转化
 * 找不到core.Version的类文件
 */
public class Demo1_05 {
    public static void main(String[] args) {
        Dept dept=new Dept();
        dept.setName("Market");
        Emp e1=new Emp();
        e1.setName("zhang");
        e1.setDept(dept);
        Emp e2=new Emp();
        e2.setName("li");
        e2.setDept(dept);

        dept.setEmps(Arrays.asList(e1,e2));
        ObjectMapper objectMapper=new ObjectMapper();
        System.out.println(/*objectMapper.writeValueAsString(dept)*/);
    }
}
