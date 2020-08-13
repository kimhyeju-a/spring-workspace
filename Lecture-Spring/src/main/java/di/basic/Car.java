package di.basic;

public class Car {

	private Tire tire; 	//의존관계 발생
	// car라는 클래스의 코드가 바꾸지 않음
	/*
		결합도가 떨어져 있다.
		==> tire라는 인스턴스 객체에 새로운 인스턴스 객체가 들어온다 하더라도, car 클래스가 수정이 되지 않는다.
		==> car라는 인스턴스 객체는 tire라는 것이 필요함 : main에서 권한을 넘긴다.
	 */
	public Car() {
		//의존관계 설정
		//tire = new HankookTire();
	}
	
	public Tire getTire() {
		return tire;
	}
	//속성주입(setter 주입)
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	// 생성자 주임
	public Car(Tire tire) {
		this.tire = tire;
	}

	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getTire());
	}
}
