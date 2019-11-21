package com.init.charon.stack;

/**
 * 演示栈帧
 */
public class Demo1_01 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        method2(1,2);
    }


    public  static int method2(int a,int b){
        int c= a+b;
        return c;
    }
}
