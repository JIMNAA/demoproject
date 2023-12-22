package junit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fcebook {
 ChromeDriver driver;
 String baseurl=("https://www.facebook.com");
 
 @Before
 public void setup()
 {
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	 
 }
	@After
	public void fbtest()
	{
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		
	}
	}
	
	
	

