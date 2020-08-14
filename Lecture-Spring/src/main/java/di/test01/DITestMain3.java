package di.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DITestMain3 {
	public static void main(String[] args) {
		ApplicationContext container = new GenericXmlApplicationContext("ditest01/beanContainer03.xml");
		MyCalculator my = container.getBean("myCal",MyCalculator.class);
		my.add();
		my.sub();
		my.mul();
		my.div();
	}
}
