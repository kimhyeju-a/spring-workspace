package aop.basic;

public class Designer implements Employee{

	@Override
	public void work() {
		Action.gotoOfiice();
		System.out.println("디자인을 합니다.");
		Action.getoffOffice();
	}
	
}
