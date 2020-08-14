package di.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalculatorMain {
	public static void main(String[] args) {
		ApplicationContext container = new GenericXmlApplicationContext("ditest01/beanContainer.xml");
		MyCalculator my = (MyCalculator)container.getBean("myCal");
		//주입하는 방식은 2가지 setter주입, 생성자 주입
		/*
		Calculator c = new Calculator();
		MyCalculator my = new MyCalculator(c);
		*/
		my.setFirstNum(15);
		my.setsecondNum(4);
		my.add();
		my.sub();
		my.mul();
		my.div();
		
	}
}
