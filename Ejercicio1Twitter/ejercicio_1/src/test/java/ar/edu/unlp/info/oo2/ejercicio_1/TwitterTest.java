package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwitterTest {

	Twitter twitter;
	Twitter twitterFail;

	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
		twitterFail = new Twitter();
		twitterFail.createUser("juan");
	}
    @Test
    public void testCreateUser() {
    	System.out.println("users de twitter iniciales :"+twitter.users);
        assertEquals(true, twitter.createUser("juan"));
        System.out.println("users de twitter luego de agregar :"+twitter.users);        
        System.out.println();
        
  //      System.out.println("users de failtwitter inicales: "+twitterFail.users);
//        System.out.println("Size de los users: "+ twitterFail.users.size());
//        System.out.println("Este es el user numero size: +++ " +twitterFail.users.get(twitterFail.users.size()-1).getScreenName());
      	System.out.println("users de twitterFail iniciales :"+twitterFail.users);
 ///     	User juan = new User("juan");
//        System.out.println(twitterFail.users.indexOf(juan));
      	
      	assertEquals(false, twitterFail.createUser("juan"));
        
        assertEquals(true, twitterFail.createUser("anita"));
        System.out.println("users de twitterFail luego de agregar :"+twitterFail.users);
   //     System.out.println("User 1 " + twitterFail.users.get(0));
   //     System.out.println("User 1 " + twitterFail.users.get(1));
   //     System.out.println(twitterFail.users.get(0).getScreenName()==twitterFail.users.get(1).getScreenName());
        
    }

}
