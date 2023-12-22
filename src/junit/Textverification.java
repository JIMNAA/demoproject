package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {

	ChromeDriver driver=new ChromeDriver();
	String baseurel="https://www.Google.com";
	String src=driver.getPageSource();
	
	
	@Before
	public void setup()
	{
	driver.get(baseurel);
	}
	@Test
	public void testveri()
	{
	if (src.contains("search"))	
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
	
	
	
	
	
	
	
	
	

