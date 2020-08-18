package aop.basic;

public class Programmer implements Employee {

	@Override
	public void work() {
		Action.gotoOfiice();
		System.out.println("개발을 합니다.");
		Action.getoffOffice();
	}

}
