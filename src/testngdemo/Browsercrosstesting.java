package testngdemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browsercrosstesting {

	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setup(String broswer)
	{
		if(broswer.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(broswer.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else 
		{
			driver=new FirefoxDriver();
			
				}
	}
		
		
	@Test
	public void test()
	{
		driver.get("https://www.google.com");
	}
	}
		
		
		
		
	
	
	
	

