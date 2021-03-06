package poker.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import poker.entity.User;
import poker.util.SpringContextHolder;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@Component
public class RedisDao {
    @Autowired
    private static RedisTemplate<Object, Object> template;

    public RedisDao() {
        if (template == null) {
            template = SpringContextHolder.getBean(RedisTemplate.class);
        }
    }

    public static void putValue(Object key, final Serializable value, Long time) {
        try {
            template.opsForValue().set(key, value, time, TimeUnit.HOURS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void putValue(Object key, final Serializable value) {
        try {
            template.opsForValue().set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testJJJ() {
        for (int i = 0; i < 100000; i++) {
            String key = String.valueOf("testProcess_" + i);
            User user = new User();
            user.setId(Long.valueOf(i));
            putValue(key, user, 100L);
        }
    }

    public Object getValue(Object key) {
        try {
            return template.opsForValue().get(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
