package poker.redis;

import javax.servlet.jsp.tagext.TagSupport;
/**
 * redis 标签
 * @author ZhangJingtao
 *
 */
public class RedisTag extends TagSupport{
	private String key;
	
	RedisDao redisDao = new RedisDao();
	
	public Object getValue(){
		return redisDao.getValue(this.key);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
}
