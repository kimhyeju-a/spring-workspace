package aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("aop-xml.xml");
		Employee e = (Employee)context.getBean("programmer"); 				// aop는 인터페이스 기반이기 때문에 Employee로 형변환을 해주어야 한다.
		e.work();
		
		e = context.getBean("designer", Employee.class);
		e.work();
		
		e = context.getBean("manager", Employee.class);
		e.work();
	}
}
