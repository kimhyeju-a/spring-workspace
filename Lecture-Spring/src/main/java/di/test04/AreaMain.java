package di.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import di.test04.Config;


public class AreaMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class); 
		
		Area area = context.getBean("area", Area.class);
		area.prnArea();
	}
}
 