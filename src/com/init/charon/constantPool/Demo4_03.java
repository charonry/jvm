package com.init.charon.constantPool;

/**
 * @author : tk
 * @version : 1.0
 * @date : 21:48 2019/11/11
 */
public class Demo4_03 {
    public static void main(String[] args) {
        String str="ab";
        String s=new String("a")+new String("b"); //存放在堆中
        String s2 = s.intern();//将这个字符串尝试放入串池，如果有就不会放入，没有就放入，将串池中对象返回；1.8
                                                  // 没有将对象复制一份放入串池  1.6
        System.out.println(s=="ab");
        System.out.println(s2=="ab");
        System.out.println(str=="ab");

        String st=new String("c")+new String("d");
        String st1="cd";
        st.intern();
        System.out.println(st==st1);
    }
}
