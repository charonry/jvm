package com.init.charon.directMemory;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * @author : tk
 * @version : 1.0
 * @date : 20:39 2019/11/12
 *
 * -XX:DisableExplicitGC   显示的
 */
public class Demo5_02 {
    static int _100Mb=1024*1024*100;

    public static void main(String[] args) throws IOException {
        ByteBuffer byteBuffer=ByteBuffer.allocateDirect(_100Mb);
        System.out.println("分配完毕..");
        System.in.read();
        System.out.println("开始释放...");
        byteBuffer=null;
        System.gc();  //显示的垃圾回收，full GC
        System.in.read();
    }
}
