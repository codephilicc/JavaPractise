package utility;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {
	
	public static String hashPassword(String plainPassword) {
		System.out.println("p "+plainPassword);
		System.out.println(BCrypt.hashpw(plainPassword,BCrypt.gensalt()));
		return BCrypt.hashpw(plainPassword,BCrypt.gensalt());
	}
	
	public static boolean checkPassword(String plainPassword,String hashedPassword) {
		System.out.println("c"+plainPassword);
		System.out.println("h"+hashedPassword);
		System.out.println(BCrypt.checkpw(plainPassword, hashedPassword));
		return BCrypt.checkpw(plainPassword, hashedPassword);
	}

}
