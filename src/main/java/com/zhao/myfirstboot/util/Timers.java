package com.zhao.myfirstboot.util;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by zhaoxudong on 2017/10/1.
 */
public class Timers implements Runnable{
    @Override
    public void run() {
        System.out.println("计时器线程已启动----------");

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                RunnableThreadWebCount.showthread();
            }
        };

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, 1000, 3000);
    }
}
