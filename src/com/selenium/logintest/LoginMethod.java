package com.selenium.logintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


	public class LoginMethod{
	
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  String errorText; 
	
	
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
		  driver.findElement(By.cssSelector("#u1 > a[name=\"tj_login\"]")).click();
		  driver.findElement(By.id("TANGRAM__PSP_8__submit")).click();
		  String errorText = driver.findElement(By.id("TANGRAM__PSP_8__error")).getText();
		  if (errorText.equals("请您填写手机/邮箱/用户名")){
				
				System.out.println("不填写用户名+密码成功");
			}
		  driver.findElement(By.id("TANGRAM__PSP_2__closeBtn")).click();
		 
	  }
	
	  //不输入用户名只输入密码
	  @Test
	  public void loginNoU(){
		  
			  driver.get(baseUrl);
			  driver.findElement(By.cssSelector("#u1 > a[name=\"tj_login\"]")).click();
			  driver.findElement(By.id("TANGRAM__PSP_8__password")).clear();
			  driver.findElement(By.id("TANGRAM__PSP_8__password")).sendKeys("111");
			  driver.findElement(By.id("TANGRAM__PSP_8__submit")).click();
			  String errorText = driver.findElement(By.id("TANGRAM__PSP_8__error")).getText();
			  if (errorText.equals("请您填写手机/邮箱/用户名")){
					
					System.out.println("不填写用户名成功");
				}
			  else{
				  
				  System.out.println("不填写用户名失败");
			  }
			  driver.findElement(By.id("TANGRAM__PSP_2__closeBtn")).click();
			 
		  }
	
	  //不输入密码
	  @Test
	  public void loginNoP() throws NullPointerException{
		  
			  driver.get(baseUrl);
			  driver.findElement(By.cssSelector("#u1 > a[name=\"tj_login\"]")).click();
			  driver.findElement(By.id("TANGRAM__PSP_8__userName")).clear();
			  driver.findElement(By.id("TANGRAM__PSP_8__userName")).sendKeys("111");
			  driver.findElement(By.id("TANGRAM__PSP_8__submit")).click();
			  String errorText = driver.findElement(By.id("TANGRAM__PSP_8__error")).getText();
			  if (errorText.equals("请您填写密码")){
					
					System.out.println("success3");
				}
			  else{
				  
				  System.out.println("不填写密码失败");
			  }
			  driver.findElement(By.id("TANGRAM__PSP_2__closeBtn")).click();
			 
		  }
	  
	  //输入错误用户名密码
	  @Test
	  public void loginErUP(){
		  
			 //enter in baidu
			  driver.get(baseUrl);
			  
			  //click login
			  driver.findElement(By.cssSelector("#u1 > a[name=\"tj_login\"]")).click();
			  
			  // send username="111" 
			  driver.findElement(By.id("TANGRAM__PSP_8__userName")).clear();
			  driver.findElement(By.id("TANGRAM__PSP_8__userName")).sendKeys("111");
			  driver.findElement(By.id("TANGRAM__PSP_8__password")).sendKeys("11221");
			  driver.findElement(By.id("TANGRAM__PSP_8__submit")).click();
			  if (errorText.equals("您输入的帐号或密码有误,")){
					
					System.out.println("输入错误账号密码失败");
				}
			  driver.findElement(By.id("TANGRAM__PSP_2__closeBtn")).click();
			 
		  }
}
	
//	LoginMethod method;
//	
//	public void Duotai(String userName, String passWord){
//		
//		
//		
//	}
//	
//	public class LoginNoUP extends LoginMethod{
//		
//		public void Duotai(String userName, String passWord){
//			
//			if(userName.equals(null)){
//				
//			}
//			
//		}
//
//	}
//
//	protected LoginMethod(String userName, String passWord){
//		
//		if(userName.equals(null)){
//			System.out.println("请输入用户名！等操作");
//		}
//		else{
//			if(passWord.equals(null)){
//				System.out.println("请输入密码！等操作 ");
//			}
//			else{
//				if(userName.equals("aaaaa")&&passWord.equals("dddddd")){
//					System.out.println("用户名或密码错误，请重新输入！");
//				}
//				else{
//					
//					System.out.println("用户名或密码错误，请重新输入！");
//				}
//			}
//		}
//		
//	}
//}
//		
	
//public static void clickLoginButton(){
//	
//	driver.findElement(By.cssSelector("#u1 > a[name=\"tj_login\"]")).click();;
//	
//}
//
//public static void clickSubmitButton(){
//	
//	driver.findElement(By.id("TANGRAM__PSP_8__submit")).click();
//}
//
//public static void clearUsernameAndSendKey(String username){
//	
//	driver.findElement(By.id("TANGRAM__PSP_8__username")).clear();
//	driver.findElement(By.id("TANGRAM__PSP_8__username")).sendKeys(username);
//}
//
//public static void clearPswAndSendKey(String psw){
//	driver.findElement(By.id("TANGRAM__PSP_8__password")).clear();
//	driver.findElement(By.id("TANGRAM__PSP_8__password")).sendKeys(psw);
//}
//
//public static String getErrorText(){
//	
//	String errorText =driver.findElement(By.id("TANGRAM__PSP_8__error")).getText();
//	
//	return errorText;


	


