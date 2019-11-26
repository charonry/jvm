package com.init.charon.classLoader;


import com.init.charon.classLoader.entity.Animal;
import com.init.charon.classLoader.entity.Cat;
import com.init.charon.classLoader.entity.Dog;

import java.io.IOException;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：演示多态原理
 * @date : 23:12 2019/11/25
 * -XX:-UseCompressedOops -XX:-UseCompressedClassPointers
 * java -cp ./lib/sa-jdi.jar sun.jvm.hotspot.HSDB
 */
public class Demo7_02 {
    public static void main(String[] args) throws IOException {
        test(new Cat());
        test(new Dog());
        System.in.read();
    }

    public static void test(Animal animal){
        animal.eat();
        animal.toString();
    }
}

