package com.init.charon.constantPool;

/** 字符串字面值也是【延迟】成为对象
 * @author : tk
 * @version : 1.0
 * @date : 21:34 2019/11/11
 */
public class Demo4_02 {
    public static void main(String[] args) {
        int x=args.length;
        System.out.println();
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("1"); //串池已经有了 就不会在新建字符串进入
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println(x);
    }
}
