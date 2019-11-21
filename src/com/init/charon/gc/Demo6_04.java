package com.init.charon.gc;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**弱引用引用
 * @author : tk
 * @version : 1.0
 * @date : 22:44 2019/11/12
 */
public class Demo6_04 {
    private  final static int _4Mb=4*1024*1024;
    public static void main(String[] args) {
        //list->WeakReference->byte[]
        List<WeakReference<byte[]>> list=new ArrayList<>();
        for(int i=0;i<6;i++){
            WeakReference<byte[]> ref=new WeakReference<>(new byte[_4Mb]);
            list.add(ref);
            for(WeakReference<byte[]> weakReference:list){
                System.out.print(weakReference.get()+"\t");
            }
            System.out.println();
        }
        System.out.println("循环结束....."+list.size());

    }
}
