package com.init.charon.memoryModel;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：
 * @date : 22:41 2019/12/2
 */
public class Demo8_03 {
    public static void main(String[] args) throws InterruptedException {
        DataContainer dataContainer=new DataContainer();
        int count=5;
        Thread t1 = new Thread(()->{
            for (int i=0;i<count;i++){
                dataContainer.increase();
            }
        });
        t1.start();
        t1.join();
        System.out.println(dataContainer.getData());
    }
}

class DataContainer{
    private volatile int data;
    static final Unsafe unsafe;
    static final long DATA_OFFSET;
    static {
        try {
            // Unsafe不能直接调用，只能通过反射或者
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            unsafe = (Unsafe) theUnsafe.get(null);
        }catch (NoSuchFieldException | IllegalAccessException e){
            throw new Error();
        }

        try{
            // data属性在DataContainer对象中偏移量，用于Unsafe直接访问该属性
            DATA_OFFSET=unsafe.objectFieldOffset(DataContainer.class.getDeclaredField("unsafe"));
        }catch (NoSuchFieldException e){
            throw new Error(e);
        }
    }

    public void increase(){
        int oldValue;
        while (true){
            // 获取共享变量旧值
            oldValue = data;
            if(unsafe.compareAndSwapInt(this,DATA_OFFSET,oldValue,oldValue+1)){
                return;
            }
        }
    }

    public void decrease(){
        int oldValue;
        while (true){
            oldValue=data;
            if(unsafe.compareAndSwapInt(this,DATA_OFFSET,oldValue,oldValue-1)){
                return;
            }
        }
    }

    public int getData(){
        return data;
    }
}