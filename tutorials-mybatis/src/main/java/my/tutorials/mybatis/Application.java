package my.tutorials.mybatis;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) throws Exception {
    	ApplicationContext context = SpringApplication.run(Application.class, args);
    	
    	TestOneDao dao = context.getBean("testOneDao", TestOneDao.class);
//    	
//    	TestOne testOne = new TestOne();
//    	testOne.setId(10);
//    	testOne.setName("abc");   	
//    	dao.save(testOne);
//    	
    	List<TestOne> list = dao.list();
    	for(TestOne item : list) {
    		System.out.println(item.getName());
    	}
    }

}
