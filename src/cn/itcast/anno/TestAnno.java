package cn.itcast.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
	@Test
	public void testUser(){
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService userService = (UserService)context.getBean("userService");
		userService.add();
	}
}
