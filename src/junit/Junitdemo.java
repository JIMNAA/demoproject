package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
       ChromeDriver driver;
       String baseurl="https://www.Google.com";
     @Before                     
     public void setup()
     {
    	 driver=new ChromeDriver();
	driver.get(baseurl);
     } 
	
	@Test
	public void googletest()
	{
	String expectedTitle=driver.getTitle();	
	String actualTitle="Google";
	if(actualTitle.equals(expectedTitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");

	}
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	}
	
	
	

