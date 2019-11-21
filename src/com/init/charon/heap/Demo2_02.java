package com.init.charon.heap;

/**
 * 演示堆内存  堆转储  dump
 */
public class Demo2_02 {
    public static void main(String[] args) throws  InterruptedException {
        System.out.println("1....");
        Thread.sleep(30000l);
        byte[] array=new byte[1024*1024*10]; //10M
        System.out.println("2....");
        Thread.sleep(20000l);
        array=null;
        //进行一次垃圾回收
        System.gc();
        System.out.println("3.....");
        Thread.sleep(1000000l);
    }
}
