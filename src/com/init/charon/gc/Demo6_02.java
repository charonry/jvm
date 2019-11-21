package com.init.charon.gc;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * 演示软引用
 * @author : tk
 * @version : 1.0
 * @date : 21:56 2019/11/12
 * -Xmx20m -XX:+PrintGCDetails -verbose:gc
 */
public class Demo6_02 {
    private  final static int _4Mb=4*1024*1024;

    public static void main(String[] args) throws IOException {
        // 强引用
        /*List<byte[]> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(new byte[_4Mb]);
        }
        System.in.read();*/
        sort();
    }

    public static void sort(){
        //list->SoftReference->byte[]
        List<SoftReference<byte[]>> list=new ArrayList();
        for(int i=0;i<5;i++){
            SoftReference<byte[]> ref=new SoftReference<>(new byte[_4Mb]);
            System.out.println(ref.get());
            list.add(ref);
            System.out.println(list.size());
        }
        System.out.println("循环结束.....");
        for(SoftReference<byte[]> ref:list){
            System.out.println(ref.get());
        }
    }
}
