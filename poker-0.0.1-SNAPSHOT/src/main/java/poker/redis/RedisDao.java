package poker.redis;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import poker.entity.User;

@Component
public  class RedisDao {
	@Autowired
	private RedisTemplate<Object, Object> template; 
	
	
	public void putValue(Object key,final Serializable value,Long time){
		try {
			template.opsForValue().set(key, value, time, TimeUnit.HOURS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Object getValue(Object key){
		try {
			return template.opsForValue().get(key);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void testJJJ(){
		for (int i = 0; i < 100000; i++) {
			String key = String.valueOf("testProcess_"+i);
			User user = new User();
			user.setId(Long.valueOf(i));
			putValue(key, user, 100L);
		}
	}
}
