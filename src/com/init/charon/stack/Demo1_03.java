package com.init.charon.stack;

/**
 * 局部变量线程安全问题
 */
public class Demo1_03 {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append(4);
        sb.append(5);
        new Thread(()->{
            m2(sb);
        }).start();
    }

    //安全
    public static void m1(){
        StringBuilder sb=new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        System.out.println(sb.toString());
    }

    //不安全
    public static void m2(StringBuilder sb){
        sb.append(1);
        sb.append(2);
        sb.append(3);
        System.out.println(sb.toString());
    }

    //不安全
    public static String m3(){
        StringBuilder sb=new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        return sb.toString();
    }
}
