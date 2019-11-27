package com.init.charon.classLoader;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : charon
 * @version : 1.0
 * @Describe ：泛型反射
 * @date : 21:01 2019/11/27
 */
public class Demo7_03 {

    public static void main(String[] args) throws NoSuchMethodException {
        Method method=Demo7_03.class.getMethod("getParams",List.class,Map.class);
        Type[] parameterTypes = method.getGenericParameterTypes();
        for(Type type:parameterTypes){
            if(type instanceof ParameterizedType){
                ParameterizedType parameterizedType=(ParameterizedType) type;
                System.out.println("原始类型 - "+parameterizedType.getRawType());
                Type[] arguments = parameterizedType.getActualTypeArguments();
                for(int i=0;i<arguments.length;i++){
                    System.out.printf("泛型类型参数[%d] - %s\n",i,arguments[i]);
                }
            }
        }
    }

    public Set<Integer> getParams(List<String> list, Map<String,Object> map){
        return null;
    }
}
