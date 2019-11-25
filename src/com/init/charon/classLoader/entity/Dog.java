package com.init.charon.classLoader.entity;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：
 * @date : 23:19 2019/11/25
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("eat bone");
    }
}
