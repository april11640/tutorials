package my.tutorials.dubbo.provider;

import org.springframework.stereotype.Service;

import my.tutorials.dubbo.common.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	public String greeting(String name) {
		return name == null ? "No body!" : "Hello, " + name;
	}

}
