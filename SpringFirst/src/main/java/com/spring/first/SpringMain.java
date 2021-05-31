package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext/*인터페이스*/ ctx=new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring.xml"/*설정파일의 위치값*/);
		MiTv tv1 =ctx.getBean("mitv"/*원하는거*/,MiTv.class/*리턴타입*/);
//		System.out.println("tv1: "+tv1);
		tv1.volumeUp();
	}

}
