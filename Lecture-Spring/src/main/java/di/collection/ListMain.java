package di.collection;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ListMain {
	public static void main(String[] args) {
		/*
		List<String> address = new ArrayList<String>();
		address.add("서울");
		address.add("부산");
		address.add("공주");
		ListAddress list = new ListAddress(address);
		list.setAddress(address);
		*/
		
		ApplicationContext container = new GenericXmlApplicationContext("di-collection01.xml");
		ListAddress list = container.getBean("list", ListAddress.class);
		
		for(String addr : list.getAddress()) {
			System.out.println(addr);
		}

		ListAddress list2 = container.getBean("list02", ListAddress.class);
		for(String addr : list2.getAddress()) {
			System.out.println(addr);
		}
		
		ListAddress list3 = container.getBean("list03", ListAddress.class);
		for(String addr : list3.getAddress()) {
			System.out.println(addr);
		}
		for(int number : list3.getNumber()) {
			System.out.println(number);
		}
	}
}
