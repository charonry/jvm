package com.init.charon.constantPool;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/** stringtable优化
 * @author : tk
 * @version : 1.0
 * @date : 22:50 2019/11/11
 */
public class Demo4_05 {
    public static void main(String[] args) throws IOException {
        List list=new ArrayList();
        System.in.read();
        for(int i=0;i<100;i++) {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\MyMaven\\settings.xml"), "utf-8"))) {
                String line = null;
                long start = System.nanoTime();
                while (true) {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    //list.add(line);
                    list.add(line.intern());
                }
                System.out.println("cost:" + (System.nanoTime() - start) / 1000000);
            }
        }

        System.in.read();
    }
}
