package my.tutorials.dubbo.consumer;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import my.tutorials.dubbo.common.HelloService;

@Component
public class HelloAction {

	@Reference(version = "1.0.0")
	private HelloService helloService;
	
	public void hello(String name) {
		String result = helloService.greeting(name);
		System.out.println("result: " + result);
	}
	
}
