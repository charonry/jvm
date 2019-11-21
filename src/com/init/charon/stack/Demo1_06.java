package com.init.charon.stack;

/**
 * 占用过多的cpuobject
 */
public class Demo1_06 {
    public static void main(String[] args) {
        new Thread(null,()->{
            System.out.println("1.......");
            while (true){

            }
        },"thread1").start();

        new Thread(null,()->{
            System.out.println("2.......");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"thread2").start();

        new Thread(null,()->{
            System.out.println("3.......");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"thread3").start();
    }
}
