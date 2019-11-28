package com.init.charon.classLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：
 * @date : 21:32 2019/11/28
 */
public class Demo7_06 {
    public static void main(String[] args) throws Exception {
        MyClassLoader classLoader=new MyClassLoader();
        Class<?> c1 = classLoader.loadClass("Dog");
        Class<?> c2 = classLoader.loadClass("Dog");
        System.out.println(c1==c2);
        MyClassLoader myClassLoader=new MyClassLoader();
        Class<?> c3 = myClassLoader.loadClass("Dog");
        System.out.println(c1==c3);
        c1.newInstance();
    }
}

class MyClassLoader extends ClassLoader{
    @Override
    //name:类名字
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String path="D:\\IDEA_worker\\jvm\\out\\production\\jvm\\com\\init\\charon\\classLoader\\entity\\"+name+".class";
        try {
            ByteArrayOutputStream os=new ByteArrayOutputStream();
            Files.copy((Paths.get(path)),os);
            // 得到字节数组
            byte[] bytes=os.toByteArray();
            return defineClass(name,bytes,0,bytes.length);
        } catch (IOException e) {
            throw  new ClassNotFoundException("未找到类文件");
        }
    }
}