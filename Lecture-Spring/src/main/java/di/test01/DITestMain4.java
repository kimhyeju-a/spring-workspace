package di.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DITestMain4 {
	public static void main(String[] args) {
		ApplicationContext container = new GenericXmlApplicationContext("ditest01/beanContainer04.xml");
		MyCalculator my = (MyCalculator)container.getBean("myCal");
		my.add();
		my.sub();
		my.mul();
		my.div();
	}
}
