package tema_02_03;

import java.util.HashMap;
import java.util.Map;


public class ATM {

	public static void main(String[] args)  {
		User user1= new User ("Ioana Popescu", "2132213");
		User user2= new User ("Marius Croitoru", "2133232");
		User user3= new User ("Roxana Prozan", "5454543");
		User user4= new User ("Anca Enache", "03408324");
		User user5= new User ("Vlad Ionescu", "08430482");
		
		Map<User, Account> map = new HashMap<>();
		map.put(user1, new Account(1234, "Constanta", 100000));
		map.put(user2, new Account(2345, "Calarasi", 100000));
		map.put(user3, new Account(3456, "Alba Iulia", 100000));
		map.put(user4, new Account(4567, "Bucuresti", 100000));
		map.put(user5, new Account(5678, "Iasi", 100000));
		
				
		
		
	}
	
	
}
