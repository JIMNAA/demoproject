package testngdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gethandle {


	WebDriver driver;
    
    
  @BeforeTest
  public void beforetest()
  {
	  driver=new ChromeDriver(); 
	  
  }
	@Test
	public  void setup()
	{
		driver.get("https://demo.guru99.com/popup.php");
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent window Title" + driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
				driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
			
			
			//System.out.println(s);
			driver.close();
			
		}
		driver.switchTo().window(parentWindow);
	}
	
	
	
	
	
	
	
	
	
	
	
}
