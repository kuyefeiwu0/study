package com.lcf.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@MapperScan("com.lcf.demo.mapper")
@EnableTransactionManagement
@EnableAspectJAutoProxy(exposeProxy=true,proxyTargetClass=true)
public class LcfMain {
	public static void main(String[] args)   {
		SpringApplication.run(LcfMain.class, args) ;
	}
}
