package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.*;

public class Twitter {
	
	List<User> users = new ArrayList<User>();
	
	private boolean existsUser(String screenName) {
		
		if(users.isEmpty()) return false;
		
		User newUser = new User(screenName);

		//existe
		if(users.indexOf(newUser)!=-1) return true;
		
		else return false;
		
/*		
//		for(int i = users.size()-1	; i>=0; i--) {
//			if (users.get(i).equals(newUser)) return true;
		}
		return false; */
		
		
	}
	
	public boolean createUser(String screenName) {
		if(existsUser(screenName)){
			return false;
		}
		else {
			User newUser = new User(screenName);
			users.add(newUser);
			return true;
		}
	}

}
