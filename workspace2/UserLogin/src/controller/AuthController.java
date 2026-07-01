package controller;

import java.util.Scanner;

import service.AuthService;

public class AuthController {

	private AuthService authService = new AuthService();

	public void login() {
		Scanner sc = new Scanner(System.in);

		System.out.println("----Login----");

		System.out.println("username: ");
		String username = sc.nextLine();

		System.out.println("password: ");
		String password = sc.nextLine();
		
		boolean success = authService.authenticate(username,password);
		
		if(success) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Wrong username or Password !");
		}
		
		sc.close();

	}

}
