package my.tutorials.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations={"classpath:application-context.xml"})
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		context.getBean(HelloAction.class).hello("tom");
	}

}
