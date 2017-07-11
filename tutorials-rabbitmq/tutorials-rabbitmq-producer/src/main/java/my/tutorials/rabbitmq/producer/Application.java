package my.tutorials.rabbitmq.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by zsp on 2017/7/11.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
    	ApplicationContext context = SpringApplication.run(Application.class, args);
    	
    	Producer producer = context.getBean(Producer.class);
    	for(int i = 0; i < 10; i++) {
    		producer.send("Hello World " + i);
    	}
    }

}
