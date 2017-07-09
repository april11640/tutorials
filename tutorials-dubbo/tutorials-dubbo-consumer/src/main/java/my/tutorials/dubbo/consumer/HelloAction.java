package my.tutorials.dubbo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import my.tutorials.dubbo.common.HelloService;

@Component
public class HelloAction {

	@Autowired
	private HelloService helloService;
	
	public void hello(String name) {
		String result = helloService.greeting(name);
		System.out.println("result: " + result);
	}
	
}
