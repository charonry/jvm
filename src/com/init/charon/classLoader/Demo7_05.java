package com.init.charon.classLoader;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：单例模式的懒加载(类加载器加载 可保证线程安全)
 * @date : 23:00 2019/11/27
 */
public class Demo7_05 {
    public static void main(String[] args) {
        //Singleton.test();
        Singleton.getSingleton();
    }
}

class Singleton{
    private Singleton() {
    }

    public static void test(){
        System.out.println("test");
    }
    //内部类
    private static class LazyHolder{
        private static final  Singleton SINGLETON=new Singleton();
        static {
            System.out.println("lazy Holder init");
        }
    }
    public static Singleton getSingleton(){
        return LazyHolder.SINGLETON;
    }
}
