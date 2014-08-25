package poker.redis;

import javax.servlet.jsp.tagext.TagSupport;

/**
 * redis 标签
 *
 * @author ZhangJingtao
 */
public class RedisTag extends TagSupport {
    RedisDao redisDao = new RedisDao();
    private String key;

    public Object getValue() {
        return redisDao.getValue(this.key);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


}
