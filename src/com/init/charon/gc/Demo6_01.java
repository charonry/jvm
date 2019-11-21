package com.init.charon.gc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** 可达性算法分析
 * @author : tk
 * @version : 1.0
 * @date : 21:13 2019/11/12
 */
public class Demo6_01 {
    public static void main(String[] args) throws IOException {
        List<Object> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(1);
        System.in.read();

        list=null;
        System.out.println(2);
        System.in.read();
        System.out.println("end...");
    }
}
