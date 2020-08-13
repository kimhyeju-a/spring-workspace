package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		//클래스 패스부터 읽어오는것 src/main/resources 가 class path,  context가 컨테이너 역할을 한다.
//		ApplicationContext context = new ClassPathXmlApplicationContext("beanContainer.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
		ApplicationContext context = new GenericXmlApplicationContext("beanContainer.xml");
//		HelloSingle obj3 = (HelloSingle)context.getBean("hs");
		HelloSingle obj3 = context.getBean("hs", HelloSingle.class);
		HelloSingle obj4 = (HelloSingle)context.getBean("hs2");
		obj3.prnMsg();
		
		System.out.println("obj3 : " + obj3);
		System.out.println("obj4 : " + obj4);
		
		
		Hello obj = (Hello)context.getBean("hello");
		obj.prnMsg();
		
		Hello obj2 = (Hello)context.getBean("hello2");
		obj2.prnMsg();
		
		System.out.println(obj);
		System.out.println(obj2);
	}
}
