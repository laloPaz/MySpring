package com.myproject.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myproject.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/myproject/xml/beans.xml");
		Mundo m = appContext.getBean(Mundo.class);
		System.out.println("Saludos: "+m.getSaludo());		

	}

}
