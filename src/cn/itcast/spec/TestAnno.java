package cn.itcast.spec;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
	@Test
	public void testUser(){
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		BookService userService = (BookService)context.getBean("bookService");
		userService.add();
	}
}
