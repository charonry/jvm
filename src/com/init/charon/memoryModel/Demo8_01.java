package com.init.charon.memoryModel;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：退而循环
 * @date : 21:44 2019/12/2
 */
public class Demo8_01 {
    static boolean run = true;
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (run){
                System.out.println(1);
            }
        }).start();
        Thread.sleep(1000l);
        run=false;
    }
}
