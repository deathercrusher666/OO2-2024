package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.*;

public class User {
	
	private String screenName;
	
	List<Tweet> tweets = new ArrayList<Tweet>();
	
	public User(String screenName){
		setScreenName(screenName);
	}

	private void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public String getScreenName() {
		return this.screenName;
	} 
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof User) {
//			((User) o).getScreenName();		PREGUNTAR
			User compareUser = (User) o;
			return this.getScreenName() == compareUser.getScreenName();
		}else 
			return false;
	}
	
	@Override
	public String toString() {
		return "User: " +this.screenName+" ";
		
	}
	
	
	
}
