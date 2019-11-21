package com.init.charon.directMemory;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**演示直接内存溢出
 * @author : tk
 * @version : 1.0
 * @date : 20:34 2019/11/12
 */
public class Demo5_01 {
    static int _100Mb=1024*1024*100;
    public static void main(String[] args) {
        List<ByteBuffer> list=new ArrayList();
        int i=0;
        try {
            while (true){
                ByteBuffer byteBuffer=ByteBuffer.allocateDirect(_100Mb);
                list.add(byteBuffer);
                i++;
            }
        } finally {
            System.out.println(i);
        }
    }
}
