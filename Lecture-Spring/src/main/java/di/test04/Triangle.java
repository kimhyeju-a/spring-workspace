package di.test04;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("triangle")
public class Triangle implements Figure {
	private int x;
	private int y;
	public Triangle() {
		Random r = new Random();
		this.x = r.nextInt(10) + 1; 
		this.y = r.nextInt(10) + 1; 
	
	}
	@Override
	public String getArea() {
		float area = x * y / 2;
		return "x = " + x +", y = " + y + " 인 삼각형 넓이 : " + area;
	}

}
