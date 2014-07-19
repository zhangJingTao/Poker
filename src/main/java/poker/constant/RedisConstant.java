package poker.constant;

public enum RedisConstant {
	TEST_JSON_KEY_LARGE("TEST_JSON_KEY_LARGE"),//100w
	TEST_JSON_KEY_MEDIUM("TEST_JSON_KEY_MEDIUM"),//10w
	TEST_JSON_KEY_SMALL("TEST_JSON_KEY_SMALL");//1000
	
	
	private String key;
	RedisConstant(String key){
		this.key = key;
	}
	public String getKey() {
		return key;
	}
	
}
