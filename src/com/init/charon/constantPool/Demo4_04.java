package com.init.charon.constantPool;

/** stringtable 垃圾回收
 * @author : tk
 * @version : 1.0
 * @date : 22:39 2019/11/11
 */
public class Demo4_04 {
    public static void main(String[] args) {
        int i=0;
        try {
            for(int j=0;j<100000;j++){
                String.valueOf(j).intern();
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(i);
        }

    }
}
