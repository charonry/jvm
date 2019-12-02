package com.init.charon.memoryModel;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：创建单例double-checked locking
 * @date : 22:12 2019/12/2
 */
public class Demo8_02 {
    private Demo8_02(){};

    private volatile  static Demo8_02 Singleton ;

    public static Demo8_02 getDemo8_02(){
        if(Singleton==null){
            synchronized (Demo8_02.class){
                if(Singleton==null){
                    Singleton=new Demo8_02();
                }
            }
        }
        return Singleton;
    }
}

