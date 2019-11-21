package com.init.charon.constantPool;

//二进制字节码（类基本信息，常量池，类方法定义，包含虚拟机指令）
public class Demo4_01 {
    public static void main(String[] args) {
        String s1="a";
        String s2="b";
        String s3="ab";
        String s4=s1+s2;//stringBuilder().append().tostring()  false
        System.out.println(s3==s4);
        String s5="a"+"b";
        System.out.println(s3==s5); //true  javac在编译期的优化
        String s6=new String("a")+new String("b");
        System.out.println(s3==s6);  //false

        String str1=new String("hello");
        String str2=new String("hello");
        System.out.println(str1==str2); //false
    }
}
