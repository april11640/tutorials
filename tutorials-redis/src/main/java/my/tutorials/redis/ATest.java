package my.tutorials.redis;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Created by zsp on 2017/7/11.
 */
@Component
public class ATest {

    private  final static String PREFIX = "atest.";

    @Resource
    private StringRedisTemplate template;

    public void save(String key, String value) {
        ValueOperations<String, String> opsForValue = template.opsForValue();
        String k = PREFIX + key;
        opsForValue.set(k, value);
    }

    public void save2(String key, String value) {
        ValueOperations<String, String> opsForValue = template.opsForValue();
        String k = PREFIX + key;
        opsForValue.set(k, value, 10, TimeUnit.SECONDS);
    }

    public void update(String key, String value) {
        ValueOperations<String, String> opsForValue = template.opsForValue();
        String k = PREFIX + key;
        opsForValue.set(k, value);
    }

    public void delete(String key) {
        String k = PREFIX + key;
        template.delete(k);
    }

    public String get(String key) {
        ValueOperations<String, String> opsForValue = template.opsForValue();
        String k = PREFIX + key;
        return opsForValue.get(k);
    }

}
