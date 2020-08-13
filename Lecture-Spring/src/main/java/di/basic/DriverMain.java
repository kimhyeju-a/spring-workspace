package di.basic;

public class DriverMain {
	
	public static void main(String[] args) {
		Tire tire = new HankookTire();		//외부에서 의존성이 있는 객체를 만들고
		//1. 생성자 주입 코드 
//		Car car = new Car(tire);			// 그 객체로 객체 생성, 1.생성자 주입 코드 [Constructor injection]
		
		
		Car car = new Car();
		car.setTire(tire);
		car.prnTireBrand();
		
	}
}
