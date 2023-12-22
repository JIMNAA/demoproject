package testngdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonesite {
	 ChromeDriver driver;
    
     
   @BeforeTest
   public void setup()
   {
	  driver=new ChromeDriver(); 
	   
   }
	@Test
	public void test()
	{
		driver.get("https://www.amazon.in");
	    String parentWindow=driver.getWindowHandle();
		System.out.println("parent window Title" + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
				driver.switchTo().window(handle);
			driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[2]/div[1]/div/div/div/ul/li[1]/a")).click();
			driver.findElement(By.xpath("/html/body")).click();
			driver.findElement(By.xpath("//*[@id=\"sobe_d_b_3_1\"]/a/div/img")).click();
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();

			
		}
		
		driver.close();
		
	}
}




	
	
	

