package service;

import dao.UserDao;
import model.User;
import utility.PasswordUtil;

public class AuthService {
	private UserDao userDao = new UserDao();

	public boolean authenticate(String username, String hashedPassword) {
			User user = userDao.findByUserName(username);
			if(user==null) {
				return false;
			}
			return PasswordUtil.checkPassword(username,user.getHashedPassword());
	}

}
