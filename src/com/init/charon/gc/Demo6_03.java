package com.init.charon.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * 软引用的引用队列
 * @author : tk
 * @version : 1.0
 * @date : 22:35 2019/11/12
 */
public class Demo6_03 {
    private  final static int _4Mb=4*1024*1024;

    public static void main(String[] args) {
        List<SoftReference<byte[]>> list=new ArrayList();

        //引用队列
        ReferenceQueue<byte[]> queue =new ReferenceQueue<>();

        for(int i=0;i<5;i++){
            //关联引用队列，软引用所关联的byte【】被回收时，软引用会自动加入引用队列
            SoftReference<byte[]> ref=new SoftReference<>(new byte[_4Mb],queue);
            System.out.println(ref.get());
            list.add(ref);
            System.out.println(list.size());
        }
        System.out.println("循环结束.....");
        //取出引用队列
        Reference<? extends byte[]> poll = queue.poll();
        while (poll!=null){
            list.remove(poll);
            poll=queue.poll();
        }
        System.out.println("===========");
        for(SoftReference<byte[]> ref:list){
            System.out.println(ref.get());
        }
    }
}
