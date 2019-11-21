package com.init.charon.MethodArea;

import com.sun.org.apache.xpath.internal.compiler.OpCodes;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * 演示元空间内存溢出 java.lang.OutOfMemoryError: Metaspace  1.8之前PerGen space永久代
 * -XX:MaxMetaspaceSize=8m
 */
public class Demo3_01 extends  ClassLoader{ //可以加载类的二进制字节码
    public static void main(String[] args) {
        int j=0;
        try {
            Demo3_01 demo=new Demo3_01();
            for(int i=0;i<10000;i++,j++){
                //classwriter:用代码生成类的二进制字节码
                ClassWriter cw=new ClassWriter(0);
                //版本号，类的返回修饰符，类名，包名，父类，接口
                cw.visit(Opcodes.V1_8,Opcodes.ACC_PUBLIC,"Class"+i,null,"java/lang/Object",null);
                //返回生成类的二进制字节码
                byte[] code=cw.toByteArray();
                //触发类的加载
                demo.defineClass("Class"+i,code,0,code.length);  //calss对象
            }
        } finally {
            System.out.println(j);
        }
    }
}
