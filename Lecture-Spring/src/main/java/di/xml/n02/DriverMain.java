package di.xml.n02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("di-xml02.xml"); //2. 객체 생성하기 위해 xml연결
		
		Car car = (Car)context.getBean("car");
		
		/*
		//xml 방식이 아닐때의 생성자 주입 방식
		Tire tire = new HankookTire();
		Car car = new Car(tire);
		car.prnTireBrand();
		*/
	}
}
