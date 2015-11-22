package com.jabue.starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jabue.form.Person;
/**
 * 
 * this is a test class used to test spring aop fuction.
 * 
 * @author Kris
 *
 */
public class ServerStarter {

	public static void main(String[] args) {
		System.out.println("Server Started...");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)ctx.getBean("Chinese");
		person.sayHello();
	}
}
