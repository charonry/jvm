package com.init.charon.stack;

/**
 * 死锁引起的cpu过高
 */
public class Demo1_07 {
    public static void main(String[] args) throws InterruptedException{
        new Thread(()->{
            synchronized ("A"){
                try {
                    Thread.sleep(2000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized ("B"){
                    System.out.println("获取了A和B.....");
                }
            }
        }).start();

        Thread.sleep(1000l);

        new Thread(()->{
            synchronized ("B"){
                synchronized ("A"){
                    System.out.println("获取了A和B.....");
                }
            }
        }).start();
    }
}
