package testngdemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Fblogin {
	 ChromeDriver driver;
     String baseurl=("https://www.facebook.com");
     
   @BeforeTest
   public void setup()
   {
	  driver=new ChromeDriver(); 
	   
   }
   @Parameters({"email","password"})
   @Test
   public void test(String email,String password)
   {
	   
	 driver.findElement(By.name("email")) .sendKeys(email); 
	 driver.findElement(By.name("pass")) .sendKeys(password); 

   }
   
   
   
   }
     
     
     
	
	
	
		 
		 
		 
	
	
	
	
	
	
	
	
	

