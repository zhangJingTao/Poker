package poker.test;

import java.io.Serializable;

import poker.entity.Menu;
import poker.entity.User;

public class SerializableVO implements Serializable{
	private static final long serialVersionUID = -6109590619136943215L;

	private Integer intValue;
	private String strValue;
	private Long longValue;
	private Menu menu;
	private User user;
	
	public SerializableVO(Integer intValue,String strValue,Long longValue,Menu menu,User user){
		this.intValue = intValue;
		this.strValue = strValue;
		this.longValue = longValue;
		this.menu = menu;
		this.user = user;
	}

	public Integer getIntValue() {
		return intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}

	public String getStrValue() {
		return strValue;
	}

	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}

	public Long getLongValue() {
		return longValue;
	}

	public void setLongValue(Long longValue) {
		this.longValue = longValue;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
