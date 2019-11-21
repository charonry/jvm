package com.init.charon.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出   java.lang.OutOfMemoryError: Java heap space  -Xmx
 */
public class Demo2_01 {
    public static void main(String[] args) {
        int i=0;
        List<String> list=new ArrayList<>();
        String a="hello";
        try {
            while (true){
                list.add(a);
                a+=a;
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
