package com.selenium.chrome;

import com.selenium.logintest.LoginMethod;

public class ChromeTest {
	
	public static void main(String args[]) throws Exception{
		
		
		ChromeTest();  // init this method
		LoginMethod a = new LoginMethod();
		a.setUp();
		a.loginNoUP();
		a.loginNoU();
		//a.loginNoP();
		//a.loginErUP();
	} 
	
	public static void ChromeTest() throws Exception{
		System.out.println("ddd");
	}	
	
	
}

