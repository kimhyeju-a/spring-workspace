package di.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(Config.class); // 3
		 
		 Car car = context.getBean("car", Car.class);										// 5
		 car.prnTireBrand();
		 
	}
}
