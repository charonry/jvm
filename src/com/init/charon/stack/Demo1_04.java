package com.init.charon.stack;

/**
 * 错误的方法递归导致内存溢出 java.lang.StackOverflowError -Xss 默认1M
 */
public class Demo1_04 {

    public static int count=0;

    public static void main(String[] args) {
        try {
            method();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(count);
        }
    }

    public static void method(){
        count++;
        method();
    }
}
