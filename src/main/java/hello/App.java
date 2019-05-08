package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// IoC Container : Inversion of Control (제어의 역전)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Greet g = (Greet) ctx.getBean("korea");
		System.out.println("Greeting !" + g.sayHello() + ((Greeter) g).iam1());
		g = (Greet) ctx.getBean("english");
		System.out.println("Greeting !" + g.sayHello());
		Greeter korea = (Greeter) ctx.getBean("korea");
		// Greeter 클래스로 부터 생성된 객체를 참조하는 변수,
		// korea는 Greeter 클래스에 저으이된 메소드를 사용할 수 있다고 생각함
		System.out.println("Greeting !" + korea.sayHello());

		Greeter2 eng = (Greeter2) ctx.getBean("english");
		System.out.println("Greeting !" + eng.sayHello());
	}
}
