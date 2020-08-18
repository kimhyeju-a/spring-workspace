package di.test04;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("area")
public class Area {
	@Autowired
	@Qualifier("triangle")
	private Figure figure;
	
	public Area() {
		Random r = new Random();
	}

	public Area(Figure figure) {
		this.figure = figure;
	}
	
	public void prnArea() {
		System.out.println(figure.getArea());
	}
}
