package di.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 	0. @Configuration 을 붙인다. 
	1. 객체 하나를 만든다.
	2. 자동으로 객체를 생성할 수 있도록 하기 위해 @Bean annotation을 붙여준다.
		- <Bean class="di.java.HankookTire" id="hankookTire"/> 처럼 인식되도록함
	3. main에서 ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
			- HankookTire의 기본 생성자가 호출된다.
	4. car 객체를 만든다.
	5. 객체를 가지고 온다.
	6. car가 autowire가 붙어 있기 때문에 타입매칭을 한다 ==> HankookTire밖에 없으므로 HankookTire 넣음
	7. 금호 타이어 객체를 생성한다.
			- 실행시키면 에러가 나온다 : Tire 타입을 가진 것이 2개이기 때문에.
	8. 금호 타이어의 객체에 name속성을 추가한다.
	9. @Qualifier로 매칭시킬 객체를 명시한다.
	10. @Component 를 뭍여준다.
			11 수행 전에, config의 내용을 주석처리
	11. Bean 어노테이션 대신에 ComponentSan(base Packages = {"di.java"}) 를 쓴다,
		- 에러가 난다.[이름을 붙여주지 않았기 때문에]
	12. 이름을 붙여준다.
	13. componentScan을 한다.
	14. main 에서 prnTireBrand를 하게되면 9번에서 금호로 명시를 했으므로 금호 타이어가 출력된다.
 */


@ComponentScan(basePackages = {"di.java"}) // 13
@Configuration							// 0
public class Config {
	/*
	@Bean
	public Car car() { 					// 4 car가 id 역할을 한다.
		return new Car();
	}
	
	
	@Bean(name="kumho")					// 8
	public Tire kumhoTire() {			// 7
		return new KumhoTire();		
	}
	
	@Bean								// 2
	@Qualifier("hankook")
	public Tire hankookTire() {			// 1
		return new HankookTire();		
	}
	*/
}
