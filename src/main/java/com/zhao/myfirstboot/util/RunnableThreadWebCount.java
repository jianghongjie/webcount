package com.zhao.myfirstboot.util;

import java.util.HashMap;
/**
 * Created by zhaoxudong on 2017/10/1.
 */
public class RunnableThreadWebCount implements Runnable{
    private static HashMap<String,Integer> map=new HashMap<String,Integer>();

    @Override
    public void run() {
        System.out.println("计数线程已启动------");
        map.put(new String("110101"), 0);
    }

    public static void showthread(){
        System.out.println("------------计数线程运行中--");
    }

    public static int addCount(String key){
        Integer count=map.get(key);
        if(count==null){
            return 0;
        }
        count++;
        map.put(key,count);
        System.out.println("网站访问人数："+count);
        return count;
    }
}
