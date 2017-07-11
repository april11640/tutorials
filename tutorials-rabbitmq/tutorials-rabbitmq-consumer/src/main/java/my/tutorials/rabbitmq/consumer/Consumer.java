package my.tutorials.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@RabbitListener(queues = MyConfiguration.QUEUE)
    public void processMessage(String content) {
        System.out.println("receive message: " + content);
    }
	
}
