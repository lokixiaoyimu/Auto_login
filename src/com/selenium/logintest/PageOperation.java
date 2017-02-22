package com.selenium.logintest;

import java.util.concurrent.TimeUnit;
import java.rmi.server.UnicastRemoteObject;

import org.apache.bcel.generic.PopInstruction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.DeselectPopUp;

public class PageOperation {

	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  String errorText; 
	  static PageOperation yongLiDian;
		
		@BeforeClass(alwaysRun = true)
		public void setUp() throws Exception {
			 
			  System.setProperty("webdriver.chrome.driver","D:/work/automation/selenium/driver/chromedriver.exe");
			  driver = new ChromeDriver();
			  baseUrl = "https://www.baidu.com/";
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }
		
		//用户名和密码皆不输入
		  @Test
		public void loginNoUP() throws Exception{
			driver.get(baseUrl);
			
		}
}

