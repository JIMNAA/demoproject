package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Amazonecart;

public class Amazoncarttest {

	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Amazon.in");
		
		
	}
	@Test
	public void testlogin()
	{	
		Amazonecart ob=new Amazonecart(driver) ;
		ob.mobileclick();
		ob.searchmobile();
		ob.click();
}
}