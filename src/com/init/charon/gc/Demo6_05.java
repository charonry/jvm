package com.init.charon.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : tk
 * @version : 1.0
 * @date : 22:58 2019/11/12
 * -Xms20m -Xmx20m -Xmn20m -XX:+PrintGCDetails -verbose:gc
 */
public class Demo6_05 {
    private static final int _512KB=512*1024;
    private static final int _1MB=1024*1024;
    private static final int _6MB=1024*1024*6;
    private static final int _8MB=1024*1024*8;

    public static void main(String[] args) throws InterruptedException {
       List<byte[]> list=new ArrayList<>();
       list.add(new byte[_8MB]);
       list.add(new byte[_1MB]);

       new Thread(()->{
           List<byte[]> lists=new ArrayList<>();
           lists.add(new byte[_8MB]);
           lists.add(new byte[_1MB]);
       }).start();

        System.out.println("sleep");
        Thread.sleep(1000L);
    }
    
}
