package testngdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Popup {

	String baseurl="https://www.justdial.com/";
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("---disable-notifications");
		driver=new ChromeDriver(op);
		
	}
	@Test
	public void test()
	{
	driver.get(baseurl);
	}
	
	
	
	
	
}
