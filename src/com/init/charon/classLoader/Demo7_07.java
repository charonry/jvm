package com.init.charon.classLoader;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：
 * @date : 22:13 2019/11/28
 */
public class Demo7_07 {
    public static void main(String[] args) {
        for(int i=0;i<200;i++){
            long start = System.nanoTime();
            for(int j=0;j<1000;j++){
                new Object();
            }
            long end = System.nanoTime();
            System.out.printf("%d\t%d\n",i,(end-start));
        }
    }
}
