package my.tutorials.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * Created by zsp on 2017/7/11.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        test(context);
    }

    private static void test(ApplicationContext context) {
        ATest atest = context.getBean(ATest.class);
        atest.save("abc", "123");
        atest.save("def", "456");
        String result = atest.get("abc");
        System.out.println("abc=" + result);
        result = atest.get("def");
        System.out.println("def=" + result);
        result = atest.get("hig");
        System.out.println("hig=" + result);
        atest.delete("abc");
        atest.delete("def");
        atest.delete("hig");
        result = atest.get("abc");
        System.out.println("abc=" + result);
        result = atest.get("def");
        System.out.println("def=" + result);
        result = atest.get("hig");
        System.out.println("hig=" + result);
    }

}
