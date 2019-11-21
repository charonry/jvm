package com.init.charon.stack;

/**
 * 局部变量的线程安全问题
 */
public class Demo1_02 {
    //多个线程同时执行此方法
    static void a1(){
        int x=0; //如果改成static会产生线程安全问题
        for(int i=0;i<5000;i++){
            x++;
        }
        System.out.println(x);
    }
}
