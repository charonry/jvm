package com.init.charon.directMemory;

import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author : tk
 * @version : 1.0
 * @date : 20:47 2019/11/12
 *
 */
public class Demo5_03 {
    static int _100Mb=1024*1024*100;
    public static void main(String[] args) throws IOException {
        Unsafe unsafe=getUnsafe();
        //分配内存
        long base = unsafe.allocateMemory(_100Mb);
        unsafe.setMemory(base,_100Mb,(byte)0);
        System.in.read();

        //释放内存
        unsafe.freeMemory(base);
        System.in.read();
    }

    public static Unsafe getUnsafe(){
        try {
            Field f=Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            Unsafe unsafe=(Unsafe) f.get(null);
            return  unsafe;
        }catch (NoSuchFieldException | IllegalAccessException e){
            throw  new RuntimeException(e);
        }
    }
}
