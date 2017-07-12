package my.tutorials.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;

import my.tutorials.dubbo.common.HelloService;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

	public String greeting(String name) {
		return name == null ? "No body!" : "Hello, " + name;
	}

}
