package com.init.charon.classLoader;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：try-with-resources
 * @date : 21:50 2019/11/27
 */
public class Demo7_04 {
    public static void main(String[] args) {
        try (MyResource myResource=new MyResource()){
            int i=10/0;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class MyResource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new Exception("close 关闭异常");
    }
}
