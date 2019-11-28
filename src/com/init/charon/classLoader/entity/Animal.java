package com.init.charon.classLoader.entity;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：
 * @date : 23:15 2019/11/25
 */
public abstract class Animal {
    public abstract void eat();
    {
        System.out.println("被继承");
    }
    public String toString(){
        return "这是"+this.getClass().getSimpleName();
    }
}
