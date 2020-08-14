package di.java;

import org.springframework.stereotype.Component;

@Component("hankook")									//10   12
public class HankookTire implements Tire {
	
	public HankookTire () {
	}
	
	public HankookTire(String string) {
		System.out.println("한국타이어 string 생성자 호출");
	}

	public String getBrand() {
		return "한국타이어";
	}

}

