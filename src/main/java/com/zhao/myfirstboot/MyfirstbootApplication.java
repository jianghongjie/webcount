package com.zhao.myfirstboot;

import com.zhao.myfirstboot.util.RunnableThreadWebCount;
import com.zhao.myfirstboot.util.Timers;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@MapperScan("com.zhao.myfirstboot.dao")
public class MyfirstbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstbootApplication.class, args);
		//计数线程
		RunnableThreadWebCount runnableThreadWebCount=new RunnableThreadWebCount();
		runnableThreadWebCount.run();
		//计时器线程
		Timers timers=new Timers();
		timers.run();
	}
}
