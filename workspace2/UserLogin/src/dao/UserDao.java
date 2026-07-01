package dao;

import java.util.HashMap;
import java.util.Map;

import model.User;
import utility.PasswordUtil;

public class UserDao {
	
	private static Map<String,User> users = new HashMap<>();
	
		static {
			
			addUser("rahul","rahul123");
			addUser("admin","admin@2024");
		}
	
		private static void addUser(String username,String plainPassword) {
			String hashed = PasswordUtil.hashPassword(plainPassword);
			users.put(username, new User(username,hashed));
		}
		
		public User findByUserName(String username) {
			return users.get(username);
		}
	
		

}
