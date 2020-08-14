package di.test04;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("square")
public class Square implements Figure{
	
	private int x;
	private int y;
	
	public Square() {
		Random r = new Random();
		this.x = r.nextInt(10) + 1; 
		this.y = r.nextInt(10) + 1; 
	
	}

	@Override
	public String getArea() {
		int area = x * y;
		return "x = " + x +", y = " + y + " 인 직사각형 넓이 : " + area;
	}

}
