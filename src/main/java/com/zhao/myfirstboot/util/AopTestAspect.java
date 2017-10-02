package com.zhao.myfirstboot.util;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * Aop例子  切面
 * Created by zhaoxudong on 2017/10/1.
 */
@Aspect //通过@Aspect注解声明一个切面
@Component  //通过@Component让此切面成为Spring容器管理的Bean
public class AopTestAspect {

    @Pointcut("execution(* com.zhao.myfirstboot.controller.*Controller.save(..))")  //通过@PointCut注解声明一个切面
    public void excudeService(){}

    @Before("excudeService()")
    public void before(JoinPoint joinPoint){
        //获取切入点的方法
        String method=joinPoint.getSignature().getName();
        //获取切入点方法传入参数列表
        Object args[]=joinPoint.getArgs();
        System.out.println("args[0]:"+args);

        if("save".equals(method)){
            //遍历参数列表，自动填写creuser和creDate
            Field[] fieldlist=args[0].getClass().getDeclaredFields();//获取属性列表
            for(int i=0;i<fieldlist.length;i++){
                if("creuser".equals(fieldlist[i].getName())){
                    fieldlist[i].setAccessible(true);
                    try {
                        fieldlist[i].set(args[0],"zhao");
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @After("excudeService()")   //通过@After注解声明一个建言，并使用@Pointcut定义的切点
    public void after(JoinPoint joinPoint){
        System.out.println("After()");
    }



}
